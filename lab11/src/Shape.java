import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape implements Drawable
{
    protected Point[] location;
    private Color color;
    private boolean filled;
    
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public boolean isFilled()
    {
        return this.filled;
    }
    
    public Point[] getLocation()
    {
        return this.location;   
    }
}
