import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    // TODO: implement this.
    private static Rectangle r1 = new Rectangle(new Point(100, 100), 100, 100, Color.BLACK, true);
    private static Point r1UL = new Point(50, 50);
    private static Point r1LL = new Point(150, 50);
    private static Point r1UR = new Point(50, 150);
    private static Point r1LR = new Point(150, 150);
    private static Rectangle r2 = new Rectangle(new Point(150, 150), 100, 100, Color.BLUE, false);
    private static Point r2UL = new Point(100, 100);
    private static Point r2LL = new Point(150, 150);
    private static Point r2UR = new Point(75, 150);
    private static Point r2LR = new Point(150, 75);
    
    //Number of points
    @Test
    public void testRectangleConstructorPointsArrayLength()
    {
        Point[] pts = r1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    //Check points
    @Test
    public void testSquareConstructorCalculatedPoints()
    {
        Point[] pts1 = r1.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, r1UR));
        
        Point[] pts2 = r2.getLocation();
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2UL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2LL));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2LR));
        Assert.assertTrue("Expected point not appearing in Rectangle. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, r2UR));     
    }
    
    //Test if unfilled
    @Test
    public void testRectangleConstructorUnfilled()
    {
        Assert.assertFalse("Rectangle fill incorrect.", r2.isFilled());
    }
    
    //Test if filled
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Rectangle fill incorrect.", r1.isFilled());
    }
    
    //Test if has correct color
    @Test
    public void testRectangleConstructorColor()
    {
        Color clr1 = r1.getColor();
        Color clr2 = r2.getColor();
        Assert.assertEquals("Square color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Square color incorrect.", Color.BLUE, clr2);
    }
}
