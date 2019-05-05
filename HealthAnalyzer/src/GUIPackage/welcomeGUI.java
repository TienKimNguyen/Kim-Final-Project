package GUIPackage;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

@SuppressWarnings("serial")
public class welcomeGUI extends JFrame implements ActionListener {
	//Panels
	private JPanel welcomePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	//Buttons
	private JButton continueBtn = new JButton("Continue");
	private JButton cancelBtn = new JButton("Cancel");
	
	//Titled Border
	private TitledBorder consoleBorder = new TitledBorder("");
	
	//Font
	private Font font = new Font("Times new Roman", Font.BOLD, 54);
	
	//TextPane
	private JTextPane textPane = new JTextPane();
	
	public welcomeGUI(String title) {
		super(title);
		setSize(550,400); //set size of frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		buildButtonPanel();
		add(welcomePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		setActionCommand();
		setVisible(true);
	}

	public void centeringText() {
		 SimpleAttributeSet attrs = new SimpleAttributeSet();
         StyleConstants.setAlignment(attrs,StyleConstants.ALIGN_CENTER);
         StyledDocument doc=(StyledDocument) textPane.getDocument();
         try {
			doc.insertString(0,"\nWELCOME\nto\nHEALTHY CLINIC\n",attrs);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
	}
	
	public void buildPanel() {
		textPane.setFont(font);
		textPane.setEditable(false);
		textPane.setBorder(consoleBorder);
		centeringText();
		welcomePanel.add(textPane);
	}
	
	public void buildButtonPanel() {
		buttonPanel.setLayout(new FlowLayout());
		
		buttonPanel.add(continueBtn);
		buttonPanel.add(cancelBtn);
	}
	
	private void setActionCommand() {
		continueBtn.addActionListener(this);
		continueBtn.setActionCommand("Continue");
		welcomePanel.add(continueBtn);
		
		cancelBtn.addActionListener(this);
		cancelBtn.setActionCommand("Cancel");
		welcomePanel.add(cancelBtn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Continue")) {
			@SuppressWarnings("unused")
			AnalyzeGUI newFrame = new AnalyzeGUI("BMI Analyzer");
			dispose();
		}
		else if (action.equals("Cancel")) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		welcomeGUI frame = new welcomeGUI("KIM NGUYEN CLINIC");
	}
}
