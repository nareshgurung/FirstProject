package main;
import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		while(menuSelection != 4) {
			String selectionOption = 	"///////////////////////////////////// \n"+
										"Please select an option: \n"+
										"1. Cups to Teaspoons \n" +
										"2. Miles to Kilometers \n" +
										"3. Us Gallons to Imperial Gallons \n" +
										"4. quit \n"+
										"///////////////////////////////////// \n";
			System.out.println(selectionOption);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select the list number: ");
			menuSelection = sc.nextInt();
			switch(menuSelection) {
			case 1:
				System.out.println("Please enter the total cups: ");
				double cup = sc.nextDouble();
				cupsToTeaspoons(cup);
				break;
			case 2:
				System.out.println("Please enter the total miles: ");
				double km = sc.nextDouble();
				mileToKm(km);
				break;
			case 3:
				System.out.println("Please enter the total Us Gallon: ");
				double gall = sc.nextDouble();
				uGallonToGallon(gall);
				break;
			}
}
	}
	public static void cupsToTeaspoons(double qty) {
		double tSpoon = qty*48;
		System.out.println(qty + "cups = " + tSpoon + "Teaspoon.");
	}
	public static void mileToKm(double mile) {
		double km = mile*1.6;
		System.out.println(mile + " miles = "+ km+ " kilometer.");
	}
	public static void uGallonToGallon(double uGallon) {
		double iGallon = uGallon*0.83;
		System.out.println(uGallon +" US gallons = "+ iGallon +" imperal gallons");
	}
	
}
