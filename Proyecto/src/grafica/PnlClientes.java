package grafica;
import java.awt.EventQueue;

import logica.ClienteVO;
import logica.ClientesDAO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
public class PnlClientes<sqlaclientes> extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtTar;
	private JTextField txtdir;
	private JTextField txtecid;
	private JTextField txtcid2;
	private JTextField txtnomC;
	private JTextField textField_5;
	private JTextField txtnom2;
	private JTextField txtTar2;
	private JTextField txtpin2;
	private JTextField txtdir2;
	private JTextField txtplan;
	private JTextField txtcon2;
	private JButton btnNewButton;

	

	private JButton btnEli;
	private JButton btnNewButton_2;
	private JButton btnVerTodo;
	private JTextField txtcon;
	private JTextField txtpin;
	private JTextField txtcid;
	private JButton btnBuscar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PnlClientes frame = new PnlClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PnlClientes() {
		setTitle("Panel de Clientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PnlClientes.class.getResource("/imagen/Logo.png")));

		iniciarComponentes();
		iniciarEventos();
		
	}
	
	public void iniciarComponentes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(255, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 128, 255), 3));
		panel.setBounds(10, 40, 268, 397);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNom = new JTextField();
		txtNom.setBounds(105, 117, 146, 20);
		txtNom.setForeground(new Color(0, 128, 255));
		panel.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(10, 151, 60, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel);
		
		btnNewButton = new JButton("Añadir");
		btnNewButton.setIcon(new ImageIcon(PnlClientes.class.getResource("/imagen/IconoAgregarUsuario.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(73, 351, 146, 35);
		
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 120, 63, 14);
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		panel.add(lblNewLabel_2);
		
		txtTar = new JTextField();
		txtTar.setBounds(105, 179, 146, 20);
		panel.add(txtTar);
		txtTar.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tarjeta");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setBounds(10, 182, 39, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pin");
		lblNewLabel_4.setForeground(new Color(0, 128, 255));
		lblNewLabel_4.setBounds(20, 216, 19, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setForeground(new Color(0, 128, 255));
		lblNewLabel_5.setBounds(10, 241, 60, 14);
		panel.add(lblNewLabel_5);
		
		txtdir = new JTextField();
		txtdir.setBounds(105, 243, 146, 20);
		panel.add(txtdir);
		txtdir.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Añadir Cliente");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_6.setForeground(new Color(0, 128, 255));
		lblNewLabel_6.setBounds(10, 11, 254, 35);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_11 = new JLabel("Nombre de  cliente");
		lblNewLabel_11.setForeground(new Color(0, 128, 255));
		lblNewLabel_11.setBounds(10, 95, 97, 14);
		panel.add(lblNewLabel_11);
		
		txtnomC = new JTextField();
		txtnomC.setBounds(105, 92, 146, 20);
		panel.add(txtnomC);
		txtnomC.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Plan");
		lblNewLabel_18.setForeground(new Color(0, 128, 255));
		lblNewLabel_18.setBounds(10, 278, 31, 14);
		panel.add(lblNewLabel_18);
		
		txtplan = new JTextField();
		txtplan.setBounds(105, 274, 146, 20);
		panel.add(txtplan);
		txtplan.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("?");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlPlanes p =new PnlPlanes();
				p.setVisible(true);
				
			}
		});
		btnNewButton_4.setBackground(new Color(0, 128, 255));
		btnNewButton_4.setBounds(46, 278, 51, 14);
		panel.add(btnNewButton_4);
		
		txtcon = new JTextField();
		txtcon.setBounds(105, 148, 146, 20);
		panel.add(txtcon);
		txtcon.setColumns(10);
		
		txtpin = new JTextField();
		txtpin.setBounds(105, 213, 146, 17);
		panel.add(txtpin);
		txtpin.setColumns(10);
		
		txtcid = new JTextField();
		txtcid.setBounds(105, 64, 146, 20);
		panel.add(txtcid);
		txtcid.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CID");
		lblNewLabel_8.setForeground(new Color(0, 128, 255));
		lblNewLabel_8.setBounds(10, 70, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1 = new JLabel(" Netxilf");
		lblNewLabel_1.setBounds(352, 0, 192, 37);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 255), 3));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(586, 40, 268, 397);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("CID ");
		lblNewLabel_7.setForeground(new Color(0, 128, 255));
		lblNewLabel_7.setBounds(10, 123, 98, 14);
		panel_1.add(lblNewLabel_7);
		
		txtecid = new JTextField();
		txtecid.setBounds(118, 113, 134, 27);
		panel_1.add(txtecid);
		txtecid.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Eliminar Clientes");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_9.setForeground(new Color(0, 128, 255));
		lblNewLabel_9.setBounds(10, 11, 258, 42);
		panel_1.add(lblNewLabel_9);
		
		btnEli = new JButton("Eliminar");
		btnEli.setIcon(new ImageIcon(PnlClientes.class.getResource("/imagen/IconoEliminar.png")));
		btnEli.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnEli.setBackground(new Color(0, 128, 255));
		btnEli.setBounds(65, 359, 154, 27);
		panel_1.add(btnEli);
		
		btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setIcon(new ImageIcon(PnlClientes.class.getResource("/imagen/IconoAtras.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		btnNewButton_2.setBounds(10, 0, 130, 37);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 128, 255), 3));
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(288, 40, 287, 397);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Buscar Clientes");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel_10.setForeground(new Color(0, 128, 255));
		lblNewLabel_10.setBounds(10, 11, 277, 35);
		panel_2.add(lblNewLabel_10);
		
		txtcid2 = new JTextField();
		txtcid2.setBounds(65, 109, 150, 35);
		panel_2.add(txtcid2);
		txtcid2.setColumns(10);
		
		JLabel CID = new JLabel("CID");
		CID.setForeground(new Color(0, 128, 255));
		CID.setBounds(10, 112, 94, 14);
		panel_2.add(CID);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(PnlClientes.class.getResource("/imagen/IconoBuscar.png")));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBuscar.setBackground(new Color(0, 128, 255));
		btnBuscar.setForeground(new Color(0, 0, 0));
		btnBuscar.setBounds(221, 109, 56, 35);
		panel_2.add(btnBuscar);
		
		textField_5 = new JTextField();
		textField_5.setBounds(178, 134, -74, -5);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		txtnom2 = new JTextField();
		txtnom2.setEditable(false);
		txtnom2.setBounds(114, 222, 150, 20);
		panel_2.add(txtnom2);
		txtnom2.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel(" Nombre C");
		lblNewLabel_14.setForeground(new Color(0, 128, 255));
		lblNewLabel_14.setBounds(10, 225, 65, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setForeground(new Color(0, 128, 255));
		lblNewLabel_15.setBounds(10, 256, 81, 14);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Tarjeta");
		lblNewLabel_16.setForeground(new Color(0, 128, 255));
		lblNewLabel_16.setBounds(10, 285, 46, 14);
		panel_2.add(lblNewLabel_16);
		
		txtTar2 = new JTextField();
		txtTar2.setEditable(false);
		txtTar2.setBounds(114, 282, 150, 23);
		panel_2.add(txtTar2);
		txtTar2.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Pin");
		lblNewLabel_17.setForeground(new Color(0, 128, 255));
		lblNewLabel_17.setBounds(10, 310, 46, 14);
		panel_2.add(lblNewLabel_17);
		
		txtpin2 = new JTextField();
		txtpin2.setEditable(false);
		txtpin2.setBounds(114, 316, 150, 20);
		panel_2.add(txtpin2);
		txtpin2.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Direccion");
		lblNewLabel_19.setForeground(new Color(0, 128, 255));
		lblNewLabel_19.setBounds(10, 348, 81, 14);
		panel_2.add(lblNewLabel_19);
		
		txtdir2 = new JTextField();
		txtdir2.setEditable(false);
		txtdir2.setBounds(114, 345, 150, 17);
		panel_2.add(txtdir2);
		txtdir2.setColumns(10);
		
		txtcon2 = new JTextField();
		txtcon2.setEditable(false);
		txtcon2.setBounds(114, 253, 150, 20);
		panel_2.add(txtcon2);
		txtcon2.setColumns(10);
		
		btnVerTodo = new JButton("Ver Todos los clientes");
		btnVerTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlClientesM c =new PnlClientesM();
				setVisible(false);
				c.setVisible(true);
			}
		});
	
		btnVerTodo.setBackground(new Color(0, 128, 255));
		btnVerTodo.setBounds(15, 54, 249, 23);
		panel_2.add(btnVerTodo);
		
	}
	
	public void iniciarEventos() {
		btnVerTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cid=Integer.valueOf(txtcid.getText());
				String nom=txtNom.getText();
				int tarC=Integer.valueOf(txtTar.getText());
				String conC=txtcon.getText();
				String dirC=txtdir.getText();
				int pin=Integer.valueOf(txtpin.getText());
				String nomC=txtnomC.getText();
				int plan=Integer.valueOf(txtplan.getText());
			
				ClienteVO cliente=new ClienteVO(cid,nom,nomC,dirC,conC,tarC,pin,plan);
				ClientesDAO.insertarCliente(cliente);		

			
				JOptionPane.showMessageDialog(null,"se añadio al cliente");
				
				
				
							}
		});
		btnEli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = JOptionPane.showConfirmDialog(null,"confirme la eliminacion de la cuenta");
				if(b==0) { 
					int ecid=Integer.valueOf(txtecid.getText());
					ClientesDAO sqlaClientes = new ClientesDAO();
					sqlaClientes.eliminarCliente(ecid);
					JOptionPane.showMessageDialog(null,"se elimino la cuenta");
					
				}
				else if (b==1){
					JOptionPane.showMessageDialog(null,"no se elimino la cuenta");
					
				}else if(b==2) {
					JOptionPane.showMessageDialog(null,"se cancelo");
				}
			}
		});
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteVO BusCli = new ClienteVO();
				int CedulaCliente = 0;
				try {
					CedulaCliente=Integer.parseInt(txtcid2.getText());
					ClientesDAO clientes=new ClientesDAO ();
					BusCli=clientes.buscarClientes(CedulaCliente);
					if(BusCli!=null) {
						txtnom2.setText(BusCli.getNombreC());
						txtcon2.setText(String.valueOf(BusCli.getContraseña()));
						txtTar2.setText(String.valueOf(BusCli.getTarjeta()));
						txtpin2.setText(String.valueOf(BusCli.getPin()));
						txtdir2.setText(BusCli.getDireccion());
						
						
						
					}
				} catch (Exception e2) {
				
				}
				
				
			   
		
			   
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        setVisible(false);
				FrmPrincipalMenu m=new FrmPrincipalMenu();
				m.setVisible(true);
			}
		});
		
		
	}//EVENTOS
}//CLASS
