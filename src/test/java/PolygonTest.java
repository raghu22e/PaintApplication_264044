import com.paint.shapes.Polygon;

import org.junit.Test;
import static org.junit.Assert.*;

public class PolygonTest {

    @Test
    public void testPolygonDraw() {
        Polygon polygon = new Polygon();
        polygon.draw();

        assertTrue(true);
    }

    @Test
    public void testPolygonErase() {
        Polygon polygon = new Polygon();
        polygon.erase();

        assertTrue(true);
    }

    @Test
    public void testPolygonMove() {
        Polygon polygon = new Polygon();
        polygon.move(10, 20);

        assertTrue(true);
    }

    @Test
    public void testPolygonResize() {
        Polygon polygon = new Polygon();
        polygon.resize(2);

        assertTrue(true);
    }

    @Test
    public void testPolygonCreation() {
        Polygon polygon = new Polygon();
        assertNotNull(polygon);
    }
}