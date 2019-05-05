package InfoProcessor;

/*
 * Analyzer class is used to create an object consisting of weight and height measurements of a patient
 * It also calculates the BMI by those figures and shows the results and recommendations
*/
public class Analyzer {
	private int heightFt;
	private int heightIn;
	private double weight;
	private double bmi;
	
	public Analyzer (int heightFt, int heightIn, double weight) {
		this.heightFt = heightFt;
		this.heightIn = heightIn;
		this.weight = weight;
		calculateBMI(weight,heightFt, heightIn);
	}

	//Method to calculate the BMI of patient
	public void calculateBMI(double w, int hFT, int hIN) {
		int h = hFT * 12 + hIN; //BMI format
		this.bmi = (w / (h * h)) * 705; // in inches
	}
	
	public int getHeightFt() {
		return heightFt;
	}

	public void setHeightFt(int heightFt) {
		this.heightFt = heightFt;
	}

	public int getHeightIn() {
		return heightIn;
	}

	public void setHeightIn(int heightIn) {
		this.heightIn = heightIn;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	//Method to analyze the BMI and give proper recommendations
	public String analyzer() {
		String statement = "";
		if (this.bmi <= 19) {
			statement = "Your BMI is less than 19.\nYou're considered underweight.\n"
					+ "Recommend to eat full nutrients.\n"
					+ "See doctor for your prescription of nutrient supplies.";
		}
		else if (this.bmi > 19 && this.bmi < 25 )
		{
			statement = "Your BMI is between 19 and 25.\nYou're in the healthy range.";
		}
		else if (this.bmi >= 25 && this.bmi < 30) {
			statement = "Your BMI is between 25 and 30.\nYou're considered overweight.\n"
					+ "Diet is recommended.\nSee doctor for the advice of proper diet process.";
		}
		else
		{
			statement = "Your BMI is greater than 30.\nYou're considered obese.\n"
					+ "Strict diet is recommended.\n"
					+ "See doctor for the advice of proper diet process.";
		}
		return statement;
	}

	//toString method formats the message displayed on screen
	@Override
	public String toString() {
		String BMIFormat = String.format("%.2f", bmi);
		String info = "";
		info = "\nHealth Measurement: \n----------------------------------"
				+ "\nHeight: " + heightFt + "ft " + heightIn + "in\n"
				+ "Weight: " + weight + " pounds\n"
				+ "BMI: " + BMIFormat + "\n\nResult:\n----------------------------------\n"
				+ analyzer();
		return info;
	}
	
	
}
