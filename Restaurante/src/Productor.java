import java.awt.Color;

import javax.swing.JLabel;

public class Productor extends Thread {
	JLabel mesa1;
	JLabel mesa2;
	JLabel mesa3;
	JLabel mesa4;
	JLabel mesa5;
	JLabel mesa6;
	JLabel mesa7;
	JLabel mesa8;
	JLabel mesa9;
	JLabel mesa10;
	private Mesas bandeja;
	private int totalLetrasProducir;
	private int milisegEsperaEntreProducciones;

	public Productor(Mesas b,int totalLetrasProducir,
			int milisegEsperaEntreProducciones){
		bandeja=b;
		this.totalLetrasProducir=totalLetrasProducir;
		this.milisegEsperaEntreProducciones=milisegEsperaEntreProducciones;
	}

	public void run(){
		final String ALFABETO="0123456789";
		char c;
		for(int i=0,totalCaracteres=ALFABETO.length();i<totalLetrasProducir;i++){
			bandeja.agregaCaracter(c=ALFABETO.charAt((int)(Math.random()*totalCaracteres)));
			System.out.println( "Se ocupo la mesa numero: " + c);
			if(c == '0')
				mesa10.setForeground(Color.RED);
			if(c == '1')
				mesa1.setForeground(Color.RED);
			if(c == '2')
				mesa2.setForeground(Color.RED);
			if(c == '3')
				mesa3.setForeground(Color.RED);
			if(c == '4')
				mesa4.setForeground(Color.RED);
			if(c == '5')
				mesa5.setForeground(Color.RED);
			if(c == '6')
				mesa6.setForeground(Color.RED);
			if(c == '7')
				mesa7.setForeground(Color.RED);
			if(c == '8')
				mesa8.setForeground(Color.RED);
			if(c == '9')
				mesa9.setForeground(Color.RED);
			try{
				sleep((int)(Math.random()*milisegEsperaEntreProducciones));
			}catch(InterruptedException e){
				;
			}
		}
	}
	
	public void recibeMesas(JLabel mesa1, JLabel mesa2, JLabel mesa3,
			JLabel mesa4, JLabel mesa5, JLabel mesa6, JLabel mesa7, JLabel mesa8,
			JLabel mesa9, JLabel mesa10) {
		this.mesa1 = mesa1;
		this.mesa2 = mesa2;
		this.mesa3 = mesa3;
		this.mesa4 = mesa4;
		this.mesa5 = mesa5;
		this.mesa6 = mesa6;
		this.mesa7 = mesa7;
		this.mesa8 = mesa8;
		this.mesa9 = mesa9;
		this.mesa10 = mesa10;
	}
}
