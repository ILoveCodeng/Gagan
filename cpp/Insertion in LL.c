#include <stdio.h>
#include <stdlib.h>

struct Node {
int data;
struct Node *next;
};

struct Node *head = NULL;

// Insert a node at the end
void insertEnd(int value) {
struct Node *newNode, *temp;

newNode = (struct Node *)malloc(sizeof(struct Node));

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

// Create a linked list
void create() {
int n, value, i;

printf("Enter number of nodes: ");
scanf("%d", &n);

for (i = 0; i < n; i++) {
printf("Enter data: ");
scanf("%d", &value);

insertEnd(value);
}
}

// Insert at first position
void insertFirst(int value) {
struct Node *newNode;

newNode = (struct Node *)malloc(sizeof(struct Node));

newNode->data = value;
newNode->next = head;

head = newNode;
}

// Insert at any position
void insertPosition(int value, int pos) {
struct Node *newNode, *temp;
int i;

if (pos == 1) {
insertFirst(value);
return;
}

temp = head;

for (i = 1; i < pos - 1 && temp != NULL; i++) {
temp = temp->next;
}

if (temp == NULL) {
printf("Invalid position\n");
return;
}

newNode = (struct Node *)malloc(sizeof(struct Node));

newNode->data = value;
newNode->next = temp->next;

temp->next = newNode;
}

// Display the linked list
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
int choice, value, pos;

while (1) {
printf("\n1. Create Linked List");
printf("\n2. Insert at First");
printf("\n3. Insert at Any Position");
printf("\n4. Insert at End");
printf("\n5. Display");
printf("\n6. Exit");

printf("\nEnter your choice: ");
scanf("%d", &choice);

switch (choice) {

case 1:
create();
break;

case 2:
printf("Enter value: ");
scanf("%d", &value);

insertFirst(value);
break;

case 3:
printf("Enter value: ");
scanf("%d", &value);

printf("Enter position: ");
scanf("%d", &pos);

insertPosition(value, pos);
break;

case 4:
printf("Enter value: ");
scanf("%d", &value);

insertEnd(value);
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
