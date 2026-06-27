package com.nikolat24.geometry.engine;

import com.nikolat24.geometry.algorithms.GeometryAlgorithms;
import com.nikolat24.geometry.model.*;
import java.util.*;

public class GeometryEngine {
    public double distance(Point2D a, Point2D b) { return a.distanceTo(b); }
    public double triangleArea(Point2D a, Point2D b, Point2D c) { return new Triangle(a,b,c).area(); }
    public Optional<Point2D> lineIntersection(Line2D a, Line2D b) { return GeometryAlgorithms.intersection(a,b); }
    public Polygon hull(List<Point2D> points) { return new Polygon(GeometryAlgorithms.convexHull(points)); }
    public String summarize(Polygon polygon) { return "Polygon[vertices=" + polygon.vertices().size() + ", area=" + polygon.area() + ", perimeter=" + polygon.perimeter() + "]"; }
}
