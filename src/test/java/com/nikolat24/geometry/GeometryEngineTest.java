package com.nikolat24.geometry;

import com.nikolat24.geometry.engine.GeometryEngine;
import com.nikolat24.geometry.model.Point2D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometryEngineTest {
    @Test void distanceWorks() {
        GeometryEngine engine = new GeometryEngine();
        assertEquals(5.0, engine.distance(new Point2D(0,0), new Point2D(3,4)), 1e-9);
    }
    @Test void triangleAreaWorks() {
        GeometryEngine engine = new GeometryEngine();
        assertEquals(6.0, engine.triangleArea(new Point2D(0,0), new Point2D(4,0), new Point2D(0,3)), 1e-9);
    }
}
