package com.nikolat24.geometry.model;

import com.nikolat24.geometry.util.Epsilon;
import com.nikolat24.geometry.util.GeometryException;

public record Circle(Point2D center, double radius) {
    public Circle { Epsilon.requireFinite(radius, "radius"); if (radius <= 0) throw new GeometryException("radius must be positive"); }
    public double area() { return Math.PI * radius * radius; }
    public double circumference() { return 2 * Math.PI * radius; }
    public boolean contains(Point2D p) { return center.distanceTo(p) <= radius + Epsilon.DEFAULT; }
}
