package GUIPackage;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import InfoProcessor.Patient; //import method from another package

@SuppressWarnings("serial")
public class AnalyzeGUI extends JFrame implements ActionListener{

	//Panels
	private JPanel firstPanel = new JPanel();
	private JPanel secondPanel = new JPanel();
	private JPanel thirdPanel = new JPanel();
	private JPanel forthPanel = new JPanel();
	private JPanel bigTopPanel = new JPanel();
	
	//Labels
	private JLabel firstNameLbl = new JLabel("First Name", SwingConstants.RIGHT);
	private JLabel lastNameLbl = new JLabel("Last Name", SwingConstants.RIGHT);
	private JLabel birthLbl = new JLabel("Date of Birth", SwingConstants.RIGHT);
	private JLabel birthDayLbl = new JLabel("Day", SwingConstants.RIGHT);
	private JLabel birthMonthLbl = new JLabel("Month", SwingConstants.RIGHT);
	private JLabel birthYearLbl = new JLabel("Year", SwingConstants.RIGHT);
	private JLabel genderLbl = new JLabel("Gender", SwingConstants.RIGHT);
	private JLabel maleLbl = new JLabel("Male", SwingConstants.RIGHT);
	private JLabel femaleLbl = new JLabel("Female", SwingConstants.RIGHT);
	private JLabel addressLbl = new JLabel("Address", SwingConstants.RIGHT);
	private JLabel cityLbl = new JLabel("City", SwingConstants.RIGHT);
	private JLabel stateLbl = new JLabel("State", SwingConstants.RIGHT);
	private JLabel zipLbl = new JLabel("Zipcode", SwingConstants.RIGHT);
	private JLabel phoneLbl = new JLabel("Phone number", SwingConstants.RIGHT);
	private JLabel heightLbl = new JLabel("Height", SwingConstants.RIGHT);
	private JLabel ftLbl = new JLabel("ft.");
	private JLabel inLbl = new JLabel("in.");
	private JLabel weightLbl = new JLabel("Weight", SwingConstants.RIGHT);
	private JLabel poundLbl = new JLabel("pound");
	
	//Buttons
	private JButton resetBtn = new JButton("Reset");
	private JButton enterBtn = new JButton("Enter");
	private JButton closeBtn = new JButton("Close");
	
	//Textfields
	private JTextField firstNameTxt = new JTextField("eg. John", 10);
	private JTextField lastNameTxt = new JTextField("eg. Smith",10);
	private JTextField yearTxt = new JTextField(10);
	private JTextField addressTxt = new JTextField(10);
	private JTextField cityTxt = new JTextField(10);
	private JTextField stateTxt = new JTextField(10);
	private JTextField zipTxt = new JTextField("eg. 11111",10);
	private JTextField phoneTxt = new JTextField("eg. 123-456-7890",10);
	private JTextField ftTxt = new JTextField(10);
	private JTextField inTxt = new JTextField(10);
	private JTextField poundTxt = new JTextField(10);
	
	//Text Area
	private JTextArea console = new JTextArea(20,47);
	
	//ScrollPane
	private JScrollPane consoleScroll = new JScrollPane(console);
	
	//Checkbox
	private JCheckBox maleCheck = new JCheckBox();
	private JCheckBox femaleCheck = new JCheckBox();
	
	//Combobox
	Integer[] dayList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	Integer[] monthList = {1,2,3,4,5,6,7,8,9,10,11,12};
	private JComboBox <Integer> dayBox = new JComboBox <> (dayList); 
	private JComboBox <Integer> monthBox = new JComboBox <> (monthList);
	
	//Titled Border
	private TitledBorder consoleBorder = new TitledBorder("Console");
	private TitledBorder patientBorder = new TitledBorder("Patient's Information");
	
	//Array of patients (users)
	private Patient[] patients = new Patient[1000];
	private int patientCount;
	private Patient patient;
	
	//Constructor used to create a frame
	public AnalyzeGUI(String title) {
		super(title);
		setSize(600,720); //set size of frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default closing operation to exit on close
		
		//Call panel building methods
		buildFirstPanel();
		buildSecondPanel();
		buildThirdPanel();
		buildForthPanel();
		bigTopPanel();
		
		//add panels to frame using borderlayout
		add(bigTopPanel, BorderLayout.NORTH);
		add(thirdPanel, BorderLayout.CENTER);
		add(forthPanel, BorderLayout.SOUTH);
		
		setActionCommand(); //Call set action command
		setVisible(true); // set the frame visible
	}

	//Build first panel
	public void buildFirstPanel() {
		//Set the layout to gridLayout with 4 rows and 4 columns
		firstPanel.setLayout(new GridLayout(4,4));
		
		//Add components to panel respectively
		firstPanel.add(firstNameLbl);
		firstPanel.add(firstNameTxt);
		
		firstPanel.add(lastNameLbl);
		firstPanel.add(lastNameTxt);
		
		firstPanel.add(addressLbl);
		firstPanel.add(addressTxt);
		
		firstPanel.add(cityLbl);
		firstPanel.add(cityTxt);
		
		firstPanel.add(stateLbl);
		firstPanel.add(stateTxt);
		
		firstPanel.add(zipLbl);
		firstPanel.add(zipTxt);
		
		firstPanel.add(phoneLbl);
		firstPanel.add(phoneTxt);
		
		firstPanel.add(new JLabel());
		firstPanel.add(new JLabel());
			
	}
	
	public void buildSecondPanel() {
		secondPanel.setLayout(new GridLayout(5,6));
		
		secondPanel.add(birthLbl);
		
		for (int i = 0; i < 5; i++) {
			secondPanel.add(new JLabel());
		}
		secondPanel.add(birthDayLbl);
		secondPanel.add(dayBox);
		
		secondPanel.add(birthMonthLbl);
		secondPanel.add(monthBox);
		
		secondPanel.add(birthYearLbl);
		secondPanel.add(yearTxt);
		
		secondPanel.add(genderLbl);
		
		secondPanel.add(maleLbl);
		secondPanel.add(maleCheck);
		
		secondPanel.add(femaleLbl);
		secondPanel.add(femaleCheck);
		
		secondPanel.add(new JLabel());
		
		secondPanel.add(heightLbl);
		
		secondPanel.add(ftTxt);
		secondPanel.add(ftLbl);
		
		secondPanel.add(inTxt);
		secondPanel.add(inLbl);
		
		secondPanel.add(new JLabel());
		
		secondPanel.add(weightLbl);
		
		secondPanel.add(poundTxt);
		secondPanel.add(poundLbl);
		
		for (int i = 0; i < 3; i++) {
			secondPanel.add(new JLabel());
		}
	}
	
	public void buildThirdPanel() {
		console.setEditable(false);
		console.setBorder(null);
		
		thirdPanel.setBorder(consoleBorder);
		thirdPanel.add(consoleScroll);
	}
	public void buildForthPanel() {
		forthPanel.setLayout(new FlowLayout());
		
		forthPanel.add(enterBtn);
		forthPanel.add(resetBtn);
		forthPanel.add(closeBtn);
	}
	
	public void bigTopPanel() {
		bigTopPanel.setLayout(new GridLayout(2,1));
		bigTopPanel.setBorder(patientBorder);
		
		bigTopPanel.add(firstPanel);
		bigTopPanel.add(secondPanel);
	}
	
	private void setActionCommand() {
		resetBtn.addActionListener(this);
		resetBtn.setActionCommand("Reset");
		
		enterBtn.addActionListener(this);
		enterBtn.setActionCommand("Enter");
		
		closeBtn.addActionListener(this);
		closeBtn.setActionCommand("Close");
	}
	
	public boolean checkValidOfNumberInput() {
		int length = String.valueOf(zipTxt.getText().trim()).length(); //Calculate the length of zipcode
		int year = Calendar.getInstance().get(Calendar.YEAR); //get the current year
		//set flags to false
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		boolean check5 = false;
		boolean check6 = false;
		boolean check =  false;
		
		//Check if number has 5 digits
		if (length != 5)
		{
			console.append("\nZipcode must have 5 digits!");
		}
		else {
			check1 = true;
		}

		String phone = phoneTxt.getText().trim();
		int phoneLength = phone.length();
		//Declare variables and initialize value of 3th and 6th character to them
		char symbol1 = phone.charAt(3), 
			 symbol2 = phone.charAt(6);
		
		//Check if the 3th and 6th character of input is '-'
		if (phoneLength == 12) {
			if (symbol1 != '-' && symbol2 != '-')
			{
				console.append("\nPhone number must follow this format: 123-456-7890");
			}
			else {
				check2 = true;
			}
		}
		else
			console.append("\nInvalid phone number!");
			check1 = false;
		
		int feet = Integer.parseInt(ftTxt.getText().trim());
		int inch = Integer.parseInt(inTxt.getText().trim());
		double pound = Double.parseDouble(poundTxt.getText().trim());
		
		if (feet < 0) {
			console.append("\nHeight in feet cannot be negative!");
		}
		else {
			check3 = true;
		}
		
		if (inch < 0) {
			console.append("\nHeight in inch cannot be negative!");
		}
		else {
			check4 = true;
		}
		
		if (pound < 0) {
			console.append("\nWeight cannot be negative!");
		}
		else {
			check5= true;
		}
		
		if (Integer.parseInt(yearTxt.getText().trim()) > year) {
			console.append("\nInvalid year of birth!");
		}
		else {
			check6 = true;
		}
		
		if (check1 == true && check2 == true && check3 == true
				&& check4 == true && check5 == true && check6 == true) {
			return check = true;
		}
		else
		{
			return check = false;
		}
	}
	
	public void getInfo() {
		try {
			if(firstNameTxt.getText().trim().equals("") || 
					lastNameTxt.getText().trim().equals("") ||
					addressTxt.getText().trim().equals("") ||
					cityTxt.getText().trim().equals("") ||
					stateTxt.getText().trim().equals("") ||
					zipTxt.getText().trim().equals("") ||
					phoneTxt.getText().trim().equals("") ||
					ftTxt.getText().trim().equals("") ||
					inTxt.getText().trim().equals("") ||
					poundTxt.getText().trim().equals("") ||
					yearTxt.getText().trim().equals("")) {
				console.append("Required fields are not filled in!");
				checkValidOfNumberInput();
			}
			else if (checkValidOfNumberInput() == true) {
				String sex = "";
				boolean checked = maleCheck.isSelected();
				if (checked) {
					sex = "Male";
				}
				else {
					sex = "Female";
				}
				patient = new Patient(firstNameTxt.getText().trim(), lastNameTxt.getText().trim(),
						addressTxt.getText().trim(), cityTxt.getText().trim(),stateTxt.getText().trim(),
						zipTxt.getText().trim(), phoneTxt.getText().trim(), (int) dayBox.getSelectedItem(),
						(int) monthBox.getSelectedItem(), Integer.parseInt(yearTxt.getText().trim()),
						sex, Integer.parseInt(ftTxt.getText().trim()), Integer.parseInt(inTxt.getText().trim()),
						Double.parseDouble(poundTxt.getText().trim()));
				patients[patientCount++] = patient;
			}
		}catch (Exception e) {
			System.out.println("Invalid input!");
			e.toString();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Reset")) {
			console.setText("");
		}
		else if (action.equals("Enter")) {
			getInfo();
			console.append(patient.toString());
		}
		else if (action.equals("Close")) {
			System.exit(0);
		}
	}	
}
