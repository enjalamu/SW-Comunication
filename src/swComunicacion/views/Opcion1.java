package swComunicacion.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import swComunicacion.Controller;

public class Opcion1 extends JFrame {

	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOpcion_1;
	private JButton btnOpcion_2;
	private Timer timer;
	private boolean vs1;
	private boolean vs2;
	private int frecuencia = 3000;
	private Controller c;
	private ImageIcon si;
	private ImageIcon no;
	public Opcion1(Controller controlador) {
		this.c = controlador;
		setTitle("Opcion 1");
		this.si = new ImageIcon("si.png");
		this.no = new ImageIcon("no.png");
		btnOpcion_1 = new JButton("SI");
		btnOpcion_1.setBackground(Color.GREEN);
		btnOpcion_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_1.setIcon(si);
		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 450, 300);
		panel.add(btnOpcion_1, BorderLayout.WEST);
		
		vs1 = true;
		
		btnOpcion_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { //al pulsar cualquier tecla
				timer.stop();
				if(vs1 == true){
					 
					JOptionPane.showMessageDialog(null, "SI", "Selección", 0, si);
				}
				else if(vs2 == true){
					JOptionPane.showMessageDialog(null, "NO", "Selección", 0, no); 
				
				}
				timer.restart();
			}			
		});
	
		btnOpcion_2 = new JButton("NO");
		btnOpcion_2.setBounds(50,50,50,50);
		btnOpcion_2.setBackground(Color.RED);
		panel.add(btnOpcion_2, BorderLayout.EAST);
		btnOpcion_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_2.setIcon(no);
		vs2 = false;
		btnOpcion_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { //al pulsar cualquier tecla
				timer.stop();
				if(vs1 == true){
					JOptionPane.showMessageDialog(null,"SI"); 

				}
				else if(vs2 == true){
					JOptionPane.showMessageDialog(null,"NO"); 
				
				}
				timer.restart();
			}			
		});
	
		timer = new Timer (frecuencia, new ActionListener () 
		{ 
		    public void actionPerformed(ActionEvent e) 
		    { 
		    	if(vs1 == true){
		    		btnOpcion_1.setBackground(Color.RED);
		    		btnOpcion_2.setBackground(Color.GREEN);
		    		vs1 = false;
		    		vs2 = true;
		    	}
		    	else if(vs2 == true){
		    		btnOpcion_2.setBackground(Color.RED);
		    		btnOpcion_1.setBackground(Color.GREEN);
		    		vs2 = false;
		    		vs1 = true;
		    	}
		     } 
		}); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel.setVisible(true);
		setContentPane(panel);
		this.setVisible(true);
		
		timer.start();
	}

	private void cerrarVentana() {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}
}
