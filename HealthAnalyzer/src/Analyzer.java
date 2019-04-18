
public class Analyzer extends GatherInfo {
	private double bmi;
	
	public double calculateBMI(double w, double h) {
		this.bmi = (w / (h * h)) * 705; // in inches
		return bmi;
	}
	
	public String analyzer() {
		String statement = "";
		if (this.bmi <= 19) {
			statement = "You're considered underweight";
		}
		else if (this.bmi > 19 && this.bmi < 25 )
		{
			statement = "You're in the healthy range";
		}
		else if (this.bmi >= 25 && this.bmi < 30) {
			statement = "You're considered overweight";
		}
		else
		{
			statement = "You're considered obese";
		}
		return statement;
	}
	
}
