package grafica;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import logica.ClienteVO;
import logica.PeliculasVO;
import logica.SeriesVO;
import logica.ClientesDAO;
import logica.PeliculaDAO;
import logica.SeriesDAO;

import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class PnlPeliculaySeries extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnomS;
	private JTextField txtnom;
	private JTextField txtPinP;
	private JTextField txtdir;
	private JTextField txtclasi;
	private JTextField txtdur;
	private JTextField txtcapS;
	private JTextField txtTemS;
	private JTextField txtdurS;
	private JTextField txtclasS;
	private JTextField txtestr;
	private JTextField txtePinP;
	private JTextField txtpinS;
	private JTextField enomS;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PnlPeliculaySeries frame = new PnlPeliculaySeries();
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
	public PnlPeliculaySeries() {
		setTitle("PELICULAS Y SERIES");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PnlPeliculaySeries.class.getResource("/imagen/Logo.png")));
		IniciarComponentes();
		IniciarEventos();
		
	}
	public void IniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "peliculas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		panel.setBounds(20, 50, 385, 480);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir");
		lblNewLabel.setBounds(136, 22, 61, 20);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(35, 55, 46, 14);
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_1);
		
		txtnom = new JTextField();
		txtnom.setBounds(252, 52, 123, 20);
		panel.add(txtnom);
		txtnom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Duracion");
		lblNewLabel_2.setBounds(35, 86, 61, 14);
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_2);
		
		txtPinP = new JTextField();
		txtPinP.setBounds(252, 114, 123, 20);
		panel.add(txtPinP);
		txtPinP.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Director");
		lblNewLabel_3.setBounds(35, 149, 46, 14);
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_3);
		
		txtdir = new JTextField();
		txtdir.setBounds(252, 146, 123, 20);
		panel.add(txtdir);
		txtdir.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Clasificacion");
		lblNewLabel_4.setBounds(35, 180, 89, 14);
		lblNewLabel_4.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estreno");
		lblNewLabel_5.setBounds(35, 212, 46, 14);
		lblNewLabel_5.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_5);
		
		txtclasi = new JTextField();
		txtclasi.setBounds(252, 177, 123, 20);
		panel.add(txtclasi);
		txtclasi.setColumns(10);
		
		btnNewButton_1 = new JButton("Añadir");
		btnNewButton_1.setBounds(136, 266, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Eliminar");
		lblNewLabel_6.setBounds(35, 294, 72, 20);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_6);
		
		btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(136, 380, 89, 23);
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		panel.add(btnNewButton_2);
		
		txtdur = new JTextField();
		txtdur.setBounds(252, 83, 123, 20);
		panel.add(txtdur);
		txtdur.setColumns(10);
		
		txtestr = new JTextField();
		txtestr.setBounds(252, 208, 123, 22);
		panel.add(txtestr);
		txtestr.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Pin pelicula");
		lblNewLabel_14.setBounds(35, 111, 89, 14);
		lblNewLabel_14.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_14);
		
		txtePinP = new JTextField();
		txtePinP.setBounds(252, 350, 123, 20);
		panel.add(txtePinP);
		txtePinP.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Pin pelicula");
		lblNewLabel_15.setBounds(35, 353, 66, 14);
		lblNewLabel_15.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_15);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "series", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		panel_1.setBounds(415, 50, 385, 480);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Añadir");
		lblNewLabel_8.setForeground(new Color(0, 128, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBackground(Color.CYAN);
		lblNewLabel_8.setBounds(129, 25, 61, 20);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setForeground(new Color(0, 128, 255));
		lblNewLabel_9.setBounds(36, 52, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		txtnomS = new JTextField();
		txtnomS.setBounds(252, 49, 123, 20);
		panel_1.add(txtnomS);
		txtnomS.setColumns(10);
		
		txtcapS = new JTextField();
		txtcapS.setColumns(10);
		txtcapS.setBounds(252, 80, 123, 20);
		panel_1.add(txtcapS);
		
		txtTemS = new JTextField();
		txtTemS.setColumns(10);
		txtTemS.setBounds(252, 111, 123, 20);
		panel_1.add(txtTemS);
		
		txtdurS = new JTextField();
		txtdurS.setColumns(10);
		txtdurS.setBounds(252, 142, 123, 20);
		panel_1.add(txtdurS);
		
		txtclasS = new JTextField();
		txtclasS.setColumns(10);
		txtclasS.setBounds(252, 173, 123, 20);
		panel_1.add(txtclasS);
		
		JLabel lblNewLabel_10 = new JLabel("Capitulos");
		lblNewLabel_10.setForeground(new Color(0, 128, 255));
		lblNewLabel_10.setBounds(36, 83, 61, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Temporadas");
		lblNewLabel_11.setForeground(new Color(0, 128, 255));
		lblNewLabel_11.setBounds(36, 114, 79, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Duracion cap");
		lblNewLabel_12.setForeground(new Color(0, 128, 255));
		lblNewLabel_12.setBounds(36, 145, 79, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Clasificacion");
		lblNewLabel_13.setForeground(new Color(0, 128, 255));
		lblNewLabel_13.setBounds(36, 176, 79, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_16 = new JLabel("Pin serie");
		lblNewLabel_16.setForeground(new Color(0, 128, 255));
		lblNewLabel_16.setBounds(36, 207, 79, 14);
		panel_1.add(lblNewLabel_16);
		
		txtpinS = new JTextField();
		txtpinS.setBounds(252, 204, 123, 20);
		panel_1.add(txtpinS);
		txtpinS.setColumns(10);
		
		btnNewButton_3 = new JButton("Añadir");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(0, 128, 255));
		btnNewButton_3.setBounds(129, 242, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_17 = new JLabel("Eliminar");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_17.setForeground(new Color(0, 128, 255));
		lblNewLabel_17.setBounds(129, 312, 89, 20);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Pin serie");
		lblNewLabel_18.setForeground(new Color(0, 128, 255));
		lblNewLabel_18.setBounds(36, 382, 79, 14);
		panel_1.add(lblNewLabel_18);
		
		btnNewButton_5 = new JButton("Eliminar");
		

		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setBackground(new Color(0, 128, 255));
		btnNewButton_5.setBounds(129, 412, 89, 23);
		panel_1.add(btnNewButton_5);
		
		enomS = new JTextField();
		enomS.setBounds(252, 383, 123, 20);
		panel_1.add(enomS);
		enomS.setColumns(10);
		
		btnNewButton = new JButton("Volver");
		btnNewButton.setIcon(new ImageIcon(PnlPeliculaySeries.class.getResource("/imagen/IconoAtras.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 128, 255));
		
		btnNewButton.setBounds(10, 11, 142, 33);
		contentPane.add(btnNewButton);
		
	}
	public void IniciarEventos() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				FrmPrincipalMenu a= new FrmPrincipalMenu();
				a.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomP=txtnom.getText();
				int pinP=Integer.valueOf(txtPinP.getText());
				String dirP=txtdir.getText();
				String clasiP=txtclasi.getText();
				int dur=Integer.valueOf(txtdur.getText());
				String est=txtestr.getText();
				PeliculasVO peli = new PeliculasVO(pinP,nomP,clasiP,dur,dirP,est);
				PeliculaDAO.insertarPeliculas(peli);	
				JOptionPane.showMessageDialog(null,"se añadio la pelicula ");	
				
				
			}
			
			
		});
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nomS = txtnomS.getText();
		        int pinS = Integer.valueOf(txtpinS.getText());
		        int capS = Integer.valueOf(txtcapS.getText());
		        int tems = Integer.valueOf(txtTemS.getText());
		        String clas = txtclasS.getText();
		        int durs = Integer.valueOf(txtdurS.getText());
		        SeriesVO ser = new SeriesVO(pinS, nomS, clas, tems, capS, durs);
		        SeriesDAO.insertarSerie(ser);
		    }
		});		

		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int b = JOptionPane.showConfirmDialog(null,"confirme la eliminacion de la pelicula");
				if(b==0) {
					JOptionPane.showMessageDialog(null,"se elimino la pelicula");
					int ePin=Integer.valueOf(txtePinP.getText());
					PeliculaDAO epli = new PeliculaDAO();
					PeliculaDAO.eliminarPersona(ePin);
					JOptionPane.showMessageDialog(null,"se elimino la cuenta");
					
				}
				
				else if (b==1){
					JOptionPane.showMessageDialog(null,"no se elimino la pelicula");
					
				}
				else if(b==2) {
					JOptionPane.showMessageDialog(null,"se cancelo");
				
				}
			}
		}
		);
		btnNewButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int b = JOptionPane.showConfirmDialog(null, "Confirme la eliminación de la serie");
		        if (b == 0) {
		            int pin = Integer.valueOf(enomS.getText());
		            SeriesDAO sqlaseries = new SeriesDAO();
		            SeriesDAO.eliminarSeries(pin);
		            JOptionPane.showMessageDialog(null, "Se eliminó la serie");
		        } else if (b == 1) {
		            JOptionPane.showMessageDialog(null, "No se eliminó la serie");
		        } else if (b == 2) {
		            JOptionPane.showMessageDialog(null, "Se canceló");
		        }
		    }
		});
		
		
	}
}//class
