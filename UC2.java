import java.util.Scanner;

public class UC2 {

	public static void main(String[] args) {
		// const.
		int roll = 1;

		// taking input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Bet Value:");
		int bet = scanner.nextInt();

		// taking random no. is for win and lose
		roll = (int) (Math.floor(Math.random() * 10) % 2);

		// logic
		if (bet == roll)

			System.out.println("BET WIN");
		else

			System.out.println("BET lOOSE");

	}
}