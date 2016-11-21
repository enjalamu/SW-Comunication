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
import swComunicacion.Observer;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Opcion1 extends JFrame implements Observer{

	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOpcion_1;
	private JButton btnOpcion_2;
	private JButton btnExtra = new JButton("Otra");
	private Timer timer;
	private boolean vs1;
	private boolean vs2;
	private boolean vsExtra;
	private int frecuencia = 2000;
	private Controller c;
	private ImageIcon si;
	private ImageIcon no;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private boolean editando;
	private JButton btnEditarOpciones;
	private JButton btnAdd;
	private ToolbarSup t;
	
	public Opcion1(Controller controlador) {
		this.c = controlador;
		setTitle("Opcion 1");
		this.si = new ImageIcon("si.png");
		this.no = new ImageIcon("no.png");
		btnOpcion_1 = new JButton("SI");
		btnOpcion_1.setBounds(45, 75, 117, 79);
		btnOpcion_1.setBackground(Color.GREEN);
		btnOpcion_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_1.setIcon(si);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(100, 100, 450, 300);
		panel.setLayout(null);
		
		// PONER DIMENSIONES
		//t = new Toolbar(c);
		//panel.add(t);
		
		panel.add(btnOpcion_1);
		
		vs1 = true;
		
		btnOpcion_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { //al pulsar cualquier tecla
				timer.stop();
				if(vs1 == true){
					JOptionPane.showMessageDialog(null,btnOpcion_1.getText(), "Seleccion", 0, si); 

				}
				else if(vs2 == true){
					JOptionPane.showMessageDialog(null,btnOpcion_2.getText(), "Seleccion", 0, si); 
				
				}
				else if(vsExtra == true){
					JOptionPane.showMessageDialog(null,btnExtra.getText(), "Seleccion", 0, si);
				}
				timer.restart();
			}			
		});
	
		btnOpcion_2 = new JButton("NO");
		btnOpcion_2.setBounds(315,80,105,69);
		btnOpcion_2.setBackground(Color.RED);
		panel.add(btnOpcion_2);
		btnOpcion_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpcion_2.setIcon(no);
		vs2 = false;
	
		timer = new Timer (frecuencia, new ActionListener () 
		{ 
		    public void actionPerformed(ActionEvent e) 
		    { 
		    	if(!btnExtra.isVisible()){
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
		    	else{
		    		if(vs1 == true){
			    		btnOpcion_1.setBackground(Color.RED);
			    		btnExtra.setBackground(Color.GREEN);
			    		btnOpcion_2.setBackground(Color.RED);
			    		vs1 = false;
			    		vsExtra = true;
			    		vs2 = false;
			    	}
			    	else if(vsExtra == true){
			    		btnOpcion_1.setBackground(Color.RED);
			    		btnExtra.setBackground(Color.RED);
			    		btnOpcion_2.setBackground(Color.GREEN);
			    		vs1 = false;
			    		vsExtra = false;
			    		vs2 = true;
			    	}
			    	else if(vs2 == true){
			    		btnOpcion_1.setBackground(Color.GREEN);
			    		btnExtra.setBackground(Color.RED);
			    		btnOpcion_2.setBackground(Color.RED);
			    		vs1 = true;
			    		vsExtra = false;
			    		vs2 = false;
			    	}
		    	}
		    }
		}); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 309);
		panel.setVisible(true);
		setContentPane(panel);
		
		JLabel lblIntroduceEnEl = new JLabel("Respuesta rápida");
		lblIntroduceEnEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceEnEl.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblIntroduceEnEl.setBounds(104, 11, 240, 23);
		panel.add(lblIntroduceEnEl);
	
		btnAdd = new JButton("Añadir Opción");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnExtra.setVisible(true);
				btnOpcion_1.setBounds(15, 75, 117, 79);
				btnOpcion_2.setBounds(325, 75, 117, 79);
				btnOpcion_1.requestFocus();
				btnAdd.setEnabled(false);
			}
		});
		btnAdd.setBounds(332, 236, 117, 23);
		panel.add(btnAdd);
		
		btnEditarOpciones = new JButton("Editar opciones");
		editando = false;
		btnEditarOpciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(editando == false){
				timer.stop();
				text1.setVisible(true);
				btnOpcion_1.setVisible(false);
				text2.setVisible(true);
				btnOpcion_2.setVisible(false);
				if(!btnAdd.isEnabled()){
				text3.setVisible(true);
				btnExtra.setVisible(false);
				}
				editando = true;
				btnAdd.setVisible(false);
				btnEditarOpciones.setText("Guardar");
				}
				else{
					btnEditarOpciones.setText("Editar opciones");
					btnOpcion_1.setText(text1.getText());
					text1.setVisible(false);
					btnOpcion_1.setVisible(true);
					btnOpcion_2.setText(text2.getText());
					text2.setVisible(false);
					btnOpcion_2.setVisible(true);
					if(!btnAdd.isEnabled()){
					btnExtra.setText(text3.getText());
					text3.setVisible(false);
					btnExtra.setVisible(true);
					}
					editando = false;
					btnAdd.setVisible(true);
					timer.restart();
					btnOpcion_1.requestFocus();
				}
			}
		});
		btnEditarOpciones.setBounds(10, 236, 133, 23);
		panel.add(btnEditarOpciones);
		
		
		btnExtra.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExtra.setBackground(Color.RED);
		btnExtra.setBounds(170, 75, 117, 79);
		btnExtra.setVisible(false);
		panel.add(btnExtra);
		
		text1 = new JTextField();
		text1.setText("");
		text1.setBounds(40,106, 86, 20);
		panel.add(text1);
		text1.setColumns(10);
		text1.setVisible(false);
		text2 = new JTextField();
		text2.setText("");
		text2.setBounds(335, 106, 86, 20);
		panel.add(text2);
		text2.setColumns(10);
		text2.setVisible(false);
		text3 = new JTextField();
		text3.setText("");
		text3.setBounds(185, 106, 86, 20);
		panel.add(text3);
		text3.setColumns(10);
		text3.setVisible(false);
		vsExtra = false;
		
		this.setVisible(true);
		timer.start();
		this.c.addObserver(this);
	}

	public void onCambioOpcion(boolean opc) {
		// TODO Auto-generated method stub
		if(!opc)
		this.setVisible(false);
	}
}
