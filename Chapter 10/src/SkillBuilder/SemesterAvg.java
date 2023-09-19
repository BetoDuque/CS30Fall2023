package SkillBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterAvg {

	private JFrame frame;
	private JTextField uInput1;
	private JTextField uInput2;
	private JTextField uInput3;
	private JButton Average;
	private JLabel Display;
	private JPanel panel;
	private JButton Low;
	private JButton High;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel grade1Label = new JLabel("Please enter your first grade:");
		grade1Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade1Label.setBounds(10, 11, 233, 19);
		frame.getContentPane().add(grade1Label);
		
		uInput1 = new JTextField();
		uInput1.setBounds(269, 12, 155, 20);
		frame.getContentPane().add(uInput1);
		uInput1.setColumns(10);
		
		JLabel grade2Label = new JLabel("Please enter your second grade:");
		grade2Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade2Label.setBounds(10, 41, 233, 19);
		frame.getContentPane().add(grade2Label);
		
		uInput2 = new JTextField();
		uInput2.setColumns(10);
		uInput2.setBounds(269, 42, 155, 20);
		frame.getContentPane().add(uInput2);
		
		JLabel grade3Label = new JLabel("Please enter your third grade:");
		grade3Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade3Label.setBounds(10, 71, 233, 19);
		frame.getContentPane().add(grade3Label);
		
		uInput3 = new JTextField();
		uInput3.setColumns(10);
		uInput3.setBounds(269, 72, 155, 20);
		frame.getContentPane().add(uInput3);
		
		Average = new JButton("Find average");
		Average.setBackground(Color.WHITE);
		Average.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double avg1 = Double.parseDouble(uInput1.getText());
				double avg2 = Double.parseDouble(uInput2.getText());
				double avg3 = Double.parseDouble(uInput3.getText());
				
				double realAverage = (avg1 + avg2 + avg3)/3;
				
				Display.setText(Double.toString(realAverage));
			}
		});
		Average.setBounds(10, 103, 155, 40);
		frame.getContentPane().add(Average);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(269, 154, 155, 40);
		frame.getContentPane().add(panel);
		
		Display = new JLabel("");
		panel.add(Display);
		Display.setHorizontalAlignment(SwingConstants.CENTER);
		Display.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		
		Low = new JButton("Find lowest");
		Low.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double avg1 = Double.parseDouble(uInput1.getText());
				double avg2 = Double.parseDouble(uInput2.getText());
				double avg3 = Double.parseDouble(uInput3.getText());
				
				if (avg1 <= avg2 && avg1 <= avg3)
					Display.setText(Double.toString(avg1));
				else if (avg2 <= avg1 && avg2 <= avg3)
					Display.setText(Double.toString(avg2));
				else
					Display.setText(Double.toString(avg3));
			}
		});
		Low.setBackground(Color.WHITE);
		Low.setBounds(10, 154, 155, 40);
		frame.getContentPane().add(Low);
		
		High = new JButton("Find highest");
		High.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double avg1 = Double.parseDouble(uInput1.getText());
				double avg2 = Double.parseDouble(uInput2.getText());
				double avg3 = Double.parseDouble(uInput3.getText());
				
				if (avg1 >= avg2 && avg1 >= avg3)
					Display.setText(Double.toString(avg1));
				else if (avg2 >= avg1 && avg2 >= avg3)
					Display.setText(Double.toString(avg2));
				else
					Display.setText(Double.toString(avg3));
			}
		});
		High.setBackground(Color.WHITE);
		High.setBounds(10, 205, 155, 40);
		frame.getContentPane().add(High);
	}

}
