
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    // TODO: complete testing
    private static RightTriangle t1 = new RightTriangle(new Point(100, 100), 50, 50, Color.BLACK,
            true);
    private static int delta1 = 25;
    private static Point left1 = new Point(100 - delta1, 100);
    private static Point upper1 = new Point(100, 100 - delta1);
    private static Point lower1 = new Point(100, 100 + delta1);
    private static Point right1 = new Point(100 + delta1, 100);
    private static RightTriangle t2 = new RightTriangle(new Point(150, 150), 100, 150, Color.CYAN,
            false);
    private static int delta2 = 50;
    private static Point left2 = new Point(150 - delta2, 150);
    private static Point upper2 = new Point(150, 150 - delta2);
    private static Point lower2 = new Point(150, 150 + delta2);
    private static Point right2 = new Point(150 + delta2, 150);
    
    //Make sure you have the right points for the vertices of the triangle
    @Test
    public void testRightTriangleConstructorComputedPoints()
    {
        Point[] pts1 = t1.getLocation();
        Assert.assertEquals(3, pts1.length);
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts1, left1, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts1, lower1, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts1, right1, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts1, upper1, 1));
        
        Point[] pts2 = t2.getLocation();
        Assert.assertEquals(3, pts2.length);
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts2, left2, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts2, lower2, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts2, right2, 1));
        Assert.assertTrue("Expected point not appearing in Triangle.", ShapeUtils.pointInSet
                (pts2, upper2, 1));
    }
    
    //Filled correctly or not
    @Test
    public void testTriangleConstructorFilled()
    {
        Assert.assertTrue("Triangle fill incorrect.", t1.isFilled());
        Assert.assertFalse("Triangle fill incorrect.", t2.isFilled());
    }
    
    //Color correct or not
    @Test
    public void testDiamondConstructorColor()
    {
        Color clr1 = t1.getColor();
        Color clr2 = t2.getColor();
        Assert.assertEquals("Triangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Triangle color incorrect.", Color.CYAN, clr2);
    }
}
