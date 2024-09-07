## Day02
#### Assignment Operators
Assignment operators are used to assign values to variables.
```bash
package Day02;

public class Assignment01 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("Initial default value: " + x);
		x += 5;
		System.out.println("After += 5: " + x);
		x -= 5;
		System.out.println("After -= 5: " + x);
		x *= 5;
		System.out.println("After *= 5: " + x);
		x /= 5;
		System.out.println("After %= 5: " + x);
	}
}
```
#### Relational Operators
Relational operators compare two values and return a boolean (true or false).
```bash
package Day02;

public class Relational02 {
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 30;
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println("x > y  : " + (x > y));
		System.out.println("x < y  : " + (x < y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x >= y : " + (x >= y));
	}
}
```
#### Logical Operators
Logical operators are used to perform logical operations on boolean values.
```bash
package Day02;

public class Logical03 {
	public static void main(String[] args) {
		boolean a, b;
		a = true;
		b = false;
		System.out.println("!a  : " + (!a));
		System.out.println("!b  : " + (!b));
		System.out.println("a && b : " + (a && b));
		System.out.println("a || b : " + (a || b));
	}
}
```
#### Increment/Decrement Operators
These operators are used to increment or decrement the value of a variable by 1
```bash
package Day02;

public class Increment_Decrement04 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 20;
		System.out.println("++num1 : "+(++num1));
		System.out.println("num1++ : "+(num1++));
		num2 = 12;
		System.out.println("--num2 : "+(--num2));
		System.out.println("num2-- : "+(num2--));
	}
}
```

#### Ternary (Conditional) Operator
The ternary operator is a shorthand for the if-else statement. 
```bash
package Day02;

public class Ternary05 {
	public static void main(String[] args) {
		int a, b;
		a = 1;
		b = 7;
		String str1 = "Weak Up";
		String str2 = "Sleep well"	;

		String value = (a > b) ? str2 : str1;
		System.out.println("Value  : " + value);
	}
}
```