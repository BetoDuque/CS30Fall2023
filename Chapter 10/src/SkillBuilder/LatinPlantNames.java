package SkillBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Label = new JLabel("Select a plant name:");
		Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Label.setBounds(10, 11, 264, 19);
		frame.getContentPane().add(Label);
		


		
		JLabel Display = new JLabel("");
		Display.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		Display.setBounds(10, 131, 264, 19);
		frame.getContentPane().add(Display);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 131, 264, 19);
		frame.getContentPane().add(panel);
		
		JComboBox cBox = new JComboBox();
		cBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				switch(cBox.getSelectedIndex())
				{
				case 1:
					Display.setText("Ocimum");
					break;
				case 2:
					Display.setText("Lavandula spica");
					break;
				case 3:
					Display.setText("Apium");
					break;
				case 4:
					Display.setText("Mentha piperita");
					break;
				case 5:
					Display.setText("Crocus");
					break;
				case 6:
					Display.setText("Salvia");
					break;
				default:
					Display.setText("");
				}
			}
		});
		cBox.setBackground(Color.WHITE);
		cBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Basil", "Lavender", "Parsley", "Peppermint", "Saffron", "Sage"}));
		cBox.setBounds(10, 41, 264, 22);
		frame.getContentPane().add(cBox);
	}
}
