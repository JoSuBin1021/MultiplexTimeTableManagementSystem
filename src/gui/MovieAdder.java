package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MovieAdder extends JFrame {
	
	public MovieAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelTheaterNum = new JLabel("Theater Number", JLabel.TRAILING);
		JTextField fieldTheaterNum = new JTextField(10);
		labelTheaterNum.setLabelFor(fieldTheaterNum);
		panel.add(labelTheaterNum);
		panel.add(fieldTheaterNum);
		
		JLabel labelName = new JLabel("Movie Name", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelStartTime = new JLabel("Starting Time", JLabel.TRAILING);
		JTextField fieldStartTime = new JTextField(10);
		labelName.setLabelFor(fieldStartTime);
		panel.add(labelStartTime);
		panel.add(fieldStartTime);
		
		JLabel labelEndTime = new JLabel("Ending Time", JLabel.TRAILING);
		JTextField fieldEndTime = new JTextField(10);
		labelName.setLabelFor(fieldEndTime);
		panel.add(labelEndTime);
		panel.add(fieldEndTime);
		
		JLabel labelRunTime = new JLabel("Running Time", JLabel.TRAILING);
		JTextField fieldRunTime = new JTextField(10);
		labelName.setLabelFor(fieldRunTime);
		panel.add(labelRunTime);
		panel.add(fieldRunTime);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
		
	}

}
