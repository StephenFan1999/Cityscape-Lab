import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Tree class
 * 
 * @author Stephen Fan
 * @version 10/12
 */
public class Tree
{
    /** instance variables*/
    private int width1;
    private int height1;
    private int x1;
    private int y1;

    
    private int width2;
    private int height2;
    private int x2;
    private int y2;

    /**
     * Default constructor for objects of class Tree
     * @param x1 the x coordinate of the top left corner of the tree trunk
     */
    public Tree(int x1)
    {
        // initialise instance variables
        this.height1 = 100;
        this.width1 = 25;
        this.x1 = x1;
        this.y1 = 500;
        
        this.width2 = 60;
        this.height2 = 85;
        this.x2 = x1 - 15;
        this.y2 = 420;

    }

    /**
     * draw method
     * @post    draws a tree
     * @param    g2 the Graphics2D object to draw to
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle trunk = new Rectangle(x1,y1,width1,height1);
        Ellipse2D.Double leaves = new Ellipse2D.Double(x2,y2,width2,height2);
        
        g2.setColor(Color.BLACK);
        g2.draw(trunk);
        g2.fill(trunk);

        g2.draw(leaves);
        g2.fill(leaves);
    }

}
