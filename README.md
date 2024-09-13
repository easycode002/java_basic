4-**Java Conditions and If Statements**

---

You already know that Java supports the usual logical conditions from mathematics:

- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
- Equal to a == b
- Not Equal to: a != b

Java has the following conditional statements:

- Use `switch` to specify many alternative blocks of code to be executed

---

1. Basic `if` Statement

- Use `if` to specify a block of code to be executed, if a specified condition is true

```java
int number = 10;

if (number > 0) {
    System.out.println("The number is positive.");
}
```

2. `if-else` Statement

- Use `else` to specify a block of code to be executed, if the same condition is false

```java
int number = -5;

if (number >= 0) {
    System.out.println("The number is non-negative.");
} else {
    System.out.println("The number is negative.");
}
```

3. `if-else if-else` Statement

- Use `else if` to specify a new condition to test, if the first condition is false

```java
int number = 0;

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```

4. Nested `if` Statements

- You can nest `if` statements within each other to check multiple conditions.

```java
int number = 20;

if (number > 0) {
    if (number % 2 == 0) {
        System.out.println("The number is positive and even.");
    } else {
        System.out.println("The number is positive and odd.");
    }
} else {
    System.out.println("The number is not positive.");
}
```

5. `switch` Statement

- The `switch` statement is an alternative(**ជំនួស**) to multiple `if-else` statements for handling different cases based on the value of a variable.

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println("Day " + day + " is " + dayName);
```

---

## Exercises

- Exercise 1: Check Even or Odd
    - Write a program that checks if a given number is even or odd.
- Exercise 2: Grade Calculator
    - Write a program that takes a numerical grade (0-100) and prints out the corresponding letter grade.
- Exercise 3: Simple Calculator
    - Create a simple calculator that performs addition, subtraction, multiplication, or division based on user input.

---

Solution:

- Exercise 1: Check Even or Odd
    
    ```java
    public class CheckEvenOdd {
        public static void main(String[] args) {
            int number = 13; // Change this number to test
    
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
    ```
    
- Exercise 2: Grade Calculator
    
    ```java
    public class GradeCalculator {
        public static void main(String[] args) {
            int grade = 85; // Change this number to test
            char letterGrade;
    
            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
    
            System.out.println("The letter grade is: " + letterGrade);
        }
    }
    ```
    
- Exercise 3: Simple Calculator
    
    ```java
    import java.util.Scanner;
    
    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
    
            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);
    
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
    
            double result;
    
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }
    
            System.out.println("Result: " + result);
        }
    }
    ```
    

---