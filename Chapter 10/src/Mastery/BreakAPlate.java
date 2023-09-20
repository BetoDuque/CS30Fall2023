package Mastery;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon twoBroken = new ImageIcon("\\Chapter 10\\src\\Images\\secondImage.jpg");
		ImageIcon allBroken = new ImageIcon("\\Chapter 10\\src\\Images\\plates_all_broken.gif");
		ImageIcon sticker = new ImageIcon("\\Chapter 10\\src\\Images\\sticker.gif");
		ImageIcon tiger = new ImageIcon("\\Chapter 10\\src\\Images\\tiger_plush.gif");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel output = new JLabel("");
		output.setIcon(new ImageIcon(BreakAPlate.class.getResource("/Images/placeholder.gif")));
		output.setBackground(Color.WHITE);
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(10, 178, 414, 72);
		frame.getContentPane().add(output);
		
		JLabel display = new JLabel("");
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setIcon(new ImageIcon(BreakAPlate.class.getResource("/Images/plates.gif")));
		display.setBounds(10, 11, 414, 97);
		frame.getContentPane().add(display);
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int random = (int) (1 + Math.random()*2);
				
				if (random == 1)
				{
					display.setIcon(allBroken);
					output.setIcon(tiger);
				}
				else
				{
					display.setIcon(twoBroken);
					output.setIcon(sticker);
				}
				Play.setText("Play again");
			}
		});
		Play.setBackground(Color.WHITE);
		Play.setBounds(10, 119, 414, 48);
		frame.getContentPane().add(Play);
	}
}
