import java.util.Scanner;
public class Electric_vs_Gas {
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		double localgaspricegallon = 0;
		double estimatedmpgofgasvehicle = 0;
		double costpermile = 0;
		double wattpermile = 0;
		double utilitywatt = 0;
		double evratekw = 0;
		double costevrate = 0;
		double milesyear = 0;
		double costsaved = 0;
		System.out.print("-- Welcome to EV savings estimator -- \n"); 
		System.out.print("Please enter the following information \n" );
		System.out.print("Please enter Local fuel price/gallon:$ \n");
		localgaspricegallon = keyboard.nextDouble();
		System.out.print("Please enter estimated MPG of gas vehicle:  \n");
		estimatedmpgofgasvehicle = keyboard.nextDouble();
		costpermile = localgaspricegallon / estimatedmpgofgasvehicle;
		System.out.print("Please enter estimated watt hour consumption per mile of EV: \n");
		wattpermile = keyboard.nextDouble();
		System.out.print("Please enter utility kWh rate:$ \n");
		utilitywatt = keyboard.nextDouble();
		evratekw = wattpermile / 1000;
		costevrate = utilitywatt * evratekw;
		System.out.print("Please enter total miles are driven per year: \n");
		milesyear = keyboard.nextDouble();
		System.out.print("Please enter total cost saved per year: \n");
		costsaved = (costpermile - costevrate) * milesyear;
		System.out.print("Calculating ..... \n");
		System.out.print("Based on data provided, you can save $" +costsaved +"," + "\n");
		System.out.print("per year by driving an EV.");

	}

}

