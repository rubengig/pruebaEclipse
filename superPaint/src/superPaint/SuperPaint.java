package superPaint;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JCheckBox;
import java.awt.MultipleGradientPaint.ColorSpaceType;

public class SuperPaint {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperPaint window = new SuperPaint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuperPaint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();

		Linea l = new Linea();
		Figura f;
		
		
		JLabel lblposicion = new JLabel("");
		lblposicion.setBounds(30, 433, 135, 13);
		frame.getContentPane().add(lblposicion);
		
		frame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
			lblposicion.setText("x: "+ String.valueOf(e.getX()+" y: "+String.valueOf(e.getY())));
				
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Linea", "Rectangulo", "Ovalo"}));
		comboBox.setBounds(30, 10, 146, 21);
		frame.getContentPane().add(comboBox);
		
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				l.setColor(Color.BLACK);
				l.setX1(e.getX());
				l.setY1(e.getY());
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				
			}
			@Override
			public void mouseReleased(MouseEvent e) {

				l.setX2(e.getX());
				l.setY2(e.getY());
				
				Linea lDibujo= new Linea( l.getX1(), l.getY1(), l.getX2(), l.getY2(), Color.BLACK );
				l.draw( frame.getGraphics());
			
//				
//				switch (comboBox.getSelectedIndex()) { //0 linea, 1 rectangulo, 2 ovalo{
//	                case 0:
//	                    
//	                    
//	                    break;
//	                case 1:
//	                    Rectangulo r= new Rectangulo( e.getX(), e.getY(), 
//	                                                        e.getX(), e.getY(), Color.BLACK);
//	                    break;
//	                case 2:
//	                    Ovalo o= new Ovalo( e.getX(), e.getY(), 
//	                                                   e.getX(), e.getY(),Color.BLACK);
//
//				break;
//	                    
//	            }
				
			}
		});
		frame.setBounds(100, 100, 817, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Rellenar");
		chckbxNewCheckBox.setBounds(338, 10, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JComboBox comboBoxColor = new JComboBox();
		comboBoxColor.setBounds(186, 10, 146, 21);
		frame.getContentPane().add(comboBoxColor);
		
		
		
		
		
		
	}
}
