package application;

import javax.swing.JFrame;
import javax.swing.JLabel;

import beans.Prova1;

public class Main {
	
	/** 
	 * prova javadoc 
	 * @param args il parametro principale
	 * @return void
	 */

	public static void main(String[] args) {
		
		//TODO: xxx
		//FIXME: aaa
		//XXX: asd
		
		System.out.println("AAA");
		
		Prova1 p = new Prova1();
		p.setNum(22);
		
		JFrame frame = new JFrame("FrameDemo");
		frame.setSize(500, 500);
		frame.add(new JLabel("Hello, World!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		
	}

}
