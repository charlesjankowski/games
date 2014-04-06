package ch03FirstGame;

import java.awt.Polygon;
import java.awt.Rectangle;
/*********************************************************
 * Ship class - polygonal shape of the player's ship
 **********************************************************/
public class Ship extends BaseVectorShape {
    //define the ship polygon
    private int[] shipx = { -8, -20, -8, -4, 4, 8, 20, 8, 0 };
    private int[] shipy = { 0, 16, 16, 24, 24, 16, 16, 0, -20 };

    //bounding rectangle
    public Rectangle getBounds() {
        Rectangle r;
        r = new Rectangle((int)getX() - 6, (int) getY() - 6, 12, 12);
        return r;
    }

    Ship() {
        setShape(new Polygon(shipx, shipy, shipx.length));
        setAlive(true);
    }
}

