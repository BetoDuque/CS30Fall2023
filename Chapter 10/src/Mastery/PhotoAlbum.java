package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PhotoAlbum {

	int currentPhoto = 0;
	
	private JFrame frame;

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
	private void initialize() 
	{
		ImageIcon image1 = new ImageIcon("..\\Chapter 10\\src\\Images\\firstImage.jpg");
		ImageIcon image2 = new ImageIcon("..\\Chapter 10\\src\\Images\\secondImage.jpg");
		ImageIcon image3 = new ImageIcon("..\\Chapter 10\\src\\Images\\thirdImage.jpg");
		ImageIcon image4 = new ImageIcon("..\\Chapter 10\\src\\Images\\fourthImage.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel display = new JLabel("");
		display.setIcon(new ImageIcon(PhotoAlbum.class.getResource("/Images/firstImage.jpg")));
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setBounds(10, 11, 414, 178);
		frame.getContentPane().add(display);
		
		JButton back = new JButton("Back");
		back.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				currentPhoto--;
				if (currentPhoto < 1)
					currentPhoto = 3;
				
				switch (currentPhoto)
				{
				case 0:
					display.setIcon(image1);
					break;
				case 1:
					display.setIcon(image2);
					break;
				case 2:
					display.setIcon(image3);
					break;
				case 3:
					display.setIcon(image4);
					break;
				}
			}
		});
		back.setBackground(Color.WHITE);
		back.setBounds(10, 200, 125, 50);
		frame.getContentPane().add(back);
		
		JButton next = new JButton("Next");
		next.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		next.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				currentPhoto++;
				if (currentPhoto > 3)
					currentPhoto = 0;
				
				switch (currentPhoto)
				{
				case 0:
					display.setIcon(image1);
					break;
				case 1:
					display.setIcon(image2);
					break;
				case 2:
					display.setIcon(image3);
					break;
				case 3:
					display.setIcon(image4);
					break;
				}
			}
		});
		next.setBackground(Color.WHITE);
		next.setBounds(299, 200, 125, 50);
		frame.getContentPane().add(next);
	}
}
