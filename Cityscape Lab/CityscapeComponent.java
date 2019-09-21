import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Stephen Fan
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    Building building1;
    Building building2;
    Building building3;
    Building building4;
    Building building5;

    

    Moon moon;

    Tree tree;
    Tree tree2;
    Tree tree3;
    
    UFO ufo;
    Background background;
    // define the CityscapeComponent contructor and intiailize all instance variables
    public CityscapeComponent(Color color, boolean isDay)
    {
        building1 = new Building(70,300,120,300);
        building2 = new Building(70,550,190,50);
        building3 = new Building(70,440,260,160);
        building4 = new Building(70,500,330,100);
        building5 = new Building(70,390,400,210);
        
        moon  = new Moon(650,85, isDay);
        tree = new Tree(40);
        tree2 = new Tree(520);
        tree3 = new Tree(630);
        
        ufo = new UFO(550,100);
        
        background = new Background(color);
    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        background.draw(g2);
        
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        
        moon.draw(g2);
        tree.draw(g2);
        tree2.draw(g2);
        tree3.draw(g2);
        ufo.draw(g2);
       
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
        moon.update();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
