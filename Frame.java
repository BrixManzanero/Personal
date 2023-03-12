import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;

public class Login_Frame {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtField;
	private ButtonGroup bg=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Frame window = new Login_Frame();
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
	public Login_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblabel_1 = new JLabel("LOGIN MODULE");
		lblabel_1.setBounds(160, 28, 114, 23);
		lblabel_1.setForeground(Color.WHITE);
		lblabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		frame.getContentPane().add(lblabel_1);
		
		JLabel lblNewLabel = new JLabel("USER NAME:");
		lblNewLabel.setBounds(57, 84, 87, 23);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setBounds(57, 118, 73, 23);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(141, 84, 105, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(88, 62, 247, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(88, 185, 247, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				
				if(username.contains("Admin") && password.contains("Secretary")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null, "WELCOME USER");
						
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "INVALID");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(160, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(140, 120, 106, 20);
		frame.getContentPane().add(txtPassword);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(rdbtnMale.isSelected()== true) {
					txtField.setText("MALE");
				
				}
				
				
			}
		});
		rdbtnMale.setFont(new Font("Arial", Font.BOLD, 9));
		rdbtnMale.setBounds(110, 158, 63, 20);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			

				if(rdbtnFemale.isSelected()== true) {
					txtField.setText("FEMALE");
					
				
					bg.add(rdbtnMale);
					bg.add(rdbtnFemale);
			}
			
		}
		});
	
		
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.CENTER);
		txtField.setBounds(171, 196, 63, 20);
		frame.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("FEMALE");
		rdbtnFemale_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				
			}
		});
		rdbtnFemale_1.setFont(new Font("Arial", Font.BOLD, 9));
		rdbtnFemale_1.setBounds(211, 158, 63, 20);
		frame.getContentPane().add(rdbtnFemale_1);
		
		
	}
}
