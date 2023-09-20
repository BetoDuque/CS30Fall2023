package SkillBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField uInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Label = new JLabel("Please enter an integer:");
		Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Label.setBounds(10, 11, 168, 19);
		frame.getContentPane().add(Label);
		
		uInput = new JTextField();
		uInput.setBounds(188, 12, 236, 21);
		frame.getContentPane().add(uInput);
		uInput.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(188, 82, 236, 19);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Display = new JLabel("");
		Display.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Display.setBounds(0, 0, 236, 19);
		panel.add(Display);
		
		JButton Submit = new JButton("Submit");
		Submit.setBackground(Color.WHITE);
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int uNum = Integer.parseInt(uInput.getText());
				
				if (uNum % 3 == 0)
					Display.setText(uNum + " is divisible by 3.");
				else
					Display.setText(uNum + " is not divisible by 3.");
			}
		});
		Submit.setBounds(10, 41, 168, 60);
		frame.getContentPane().add(Submit);
	}
}
