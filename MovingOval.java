/*
 * Name: Mingwei Sun
 * UPI: msun932
 * MovingOval subclass can draw a circle/ellipse based
 * on the mouse-point, the current width, the current height, the current border colour, the current fill colour and
 * the current moving path saved in the AnimationPanel.
 */
import java.awt.*;
public class MovingOval extends MovingShape {
	public MovingOval() {
		super(10, 20, 50, 20, 500, 500, Color.orange, Color.yellow, Path.FALLING); // the default properties
	}
	public MovingOval(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, Path pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(fillColor);
		g2d.fillOval(x, y, width, height);
		g2d.setPaint(borderColor);
		g2d.drawOval(x, y, width, height);
		drawHandles(g);
	}
	public boolean contains(Point mousePt) {
		return (x <= mousePt.x && mousePt.x <= (x + width + 1)	&&	y <= mousePt.y && mousePt.y <= (y + height + 1));
	}
	
}
