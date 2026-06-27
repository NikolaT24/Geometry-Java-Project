package com.nikolat24.geometry.app;

import com.nikolat24.geometry.engine.GeometryEngine;
import com.nikolat24.geometry.io.GeometryParser;
import com.nikolat24.geometry.model.*;
import java.util.*;

public class GeometryLabApp {
    public static void main(String[] args) {
        GeometryEngine engine = new GeometryEngine();
        List<Point2D> points = GeometryParser.points("0,0; 4,0; 4,3; 1,5; -1,2");
        Polygon hull = engine.hull(points);
        System.out.println("Geometry Lab running.");
        System.out.println(engine.summarize(hull));
        System.out.println("Triangle area example: " + engine.triangleArea(new Point2D(0,0), new Point2D(4,0), new Point2D(0,3)));
    }
}
