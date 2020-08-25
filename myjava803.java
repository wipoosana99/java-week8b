package week8b;

public class myjava803 {
	public static void main(String[]args) {
		double hours = 25;
		double yourHoursWorked = 37.5;
		final double STD_RATE =13.75;
		System.out.println("Adding Parameter to Method");
		System.out.println("==========");
		calculateGross(12,10);
		calculateGross(hours,STD_RATE);
		calculateGross(yourHoursWorked,15);
		calculateNetPay(12,18);
	}
	public static double calculateGross(double hours,double rate) {
		System.out.println("calculateGross");
		final double STD_RATE = 13.75;
		double gross;
		gross = hours*rate;
		System.out.println(hours+" hours at $ " + rate
				+ "per hours is $ " + gross);
		return calculateNetPay(12,10);
	}
	public static double calculateNetPay(double hours,double rate) {
		double gross = 20;
		double withholding;
		double net;
		gross = hours*rate;
		withholding = 10*gross;
		net = gross-withholding;
		return net;
	}
}
