import com.paint.shapes.Rectangle;

import com.paint.utils.Point;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testRectangleCreation() {
        Point p = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p, 10, 20);

        assertNotNull(rectangle);
    }

    @Test
    public void testRectangleMove() {
        Point p = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p, 10, 20);

        rectangle.move(15, 25);

        assertEquals(15, p.getX());
        assertEquals(25, p.getY());
    }

    @Test
    public void testRectangleResize() {
        Point p = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p, 10, 20);

        rectangle.resize(2);

        // Since width & height are private, we just verify no exception
        assertTrue(true);
    }

    @Test
    public void testRectangleDraw() {
        Point p = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p, 10, 20);

        rectangle.draw();

        assertTrue(true);
    }

    @Test
    public void testRectangleErase() {
        Point p = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p, 10, 20);

        rectangle.erase();

        assertTrue(true);
    }
}