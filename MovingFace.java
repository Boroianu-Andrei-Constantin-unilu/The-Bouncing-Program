/*
 * Name: Mingwei Sun
 * UPI: msun932
 * My own selected emoji/face shape
 */
import java.awt.*;
public class MovingFace extends MovingOval{
	public MovingFace() {
		super(10, 20, 50, 20, 500, 500, Color.orange, Color.yellow, Path.FALLING); // the default properties
	}
	public MovingFace(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, Path pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(fillColor);
		g2d.fillOval(x, y, width, height);
		g2d.setPaint(borderColor);
		g2d.drawOval(x, y, width, height);
		drawHandles(g);
		//eyes
		g2d.setColor(Color.black);
		g2d.fillOval(x+(int)(width*0.3), y+(int)(height*0.3), width/6, height/6);
		g2d.fillOval(x+width-(int)(width*0.4), y+(int)(height*0.3), width/6, height/6);
		//month
		g2d.fillRect(x+(int)(width*0.3), y+height/2+20*height/100, (int)(0.5*width), height/15);
		
		
		
	}
	public boolean contains(Point mousePt) {
		return (x <= mousePt.x && mousePt.x <= (x + width + 1)	&&	y <= mousePt.y && mousePt.y <= (y + height + 1));
	}
	
	
}
