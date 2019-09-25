import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;

public class Frame {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("Welcome to Cab Comparison Program!");
	private JTextField pick_up_point;
	private JLabel lblDestinationPoint;
	private JTextField destination_point;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JLabel lblNewLabel_2;
	private JLabel lblUber;
	private JLabel lblMeru;
	private JLabel lblMega;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField destination_city;
	private JTextField pick_up_city;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBounds(0, 0, 619, 33);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pick up point:");
		lblNewLabel_1.setBounds(23, 136, 118, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		pick_up_point = new JTextField();
		pick_up_point.setBounds(23, 167, 189, 20);
		frame.getContentPane().add(pick_up_point);
		pick_up_point.setColumns(10);
		
		lblDestinationPoint = new JLabel("Destination point:");
		lblDestinationPoint.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDestinationPoint.setBounds(23, 239, 118, 20);
		frame.getContentPane().add(lblDestinationPoint);
		
		destination_point = new JTextField();
		destination_point.setColumns(10);
		destination_point.setBounds(23, 262, 189, 20);
		frame.getContentPane().add(destination_point);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 44, 619, 33);
		frame.getContentPane().add(menuBar);
		
		mnNewMenu = new JMenu("Home");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("Monitoring");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("Analysis");
		mnNewMenu_2.setForeground(Color.BLACK);
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSubmit.setBounds(67, 335, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		lblNewLabel_2 = new JLabel("Ola");
		lblNewLabel_2.setBounds(222, 114, 57, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblUber = new JLabel("Uber");
		lblUber.setBounds(332, 114, 46, 14);
		frame.getContentPane().add(lblUber);
		
		lblMeru = new JLabel("Meru");
		lblMeru.setBounds(434, 114, 57, 14);
		frame.getContentPane().add(lblMeru);
		
		lblMega = new JLabel("Mega");
		lblMega.setBounds(543, 114, 46, 14);
		frame.getContentPane().add(lblMega);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 147, 95, 187);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(327, 147, 95, 187);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(434, 147, 95, 187);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(543, 147, 95, 187);
		frame.getContentPane().add(textField_4);
		
		destination_city = new JTextField();
		destination_city.setColumns(10);
		destination_city.setBounds(23, 304, 189, 20);
		frame.getContentPane().add(destination_city);
		
		JLabel lblDestinationCity = new JLabel("Destination city:");
		lblDestinationCity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDestinationCity.setBounds(23, 283, 118, 20);
		frame.getContentPane().add(lblDestinationCity);
		
		pick_up_city = new JTextField();
		pick_up_city.setColumns(10);
		pick_up_city.setBounds(23, 208, 189, 20);
		frame.getContentPane().add(pick_up_city);
		
		JLabel lblPickUpCity = new JLabel("Pick up city:");
		lblPickUpCity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPickUpCity.setBounds(23, 187, 118, 20);
		frame.getContentPane().add(lblPickUpCity);
	}
}
