import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTest {
  
  @Test
  public void testAdd() {
    Point2D p1 = new Point2D();
    Point2D p2 = p1.add(4, 6);
    assertEquals("p2.X = 4", 4, p2.X);
    assertEquals("p2.Y = 6", 6, p2.Y);
  }
  
  @Test
  public void testTranslate() {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D(4, 6);
    p1.translate(p2);
    assertEquals("p1.X = 4", 4, p1.X);
    assertEquals("p1.Y = 6", 6, p1.Y);
  }
  
  @Test
  public void testDistance() {
    Point2D p1 = new Point2D();
    p1.distance(3, 4);
    assertEquals("distance = 7", 5, p1.distance(3, 4));
  }
  
  @Test
  public void testToString() {
    Point2D p1 = new Point2D(1, 2);
    p1.toString();
    assertEquals("string = (1, 2)", "(1, 2)", p1.toString());
  }
  
}