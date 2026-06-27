package com.nikolat24.geometry.util;

public final class Epsilon {
    public static final double DEFAULT = 1.0e-9;
    private Epsilon() {}
    public static boolean equals(double a, double b) { return Math.abs(a - b) <= DEFAULT; }
    public static boolean isZero(double value) { return Math.abs(value) <= DEFAULT; }
    public static double clamp(double value, double min, double max) { return Math.max(min, Math.min(max, value)); }
    public static void requireFinite(double value, String name) { if (!Double.isFinite(value)) throw new GeometryException(name + " must be finite"); }
}
