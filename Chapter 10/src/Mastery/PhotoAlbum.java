package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhotoAlbum {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhotoAlbum window = new PhotoAlbum();
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
	public PhotoAlbum() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fn.setText("First Name");
		fn.setBounds(10, 11, 144, 40);
		panel.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setText("Last Name");
		ln.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ln.setColumns(10);
		ln.setBounds(260, 11, 144, 40);
		panel.add(ln);
		
		JTextArea disp = new JTextArea();
		disp.setBounds(10, 128, 394, 22);
		panel.add(disp);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String fN = fn.getText();
				String lN = ln.getText();
				disp.setText(fN + " " + lN);
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(10, 162, 394, 77);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		comboBox.setBounds(10, 62, 144, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent", "Western", "Eastern", "Forest Lawn"}));
		comboBox_1.setForeground(Color.DARK_GRAY);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setBounds(260, 62, 144, 22);
		panel.add(comboBox_1);
		

	}
}
