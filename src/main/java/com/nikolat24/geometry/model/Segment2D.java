package com.nikolat24.geometry.model;

public record Segment2D(Point2D a, Point2D b) {
    public double length() { return a.distanceTo(b); }
    public Point2D midpoint() { return a.midpoint(b); }
    public Line2D line() { return Line2D.through(a, b); }
}
