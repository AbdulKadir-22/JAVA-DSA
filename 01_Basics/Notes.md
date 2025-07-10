### Variables, Data Types & User Input
Variables in Java
Variables store data in memory with a specific type.

Syntax: dataType variableName = value;
Java is statically typed – every variable must have a type.

Example:
int age = 20;
String name = "Yusu";

🔢 Java Data Types
🔸 Primitive Data Types (8 total)

Type	Size	Example	             Description

int 	4 bytes	int x = 10;	        Whole numbers
float	4 bytes	float f = 2.5f; 	Decimal (less precise)
double	8 bytes	double d = 3.14;	Precise decimal
char	2 bytes	char ch = 'A';	    Single character
boolean	1 bit	boolean b = true;	True/false
byte	1 byte	byte b = 127;	    Small integers
short	2 bytes	short s = 10000;	Medium integers
long	8 bytes	long l = 999999L;	Large integers

🔸 Non-Primitive Data Types
Used for more complex data like strings, arrays, classes.

Example: String name = "Java";

🛡 Constants in Java
Use final to create unchangeable (constant) values.

final double PI = 3.14159;

### Taking Input in Java (Using Scanner)
✅ Steps:
Import the class:

import java.util.Scanner;
Create Scanner object:

Scanner sc = new Scanner(System.in);
Use input methods:

String name = sc.nextLine();   // full line
int age = sc.nextInt();        // integer
double gpa = sc.nextDouble();  // decimal
⚠️ nextLine() After nextInt()
Consume leftover newline:

sc.nextLine();  // after nextInt() or nextDouble()