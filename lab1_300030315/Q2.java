public class Q2 {
	public static void main(String[] args) {
		int i=1;
		while (i<31) {
			if (i % 15 ==0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 5 ==0) {
				System.out.println("Buzz");

			}
			else if (i % 3 ==0) {
				System.out.println("Fizz");
			}
			i++;
		}
	}
}