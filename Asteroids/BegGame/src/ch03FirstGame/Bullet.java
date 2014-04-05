package ch03FirstGame;

import java.awt.*;

/*********************************************************
 * Bullet class - polygonal shape of a bullet

 **********************************************************/
public class Bullet extends BaseVectorShape {

	private int[] bulletx = { -4, -10, -4, -2, 2, 4, 10, 4, 0 };
    private int[] bullety = { 0, 8, 8, 12, 12, 8, 8, 0, -10 };
    
    //bounding rectangle
    public Rectangle getBounds() {
        Rectangle r;
        r = new Rectangle((int)getX(), (int) getY(), 1, 1);
        return r;
    }

    Bullet() {
        //create the bullet shape
        setShape(new Polygon(bulletx, bullety, bulletx.length));
        setAlive(false);
    }
}

