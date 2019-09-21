import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * @author Stephen Fan
 * @version 10/6/2015
 */
public class Building
{
    /** instance variables*/
    private int width;
    private int height;
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Building
     * @param width the width of the building
     * @param height the height of the building
     * @param x the x coordinate of the top left corner of the building
     * @param y the y coordinate of the top left corner of the building
     */
    public Building(int width,int height,int x, int y)
    {
        // initialise instance variables
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    /**
     * draw method
     * @post    draws a building
     * @param    g2 the Graphics2D object to draw to
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(x,y,width,height);
        
        g2.setColor(Color.BLACK);
        g2.draw(building);
        g2.fill(building);
    }

}
