package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FrmPrincipalMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnpys;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipalMenu frame = new FrmPrincipalMenu();
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
	public FrmPrincipalMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmPrincipalMenu.class.getResource("/imagen/Logo.png")));
		IniciarComponentes();
		IniciaEventos();
	}
		
	public void IniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 437);
		contentPane = 	new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Netxilf");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(138, 11, 401, 135);
		contentPane.add(lblNewLabel);
	
		
		btnpys = new JButton("Peliculas y Series");
		btnpys.setIcon(new ImageIcon(FrmPrincipalMenu.class.getResource("/imagen/IconoVideo.png")));
		btnpys.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnpys.setBackground(new Color(0, 128, 255));
		
		btnpys.setBounds(255, 167, 228, 33);
		contentPane.add(btnpys);
		
		btnNewButton = new JButton("Cliente");
		btnNewButton.setIcon(new ImageIcon(FrmPrincipalMenu.class.getResource("/imagen/IconoUsuario.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 128, 255));
		
		btnNewButton.setBounds(255, 211, 228, 32);
		contentPane.add(btnNewButton);
	}
	public void IniciaEventos() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PnlClientes c= new PnlClientes();
				c.setVisible(true);
			}
		});
		btnpys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PnlPeliculaySeries a=new PnlPeliculaySeries();
				a.setVisible(true);
			}
		});
		
	}
		
	
}//class
