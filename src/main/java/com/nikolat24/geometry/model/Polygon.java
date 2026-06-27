package com.nikolat24.geometry.model;

import java.util.*;
import com.nikolat24.geometry.util.GeometryException;

public final class Polygon {
    private final List<Point2D> vertices;
    public Polygon(List<Point2D> vertices) { if (vertices == null || vertices.size() < 3) throw new GeometryException("Polygon needs at least 3 vertices"); this.vertices = List.copyOf(vertices); }
    public List<Point2D> vertices() { return vertices; }
    public double signedArea() { double sum = 0; for (int i=0;i<vertices.size();i++) { Point2D p=vertices.get(i), q=vertices.get((i+1)%vertices.size()); sum += p.x()*q.y() - p.y()*q.x(); } return sum/2.0; }
    public double area() { return Math.abs(signedArea()); }
    public double perimeter() { double sum = 0; for (int i=0;i<vertices.size();i++) sum += vertices.get(i).distanceTo(vertices.get((i+1)%vertices.size())); return sum; }
    public Point2D centroid() { double sx=0, sy=0; for(Point2D p:vertices){sx+=p.x(); sy+=p.y();} return new Point2D(sx/vertices.size(), sy/vertices.size()); }
}
