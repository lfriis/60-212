/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/11/18
 * DESCRIPTION: Creating a calculator with JFrame and Events
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame1 {

	private JFrame frame;
	private JTextField inputTextBox1;
	private JTextField outputTextBox;
	private JTextField inputTextBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
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
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int x, y, result;
				
					x = Integer.parseInt(inputTextBox1.getText());
					y = Integer.parseInt(inputTextBox2.getText());
					result = x + y;
					
					outputTextBox.setText(Integer.toString(result));
			}
		});
		add.setBounds(76, 125, 50, 42);
		frame.getContentPane().add(add);
		
		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, y, result;
				
				x = Integer.parseInt(inputTextBox1.getText());
				y = Integer.parseInt(inputTextBox2.getText());
				result = x - y;
				
				outputTextBox.setText(Integer.toString(result));
			}
		});
		subtract.setBounds(143, 125, 50, 42);
		frame.getContentPane().add(subtract);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x, y, result;
				
				x = Integer.parseInt(inputTextBox1.getText());
				y = Integer.parseInt(inputTextBox2.getText());
				result = x * y;
				
				outputTextBox.setText(Integer.toString(result));
			}
		});
		multiply.setBounds(210, 125, 50, 42);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				int x, y, result;
				
				x = Integer.parseInt(inputTextBox1.getText());
				y = Integer.parseInt(inputTextBox2.getText());
				result = x / y;
				
				outputTextBox.setText(Integer.toString(result));
			}
		});
		divide.setBounds(277, 125, 50, 42);
		frame.getContentPane().add(divide);
		
		inputTextBox1 = new JTextField();
		inputTextBox1.setBounds(112, 13, 78, 42);
		frame.getContentPane().add(inputTextBox1);
		inputTextBox1.setColumns(10);
		
		JLabel lblResult = new JLabel("Input");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblResult.setBounds(48, 16, 60, 33);
		frame.getContentPane().add(lblResult);
		
		outputTextBox = new JTextField();
		outputTextBox.setBounds(112, 63, 197, 43);
		frame.getContentPane().add(outputTextBox);
		outputTextBox.setColumns(10);
		
		JLabel lblResult_1 = new JLabel("Result");
		lblResult_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblResult_1.setBounds(42, 64, 66, 42);
		frame.getContentPane().add(lblResult_1);
		
		inputTextBox2 = new JTextField();
		inputTextBox2.setBounds(231, 15, 78, 42);
		frame.getContentPane().add(inputTextBox2);
		inputTextBox2.setColumns(10);
	}
}
