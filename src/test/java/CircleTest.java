import com.paint.shapes.Circle;

import com.paint.utils.Point;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testCircleArea() {
        Point p = new Point(0,0);
        Circle circle = new Circle(5, p);

        double area = circle.area();

        assertEquals(78.54, area, 0.5);
    }

    @Test
    public void testCircleMove() {
        Point p = new Point(0,0);
        Circle circle = new Circle(5, p);

        circle.move(10,20);

        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }

    @Test
    public void testCircleResize() {
        Point p = new Point(0,0);
        Circle circle = new Circle(5, p);

        circle.resize(2);

        double area = circle.area();

        assertEquals(314.15, area, 1);
    }

    @Test
    public void testCircleDraw() {
        Point p = new Point(5,5);
        Circle circle = new Circle(5, p);

        circle.draw();

        assertTrue(true);
    }

    @Test
    public void testCircleErase() {
        Point p = new Point(5,5);
        Circle circle = new Circle(5, p);

        circle.erase();

        assertTrue(true);
    }
}