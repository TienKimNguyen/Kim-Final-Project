
public class Analyzer extends GatherInfo {
	private double bmi;
	
	public double calculateBMI(double w, double h) {
		this.bmi = (w / (h * h)) * 705; // in inches
		return bmi;
	}
	
	public String analyzer() {
		String statement = "";
		if (this.bmi <= 19) {
			statement = "You're considered underweight. Would you like a dietary plan?";
		}
		else if (this.bmi >19 && this.bmi <25 )
		{
			statement = "You're in the healthy range. Would you like a dietary plan to help you stay fit?";
		}
		else if (this.bmi >= 25 && this.bmi <30) {
			statement = "You're considered overweight. Would you like a dietary plan?";
		}
		else
		{
			statement = "You're considered obese. Would you like a dietary plan?";
		}
		return statement;
	}
	
}
