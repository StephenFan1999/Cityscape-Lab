import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * @author Stephen Fan
 * @version
 */
public class Background
{
    // instance variables
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
     * draw method
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
