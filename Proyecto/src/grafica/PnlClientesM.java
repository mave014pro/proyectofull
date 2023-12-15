package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

import logica.ClientesDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class PnlClientesM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSalir;
	private JButton btnImprimir;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PnlClientesM frame = new PnlClientesM();
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
	public PnlClientesM() {
		setTitle("Lista de Usuarios");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PnlClientesM.class.getResource("/imagen/Logo.png")));
		IniciarComponentes();
		IniciarEvento();
		
	}
	public void IniciarComponentes() {
		
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon("C:\\Users\\58718778\\Desktop\\mavesado\\IconoAtras.png"));
		btnSalir.setForeground(new Color(0, 0, 0));
		btnSalir.setBackground(new Color(0, 128, 255));
		
		btnSalir.setBounds(0, 399, 132, 30);
		contentPane.add(btnSalir);
		
		btnImprimir = new JButton("Imprimir");
		
		btnImprimir.setIcon(new ImageIcon(PnlClientesM.class.getResource("/imagen/IconoLista.png")));
		btnImprimir.setBounds(229, 350, 170, 41);
		contentPane.add(btnImprimir);
		
		JPanel pnlClientes = new JPanel();
		pnlClientes.setBackground(new Color(0, 0, 0));
		pnlClientes.setBorder(new LineBorder(new Color(0, 128, 255), 2));
		pnlClientes.setBounds(10, 11, 628, 328);
		contentPane.add(pnlClientes);
		pnlClientes.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 608, 306);
		pnlClientes.add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 100, 2, 2);
		contentPane.add(scrollPane);
		
	
	}
	public void IniciarEvento(){
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientesDAO cliente;
				cliente = new ClientesDAO();
				cliente.listaCliente();
				System.out.println(cliente.listaCliente().toString());
				textArea.setText(cliente.listaCliente().toString());

				}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		PnlClientes v=new PnlClientes();
		v.setVisible(true);
		setVisible(false);
			}
		});
	}
}
