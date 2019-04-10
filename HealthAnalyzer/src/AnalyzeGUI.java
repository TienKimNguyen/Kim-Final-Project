import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AnalyzeGUI extends JFrame{
	//Panels
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel consolePanel = new JPanel();
	
	//Labels
	private JLabel firstNameLbl = new JLabel("First Name");
	private JLabel lastNameLbl = new JLabel("Last Name");
	private JLabel birthLbl = new JLabel("Date of Birth");
	private JLabel birthDayLbl = new JLabel("Day");
	private JLabel birthMonthLbl = new JLabel("Month");
	private JLabel birthYearLbl = new JLabel("Year");
	private JLabel genderLbl = new JLabel("Gender");
	private JLabel maleLbl = new JLabel("Male");
	private JLabel femaleLbl = new JLabel("Female");
	private JLabel addressLbl = new JLabel("Address");
	private JLabel cityLbl = new JLabel("City");
	private JLabel stateLbl = new JLabel("State");
	private JLabel zipLbl = new JLabel("Zipcode");
	private JLabel phoneLbl = new JLabel("Phone number");
	private JLabel heightLbl = new JLabel("Height");
	private JLabel ftLbl = new JLabel("ft.");
	private JLabel inLbl = new JLabel("in.");
	private JLabel weightLbl = new JLabel("Weight");
	private JLabel poundLbl = new JLabel("pound");
	
	//Buttons
	private JButton continueBtn = new JButton("Continue");
	private JButton cancelBtn = new JButton("Continue");
	private JButton nextBtn = new JButton("Next");
	private JButton enterBtn = new JButton("Enter");
	
	//Textfields
	private JTextField firstNameTxt = new JTextField(10);
	private JTextField lastNameTxt = new JTextField(10);
	private JTextField yearTxt = new JTextField(10);
	private JTextField addressTxt = new JTextField(10);
	private JTextField cityTxt = new JTextField(10);
	private JTextField stateTxt = new JTextField(10);
	private JTextField zipTxt = new JTextField(10);
	private JTextField phoneTxt = new JTextField(10);
	private JTextField ftTxt = new JTextField(10);
	private JTextField inTxt = new JTextField(10);
	private JTextField poundTxt = new JTextField(10);
	
	//Text Area
	private JTextArea welcome = new JTextArea("WELCOME\nto KIM - RICHARD CLINIC",10,20);
	private JTextArea console = new JTextArea(10,20);
	
	//Checkbox
	private JCheckBox maleCheck = new JCheckBox();
	private JCheckBox femaleCheck = new JCheckBox();
	
	//Combobox
	Integer[] dayList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	Integer[] monthList = {1,2,3,4,5,6,7,8,9,10,11,12};
	private JComboBox <Integer> dayBox = new JComboBox <> (dayList); 
	private JComboBox <Integer> monthBox = new JComboBox <> (monthList);
	
	public AnalyzeGUI(String title) {
		super(title);
		setSize(500,350); //set size of frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setActionCommand();
		setVisible(true);
	}

	private void setActionCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
