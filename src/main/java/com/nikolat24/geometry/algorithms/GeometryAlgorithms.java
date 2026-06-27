package com.nikolat24.geometry.algorithms;

import com.nikolat24.geometry.model.*;
import com.nikolat24.geometry.util.*;
import java.util.*;

public final class GeometryAlgorithms {
    private GeometryAlgorithms() {}
    public static Optional<Point2D> intersection(Line2D first, Line2D second) {
        double cross = first.direction().cross(second.direction());
        if (Epsilon.isZero(cross)) return Optional.empty();
        Vector2D delta = first.point().vectorTo(second.point());
        double t = delta.cross(second.direction()) / cross;
        return Optional.of(first.at(t));
    }
    public static double orientation(Point2D a, Point2D b, Point2D c) { return a.vectorTo(b).cross(a.vectorTo(c)); }
    public static boolean areCollinear(Point2D a, Point2D b, Point2D c) { return Epsilon.isZero(orientation(a,b,c)); }
    public static Circle circleFromDiameter(Point2D a, Point2D b) { return new Circle(a.midpoint(b), a.distanceTo(b)/2.0); }
    public static List<Point2D> convexHull(List<Point2D> input) {
        List<Point2D> pts = new ArrayList<>(input);
        pts.sort(Comparator.comparingDouble(Point2D::x).thenComparingDouble(Point2D::y));
        if (pts.size() <= 1) return pts;
        List<Point2D> lower = new ArrayList<>();
        for (Point2D p: pts) { while (lower.size() >= 2 && orientation(lower.get(lower.size()-2), lower.get(lower.size()-1), p) <= 0) lower.remove(lower.size()-1); lower.add(p); }
        List<Point2D> upper = new ArrayList<>();
        for (int i=pts.size()-1;i>=0;i--) { Point2D p=pts.get(i); while (upper.size() >= 2 && orientation(upper.get(upper.size()-2), upper.get(upper.size()-1), p) <= 0) upper.remove(upper.size()-1); upper.add(p); }
        lower.remove(lower.size()-1); upper.remove(upper.size()-1); lower.addAll(upper); return lower;
    }
}
