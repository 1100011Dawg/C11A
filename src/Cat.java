import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// ears will be at the top of the head on either side
	private static final int EAR_SEPARATION = HEAD_DIMENSION/4 * 3;
	private static final int EAR_DIMENSION = 30;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.darkGray);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw ears
		g2.fillOval(x, y, EAR_DIMENSION, EAR_DIMENSION);
		g2.fillOval(x + EAR_SEPARATION, y, EAR_DIMENSION, EAR_DIMENSION);
		g2.setColor(Color.pink);
		g2.fillOval(x+EAR_DIMENSION/4, y+EAR_DIMENSION/4, EAR_DIMENSION/2, EAR_DIMENSION/2);
		g2.fillOval(x + EAR_SEPARATION+EAR_DIMENSION/4, y+EAR_DIMENSION/4, EAR_DIMENSION/2, EAR_DIMENSION/2);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow", catX+30, catY+HEAD_DIMENSION+15);	
		//I'm a cat text above the cat
		g2.drawString("I'm A Cat", catX+20, catY-5);	
	}
}
