import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    // instance variables - replace the example below with your own
    private int radius;
    
    private int x1;
    private int y1;
    private boolean isDay;

    /**
     * Constructor for objects of class Moon
     * @param x1 the x coordinate of the top left corner of the box that would surround the moon
     * @param y1 the y coordinate of the top left corner of the box that would surround the moon
     * @param isDay whether the time is day or night
     */
    public Moon(int x1, int y1, boolean isDay)
    {
        // initialise instance variables
        this.x1 = x1;
        this.y1 = y1;
        
        this.radius = 80;
        this.isDay = isDay;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  g2 the Graphics2D object to draw to
     * @post draws a moon or a sun depending on the user input
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double moon = new Ellipse2D.Double(x1,y1,radius,radius);
        
        
        if(isDay)
        {
            g2.setColor(Color.YELLOW);
        }
        else
        {
            g2.setColor(Color.WHITE);
        }
        g2.draw(moon);
        g2.fill(moon);
        
    }
    public void update()
    {
        x1 += 20;
    }
}
