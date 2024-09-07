# Day01
#### Hello world with java programming first with IDE.
```bash
package Day01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World...");
	}
}
```

#### Variable
*What is a Variable in Java Programming?*
- A variable in Java is a container that holds data values during the execution of a program. Each variable in Java has a data type that specifies the type of data it can store, such as integers, floating-point numbers, characters, or strings. Variables are fundamental to programming because they allow us to store and manipulate data dynamically.
*Why Use Variables in Java?*
 - Storing Data: Variables allow us to store data values that can change throughout the program.
 - Dynamic Calculations: They enable us to perform operations (like calculations) and store the results.
 - Readable Code: By giving names to data, variables make code more readable and understandable.
```bash
package Day01;

public class VariableDemo01 {
	public static void main(String[] args) {
		int a = 200;
		String name = "Cito Traning Center";
		System.out.println(a);
		System.out.println(name);
		// integer = int
	}
}
```


#### Data Type
*What is a Data Type in Java Programming?*
- A data type in Java defines the type of data that a variable can store. Java is a strongly-typed language, which means every variable must be declared with a data type before it is used.
```bash
package Day01;

public class DataTypeDemo02 {
	public static void main(String[] args) {
		// Declare variable:
		int age=19;				// store integer number
		double price=11.22;		// store decimal value
		boolean isLogin=true;	// store true(1) false(0)
		char grade = 'A';		// store single character
		String name = "Cito";	// store multiple character
		
		// Output
		System.out.println("Integer		: "+age);
		System.out.println("Double		: "+price);
		System.out.println("Boolean		: "+isLogin);
		System.out.println("Character	: "+grade);
		System.out.println("String		: "+name);
		// syso = System.out.println();
	}
}
```

#### Operator
*What is an Operator in Java Programming?*
- An operator in Java is a symbol or keyword that performs a specific operation on one or more operands (variables or values) to produce a result. 
```bash
package Day01;

public class OperatorDemo03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// Sum
		int sum = a + b;
		// Subtraction
		int sub = a - b;
		// Multiplication
		int multi = a * b;
		// Division
		int div = a / b;
		System.out.println(sum + ", " + sub + ", " + multi + ", " + div);
	}
}
```
