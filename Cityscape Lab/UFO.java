import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * UFO Class
 * 
 * @author Stephen Fan
 * @version 10/12
 */
public class UFO
{
    /** instance variables*/
    private int cradius;
    private int ewidth;
    private int eheight;
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Default constructor for objects of class UFO
     * @param x1 the x coordinate of the top left corner of the box surrounding the circle that forms the window of the UFO
     * @param y1 the y coordinate of the top left corner of the box surrounding the circle that forms the window of the UFO
     */
    public UFO(int x1,int y1)
    {
        // initialise instance variables
        this.x1 = x1;
        this.y1 = y1;
        this.cradius = 40;
        
        this.x2 = x1 - 20;
        this.y2 = y2 + 120;
        this.eheight = 20;
        this.ewidth = 80;
    }

    /**
     * draw method
     * @post    draws a UFO
     * @param    g2 the Graphics2D object to draw to
     */
    public void draw(Graphics2D g2)
    {
        // draw UFO
        Ellipse2D.Double window = new Ellipse2D.Double(x1,y1,cradius,cradius);
        Ellipse2D.Double body = new Ellipse2D.Double(x2,y2,ewidth,eheight);
        
        g2.setColor(Color.GREEN);
        g2.draw(window);
        g2.fill(window);
        g2.setColor(Color.BLACK);
        g2.draw(body);
        g2.fill(body);
    }

}
