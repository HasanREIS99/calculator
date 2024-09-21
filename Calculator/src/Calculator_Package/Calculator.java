package Calculator_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private JButton btn7;
	private JButton btn2;
	private double answer,number;
	private int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		input.setText(input.getText()+str);
	}
	
	public void calculate() {
		
		switch(operation) {
		
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
		
	}
	


	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 364, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 20, 364, 40);
		screen.add(input);
		input.setColumns(10);
		
		JLabel resultLbl = new JLabel("New label");
		resultLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		resultLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultLbl.setBounds(205, 0, 159, 21);
		screen.add(resultLbl);
		
		JPanel control = new JPanel();
		control.setBounds(10, 81, 364, 369);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn9);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				resultLbl.setText(number + e.getActionCommand());
				
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnDivision);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn4);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				resultLbl.setText(number + e.getActionCommand());
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnMultiply);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn1);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				resultLbl.setText(number + e.getActionCommand());
				
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnSubtract);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnC);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				resultLbl.setText("");
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnEqual);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				resultLbl.setText(number + e.getActionCommand());
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnSum);
	}
}
