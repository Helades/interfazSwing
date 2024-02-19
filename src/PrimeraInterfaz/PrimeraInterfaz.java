package PrimeraInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrimeraInterfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel LabelSensual = new JLabel("Texto Sensual");
	private JTextField txtCosasSensualesQue;
	private JTextField txtContador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraInterfaz frame = new PrimeraInterfaz();
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
	public PrimeraInterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		LabelSensual.setHorizontalAlignment(SwingConstants.CENTER);
		LabelSensual.setFont(new Font("Tahoma", Font.BOLD, 20));
		LabelSensual.setBounds(52, 70, 507, 41);
		contentPane.add(LabelSensual);
		
		JButton BotonSensual = new JButton("Botón Sensual");
		BotonSensual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BotonSensual.setBounds(232, 154, 156, 21);
		contentPane.add(BotonSensual);
		
		txtCosasSensualesQue = new JTextField();
		txtCosasSensualesQue.setHorizontalAlignment(SwingConstants.CENTER);
		txtCosasSensualesQue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCosasSensualesQue.setBounds(190, 119, 236, 26);
		txtCosasSensualesQue.setText("Cosas Sensuales que Introducir");
		contentPane.add(txtCosasSensualesQue);
		txtCosasSensualesQue.setColumns(10);
		
		txtContador = new JTextField();
		txtContador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtContador.setHorizontalAlignment(SwingConstants.CENTER);
		txtContador.setBounds(52, 215, 507, 41);
		contentPane.add(txtContador);
		txtContador.setColumns(10);
		
		JButton botonExterminatus = new JButton("EXTERMINATUS");
		botonExterminatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonExterminatus.setBounds(232, 184, 156, 21);
		contentPane.add(botonExterminatus);
		
		BotonSensual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Pilla el texto del JTextField rellenable y establece el texto de Label al del JTextField
				LabelSensual.setText(txtCosasSensualesQue.getText());
				// Guarda las palabras del texto en un array (sin espacios)
				String[] arrayPalabras = txtCosasSensualesQue.getText().split(" ");
				// Mira como de largo (nº de caracteres y palabras) es el Label anteriormente modificado y lo muestra por pantalla
				if (LabelSensual.getText().replaceAll(" ","").length()==0)
					txtContador.setText("Error 42069: Texto sensual not found.");
				else
					txtContador.setText("El texto sensual de arriba tiene "+LabelSensual.getText().replaceAll(" ","").length()+ " caracteres y "+arrayPalabras.length+" palabras.");
			}});
		
		botonExterminatus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LabelSensual.setText("EXTERMINATUS");
				txtContador.setText("El Emperador de la Humanidad ha dictaminado que no se cuenten más cosas por ahora.");
				// Quita todo el texto del JTextField	
				txtCosasSensualesQue.setText("");
			}});
	}
}
