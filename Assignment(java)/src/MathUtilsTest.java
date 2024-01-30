import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(-1, MathUtils.add(-2, 1));
        assertEquals(0, MathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, MathUtils.subtract(3, 2));
        assertEquals(-3, MathUtils.subtract(-2, 1));
        assertEquals(0, MathUtils.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, MathUtils.multiply(2, 3));
        assertEquals(-2, MathUtils.multiply(-1, 2));
        assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, MathUtils.divide(4, 2), 0.00001);
        assertEquals(-2.5, MathUtils.divide(-5, 2), 0.00001);
        assertEquals(-1.0, MathUtils.divide(5, 0), 0.00001);  // Testing division by zero
        assertEquals(0.0, MathUtils.divide(0, 5), 0.00001);
    }
}
