package mainPackage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class HanoiTowersDraw extends JPanel{
	
	private BufferedImage redDisk;
	private BufferedImage greenDisk;
	private BufferedImage blueDisk;
	public Stack<String> tower1 = new Stack<String>();
	public Stack<String> tower2 = new Stack<String>();
	public Stack<String> tower3 = new Stack<String>();
	public int height = 600;
	public int redPosY = 0;
	public int greenPosY = 120;
	public int bluePosY = 240;
	public int redPosX = 100;
	public int greenPosX = 100;
	public int bluePosX = 100;
	
	public HanoiTowersDraw(){
		try {
			redDisk = ImageIO.read(getClass().getResourceAsStream("Red.png"));
			greenDisk = ImageIO.read(getClass().getResourceAsStream("Green.png"));
			blueDisk = ImageIO.read(getClass().getResourceAsStream("Blue.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
		
	}
	public void paint(Graphics g){
		g.drawImage(redDisk, redPosX, height - redPosY, 300, 120, null);
		g.drawImage(greenDisk, greenPosX + 25, height - greenPosY, 250, 120, null);
		g.drawImage(blueDisk, bluePosX + 50,  height - bluePosY, 200, 120, null);
	}
	
}
