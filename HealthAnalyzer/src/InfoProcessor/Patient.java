package InfoProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private String sex;
	private Date date = new Date();
	private Analyzer analyzer;

	public Patient(String firstName, String lastName, String address, String city,
			String state, String zip, String phone, int day, int month, int year,
			String sex, Analyzer analyzer) {
		this.analyzer = analyzer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.birthDay = day;
		this.birthMonth = month;
		this.birthYear = year;
		this.sex = sex;
	}
	
	public Analyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		SimpleDateFormat visitDate = new SimpleDateFormat("MMM dd, yyyy h:mm:ss a");
		String result = visitDate.format(date);
		return result;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String toString() {
		String info = "";
		info = "PATIENT INFORMATION\n----------------------------------"
				+ "\nFull Name: " + firstName + " "+ lastName
				+ "\nBirthdate: " + birthMonth + "/" + birthDay + "/" + birthYear
				+"\nGender: " + sex
				+ "\nAddress: " + address + ", " + city + ", " + state + ", " + zip
				+ "\nPhone Number: " + phone + "\n" + analyzer.toString()
				+ "\n\nDate visited: " + getDate() + "\nThank you for using our service!";
		return info;
	}
}
