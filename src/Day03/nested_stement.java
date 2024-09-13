package Day03;

public class nested_stement {

	public static void main(String[] args) {
		int num = 21;
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("The num is positive and even");
			} else {
				System.out.println("The num is positive and odd");
			}
		} else {
			System.out.println("The num is not positive.");
		}
	}
}
