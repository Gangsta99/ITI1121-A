import java.util.Scanner;

class VotingRight {
	public static void main(String[] args) {
		System.out.print("How old are you?");
		Scanner scanAge = new Scanner(System.in);
		int age = scanAge.nextInt();
		if (age<18) {
			int i = 18 - age;
			if (i>1){
				System.out.print("You will be allowed to vote in " + i + " years.");
			}
			else {
				System.out.print("You will be allowed to vote in 1 year.");
			}
		}
		else {
			System.out.print("You have the right to vote.");
		}
	}
}