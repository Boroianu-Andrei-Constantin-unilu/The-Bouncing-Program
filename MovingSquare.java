/*
 * Name: Mingwei Sun
 * UPI: msun932
 * MovingSquare subclass
 */
import java.awt.*;
public class MovingSquare extends MovingRectangle {
	public MovingSquare() {
		super(10, 20, 50, 20, 500, 500, Color.orange, Color.yellow, Path.FALLING); // the default properties
	}
	public MovingSquare(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, Path pathType) {
		super(x, y, Math.min(w,h), Math.min(w,h), mw, mh, bc, fc, pathType);
	}
	public void setWidth(int w) { 
		width = w; 
		height = w;
	}
	    /** Set the height of the shape.
	     * @param h     the height value
	     */
	public void setHeight(int h) { 
		height = h;
		width = h;
	}
}
