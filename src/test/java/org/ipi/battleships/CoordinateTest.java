package org.ipi.battleships;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void coordinatesAreEquals() {
        Coordinate c1 = new Coordinate(2, 3);
        Coordinate c2 = new Coordinate(2, 3);
        Coordinate c3 = new Coordinate(3, 2);
        assertEquals(c1, c2);
        assertNotEquals(c2, c3);
    }
}
