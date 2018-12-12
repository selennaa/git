package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class VentanaActionListenerComun extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComun frame = new VentanaActionListenerComun();
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
	public VentanaActionListenerComun() {
		setTitle("VentanaActionListenerComun");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelDatos.add(lblNmero);
		
		txtNumero = new JTextField();
		txtNumero.setText("0");
		txtNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//acciones a realizar al pulsar enter
				String mensaje;
				mensaje = "El numero introducido es el "+ txtNumero.getText();
			
			}
		});
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
	
		panelDatos.add(txtNumero);
		txtNumero.setColumns(6);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelDatos.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setColumns(6);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelDatos.add(passwordField);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDatos.add(btnOk);
		
		JLabel lblRespuesta = new JLabel("An\u00F3nimo");
		lblRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRespuesta, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
