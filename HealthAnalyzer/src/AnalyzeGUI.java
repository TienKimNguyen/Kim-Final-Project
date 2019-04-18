import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AnalyzeGUI extends JFrame implements ActionListener{
	//Panels
	private JPanel firstPanel = new JPanel();
	private JPanel secondPanel = new JPanel();
	private JPanel thirdPanel = new JPanel();
	private JPanel forthPanel = new JPanel();
	private JPanel fifthPanel = new JPanel();
	private JPanel bigTopPanel = new JPanel();
	private JPanel bigBottomPanel = new JPanel();
	
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
	private JButton resetBtn = new JButton("Reset");
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
		setSize(500,500); //set size of frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildFirstPanel();
		buildSecondPanel();
		buildThirdPanel();
		buildForthPanel();
		buildFifthPanel();
		bigTopPanel();
		bigBottomPanel();
		add(bigTopPanel, BorderLayout.CENTER);
		add(bigBottomPanel, BorderLayout.SOUTH);
		setActionCommand();
		setVisible(true);
	}

	public void buildFirstPanel() {
		firstPanel.setLayout(new GridLayout(1,4));
		
		firstPanel.add(firstNameLbl);
		firstPanel.add(firstNameTxt);
		
		firstPanel.add(lastNameLbl);
		firstPanel.add(lastNameTxt);
	}
	
	public void buildSecondPanel() {
		secondPanel.setLayout(new GridLayout(3,6));
		
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
	}
	
	public void buildThirdPanel() {
		thirdPanel.setLayout( new GridLayout (3,4));
		
		thirdPanel.add(addressLbl);
		thirdPanel.add(addressTxt);
		
		thirdPanel.add(cityLbl);
		thirdPanel.add(cityTxt);
		
		thirdPanel.add(stateLbl);
		thirdPanel.add(stateTxt);
		
		thirdPanel.add(zipLbl);
		thirdPanel.add(zipTxt);
		
		thirdPanel.add(phoneLbl);
		thirdPanel.add(phoneTxt);
		
		thirdPanel.add(new JLabel());
		thirdPanel.add(new JLabel());
	}
	
	public void buildForthPanel() {
		forthPanel.setLayout( new GridLayout (2,5));
		
		forthPanel.add(heightLbl);
		
		forthPanel.add(ftTxt);
		forthPanel.add(ftLbl);
		
		forthPanel.add(inTxt);
		forthPanel.add(inLbl);
		
		forthPanel.add(weightLbl);
		
		forthPanel.add(poundTxt);
		forthPanel.add(poundLbl);
		
		forthPanel.add(new JLabel());
		forthPanel.add(new JLabel());
	}
	
	public void buildFifthPanel() {
		fifthPanel.setLayout(new FlowLayout());
		
		fifthPanel.add(enterBtn);
		fifthPanel.add(resetBtn);
	}
	
	public void bigTopPanel() {
		bigTopPanel.setLayout(new BorderLayout());
		bigTopPanel.add(firstPanel, BorderLayout.NORTH);
		bigTopPanel.add(secondPanel, BorderLayout.CENTER);
		bigTopPanel.add(thirdPanel, BorderLayout.SOUTH);
	}
	
	public void bigBottomPanel() {
		bigBottomPanel.setLayout(new BorderLayout());
		bigTopPanel.add(forthPanel, BorderLayout.NORTH);
		bigTopPanel.add(fifthPanel, BorderLayout.CENTER);
		bigTopPanel.add(console, BorderLayout.SOUTH);
	}
	
	private void setActionCommand() {
		continueBtn.addActionListener(this);
		continueBtn.setActionCommand("Continue");
		
		cancelBtn.addActionListener(this);
		cancelBtn.setActionCommand("Cancel");
		
		resetBtn.addActionListener(this);
		resetBtn.setActionCommand("Reset");
		bigBottomPanel.add(resetBtn);
		
		enterBtn.addActionListener(this);
		enterBtn.setActionCommand("Enter");
		bigBottomPanel.add(enterBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Continue")) {
			
		}
		else if (action.equals("Cancel")) {
			System.exit(0);
		}
		else if (action.equals("Reset")) {
			console.setText("");
		}
		else if (action.equals("Enter")) {
			
		}
	}
	
}
