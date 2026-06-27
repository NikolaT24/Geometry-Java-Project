package com.nikolat24.geometry.io;

import com.nikolat24.geometry.model.Point2D;
import com.nikolat24.geometry.util.GeometryException;
import java.util.*;

public final class GeometryParser {
    private GeometryParser() {}
    public static Point2D point(String text) {
        String cleaned = text.trim().replace("(", "").replace(")", "");
        String[] parts = cleaned.split(",");
        if (parts.length != 2) throw new GeometryException("Expected point format x,y");
        return new Point2D(Double.parseDouble(parts[0].trim()), Double.parseDouble(parts[1].trim()));
    }
    public static List<Point2D> points(String text) {
        List<Point2D> result = new ArrayList<>();
        for (String token : text.split(";")) result.add(point(token));
        return result;
    }
}
