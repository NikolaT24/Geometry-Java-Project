package com.nikolat24.geometry.model;

import com.nikolat24.geometry.util.Epsilon;

public record Point2D(double x, double y) {
    public Point2D {
        Epsilon.requireFinite(x, "x");
        Epsilon.requireFinite(y, "y");
    }
    public Point2D add(Vector2D v) { return new Point2D(x + v.dx(), y + v.dy()); }
    public Vector2D vectorTo(Point2D other) { return new Vector2D(other.x - x, other.y - y); }
    public double distanceTo(Point2D other) { return Math.hypot(other.x - x, other.y - y); }
    public Point2D midpoint(Point2D other) { return new Point2D((x + other.x) / 2.0, (y + other.y) / 2.0); }
    public Point2D translate(double dx, double dy) { return new Point2D(x + dx, y + dy); }
    public Point2D scale(double factor) { return new Point2D(x * factor, y * factor); }
    public Point2D rotate(double radians) { double c = Math.cos(radians); double s = Math.sin(radians); return new Point2D(c*x - s*y, s*x + c*y); }
    @Override public String toString() { return "(" + x + ", " + y + ")"; }
}
