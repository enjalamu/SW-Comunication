package swComunicacion.views;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import swComunicacion.Controller;
import swComunicacion.Observer;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class PrincipalView extends JFrame implements Observer {

	private JPanel contentPane;
	private Controller c;
	//private boolean vs1 = true;
	private boolean vs1;
	private boolean vs2;
	private boolean vs3;
	private JButton btnOpcion_1;
	private JButton btnOpcion_2;
	private JButton btnOpcion_3;
	private Timer timer;
	private int frecuencia = 3000;
	private JButton btnHelp;
	public PrincipalView(Controller c2) {
		c = c2;
		setTitle("SW Comunicacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setToolTipText("Opciones");
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnHelp = new JButton("Help");
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Para seleccionar una opción debemos pulsar cualquier tecla cuando "
						+ "la opción que queramos esté en verde", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
				btnHelp.transferFocus();
			}
		}
		 );
		toolBar.add(btnHelp);
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		btnOpcion_1 = new JButton("Opcion 1");
		btnOpcion_1.setBackground(Color.GREEN);
		panel.add(btnOpcion_1, BorderLayout.WEST);
		btnOpcion_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		vs1 = true;
		
		btnOpcion_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { //al pulsar cualquier tecla
				timer.stop();
				if(vs1 == true){
					JOptionPane.showMessageDialog(null, "Ha elegido la opción 1", "Info", JOptionPane.INFORMATION_MESSAGE);

				}
				else if(vs2 == true){
					JOptionPane.showMessageDialog(null, "Ha elegido la opción 2", "Info", JOptionPane.INFORMATION_MESSAGE);

				}
				else if(vs3 == true){
					JOptionPane.showMessageDialog(null, "Ha elegido la opción 3", "Info", JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});
		
		
		btnOpcion_2 = new JButton("Opcion 2");
		btnOpcion_2.setBackground(Color.RED);
		panel.add(btnOpcion_2, BorderLayout.CENTER);
		btnOpcion_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		vs2 = false;
		
		btnOpcion_3 = new JButton("Opcion 3");
		btnOpcion_3.setBackground(Color.RED);
		panel.add(btnOpcion_3, BorderLayout.EAST);
		btnOpcion_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		vs3 = false;
		
		setVisible(true);
		this.c.anadirVista(this);
		
		// la frecuencia hace referencia al intervalo con que se realizará la función (en milisegundos)
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
		    		btnOpcion_3.setBackground(Color.GREEN);
		    		vs2 = false;
		    		vs3 = true;
		    	}
		    	else if(vs3 == true){
		    		btnOpcion_3.setBackground(Color.RED);
		    		btnOpcion_1.setBackground(Color.GREEN);
		    		vs3 = false;
		    		vs1 = true;
		    	}
		    	
		     } 
		}); 

		btnOpcion_1.requestFocus();
		timer.start();
			
	}
	
}
