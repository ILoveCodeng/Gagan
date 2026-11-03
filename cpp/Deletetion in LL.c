#include <stdio.h>
#include <stdlib.h>

struct Node {
int data;
struct Node *next;
};

struct Node *head = NULL;

// Create a linked list
void create() {
struct Node *newNode, *temp;
int n, i, value;

printf("Enter number of nodes: ");
scanf("%d", &n);

for (i = 0; i < n; i++) {
newNode = (struct Node *)malloc(sizeof(struct Node));

printf("Enter data: ");
scanf("%d", &value);

newNode->data = value;
newNode->next = NULL;

if (head == NULL) {
head = newNode;
}
else {
temp = head;

while (temp->next != NULL) {
temp = temp->next;
}

temp->next = newNode;
}
}
}

// Delete first element
void deleteFirst() {
struct Node *temp;

if (head == NULL) {
printf("List is empty\n");
return;
}

temp = head;
head = head->next;

free(temp);

printf("First node deleted\n");
}

// Delete specified element
void deleteElement(int value) {
struct Node *temp, *prev;

temp = head;

if (head == NULL) {
printf("List is empty\n");
return;
}

if (head->data == value) {
deleteFirst();
return;
}

while (temp != NULL && temp->data != value) {
prev = temp;
temp = temp->next;
}

if (temp == NULL) {
printf("Element not found\n");
return;
}

prev->next = temp->next;

free(temp);

printf("Specified element deleted\n");
}

// Delete last element
void deleteLast() {
struct Node *temp, *prev;

if (head == NULL) {
printf("List is empty\n");
return;
}

if (head->next == NULL) {
free(head);
head = NULL;
printf("Last node deleted\n");
return;
}

temp = head;

while (temp->next != NULL) {
prev = temp;
temp = temp->next;
}

prev->next = NULL;

free(temp);

printf("Last node deleted\n");
}

// Display linked list
void display() {
struct Node *temp;

if (head == NULL) {
printf("List is empty\n");
return;
}

temp = head;

printf("Linked List: ");

while (temp != NULL) {
printf("%d -> ", temp->data);
temp = temp->next;
}

printf("NULL\n");
}

// Main function
int main() {
int choice, value;

while (1) {
printf("\n1. Create Linked List");
printf("\n2. Delete First Element");
printf("\n3. Delete Specified Element");
printf("\n4. Delete Last Element");
printf("\n5. Display");
printf("\n6. Exit");

printf("\nEnter your choice: ");
scanf("%d", &choice);

switch (choice) {

case 1:
create();
break;

case 2:
deleteFirst();
break;

case 3:
printf("Enter element to delete: ");
scanf("%d", &value);

deleteElement(value);
break;

case 4:
deleteLast();
break;

case 5:
display();
break;

case 6:
printf("\n\nGagan M S\n1WA25CS083\n3/11/26");
exit(0);

default:
printf("Invalid choice\n");
}
}

return 0;
}
