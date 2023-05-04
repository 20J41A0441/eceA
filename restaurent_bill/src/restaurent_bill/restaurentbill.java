package restaurent_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class restaurentbill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restaurentbill window = new restaurentbill();
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
	public restaurentbill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 614, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" RESTAURENT BILL");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(146, 68, 269, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(88, 180, 113, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(87, 275, 98, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "COFFEE--->20/-", "CHICKEN 65--->50/-", "CHICKEN BIRYANI--->180/-", "PANEER  BIRYANI--->100/-"}));
		c1.setBounds(250, 180, 199, 29);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(258, 275, 191, 29);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("COFFEE--->20/-")) {
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "Hello!\n Selected iem is:"+item+"\n Quantity:"+q+"\n yourbill:"+bill);
				}
				else if(item.equals("CHICKEN 65--->50/-")) {
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "Hello!\n Selected iem is:"+item+"\n Quantity:"+q+"\n yourbill:"+bill);
				}
				else if(item.equals("CHICKEN BIRYANI--->180/-")) {
					bill=q*180;
					JOptionPane.showMessageDialog(btnNewButton, "Hello!\n Selected iem is:"+item+"\n Quantity:"+q+"\n yourbill:"+bill);
				}
				else if(item.equals("PANEER BIRYANI--->100/-")) {
					bill=q*100;
					JOptionPane.showMessageDialog(btnNewButton, "Hello!\n Selected iem is:"+item+"\n Quantity:"+q+"\n yourbill:"+bill);
				}
			}
		});
		btnNewButton.setBounds(182, 370, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
