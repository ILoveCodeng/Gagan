import java.util.Scanner;

class EmailOperations
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

// Accept email address
System.out.println("Enter your email address:");
String email = sc.nextLine();

// Remove leading and trailing spaces
email = email.trim();

// 1. Find length
System.out.println("Length: " + email.length());

// 2. Extract username
int position = email.indexOf('@');
String username = email.substring(0, position);
System.out.println("Username: " + username);

// 3. Extract and compare domain
String domain = email.substring(position + 1);
System.out.println("Domain: " + domain);

if(domain.equals("bmsce.ac.in"))
System.out.println("Belongs to BMSCE");
else
System.out.println("Does not belong to BMSCE");

// 4. Convert to lowercase
System.out.println("Lowercase: " + email.toLowerCase());

// 5. Check starting prefix
System.out.println("Enter registration number prefix:");
String prefix = sc.nextLine();

if(email.startsWith(prefix))
System.out.println("Email starts with the given prefix");
else
System.out.println("Email does not start with the given prefix");

// 6. Check ending domain
if(email.endsWith("bmsce.ac.in"))
System.out.println("Email ends with valid domain");
else
System.out.println("Email does not end with valid domain");

// 7. Replace domain
String newEmail = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
System.out.println("Updated email: " + newEmail);

// 8. Check whether email contains a sequence
System.out.println("Enter a word to search:");
String word = sc.nextLine();

if(email.contains(word))
System.out.println("Email contains " + word);
else
System.out.println("Email does not contain " + word);

// 9. Display trimmed email
System.out.println("Trimmed email: " + email);

// 10. Compare two email addresses
System.out.println("Enter another email address:");
String email2 = sc.nextLine().trim();

if(email.equalsIgnoreCase(email2))
System.out.println("Both email addresses are identical");
else
System.out.println("Email addresses are different");

sc.close();
}
}

