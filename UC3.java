import java.util.Scanner;

public class UC3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// userinput
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the InitialStake :");
		int InitialStake = scanner.nextInt();
		System.out.println("Enter the bet amount :");
		int bet = scanner.nextInt();

		// const
		int maxStake = InitialStake + 50 % InitialStake;
		int minStake = InitialStake - 50 % InitialStake;

		// logic part
		while (InitialStake > minStake && InitialStake < maxStake) {
			{
				double randomCheck = Math.floor(Math.random() * 10) % 2;
				int play = (int) randomCheck;
				switch (play) {

				case 1:
					InitialStake += bet;
					System.out.println("you win 1$");
					System.out.println("the stake after winning" + InitialStake);
					break;
				case 0:
					InitialStake -= bet;
					System.out.println("you loose 1$");
					System.out.println("the stake after loosing" + InitialStake);
					break;
				}

				System.out.println("Stake has reached to" + InitialStake);
			}

		}
	}
}