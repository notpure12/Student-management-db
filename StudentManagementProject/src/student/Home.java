package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	student Student = new student(); 
	public void init() {
	}
	public boolean isEmpty() {
		if(textField_1.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Student name is missing");
			return false;
		}
		if(textField_2.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"DOB is missing");
			return false;
		}
		if(textField_3.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Email is missing");
			return false;
		}
		if(textField_4.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Tel is missing");
			return false;
		}
		if(textField_5.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Address is missing");
			return false;
		}
		return true;
	}
	public void clear() {
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		textField_4.setText(null);
		textField_5.setText(null);
	}
	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Management System");
		lblNewLabel.setBackground(new Color(153, 180, 209));
		lblNewLabel.setFont(new Font("TH Fah kwang", Font.BOLD, 61));
		lblNewLabel.setBounds(10, 11, 1004, 59);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 81, 1004, 454);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 351, 404);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("รหัสนิสิต");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 11, 140, 30);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(160, 11, 181, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ชื่อ-นามสกุล");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 52, 140, 30);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 52, 181, 30);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("วัน / เดือน / ปีเกิด");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 134, 140, 30);
		panel_1.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 134, 181, 30);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("อีเมล");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 175, 140, 30);
		panel_1.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 175, 181, 30);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("เบอร์โทร");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(10, 216, 140, 30);
		panel_1.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 216, 181, 30);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ที่อยู่");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(10, 257, 140, 30);
		panel_1.add(lblNewLabel_1_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(160, 257, 181, 136);
		panel_1.add(textField_5);
		
		JButton btnNewButton_2_4 = new JButton("เคลียร์");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				
			}
		});
		btnNewButton_2_4.setBounds(10, 345, 89, 48);
		panel_1.add(btnNewButton_2_4);
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(371, 11, 618, 404);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 598, 70);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_6 = new JLabel("ค้นหานิสิต");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_6.setBounds(10, 11, 140, 48);
		panel_3.add(lblNewLabel_1_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(160, 11, 231, 48);
		panel_3.add(textField_6);
		
		JButton btnNewButton = new JButton("ค้นหา");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(401, 11, 89, 48);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("รีเฟรช");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(499, 11, 89, 48);
		panel_3.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 598, 260);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student's ID", "Student's Name", "Date of Birth", "Email", "Tel", "Address"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 356, 598, 37);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("เพิ่มนิสิต");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty()) {
					String id = textField.getText();
					String name = textField_1.getText();
					String dob = textField_2.getText();
					String email = textField_3.getText();
					String tel = textField_4.getText();
					String address = textField_5.getText();
					
					Student.insert(id, name, dob, email, tel, address);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 11, 89, 26);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("แก้ไข");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(110, 11, 89, 26);
		panel_4.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("ลบ");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_2.setBounds(209, 11, 89, 26);
		panel_4.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("พิมพ์");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_3.setBounds(308, 11, 89, 26);
		panel_4.add(btnNewButton_2_3);
	}
}
