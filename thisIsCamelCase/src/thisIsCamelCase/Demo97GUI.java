package thisIsCamelCase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Demo97GUI {
	
	double number = 0;
	double multiplier = 1;
	int requirement = 16;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo97GUI window = new Demo97GUI();
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
	public Demo97GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel requirementNeeded = new JLabel("16");
		requirementNeeded.setFont(new Font("Tahoma", Font.PLAIN, 16));
		requirementNeeded.setBounds(10, 94, 110, 20);
		frame.getContentPane().add(requirementNeeded);
		
		JLabel numberDisplay = new JLabel("0");
		numberDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		numberDisplay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		numberDisplay.setBounds(171, 65, 182, 29);
		frame.getContentPane().add(numberDisplay);
		
		JLabel multiplierDisplay = new JLabel("Multiplier:");
		multiplierDisplay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		multiplierDisplay.setBounds(10, 11, 110, 29);
		frame.getContentPane().add(multiplierDisplay);
		
		JLabel multiplierText = new JLabel("1.0x");
		multiplierText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		multiplierText.setBounds(10, 38, 110, 20);
		frame.getContentPane().add(multiplierText);
		
		JButton submit = new JButton("Click me");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				number = number + multiplier;
				numberDisplay.setText(Double.toString(number));
			}
		});
		submit.setBounds(171, 126, 182, 62);
		frame.getContentPane().add(submit);
		
		JButton Increase = new JButton("Increase multiplier");
		Increase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (number >= requirement)
				{
					number -= requirement;
					multiplier++;
					requirement = (int) (requirement*Math.log(requirement));
					multiplierText.setText(Double.toString(multiplier) + "x");
					numberDisplay.setText(Double.toString(number));
					requirementNeeded.setText(Double.toString(requirement));
					
				}
			}
		});
		Increase.setBounds(10, 118, 125, 29);
		frame.getContentPane().add(Increase);
		
		JLabel requirementText = new JLabel("Requires: ");
		requirementText.setFont(new Font("Tahoma", Font.PLAIN, 24));
		requirementText.setBounds(10, 65, 110, 29);
		frame.getContentPane().add(requirementText);

	}
}
