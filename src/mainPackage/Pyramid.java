package mainPackage;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Pyramid {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		Pyramid run = new Pyramid();
		run.run();
	}
	public void run() {
		boolean invert = true;
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter A Integer (<60)"));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 80, 10, 10 * x));
		int u = 2 * x - 2;
		for(int i = 0;i<x;i++){
			
			String text = "";
			JLabel label = new JLabel();
			
			for(int k = 0; k < u;k++){
				text = text + "  ";
			}
			u = u - 1;
			for(int y = 0;y<=i;y++){
				text = text + "@ ";
			}
			label.setText(text);
			panel.add(label);
			frame.pack();
			
		}
	
	}
}
