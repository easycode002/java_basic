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
