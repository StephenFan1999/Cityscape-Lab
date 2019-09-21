import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Write a description of class Background here.
 * 
 * @author Stephen Fan
 * @version (a version number or a date)
 */
public class Background
{
    // instance variables - replace the example below with your own
    private int width, height;
    private Color color;
    /**
     * Constructor for objects of class Background
     * @param color the color of the background
     */
    public Background(Color color)
    {
        // initialise instance variables
        width = 800;
        height = 600;
        this.color = color;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param g2 the Graphics2D object draws to
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle background = new Rectangle(0,0,800,600);
        g2.setColor(color);
        g2.fill(background);
        g2.draw(background);
        
    }
}
