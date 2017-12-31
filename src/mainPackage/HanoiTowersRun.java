package mainPackage;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;

public class HanoiTowersRun extends JFrame implements KeyListener {
	HanoiTowersDraw draw;
	int Selection = 0;
	String Selected = "";
	
	public HanoiTowersRun(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1400,800);
	setResizable(false);
	setTitle("Hanoi Towers");
	addKeyListener(this);
	
	init();
	
	}
	
	public void init() {
		System.out.println("Running");
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(1, 1, 0, 0));
		draw = new HanoiTowersDraw();
		add(draw);
		
		setVisible(true);
		draw.tower1.push("Red");
		draw.tower1.push("Green");
		draw.tower1.push("Blue");
	}
	
	public static void main(String[] args) {
		new HanoiTowersRun();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(Selected);
		if(e.getKeyChar() == '1'){
			if(Selected.equals("")){
			Selected = draw.tower1.pop();
			} else if(Selected.equals("blue")){
				draw.bluePosX = 100;
				draw.bluePosY = 0 - 300;
				draw.repaint();
			}
		}
		}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
