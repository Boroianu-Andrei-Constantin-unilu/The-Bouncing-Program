/*
 * Name: Mingwei Sun
 * UPI: msun932
 * A subclass MovingRectangle of MovingShape
 */
import java.awt.*;
public class MovingRectangle extends MovingShape{
	public MovingRectangle() {
		super(10, 20, 50, 20, 500, 500, Color.orange, Color.yellow, Path.FALLING); // the default properties
	}
	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, Path pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
		
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(fillColor);
		g2d.fillRect(x, y, width, height);
		g2d.setPaint(borderColor);
		g2d.drawRect(x, y, width, height);
		drawHandles(g);
	}

	/** Returns whether the point is in the rectangle or not
	 * @return true if and only if the point is in the rectangle, false otherwise.
	 */
	public boolean contains(Point mousePt) {
		return (x <= mousePt.x && mousePt.x <= (x + width + 1)	&&	y <= mousePt.y && mousePt.y <= (y + height + 1));
	}

    /** Set the path of the shape.
     * @param pathID     the integer value of the path
     *    MovingPath.FALLING is the falling path
     */
}
