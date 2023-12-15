package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 437);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("peli y series");
		mntmNewMenuItem_1.setForeground(new Color(0, 128, 255));
		mntmNewMenuItem_1.setBackground(new Color(0, 0, 0));
		menuBar.add(mntmNewMenuItem_1);
		
		
		JMenu mnNewMenu = new JMenu("configuracion");
		mnNewMenu.setBackground(new Color(0, 0, 0));
		mnNewMenu.setForeground(new Color(0, 128, 255));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("cuentas");
		mntmNewMenuItem_2.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_2.setForeground(new Color(0, 128, 255));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("peliculas");
		mntmNewMenuItem_3.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_3.setForeground(new Color(0, 128, 255));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("video");
		mntmNewMenuItem.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem.setForeground(new Color(0, 128, 255));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("cerrar seccion\r\n");
		mntmNewMenuItem_4.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setForeground(new Color(0, 128, 255));
		mnNewMenu.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PelisUY");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(145, 74, 401, 135);
		contentPane.add(lblNewLabel);
	}
}
