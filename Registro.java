package practicaEntorno;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombreRegistro;
	private JTextField passwordRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Registro:");
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nombreVariable = new JLabel("Registro");
		nombreVariable.setFont(new Font("Tahoma", Font.PLAIN, 35));
		nombreVariable.setBackground(new Color(0, 0, 0));
		nombreVariable.setBounds(66, 37, 244, 74);
		contentPane.add(nombreVariable);

		JLabel foto = new JLabel("New label");
		foto.setIcon(new ImageIcon(
				"C:\\Users\\pedro\\Desktop\\1º DAM\\Ent Desarrollo\\line-icon-for-registration-vector.jpg"));
		foto.setBounds(723, 10, 206, 264);
		contentPane.add(foto);

		nombreRegistro = new JTextField();
		nombreRegistro.setBounds(235, 168, 251, 26);
		contentPane.add(nombreRegistro);
		nombreRegistro.setColumns(10);

		passwordRegistro = new JTextField();
		passwordRegistro.setBounds(235, 237, 251, 26);
		contentPane.add(passwordRegistro);
		passwordRegistro.setColumns(10);

		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre.setHorizontalAlignment(SwingConstants.TRAILING);
		nombre.setBounds(106, 158, 119, 36);
		contentPane.add(nombre);

		JLabel password = new JLabel("Password:");
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(134, 227, 91, 37);
		contentPane.add(password);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = nombreRegistro.getText();
				String pass = passwordRegistro.getText();

				if (user.equals("pedro") && pass.equals("pedroo")) {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto");
				}
			}
		});
		btnNewButton.setBounds(324, 322, 85, 21);
		contentPane.add(btnNewButton);
	}
}
