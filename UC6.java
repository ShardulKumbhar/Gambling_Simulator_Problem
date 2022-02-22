import java.util.Scanner;

public class UC6 {

	public static void main(String[] args) {
		{

			// User Input
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter the InitialStake :");
				int InitialStake = scanner.nextInt();
				System.out.println("Enter the bet amount :");
				int bet = scanner.nextInt();
				int StartingStake = InitialStake;
				int TotalAmount = 0;
				int TotalAmountDiffInMonth = 0;

				// Loop for Day counting
				for (int Day = 1; Day <= 20; Day++) {
					double maxStake = InitialStake + (InitialStake / 2);
					double minStake = InitialStake - (InitialStake / 2);

					// loop for binding the amount minimum and maximum will or loss per day
					while (InitialStake > minStake && InitialStake < maxStake) {
						// random value to find winning or loss
						double randomCheck = Math.floor(Math.random() * 10) % 2;
						int play = (int) randomCheck;

						// initializing function for winning and loss
						switch (play) {

						case 1:
							InitialStake += bet;

							break;
						case 0:
							InitialStake -= bet;

							if (InitialStake == 0) {
								System.out.println("Gambler is not having amount to bet further");
							}
							break;
						}
					}
					if (InitialStake == minStake || InitialStake == maxStake) {
						System.out.println("Player Resign :" + Day);
					}
					if (InitialStake > 100) {
						int AmountWonPerDay = InitialStake - StartingStake;
						System.out.println("Player Won Day " + Day + " Rs. " + AmountWonPerDay);
					} else if (InitialStake < 100) {
						int AmountLostPerDay = StartingStake - InitialStake;
						System.out.println("Player Lost Day " + Day + " Rs." + AmountLostPerDay);
					}

					TotalAmount += InitialStake;
				}
				System.out.println("After 20 Days Total Stake Player has = Rs." + TotalAmount);
				TotalAmountDiffInMonth = (TotalAmount - StartingStake) * 20;
				if (TotalAmountDiffInMonth > 0) {
					System.out.println("Total Stake Player WON  = Rs. " + TotalAmountDiffInMonth);
					System.out.println("Luckest day");
				} else {
					System.out.println("Total Stake Player Lost = Rs. " + TotalAmountDiffInMonth);
					System.out.println("Unluckest day");
				}
			}
		}
	}
}