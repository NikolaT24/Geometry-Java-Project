package com.nikolat24.geometry.io;

import com.nikolat24.geometry.model.*;
import java.util.stream.Collectors;

public final class GeometrySerializer {
    private GeometrySerializer() {}
    public static String point(Point2D p) { return p.x() + "," + p.y(); }
    public static String polygon(Polygon polygon) { return polygon.vertices().stream().map(GeometrySerializer::point).collect(Collectors.joining(";")); }
}
