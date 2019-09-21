import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Cityscape here.
 * 
 * @author Stephen Fan
 * @version 10/6/2015
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
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
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     * @post    draws a building
     * @param    g2 the Graphics2D object to draw to
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle building = new Rectangle(x,y,width,height);
        
        g2.setColor(Color.BLACK);
        g2.draw(building);
        g2.fill(building);
    }

}
