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
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class SemesterAvg {

	private JFrame frame;
	private JMenuItem viewProject;
	private Panel project;
	private JPanel buttonRegion;
	private JButton Average;
	private JButton Low;
	private JButton High;
	private JPanel inputRegion;
	private JLabel grade1Label;
	private JLabel grade2Label;
	private JLabel grade3Label;
	private JTextField uInput2;
	private JTextField uInput1;
	private JTextField uInput3;
	private JPanel outputRegion;
	private JLabel Display;
	private JPanel RL;
	private JPanel information;

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
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		project = new Panel();
		project.setLayout(null);
		project.setBounds(10, 10, 414, 234);
		frame.getContentPane().add(project);
		
		buttonRegion = new JPanel();
		buttonRegion.setLayout(null);
		buttonRegion.setBounds(0, 92, 155, 142);
		project.add(buttonRegion);
		
		inputRegion = new JPanel();
		inputRegion.setLayout(null);
		inputRegion.setBounds(0, 0, 414, 81);
		project.add(inputRegion);
		
		grade1Label = new JLabel("Please enter your first grade:");
		grade1Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade1Label.setBounds(0, 0, 202, 19);
		inputRegion.add(grade1Label);
		
		grade2Label = new JLabel("Please enter your second grade:");
		grade2Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade2Label.setBounds(0, 30, 233, 19);
		inputRegion.add(grade2Label);
		
		grade3Label = new JLabel("Please enter your third grade:");
		grade3Label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		grade3Label.setBounds(0, 60, 233, 19);
		inputRegion.add(grade3Label);
		
		uInput2 = new JTextField();
		uInput2.setColumns(10);
		uInput2.setBounds(259, 31, 155, 20);
		inputRegion.add(uInput2);
		
		uInput1 = new JTextField();
		uInput1.setColumns(10);
		uInput1.setBounds(259, 1, 155, 20);
		inputRegion.add(uInput1);
		
		uInput3 = new JTextField();
		uInput3.setColumns(10);
		uInput3.setBounds(259, 61, 155, 20);
		inputRegion.add(uInput3);
		
		outputRegion = new JPanel();
		outputRegion.setBackground(Color.WHITE);
		outputRegion.setBounds(259, 194, 155, 40);
		project.add(outputRegion);
		
		Display = new JLabel("");
		Display.setHorizontalAlignment(SwingConstants.CENTER);
		Display.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		outputRegion.add(Display);
		
		RL = new JPanel();
		RL.setBounds(10, 10, 414, 233);
		frame.getContentPane().add(RL);
		RL.setLayout(null);
		
		information = new JPanel();
		information.setBounds(0, 0, 414, 49);
		RL.add(information);
		information.setLayout(null);
		
		JLabel creditName = new JLabel("Credit Name: CSE3010 - Computer Science 3");
		creditName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		creditName.setBounds(0, 0, 414, 24);
		information.add(creditName);
		
		JLabel assignName = new JLabel("Assignment Name: SemesterAvg");
		assignName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		assignName.setBounds(0, 25, 414, 24);
		information.add(assignName);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 60, 414, 173);
		RL.add(panel);
		panel.setLayout(null);
		
		JTextPane text = new JTextPane();
		text.setEditable(false);
		text.setBackground(UIManager.getColor("Button.background"));
		text.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc iaculis aliquam ipsum, non porta nisl tristique sit amet. Donec quis velit a arcu ornare feugiat ut et mi. Sed sed lobortis leo, ut volutpat ex. In nec elementum tellus. Donec vel velit tincidunt, tincidunt tortor id, egestas mi. Morbi eget sem laoreet, porttitor odio pulvinar, rutrum ex. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla facilisi. Ut interdum metus sit amet sapien tristique aliquam. Proin eu erat vel ante lobortis facilisis.");
		text.setBounds(0, 0, 414, 173);
		panel.add(text);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		frame.setJMenuBar(menuBar);
		
		Average = new JButton("Find average");
		Average.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double avg1 = Double.parseDouble(uInput1.getText());
				double avg2 = Double.parseDouble(uInput2.getText());
				double avg3 = Double.parseDouble(uInput3.getText());
				
				double realAverage = (avg1 + avg2 + avg3)/3;
				
				Display.setText(Double.toString(realAverage));
			}
		});
		Average.setBackground(Color.WHITE);
		Average.setBounds(0, 0, 155, 40);
		buttonRegion.add(Average);
		
		Low = new JButton("Find lowest");
		Low.addActionListener(new ActionListener() 
		{
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
		Low.setBounds(0, 51, 155, 40);
		buttonRegion.add(Low);
		
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
		High.setBounds(0, 102, 155, 40);
		buttonRegion.add(High);
		
		JMenu mnNewMenu = new JMenu("View");
		mnNewMenu.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem viewRL = new JMenuItem("View reflection log");
		viewRL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Disables all buttons buttons before showing new buttons
				project.setVisible(false);
				RL.setVisible(true);
				
			}
		});
		
		viewProject = new JMenuItem("View project");
		viewProject.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		viewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				project.setVisible(true);
				RL.setVisible(false);
				
			}
		});
		mnNewMenu.add(viewProject);
		viewRL.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		mnNewMenu.add(viewRL);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
