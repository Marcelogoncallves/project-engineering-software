package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaPrincipalUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaPrincipalUsuario() throws ParseException {
		TelaAlterarPrestador tap = new TelaAlterarPrestador();
		setTitle("Perfil");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Online");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(335, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnOffline = new JButton("Offline");
		btnOffline.setFont(new Font("Arial", Font.PLAIN, 14));
		btnOffline.setBounds(335, 39, 89, 23);
		contentPane.add(btnOffline);
		
		JButton btnServios = new JButton("Servi\u00E7os");
		btnServios.setFont(new Font("Arial", Font.PLAIN, 14));
		btnServios.setBounds(335, 73, 89, 23);
		contentPane.add(btnServios);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(335, 227, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 82, 13, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 107, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 134, 56, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobre.setBounds(10, 160, 38, 17);
		contentPane.add(lblSobre);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 185, 134, 64);
		contentPane.add(scrollPane);
		
		JTextPane tpSobre = new JTextPane();
		scrollPane.setViewportView(tpSobre);
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setBounds(33, 81, 168, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setEditable(false);
		tfNome.setColumns(10);
		tfNome.setBounds(56, 106, 158, 20);
		contentPane.add(tfNome);
		
		tfTelefone = new JTextField();
		tfTelefone.setEditable(false);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(76, 133, 141, 20);
		contentPane.add(tfTelefone);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tap.setVisible(true);
			}
		});
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBounds(181, 227, 89, 23);
		contentPane.add(btnAlterar);
	}
}
