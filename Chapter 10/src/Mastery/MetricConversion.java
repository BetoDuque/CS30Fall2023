package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class MetricConversion {

	private JFrame frmMetricconversion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.frmMetricconversion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetricconversion = new JFrame();
		frmMetricconversion.setTitle("MetricConversion");
		frmMetricconversion.setBounds(100, 100, 250, 200);
		frmMetricconversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetricconversion.getContentPane().setLayout(null);
		
		JLabel Label = new JLabel("Select a convesion type:");
		Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Label.setBounds(10, 11, 214, 22);
		frmMetricconversion.getContentPane().add(Label);
		
		JLabel Display = new JLabel("");
		Display.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Display.setBounds(10, 128, 214, 22);
		frmMetricconversion.getContentPane().add(Display);
		
		JComboBox uInput = new JComboBox();
		uInput.setBackground(Color.WHITE);
		uInput.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		uInput.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				switch (uInput.getSelectedIndex())
				{
				case 1:
					Display.setText("1 inch = 2.54 centimeters.");
					break;
				case 2:
					Display.setText("1 foot = 0.3048 meters.");
					break;
				case 3:
					Display.setText("1 gallon = 4.5461 liters.");
					break;
				case 4:
					Display.setText("1 pound = 0.4536 kilograms.");
					break;
				default:
					Display.setText("");
				}
			}
		});
		uInput.setModel(new DefaultComboBoxModel(new String[] {"Select conversion", "Inches to centimeters", "Feet to meters", "Gallon to liters", "Pound to kilograms"}));
		uInput.setBounds(10, 36, 214, 22);
		frmMetricconversion.getContentPane().add(uInput);
		
		JPanel Background = new JPanel();
		Background.setBackground(Color.WHITE);
		Background.setBounds(10, 128, 214, 22);
		frmMetricconversion.getContentPane().add(Background);
		

	}
}
