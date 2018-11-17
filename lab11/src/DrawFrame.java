import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 1000;
        int height = 800;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        Circle outline = new Circle(new Point(400, 300), 550, Color.BLACK, false);
        Circle collarButtonInside = new Circle(new Point(400, 500), 60, Color.RED, true);
        Circle collarButtonOutside = new Circle(new Point(400, 500), 35, Color.GREEN, false);
                
        // Ears:
        RightTriangle ear1 = new RightTriangle(new Point(555, 140), -70, -110, Color.BLACK, true);
        RightTriangle ear2 = new RightTriangle(new Point(245, 140), 70, -110, Color.BLACK, true);
        RightTriangle earInside1 = new RightTriangle(new Point(550, 140), -50, -100, Color.PINK, true);
        RightTriangle earInside2 = new RightTriangle(new Point(250, 140), 50, -100, Color.PINK, true);
        
        // Eyes (and tongue):
        Oval eye1 = new Oval(new Point(300, 200), 50, 100, Color.WHITE, true);
        Oval eye2 = new Oval(new Point(500, 200), 50, 100, Color.WHITE, true);
        Oval pupil1 = new Oval(new Point(300, 200), 25, 50, Color.BLACK, true);
        Oval pupil2 = new Oval(new Point(500, 200), 25, 50, Color.BLACK, true);
        Oval tongue = new Oval(new Point(450, 420), 40, 75, Color.RED, true);
        
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 25, Color.BLACK, true);
        
        // Collar:
        Oval collar = new Oval(new Point(400, 500), 350, 40, Color.BLUE, true);
        
        //Mouth:
        PolyLine mouthLeft = new PolyLine(new Point(300, 350), new Point(400, 400), 50, 
                Color.BLACK, true);
        PolyLine mouthRight = new PolyLine(new Point(400, 400), new Point(500, 350), 50, 
                Color.BLACK, true);
        
        // Square around the dog:
        Square squareOutline = new Square(new Point(400, 300), 550, Color.MAGENTA, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(nose);
        drawPanel.addShape(outline);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(pupil1);
        drawPanel.addShape(pupil2);
        drawPanel.addShape(ear1);
        drawPanel.addShape(ear2);
        drawPanel.addShape(earInside1);
        drawPanel.addShape(earInside2);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarButtonInside);
        drawPanel.addShape(collarButtonOutside);
        drawPanel.addShape(squareOutline);
        drawPanel.addShape(mouthLeft);
        drawPanel.addShape(mouthRight);
        drawPanel.addShape(tongue);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
