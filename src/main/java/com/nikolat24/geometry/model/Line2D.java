package com.nikolat24.geometry.model;

import com.nikolat24.geometry.util.Epsilon;
import com.nikolat24.geometry.util.GeometryException;

public record Line2D(Point2D point, Vector2D direction) {
    public Line2D { if (Epsilon.isZero(direction.length())) throw new GeometryException("Line direction cannot be zero"); }
    public static Line2D through(Point2D a, Point2D b) { return new Line2D(a, a.vectorTo(b)); }
    public Point2D at(double t) { return point.add(direction.scale(t)); }
    public boolean isParallel(Line2D other) { return Epsilon.isZero(direction.cross(other.direction)); }
    public double distanceTo(Point2D p) { return Math.abs(point.vectorTo(p).cross(direction)) / direction.length(); }
    public Point2D projection(Point2D p) { Vector2D ap = point.vectorTo(p); double t = ap.dot(direction) / direction.dot(direction); return at(t); }
}
