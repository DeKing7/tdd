package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {

    @Test
    public void testToString() {
        assertEquals("$3,00", new Dollar(3).toString());
        assertEquals("$7,50", new Dollar(7.5).toString());
    }

    @Test
    public void testEquality() {
        Dollar threeDollarsFiftyCents = new Dollar(3.50);
        Dollar threeDollarsFiftyCents2 = new Dollar(3.50);
        assertTrue(threeDollarsFiftyCents.equals(threeDollarsFiftyCents2));
    }

    @Test
    public void testInequality() {
        Dollar threeDollarsFiftyCents = new Dollar(3.50);
        Dollar threeDollarsTwentyCents = new Dollar(3.20);
        assertFalse(threeDollarsFiftyCents.equals(threeDollarsTwentyCents));
    }

    @Test
    public void testSubstraction() {
        assertEquals(new Dollar(1), new Dollar(3).minus(new Dollar(2)));
        assertEquals(new Dollar(2), new Dollar(5).minus(new Dollar(3)));
    }

    @Test
    public void testNumericSafety() {
        assertEquals(new Dollar(0.61), new Dollar(1.03).minus(new Dollar(0.42)));
    }
}