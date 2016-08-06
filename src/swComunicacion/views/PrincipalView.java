package swComunicacion.views;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import swComunicacion.Controller;
import swComunicacion.Observer;

public class PrincipalView extends JFrame implements Observer {

	private JPanel contentPane;
	private Controller c;
	
	public PrincipalView(Controller c2) {
		c = c2;
		setTitle("SW Comunicacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOpcion_2 = new JButton("Opcion 2");
		btnOpcion_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_2.setBounds(144, 29, 146, 232);
		contentPane.add(btnOpcion_2);
		
		JButton btnOpcion_1 = new JButton("Opcion 1");
		btnOpcion_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_1.setBounds(0, 29, 146, 232);
		contentPane.add(btnOpcion_1);
		
		JButton btnOpcion_3 = new JButton("Opcion 3");
		btnOpcion_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_3.setBounds(288, 29, 146, 232);
		contentPane.add(btnOpcion_3);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setToolTipText("Opciones");
		toolBar.setBounds(0, 0, 434, 30);
		contentPane.add(toolBar);
		setVisible(true);
		this.c.anadirVista(this);
	}
}
