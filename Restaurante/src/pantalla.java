

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class pantalla extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	public static final int TOTAL_LETRAS_PROCESAR=100;
	public static final int MILISEG_ESPERA_PRODUCTOR=1000;
	public static final int MILISEG_ESPERA_CONSUMIDOR=5000;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla frame = new pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public pantalla() {
		JLabel lblMesa = new JLabel("Mesa 1");
		lblMesa.setForeground(Color.GREEN);
		lblMesa.setBackground(Color.GREEN);
		
		JLabel lblMesa_1 = new JLabel("Mesa 2");
		lblMesa_1.setForeground(Color.GREEN);
		
		JLabel lblMesa_2 = new JLabel("Mesa 3");
		lblMesa_2.setForeground(Color.GREEN);
		
		JLabel lblMesa_3 = new JLabel("Mesa 4");
		lblMesa_3.setForeground(Color.GREEN);
		
		JLabel lblMesa_4 = new JLabel("Mesa 5");
		lblMesa_4.setForeground(Color.GREEN);
		
		JLabel lblMesa_5 = new JLabel("Mesa 6");
		lblMesa_5.setForeground(Color.GREEN);
		
		JLabel lblMesa_6 = new JLabel("Mesa 7");
		lblMesa_6.setForeground(Color.GREEN);
		
		JLabel lblMesa_7 = new JLabel("Mesa 8");
		lblMesa_7.setForeground(Color.GREEN);
		
		JLabel lblMesa_8 = new JLabel("Mesa 9");
		lblMesa_8.setForeground(Color.GREEN);
		
		JLabel lblMesa_9 = new JLabel("Mesa 0");
		lblMesa_9.setForeground(Color.GREEN);
		

		setFocusable(true);
		setTitle("Restaurante de CUCEI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 467);
		JPanel contentPane = new JPanel();

		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAbrir = new JButton("Iniciar");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mesas b=new Mesas();
				Productor p=new Productor(b,TOTAL_LETRAS_PROCESAR,MILISEG_ESPERA_PRODUCTOR);
				Consumidor c=new Consumidor(b,TOTAL_LETRAS_PROCESAR,MILISEG_ESPERA_CONSUMIDOR);
				p.start();
				c.start();
				p.recibeMesas(lblMesa, lblMesa_1, lblMesa_2, lblMesa_3, lblMesa_4, 
						lblMesa_5, lblMesa_6, lblMesa_7, lblMesa_8, lblMesa_9);
				c.recibeMesas(lblMesa, lblMesa_1, lblMesa_2, lblMesa_3, lblMesa_4, 
						lblMesa_5, lblMesa_6, lblMesa_7, lblMesa_8, lblMesa_9);
			}
		});
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(257, Short.MAX_VALUE)
					.addComponent(btnAbrir)
					.addGap(245))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMesa)
						.addComponent(lblMesa_3)
						.addComponent(lblMesa_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMesa_1)
							.addGap(159)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMesa_5)
								.addComponent(lblMesa_4))))
					.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMesa_6)
						.addComponent(lblMesa_7)
						.addComponent(lblMesa_8)
						.addComponent(lblMesa_9))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesa)
						.addComponent(lblMesa_6))
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesa_1)
						.addComponent(lblMesa_4)
						.addComponent(lblMesa_7))
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesa_2)
						.addComponent(lblMesa_8))
					.addGap(11)
					.addComponent(lblMesa_5)
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesa_3)
						.addComponent(lblMesa_9))
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addComponent(btnAbrir)
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
	}
}


