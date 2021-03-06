package swComunicacion.views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JTextArea;

import swComunicacion.Controller;
import swComunicacion.Observer;

public class Opcion2 extends JFrame implements Observer{
	
	private static final long serialVersionUID = 1L;
	private  JTextArea textArea;
	private LinkedList<Boolean> bBotones;
	private LinkedList<JButton> botones;
	private JPanel contentPane;
	private Timer timer;
	private JButton btnW;
	private JButton btnE;
	private JButton btnR;
	private JButton btnT;
	private JButton btnY;
	private JButton btnU;
	private JButton btnI;
	private JButton btnO;
	private JButton btnP;
	private JButton btnA;
	private JButton btnS;
	private JButton btnD;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnEnie;
	private JButton btnZ;
	private JButton btnX;
	private JButton btnC;
	private JButton btnV;
	private JButton btnB;
	private JButton btnN;
	private JButton btnM;
	private JButton btnEspacio;
	private int frecuencia = 500;
	private ToolbarSup t;
	private Controller c;
	
	public Opcion2(Controller controlador) {
		this.c = controlador;
		setTitle("Opcion 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		botones = new LinkedList<JButton>();
		bBotones = new LinkedList<Boolean>();
		JPanel panel = new JPanel();
		t = new ToolbarSup(c);
		contentPane.add(t, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		bBotones.add(true);
		for(int i=1; i<29;i++){		
			bBotones.add(false);
		}
		
		textArea = new JTextArea();
		textArea.setEditable(true);
		textArea.setFocusable(false);
		textArea.setBounds(10, 11, 529, 60);
		panel.add(textArea);
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(10, 82, 44, 44);
		btnQ.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(0)==true)
					textArea.append("q");
				if(bBotones.get(1)==true)
					textArea.append("w");
				if(bBotones.get(2)==true)
					textArea.append("e");
				if(bBotones.get(3)==true)
					textArea.append("r");
				if(bBotones.get(4)==true)
					textArea.append("t");
				if(bBotones.get(5)==true)
					textArea.append("y");
				if(bBotones.get(6)==true)
					textArea.append("u");
				if(bBotones.get(7)==true)
					textArea.append("i");
				if(bBotones.get(8)==true)
					textArea.append("o");
				if(bBotones.get(9)==true)
					textArea.append("p");
				if(bBotones.get(10)==true)
					textArea.append("a");
				if(bBotones.get(11)==true)
					textArea.append("s");
				if(bBotones.get(12)==true)
					textArea.append("d");
				if(bBotones.get(13)==true)
					textArea.append("f");
				if(bBotones.get(14)==true)
					textArea.append("g");
				if(bBotones.get(15)==true)
					textArea.append("h");
				if(bBotones.get(16)==true)
					textArea.append("j");
				if(bBotones.get(17)==true)
					textArea.append("k");
				if(bBotones.get(18)==true)
					textArea.append("l");
				if(bBotones.get(19)==true)
					textArea.append("\u00D1");
				if(bBotones.get(20)==true)
					textArea.append("z");
				if(bBotones.get(21)==true)
					textArea.append("x");
				if(bBotones.get(22)==true)
					textArea.append("c");
				if(bBotones.get(23)==true)
					textArea.append("v");
				if(bBotones.get(24)==true)
					textArea.append("b");
				if(bBotones.get(25)==true)
					textArea.append("n");
				if(bBotones.get(26)==true)
					textArea.append("m");
				if(bBotones.get(27)==true)
					textArea.setText(textArea.getText().substring(0, (textArea.getText().length()-1)));
				if(bBotones.get(28)==true){
					textArea.append("\u0020");
					}
					
				timer.restart();
			}			
		});
		panel.add(btnQ);
		botones.add(btnQ);
		
		btnW = new JButton("W");
		btnW.setBounds(63, 82, 44, 44);
		btnW.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(2)==true)
					textArea.append("w");
				timer.restart();
			}			
		});		
		panel.add(btnW);
		botones.add(btnW);
		
		btnE = new JButton("E");
		btnE.setBounds(117, 82, 44, 44);
		btnE.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(3)==true)
					textArea.append("e");
				timer.restart();
			}			
		});
		panel.add(btnE);
		botones.add(btnE);
		
		btnR = new JButton("R");
		btnR.setBounds(171, 82, 44, 44);
		btnR.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(4)==true)
					textArea.append("r");
				timer.restart();
			}			
		});
		panel.add(btnR);
		botones.add(btnR);
		
		btnT = new JButton("T");
		btnT.setBounds(225, 82, 44, 44);
		btnT.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(5)==true)
					textArea.append("t");
				timer.restart();
			}			
		});
		panel.add(btnT);
		botones.add(btnT);
		
		btnY = new JButton("Y");
		btnY.setBounds(279, 82, 44, 44);
		btnY.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) { 
				timer.stop();
				if(bBotones.get(6)==true)
					textArea.append("y");
				timer.restart();
			}			
		});
		panel.add(btnY);
		botones.add(btnY);
		
		btnU = new JButton("U");
		btnU.setBounds(333, 82, 44, 44);
	
		panel.add(btnU);
		botones.add(btnU);
		
		btnI = new JButton("I");
		btnI.setBounds(387, 82, 44, 44);
		
		panel.add(btnI);
		botones.add(btnI);
		
		btnO = new JButton("O");
		btnO.setBounds(441, 82, 44, 44);
		
		panel.add(btnO);
		botones.add(btnO);
		
		btnP = new JButton("P");
		btnP.setBounds(495, 82, 44, 44);
		
		panel.add(btnP);
		botones.add(btnP);
		
		btnA = new JButton("A");
		btnA.setBounds(10, 137, 44, 44);
		
		panel.add(btnA);
		botones.add(btnA);
		
		btnS = new JButton("S");
		btnS.setBounds(62, 137, 44, 44);
		
		panel.add(btnS);
		botones.add(btnS);
		
		btnD = new JButton("D");
		btnD.setBounds(116, 137, 44, 44);
		
		panel.add(btnD);
		botones.add(btnD);
		
		btnF = new JButton("F");
		btnF.setBounds(170, 137, 44, 44);
		
		panel.add(btnF);
		botones.add(btnF);
		
		btnG = new JButton("G");
		btnG.setBounds(224, 137, 44, 44);
		
		panel.add(btnG);
		botones.add(btnG);
		
		btnH = new JButton("H");
		btnH.setBounds(276, 137, 43, 44);
		
		panel.add(btnH);
		botones.add(btnH);
		
		btnJ = new JButton("J");
		btnJ.setBounds(327, 137, 44, 44);
		
		panel.add(btnJ);
		botones.add(btnJ);
		
		btnK = new JButton("K");
		btnK.setBounds(381, 137, 44, 44);
		
		panel.add(btnK);
		botones.add(btnK);
		
		btnL = new JButton("L");
		btnL.setBounds(435, 137, 44, 44);
		
		panel.add(btnL);
		botones.add(btnL);
		
		btnEnie = new JButton("\u00D1");
		
		btnEnie.setBounds(489, 137, 44, 44);
		panel.add(btnEnie);
		botones.add(btnEnie);
		
		btnZ = new JButton("Z");
		btnZ.setBounds(63, 192, 44, 44);
		
		panel.add(btnZ);
		botones.add(btnZ);
		
		btnX = new JButton("X");
		btnX.setBounds(117, 192, 44, 44);
		
		panel.add(btnX);
		botones.add(btnX);
		
		btnC = new JButton("C");
		btnC.setBounds(171, 192, 44, 44);
		
		panel.add(btnC);
		botones.add(btnC);
		
		btnV = new JButton("V");
		btnV.setBounds(225, 192, 44, 44);
		
		panel.add(btnV);
		botones.add(btnV);
		
		btnB = new JButton("B");
		btnB.setBounds(279, 192, 44, 44);
		
		panel.add(btnB);
		botones.add(btnB);
		
		btnN = new JButton("N");
		btnN.setBounds(335, 192, 44, 44);
		
		panel.add(btnN);
		botones.add(btnN);
		
		btnM = new JButton("M");
		btnM.setBounds(389, 192, 44, 44);
		
		panel.add(btnM);
		botones.add(btnM);
		
		JButton button = new JButton("BORRAR");
		
		button.setBounds(441, 192, 89, 44);
		panel.add(button);
		botones.add(button);
		System.out.println(botones.size());
		
		btnEspacio = new JButton("ESPACIO");
		btnEspacio.setBounds(148, 248, 257, 44);
		
		panel.add(btnEspacio);
		this.setVisible(true);
		botones.add(btnEspacio);
		System.out.println(botones.size());
	
		
		
		timer = new Timer (frecuencia, new ActionListener () 
		{ int act =0;
		    public void actionPerformed(ActionEvent e) 
		    { 
		    	//bBotones.set(act, true);
		    
		    	
		    	for(int i=0; i<botones.size();i++){		    		
		    		if(bBotones.get(i) == true){
		    			botones.get(i).setBackground(Color.GREEN);		    			
		    			bBotones.set(act, false);
		    			act=i+1;
		    			bBotones.set(act, false);
		    			
		    			
		    		}
		    		else if(bBotones.get(i) == false){
		    			botones.get(i).setBackground(null);
		    			bBotones.set(i, false);
		    			
		    		}
		    		
		    	}
		    	
//		    	bBotones.set(act-1, false);
//		    	if ((act+1)>=29)act=0;
//		    	bBotones.set((act), true);
		    	//bBotones.set(act+1, true);
		    } 
		}); 
		timer.start();
		//this.btnA.requestFocus();
		this.c.addObserver(this);			
	}

	public void onCambioOpcion(boolean opc) {
		// TODO Auto-generated method stub
		if(!opc)
		this.setVisible(false);
	}
}
