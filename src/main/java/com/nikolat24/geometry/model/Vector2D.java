package com.nikolat24.geometry.model;

import com.nikolat24.geometry.util.Epsilon;
import com.nikolat24.geometry.util.GeometryException;

public record Vector2D(double dx, double dy) {
    public Vector2D { Epsilon.requireFinite(dx, "dx"); Epsilon.requireFinite(dy, "dy"); }
    public double length() { return Math.hypot(dx, dy); }
    public Vector2D normalize() { double len = length(); if (Epsilon.isZero(len)) throw new GeometryException("Cannot normalize zero vector"); return new Vector2D(dx / len, dy / len); }
    public Vector2D scale(double factor) { return new Vector2D(dx * factor, dy * factor); }
    public double dot(Vector2D other) { return dx * other.dx + dy * other.dy; }
    public double cross(Vector2D other) { return dx * other.dy - dy * other.dx; }
    public Vector2D perpendicular() { return new Vector2D(-dy, dx); }
    public double angle() { return Math.atan2(dy, dx); }
}
