import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	JLabel lbluserT;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @return 
	 */
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 271);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Barlow Condensed", Font.PLAIN, 57));
		lblNewLabel.setBounds(223, 36, 587, 53);
		contentPane.add(lblNewLabel);
		
		lbluserT = new JLabel();
		lbluserT.setBounds(296, 125, 151, 29);
		contentPane.add(lbluserT);
		
		lblNewLabel_1 = new JLabel("Have a Great day.");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(272, 100, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\ACAD\\OOP\\Eclipse\\OE8\\OE8\\src\\image\\3.png"));
		lblNewLabel_2.setBounds(148, 27, 101, 87);
		contentPane.add(lblNewLabel_2);
	}
}
