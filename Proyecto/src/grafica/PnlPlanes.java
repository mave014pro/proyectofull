package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class PnlPlanes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PnlPlanes frame = new PnlPlanes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PnlPlanes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 137);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrPlan = new JTextArea();
		txtrPlan.setText("plan 1 : usable en solo una pantalla y solo 1 perfil\r\nplan 2 : usable en 2 pantallas y tiene 4 perfiles\r\nplan 3 : usable en todas las pantallas que quiera tiene 4 perfiles");
		txtrPlan.setEditable(false);
		txtrPlan.setForeground(new Color(0, 128, 255));
		txtrPlan.setBackground(new Color(0, 0, 0));
		txtrPlan.setBounds(10, 11, 525, 76);
		contentPane.add(txtrPlan);
	}
}
