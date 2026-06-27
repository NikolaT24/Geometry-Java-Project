package com.nikolat24.geometry.model;

import com.nikolat24.geometry.util.Epsilon;
import com.nikolat24.geometry.util.GeometryException;

public record Triangle(Point2D a, Point2D b, Point2D c) {
    public Triangle { if (Epsilon.isZero(signedAreaTwice())) throw new GeometryException("Triangle points must not be collinear"); }
    private double signedAreaTwice() { return (b.x()-a.x())*(c.y()-a.y()) - (b.y()-a.y())*(c.x()-a.x()); }
    public double area() { return Math.abs(signedAreaTwice()) / 2.0; }
    public double perimeter() { return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a); }
    public Point2D centroid() { return new Point2D((a.x()+b.x()+c.x())/3.0, (a.y()+b.y()+c.y())/3.0); }
    public boolean isRight() { double x=a.distanceTo(b), y=b.distanceTo(c), z=c.distanceTo(a); double[] s={x*x,y*y,z*z}; java.util.Arrays.sort(s); return Epsilon.equals(s[0]+s[1], s[2]); }
}
