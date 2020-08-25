package week8b;

public class myjava802 {
	public static void main(String[]args) {
		double hours = 25;
		double yourHoursWorked = 37.5;
		final double STD_RATE =13.75;
		System.out.println("Adding Parameter to Method");
		System.out.println("==========");
		calculateGross(12,10);
		calculateGross(hours,STD_RATE);
		calculateGross(yourHoursWorked,15);
	}
	public static void calculateGross(double hours,double rate) {
		System.out.println("calculateGross");
		final double STD_RATE = 13.75;
		double gross;
		gross = hours*STD_RATE;
		System.out.println(hours+" hours at $ " + STD_RATE
				+ "per hours is $ " + gross);
		
	}
}
