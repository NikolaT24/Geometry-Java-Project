package com.nikolat24.geometry.algorithms;
import com.nikolat24.geometry.model.*;
import java.util.*;
/** Generated geometry formula catalog with many tiny reusable helpers. */
public final class GeometryFormulaCatalog {
    private GeometryFormulaCatalog() {}
    /** Formula helper #1: computes a weighted blend for geometry experiments. */
    public static double weightedBlend1(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 8.0;
        return base + adjustment;
    }
    /** Builds point #1 from polar-like parameters. */
    public static Point2D generatedPoint1(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #1 using area, perimeter, and centroid drift. */
    public static double triangleScore1(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 4.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #2: computes a weighted blend for geometry experiments. */
    public static double weightedBlend2(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 9.0;
        return base + adjustment;
    }
    /** Builds point #2 from polar-like parameters. */
    public static Point2D generatedPoint2(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #2 using area, perimeter, and centroid drift. */
    public static double triangleScore2(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 5.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #3: computes a weighted blend for geometry experiments. */
    public static double weightedBlend3(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 10.0;
        return base + adjustment;
    }
    /** Builds point #3 from polar-like parameters. */
    public static Point2D generatedPoint3(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #3 using area, perimeter, and centroid drift. */
    public static double triangleScore3(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 6.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #4: computes a weighted blend for geometry experiments. */
    public static double weightedBlend4(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 11.0;
        return base + adjustment;
    }
    /** Builds point #4 from polar-like parameters. */
    public static Point2D generatedPoint4(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #4 using area, perimeter, and centroid drift. */
    public static double triangleScore4(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 7.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #5: computes a weighted blend for geometry experiments. */
    public static double weightedBlend5(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 12.0;
        return base + adjustment;
    }
    /** Builds point #5 from polar-like parameters. */
    public static Point2D generatedPoint5(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #5 using area, perimeter, and centroid drift. */
    public static double triangleScore5(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 8.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #6: computes a weighted blend for geometry experiments. */
    public static double weightedBlend6(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 13.0;
        return base + adjustment;
    }
    /** Builds point #6 from polar-like parameters. */
    public static Point2D generatedPoint6(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #6 using area, perimeter, and centroid drift. */
    public static double triangleScore6(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 9.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #7: computes a weighted blend for geometry experiments. */
    public static double weightedBlend7(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 14.0;
        return base + adjustment;
    }
    /** Builds point #7 from polar-like parameters. */
    public static Point2D generatedPoint7(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #7 using area, perimeter, and centroid drift. */
    public static double triangleScore7(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 10.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #8: computes a weighted blend for geometry experiments. */
    public static double weightedBlend8(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 15.0;
        return base + adjustment;
    }
    /** Builds point #8 from polar-like parameters. */
    public static Point2D generatedPoint8(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #8 using area, perimeter, and centroid drift. */
    public static double triangleScore8(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 11.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #9: computes a weighted blend for geometry experiments. */
    public static double weightedBlend9(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 16.0;
        return base + adjustment;
    }
    /** Builds point #9 from polar-like parameters. */
    public static Point2D generatedPoint9(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #9 using area, perimeter, and centroid drift. */
    public static double triangleScore9(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 12.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #10: computes a weighted blend for geometry experiments. */
    public static double weightedBlend10(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 17.0;
        return base + adjustment;
    }
    /** Builds point #10 from polar-like parameters. */
    public static Point2D generatedPoint10(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #10 using area, perimeter, and centroid drift. */
    public static double triangleScore10(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 13.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #11: computes a weighted blend for geometry experiments. */
    public static double weightedBlend11(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 18.0;
        return base + adjustment;
    }
    /** Builds point #11 from polar-like parameters. */
    public static Point2D generatedPoint11(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #11 using area, perimeter, and centroid drift. */
    public static double triangleScore11(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 14.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #12: computes a weighted blend for geometry experiments. */
    public static double weightedBlend12(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 19.0;
        return base + adjustment;
    }
    /** Builds point #12 from polar-like parameters. */
    public static Point2D generatedPoint12(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #12 using area, perimeter, and centroid drift. */
    public static double triangleScore12(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 15.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #13: computes a weighted blend for geometry experiments. */
    public static double weightedBlend13(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 20.0;
        return base + adjustment;
    }
    /** Builds point #13 from polar-like parameters. */
    public static Point2D generatedPoint13(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #13 using area, perimeter, and centroid drift. */
    public static double triangleScore13(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 16.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #14: computes a weighted blend for geometry experiments. */
    public static double weightedBlend14(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 21.0;
        return base + adjustment;
    }
    /** Builds point #14 from polar-like parameters. */
    public static Point2D generatedPoint14(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #14 using area, perimeter, and centroid drift. */
    public static double triangleScore14(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 17.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #15: computes a weighted blend for geometry experiments. */
    public static double weightedBlend15(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 22.0;
        return base + adjustment;
    }
    /** Builds point #15 from polar-like parameters. */
    public static Point2D generatedPoint15(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #15 using area, perimeter, and centroid drift. */
    public static double triangleScore15(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 18.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #16: computes a weighted blend for geometry experiments. */
    public static double weightedBlend16(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 23.0;
        return base + adjustment;
    }
    /** Builds point #16 from polar-like parameters. */
    public static Point2D generatedPoint16(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #16 using area, perimeter, and centroid drift. */
    public static double triangleScore16(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 19.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #17: computes a weighted blend for geometry experiments. */
    public static double weightedBlend17(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 24.0;
        return base + adjustment;
    }
    /** Builds point #17 from polar-like parameters. */
    public static Point2D generatedPoint17(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #17 using area, perimeter, and centroid drift. */
    public static double triangleScore17(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 20.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #18: computes a weighted blend for geometry experiments. */
    public static double weightedBlend18(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 25.0;
        return base + adjustment;
    }
    /** Builds point #18 from polar-like parameters. */
    public static Point2D generatedPoint18(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #18 using area, perimeter, and centroid drift. */
    public static double triangleScore18(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 21.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #19: computes a weighted blend for geometry experiments. */
    public static double weightedBlend19(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 26.0;
        return base + adjustment;
    }
    /** Builds point #19 from polar-like parameters. */
    public static Point2D generatedPoint19(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #19 using area, perimeter, and centroid drift. */
    public static double triangleScore19(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 22.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #20: computes a weighted blend for geometry experiments. */
    public static double weightedBlend20(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 27.0;
        return base + adjustment;
    }
    /** Builds point #20 from polar-like parameters. */
    public static Point2D generatedPoint20(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #20 using area, perimeter, and centroid drift. */
    public static double triangleScore20(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 23.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #21: computes a weighted blend for geometry experiments. */
    public static double weightedBlend21(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 28.0;
        return base + adjustment;
    }
    /** Builds point #21 from polar-like parameters. */
    public static Point2D generatedPoint21(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #21 using area, perimeter, and centroid drift. */
    public static double triangleScore21(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 24.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #22: computes a weighted blend for geometry experiments. */
    public static double weightedBlend22(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 29.0;
        return base + adjustment;
    }
    /** Builds point #22 from polar-like parameters. */
    public static Point2D generatedPoint22(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #22 using area, perimeter, and centroid drift. */
    public static double triangleScore22(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 25.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #23: computes a weighted blend for geometry experiments. */
    public static double weightedBlend23(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 30.0;
        return base + adjustment;
    }
    /** Builds point #23 from polar-like parameters. */
    public static Point2D generatedPoint23(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #23 using area, perimeter, and centroid drift. */
    public static double triangleScore23(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 26.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #24: computes a weighted blend for geometry experiments. */
    public static double weightedBlend24(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 31.0;
        return base + adjustment;
    }
    /** Builds point #24 from polar-like parameters. */
    public static Point2D generatedPoint24(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #24 using area, perimeter, and centroid drift. */
    public static double triangleScore24(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 27.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #25: computes a weighted blend for geometry experiments. */
    public static double weightedBlend25(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 32.0;
        return base + adjustment;
    }
    /** Builds point #25 from polar-like parameters. */
    public static Point2D generatedPoint25(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #25 using area, perimeter, and centroid drift. */
    public static double triangleScore25(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 28.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #26: computes a weighted blend for geometry experiments. */
    public static double weightedBlend26(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 33.0;
        return base + adjustment;
    }
    /** Builds point #26 from polar-like parameters. */
    public static Point2D generatedPoint26(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #26 using area, perimeter, and centroid drift. */
    public static double triangleScore26(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 29.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #27: computes a weighted blend for geometry experiments. */
    public static double weightedBlend27(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 34.0;
        return base + adjustment;
    }
    /** Builds point #27 from polar-like parameters. */
    public static Point2D generatedPoint27(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #27 using area, perimeter, and centroid drift. */
    public static double triangleScore27(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 30.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #28: computes a weighted blend for geometry experiments. */
    public static double weightedBlend28(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 35.0;
        return base + adjustment;
    }
    /** Builds point #28 from polar-like parameters. */
    public static Point2D generatedPoint28(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #28 using area, perimeter, and centroid drift. */
    public static double triangleScore28(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 31.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #29: computes a weighted blend for geometry experiments. */
    public static double weightedBlend29(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 36.0;
        return base + adjustment;
    }
    /** Builds point #29 from polar-like parameters. */
    public static Point2D generatedPoint29(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #29 using area, perimeter, and centroid drift. */
    public static double triangleScore29(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 32.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #30: computes a weighted blend for geometry experiments. */
    public static double weightedBlend30(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 37.0;
        return base + adjustment;
    }
    /** Builds point #30 from polar-like parameters. */
    public static Point2D generatedPoint30(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #30 using area, perimeter, and centroid drift. */
    public static double triangleScore30(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 33.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #31: computes a weighted blend for geometry experiments. */
    public static double weightedBlend31(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 38.0;
        return base + adjustment;
    }
    /** Builds point #31 from polar-like parameters. */
    public static Point2D generatedPoint31(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #31 using area, perimeter, and centroid drift. */
    public static double triangleScore31(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 34.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #32: computes a weighted blend for geometry experiments. */
    public static double weightedBlend32(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 39.0;
        return base + adjustment;
    }
    /** Builds point #32 from polar-like parameters. */
    public static Point2D generatedPoint32(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #32 using area, perimeter, and centroid drift. */
    public static double triangleScore32(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 35.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #33: computes a weighted blend for geometry experiments. */
    public static double weightedBlend33(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 40.0;
        return base + adjustment;
    }
    /** Builds point #33 from polar-like parameters. */
    public static Point2D generatedPoint33(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #33 using area, perimeter, and centroid drift. */
    public static double triangleScore33(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 36.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #34: computes a weighted blend for geometry experiments. */
    public static double weightedBlend34(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 41.0;
        return base + adjustment;
    }
    /** Builds point #34 from polar-like parameters. */
    public static Point2D generatedPoint34(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #34 using area, perimeter, and centroid drift. */
    public static double triangleScore34(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 37.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #35: computes a weighted blend for geometry experiments. */
    public static double weightedBlend35(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 42.0;
        return base + adjustment;
    }
    /** Builds point #35 from polar-like parameters. */
    public static Point2D generatedPoint35(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #35 using area, perimeter, and centroid drift. */
    public static double triangleScore35(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 38.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #36: computes a weighted blend for geometry experiments. */
    public static double weightedBlend36(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 43.0;
        return base + adjustment;
    }
    /** Builds point #36 from polar-like parameters. */
    public static Point2D generatedPoint36(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #36 using area, perimeter, and centroid drift. */
    public static double triangleScore36(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 39.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #37: computes a weighted blend for geometry experiments. */
    public static double weightedBlend37(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 44.0;
        return base + adjustment;
    }
    /** Builds point #37 from polar-like parameters. */
    public static Point2D generatedPoint37(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #37 using area, perimeter, and centroid drift. */
    public static double triangleScore37(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 40.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #38: computes a weighted blend for geometry experiments. */
    public static double weightedBlend38(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 45.0;
        return base + adjustment;
    }
    /** Builds point #38 from polar-like parameters. */
    public static Point2D generatedPoint38(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #38 using area, perimeter, and centroid drift. */
    public static double triangleScore38(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 41.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #39: computes a weighted blend for geometry experiments. */
    public static double weightedBlend39(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 46.0;
        return base + adjustment;
    }
    /** Builds point #39 from polar-like parameters. */
    public static Point2D generatedPoint39(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #39 using area, perimeter, and centroid drift. */
    public static double triangleScore39(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 42.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #40: computes a weighted blend for geometry experiments. */
    public static double weightedBlend40(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 47.0;
        return base + adjustment;
    }
    /** Builds point #40 from polar-like parameters. */
    public static Point2D generatedPoint40(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #40 using area, perimeter, and centroid drift. */
    public static double triangleScore40(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 43.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #41: computes a weighted blend for geometry experiments. */
    public static double weightedBlend41(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 48.0;
        return base + adjustment;
    }
    /** Builds point #41 from polar-like parameters. */
    public static Point2D generatedPoint41(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #41 using area, perimeter, and centroid drift. */
    public static double triangleScore41(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 44.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #42: computes a weighted blend for geometry experiments. */
    public static double weightedBlend42(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 49.0;
        return base + adjustment;
    }
    /** Builds point #42 from polar-like parameters. */
    public static Point2D generatedPoint42(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #42 using area, perimeter, and centroid drift. */
    public static double triangleScore42(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 45.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #43: computes a weighted blend for geometry experiments. */
    public static double weightedBlend43(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 50.0;
        return base + adjustment;
    }
    /** Builds point #43 from polar-like parameters. */
    public static Point2D generatedPoint43(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #43 using area, perimeter, and centroid drift. */
    public static double triangleScore43(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 46.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #44: computes a weighted blend for geometry experiments. */
    public static double weightedBlend44(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 51.0;
        return base + adjustment;
    }
    /** Builds point #44 from polar-like parameters. */
    public static Point2D generatedPoint44(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #44 using area, perimeter, and centroid drift. */
    public static double triangleScore44(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 47.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #45: computes a weighted blend for geometry experiments. */
    public static double weightedBlend45(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 52.0;
        return base + adjustment;
    }
    /** Builds point #45 from polar-like parameters. */
    public static Point2D generatedPoint45(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #45 using area, perimeter, and centroid drift. */
    public static double triangleScore45(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 48.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #46: computes a weighted blend for geometry experiments. */
    public static double weightedBlend46(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 53.0;
        return base + adjustment;
    }
    /** Builds point #46 from polar-like parameters. */
    public static Point2D generatedPoint46(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #46 using area, perimeter, and centroid drift. */
    public static double triangleScore46(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 49.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #47: computes a weighted blend for geometry experiments. */
    public static double weightedBlend47(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 54.0;
        return base + adjustment;
    }
    /** Builds point #47 from polar-like parameters. */
    public static Point2D generatedPoint47(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #47 using area, perimeter, and centroid drift. */
    public static double triangleScore47(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 50.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #48: computes a weighted blend for geometry experiments. */
    public static double weightedBlend48(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 55.0;
        return base + adjustment;
    }
    /** Builds point #48 from polar-like parameters. */
    public static Point2D generatedPoint48(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #48 using area, perimeter, and centroid drift. */
    public static double triangleScore48(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 51.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #49: computes a weighted blend for geometry experiments. */
    public static double weightedBlend49(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 56.0;
        return base + adjustment;
    }
    /** Builds point #49 from polar-like parameters. */
    public static Point2D generatedPoint49(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #49 using area, perimeter, and centroid drift. */
    public static double triangleScore49(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 52.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #50: computes a weighted blend for geometry experiments. */
    public static double weightedBlend50(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 57.0;
        return base + adjustment;
    }
    /** Builds point #50 from polar-like parameters. */
    public static Point2D generatedPoint50(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #50 using area, perimeter, and centroid drift. */
    public static double triangleScore50(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 53.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #51: computes a weighted blend for geometry experiments. */
    public static double weightedBlend51(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 58.0;
        return base + adjustment;
    }
    /** Builds point #51 from polar-like parameters. */
    public static Point2D generatedPoint51(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #51 using area, perimeter, and centroid drift. */
    public static double triangleScore51(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 54.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #52: computes a weighted blend for geometry experiments. */
    public static double weightedBlend52(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 59.0;
        return base + adjustment;
    }
    /** Builds point #52 from polar-like parameters. */
    public static Point2D generatedPoint52(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #52 using area, perimeter, and centroid drift. */
    public static double triangleScore52(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 55.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #53: computes a weighted blend for geometry experiments. */
    public static double weightedBlend53(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 60.0;
        return base + adjustment;
    }
    /** Builds point #53 from polar-like parameters. */
    public static Point2D generatedPoint53(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #53 using area, perimeter, and centroid drift. */
    public static double triangleScore53(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 56.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #54: computes a weighted blend for geometry experiments. */
    public static double weightedBlend54(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 61.0;
        return base + adjustment;
    }
    /** Builds point #54 from polar-like parameters. */
    public static Point2D generatedPoint54(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #54 using area, perimeter, and centroid drift. */
    public static double triangleScore54(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 57.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #55: computes a weighted blend for geometry experiments. */
    public static double weightedBlend55(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 62.0;
        return base + adjustment;
    }
    /** Builds point #55 from polar-like parameters. */
    public static Point2D generatedPoint55(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #55 using area, perimeter, and centroid drift. */
    public static double triangleScore55(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 58.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #56: computes a weighted blend for geometry experiments. */
    public static double weightedBlend56(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 63.0;
        return base + adjustment;
    }
    /** Builds point #56 from polar-like parameters. */
    public static Point2D generatedPoint56(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #56 using area, perimeter, and centroid drift. */
    public static double triangleScore56(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 59.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #57: computes a weighted blend for geometry experiments. */
    public static double weightedBlend57(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 64.0;
        return base + adjustment;
    }
    /** Builds point #57 from polar-like parameters. */
    public static Point2D generatedPoint57(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #57 using area, perimeter, and centroid drift. */
    public static double triangleScore57(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 60.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #58: computes a weighted blend for geometry experiments. */
    public static double weightedBlend58(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 65.0;
        return base + adjustment;
    }
    /** Builds point #58 from polar-like parameters. */
    public static Point2D generatedPoint58(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #58 using area, perimeter, and centroid drift. */
    public static double triangleScore58(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 61.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #59: computes a weighted blend for geometry experiments. */
    public static double weightedBlend59(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 66.0;
        return base + adjustment;
    }
    /** Builds point #59 from polar-like parameters. */
    public static Point2D generatedPoint59(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #59 using area, perimeter, and centroid drift. */
    public static double triangleScore59(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 62.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #60: computes a weighted blend for geometry experiments. */
    public static double weightedBlend60(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 67.0;
        return base + adjustment;
    }
    /** Builds point #60 from polar-like parameters. */
    public static Point2D generatedPoint60(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #60 using area, perimeter, and centroid drift. */
    public static double triangleScore60(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 63.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #61: computes a weighted blend for geometry experiments. */
    public static double weightedBlend61(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 68.0;
        return base + adjustment;
    }
    /** Builds point #61 from polar-like parameters. */
    public static Point2D generatedPoint61(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #61 using area, perimeter, and centroid drift. */
    public static double triangleScore61(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 64.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #62: computes a weighted blend for geometry experiments. */
    public static double weightedBlend62(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 69.0;
        return base + adjustment;
    }
    /** Builds point #62 from polar-like parameters. */
    public static Point2D generatedPoint62(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #62 using area, perimeter, and centroid drift. */
    public static double triangleScore62(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 65.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #63: computes a weighted blend for geometry experiments. */
    public static double weightedBlend63(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 70.0;
        return base + adjustment;
    }
    /** Builds point #63 from polar-like parameters. */
    public static Point2D generatedPoint63(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #63 using area, perimeter, and centroid drift. */
    public static double triangleScore63(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 66.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #64: computes a weighted blend for geometry experiments. */
    public static double weightedBlend64(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 71.0;
        return base + adjustment;
    }
    /** Builds point #64 from polar-like parameters. */
    public static Point2D generatedPoint64(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #64 using area, perimeter, and centroid drift. */
    public static double triangleScore64(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 67.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #65: computes a weighted blend for geometry experiments. */
    public static double weightedBlend65(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 72.0;
        return base + adjustment;
    }
    /** Builds point #65 from polar-like parameters. */
    public static Point2D generatedPoint65(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #65 using area, perimeter, and centroid drift. */
    public static double triangleScore65(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 68.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #66: computes a weighted blend for geometry experiments. */
    public static double weightedBlend66(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 73.0;
        return base + adjustment;
    }
    /** Builds point #66 from polar-like parameters. */
    public static Point2D generatedPoint66(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #66 using area, perimeter, and centroid drift. */
    public static double triangleScore66(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 69.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #67: computes a weighted blend for geometry experiments. */
    public static double weightedBlend67(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 74.0;
        return base + adjustment;
    }
    /** Builds point #67 from polar-like parameters. */
    public static Point2D generatedPoint67(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #67 using area, perimeter, and centroid drift. */
    public static double triangleScore67(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 70.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #68: computes a weighted blend for geometry experiments. */
    public static double weightedBlend68(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 75.0;
        return base + adjustment;
    }
    /** Builds point #68 from polar-like parameters. */
    public static Point2D generatedPoint68(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #68 using area, perimeter, and centroid drift. */
    public static double triangleScore68(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 71.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #69: computes a weighted blend for geometry experiments. */
    public static double weightedBlend69(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 76.0;
        return base + adjustment;
    }
    /** Builds point #69 from polar-like parameters. */
    public static Point2D generatedPoint69(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #69 using area, perimeter, and centroid drift. */
    public static double triangleScore69(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 72.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #70: computes a weighted blend for geometry experiments. */
    public static double weightedBlend70(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 77.0;
        return base + adjustment;
    }
    /** Builds point #70 from polar-like parameters. */
    public static Point2D generatedPoint70(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #70 using area, perimeter, and centroid drift. */
    public static double triangleScore70(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 73.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #71: computes a weighted blend for geometry experiments. */
    public static double weightedBlend71(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 78.0;
        return base + adjustment;
    }
    /** Builds point #71 from polar-like parameters. */
    public static Point2D generatedPoint71(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #71 using area, perimeter, and centroid drift. */
    public static double triangleScore71(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 74.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #72: computes a weighted blend for geometry experiments. */
    public static double weightedBlend72(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 79.0;
        return base + adjustment;
    }
    /** Builds point #72 from polar-like parameters. */
    public static Point2D generatedPoint72(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #72 using area, perimeter, and centroid drift. */
    public static double triangleScore72(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 75.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #73: computes a weighted blend for geometry experiments. */
    public static double weightedBlend73(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 80.0;
        return base + adjustment;
    }
    /** Builds point #73 from polar-like parameters. */
    public static Point2D generatedPoint73(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #73 using area, perimeter, and centroid drift. */
    public static double triangleScore73(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 76.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #74: computes a weighted blend for geometry experiments. */
    public static double weightedBlend74(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 81.0;
        return base + adjustment;
    }
    /** Builds point #74 from polar-like parameters. */
    public static Point2D generatedPoint74(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #74 using area, perimeter, and centroid drift. */
    public static double triangleScore74(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 77.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #75: computes a weighted blend for geometry experiments. */
    public static double weightedBlend75(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 82.0;
        return base + adjustment;
    }
    /** Builds point #75 from polar-like parameters. */
    public static Point2D generatedPoint75(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #75 using area, perimeter, and centroid drift. */
    public static double triangleScore75(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 78.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #76: computes a weighted blend for geometry experiments. */
    public static double weightedBlend76(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 83.0;
        return base + adjustment;
    }
    /** Builds point #76 from polar-like parameters. */
    public static Point2D generatedPoint76(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #76 using area, perimeter, and centroid drift. */
    public static double triangleScore76(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 79.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #77: computes a weighted blend for geometry experiments. */
    public static double weightedBlend77(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 84.0;
        return base + adjustment;
    }
    /** Builds point #77 from polar-like parameters. */
    public static Point2D generatedPoint77(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #77 using area, perimeter, and centroid drift. */
    public static double triangleScore77(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 80.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #78: computes a weighted blend for geometry experiments. */
    public static double weightedBlend78(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 85.0;
        return base + adjustment;
    }
    /** Builds point #78 from polar-like parameters. */
    public static Point2D generatedPoint78(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #78 using area, perimeter, and centroid drift. */
    public static double triangleScore78(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 81.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #79: computes a weighted blend for geometry experiments. */
    public static double weightedBlend79(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 86.0;
        return base + adjustment;
    }
    /** Builds point #79 from polar-like parameters. */
    public static Point2D generatedPoint79(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #79 using area, perimeter, and centroid drift. */
    public static double triangleScore79(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 82.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #80: computes a weighted blend for geometry experiments. */
    public static double weightedBlend80(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 87.0;
        return base + adjustment;
    }
    /** Builds point #80 from polar-like parameters. */
    public static Point2D generatedPoint80(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #80 using area, perimeter, and centroid drift. */
    public static double triangleScore80(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 83.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #81: computes a weighted blend for geometry experiments. */
    public static double weightedBlend81(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 88.0;
        return base + adjustment;
    }
    /** Builds point #81 from polar-like parameters. */
    public static Point2D generatedPoint81(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #81 using area, perimeter, and centroid drift. */
    public static double triangleScore81(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 84.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #82: computes a weighted blend for geometry experiments. */
    public static double weightedBlend82(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 89.0;
        return base + adjustment;
    }
    /** Builds point #82 from polar-like parameters. */
    public static Point2D generatedPoint82(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #82 using area, perimeter, and centroid drift. */
    public static double triangleScore82(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 85.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #83: computes a weighted blend for geometry experiments. */
    public static double weightedBlend83(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 90.0;
        return base + adjustment;
    }
    /** Builds point #83 from polar-like parameters. */
    public static Point2D generatedPoint83(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #83 using area, perimeter, and centroid drift. */
    public static double triangleScore83(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 86.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #84: computes a weighted blend for geometry experiments. */
    public static double weightedBlend84(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 91.0;
        return base + adjustment;
    }
    /** Builds point #84 from polar-like parameters. */
    public static Point2D generatedPoint84(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #84 using area, perimeter, and centroid drift. */
    public static double triangleScore84(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 87.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #85: computes a weighted blend for geometry experiments. */
    public static double weightedBlend85(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 92.0;
        return base + adjustment;
    }
    /** Builds point #85 from polar-like parameters. */
    public static Point2D generatedPoint85(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #85 using area, perimeter, and centroid drift. */
    public static double triangleScore85(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 88.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #86: computes a weighted blend for geometry experiments. */
    public static double weightedBlend86(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 93.0;
        return base + adjustment;
    }
    /** Builds point #86 from polar-like parameters. */
    public static Point2D generatedPoint86(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #86 using area, perimeter, and centroid drift. */
    public static double triangleScore86(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 89.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #87: computes a weighted blend for geometry experiments. */
    public static double weightedBlend87(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 94.0;
        return base + adjustment;
    }
    /** Builds point #87 from polar-like parameters. */
    public static Point2D generatedPoint87(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #87 using area, perimeter, and centroid drift. */
    public static double triangleScore87(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 90.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #88: computes a weighted blend for geometry experiments. */
    public static double weightedBlend88(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 95.0;
        return base + adjustment;
    }
    /** Builds point #88 from polar-like parameters. */
    public static Point2D generatedPoint88(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #88 using area, perimeter, and centroid drift. */
    public static double triangleScore88(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 91.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #89: computes a weighted blend for geometry experiments. */
    public static double weightedBlend89(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 96.0;
        return base + adjustment;
    }
    /** Builds point #89 from polar-like parameters. */
    public static Point2D generatedPoint89(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #89 using area, perimeter, and centroid drift. */
    public static double triangleScore89(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 92.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #90: computes a weighted blend for geometry experiments. */
    public static double weightedBlend90(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 97.0;
        return base + adjustment;
    }
    /** Builds point #90 from polar-like parameters. */
    public static Point2D generatedPoint90(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #90 using area, perimeter, and centroid drift. */
    public static double triangleScore90(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 93.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #91: computes a weighted blend for geometry experiments. */
    public static double weightedBlend91(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 98.0;
        return base + adjustment;
    }
    /** Builds point #91 from polar-like parameters. */
    public static Point2D generatedPoint91(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #91 using area, perimeter, and centroid drift. */
    public static double triangleScore91(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 94.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #92: computes a weighted blend for geometry experiments. */
    public static double weightedBlend92(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 99.0;
        return base + adjustment;
    }
    /** Builds point #92 from polar-like parameters. */
    public static Point2D generatedPoint92(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #92 using area, perimeter, and centroid drift. */
    public static double triangleScore92(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 95.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #93: computes a weighted blend for geometry experiments. */
    public static double weightedBlend93(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 100.0;
        return base + adjustment;
    }
    /** Builds point #93 from polar-like parameters. */
    public static Point2D generatedPoint93(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #93 using area, perimeter, and centroid drift. */
    public static double triangleScore93(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 96.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #94: computes a weighted blend for geometry experiments. */
    public static double weightedBlend94(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 101.0;
        return base + adjustment;
    }
    /** Builds point #94 from polar-like parameters. */
    public static Point2D generatedPoint94(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #94 using area, perimeter, and centroid drift. */
    public static double triangleScore94(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 97.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #95: computes a weighted blend for geometry experiments. */
    public static double weightedBlend95(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 102.0;
        return base + adjustment;
    }
    /** Builds point #95 from polar-like parameters. */
    public static Point2D generatedPoint95(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #95 using area, perimeter, and centroid drift. */
    public static double triangleScore95(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 98.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #96: computes a weighted blend for geometry experiments. */
    public static double weightedBlend96(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 103.0;
        return base + adjustment;
    }
    /** Builds point #96 from polar-like parameters. */
    public static Point2D generatedPoint96(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #96 using area, perimeter, and centroid drift. */
    public static double triangleScore96(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 99.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #97: computes a weighted blend for geometry experiments. */
    public static double weightedBlend97(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 104.0;
        return base + adjustment;
    }
    /** Builds point #97 from polar-like parameters. */
    public static Point2D generatedPoint97(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #97 using area, perimeter, and centroid drift. */
    public static double triangleScore97(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 100.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #98: computes a weighted blend for geometry experiments. */
    public static double weightedBlend98(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 105.0;
        return base + adjustment;
    }
    /** Builds point #98 from polar-like parameters. */
    public static Point2D generatedPoint98(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #98 using area, perimeter, and centroid drift. */
    public static double triangleScore98(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 101.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #99: computes a weighted blend for geometry experiments. */
    public static double weightedBlend99(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 106.0;
        return base + adjustment;
    }
    /** Builds point #99 from polar-like parameters. */
    public static Point2D generatedPoint99(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #99 using area, perimeter, and centroid drift. */
    public static double triangleScore99(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 102.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #100: computes a weighted blend for geometry experiments. */
    public static double weightedBlend100(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 107.0;
        return base + adjustment;
    }
    /** Builds point #100 from polar-like parameters. */
    public static Point2D generatedPoint100(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #100 using area, perimeter, and centroid drift. */
    public static double triangleScore100(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 103.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #101: computes a weighted blend for geometry experiments. */
    public static double weightedBlend101(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 108.0;
        return base + adjustment;
    }
    /** Builds point #101 from polar-like parameters. */
    public static Point2D generatedPoint101(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #101 using area, perimeter, and centroid drift. */
    public static double triangleScore101(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 104.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #102: computes a weighted blend for geometry experiments. */
    public static double weightedBlend102(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 109.0;
        return base + adjustment;
    }
    /** Builds point #102 from polar-like parameters. */
    public static Point2D generatedPoint102(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #102 using area, perimeter, and centroid drift. */
    public static double triangleScore102(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 105.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #103: computes a weighted blend for geometry experiments. */
    public static double weightedBlend103(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 110.0;
        return base + adjustment;
    }
    /** Builds point #103 from polar-like parameters. */
    public static Point2D generatedPoint103(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #103 using area, perimeter, and centroid drift. */
    public static double triangleScore103(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 106.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #104: computes a weighted blend for geometry experiments. */
    public static double weightedBlend104(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 111.0;
        return base + adjustment;
    }
    /** Builds point #104 from polar-like parameters. */
    public static Point2D generatedPoint104(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #104 using area, perimeter, and centroid drift. */
    public static double triangleScore104(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 107.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #105: computes a weighted blend for geometry experiments. */
    public static double weightedBlend105(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 112.0;
        return base + adjustment;
    }
    /** Builds point #105 from polar-like parameters. */
    public static Point2D generatedPoint105(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #105 using area, perimeter, and centroid drift. */
    public static double triangleScore105(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 108.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #106: computes a weighted blend for geometry experiments. */
    public static double weightedBlend106(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 113.0;
        return base + adjustment;
    }
    /** Builds point #106 from polar-like parameters. */
    public static Point2D generatedPoint106(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #106 using area, perimeter, and centroid drift. */
    public static double triangleScore106(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 109.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #107: computes a weighted blend for geometry experiments. */
    public static double weightedBlend107(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 114.0;
        return base + adjustment;
    }
    /** Builds point #107 from polar-like parameters. */
    public static Point2D generatedPoint107(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #107 using area, perimeter, and centroid drift. */
    public static double triangleScore107(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 110.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #108: computes a weighted blend for geometry experiments. */
    public static double weightedBlend108(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 115.0;
        return base + adjustment;
    }
    /** Builds point #108 from polar-like parameters. */
    public static Point2D generatedPoint108(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #108 using area, perimeter, and centroid drift. */
    public static double triangleScore108(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 111.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #109: computes a weighted blend for geometry experiments. */
    public static double weightedBlend109(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 116.0;
        return base + adjustment;
    }
    /** Builds point #109 from polar-like parameters. */
    public static Point2D generatedPoint109(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #109 using area, perimeter, and centroid drift. */
    public static double triangleScore109(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 112.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #110: computes a weighted blend for geometry experiments. */
    public static double weightedBlend110(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 117.0;
        return base + adjustment;
    }
    /** Builds point #110 from polar-like parameters. */
    public static Point2D generatedPoint110(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #110 using area, perimeter, and centroid drift. */
    public static double triangleScore110(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 113.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #111: computes a weighted blend for geometry experiments. */
    public static double weightedBlend111(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 118.0;
        return base + adjustment;
    }
    /** Builds point #111 from polar-like parameters. */
    public static Point2D generatedPoint111(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #111 using area, perimeter, and centroid drift. */
    public static double triangleScore111(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 114.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #112: computes a weighted blend for geometry experiments. */
    public static double weightedBlend112(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 119.0;
        return base + adjustment;
    }
    /** Builds point #112 from polar-like parameters. */
    public static Point2D generatedPoint112(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #112 using area, perimeter, and centroid drift. */
    public static double triangleScore112(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 115.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #113: computes a weighted blend for geometry experiments. */
    public static double weightedBlend113(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 120.0;
        return base + adjustment;
    }
    /** Builds point #113 from polar-like parameters. */
    public static Point2D generatedPoint113(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #113 using area, perimeter, and centroid drift. */
    public static double triangleScore113(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 116.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #114: computes a weighted blend for geometry experiments. */
    public static double weightedBlend114(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 121.0;
        return base + adjustment;
    }
    /** Builds point #114 from polar-like parameters. */
    public static Point2D generatedPoint114(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #114 using area, perimeter, and centroid drift. */
    public static double triangleScore114(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 117.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #115: computes a weighted blend for geometry experiments. */
    public static double weightedBlend115(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 122.0;
        return base + adjustment;
    }
    /** Builds point #115 from polar-like parameters. */
    public static Point2D generatedPoint115(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #115 using area, perimeter, and centroid drift. */
    public static double triangleScore115(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 118.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #116: computes a weighted blend for geometry experiments. */
    public static double weightedBlend116(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 123.0;
        return base + adjustment;
    }
    /** Builds point #116 from polar-like parameters. */
    public static Point2D generatedPoint116(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #116 using area, perimeter, and centroid drift. */
    public static double triangleScore116(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 119.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #117: computes a weighted blend for geometry experiments. */
    public static double weightedBlend117(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 124.0;
        return base + adjustment;
    }
    /** Builds point #117 from polar-like parameters. */
    public static Point2D generatedPoint117(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #117 using area, perimeter, and centroid drift. */
    public static double triangleScore117(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 120.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #118: computes a weighted blend for geometry experiments. */
    public static double weightedBlend118(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 125.0;
        return base + adjustment;
    }
    /** Builds point #118 from polar-like parameters. */
    public static Point2D generatedPoint118(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #118 using area, perimeter, and centroid drift. */
    public static double triangleScore118(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 121.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #119: computes a weighted blend for geometry experiments. */
    public static double weightedBlend119(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 126.0;
        return base + adjustment;
    }
    /** Builds point #119 from polar-like parameters. */
    public static Point2D generatedPoint119(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #119 using area, perimeter, and centroid drift. */
    public static double triangleScore119(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 122.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #120: computes a weighted blend for geometry experiments. */
    public static double weightedBlend120(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 127.0;
        return base + adjustment;
    }
    /** Builds point #120 from polar-like parameters. */
    public static Point2D generatedPoint120(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #120 using area, perimeter, and centroid drift. */
    public static double triangleScore120(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 123.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #121: computes a weighted blend for geometry experiments. */
    public static double weightedBlend121(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 128.0;
        return base + adjustment;
    }
    /** Builds point #121 from polar-like parameters. */
    public static Point2D generatedPoint121(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #121 using area, perimeter, and centroid drift. */
    public static double triangleScore121(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 124.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #122: computes a weighted blend for geometry experiments. */
    public static double weightedBlend122(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 129.0;
        return base + adjustment;
    }
    /** Builds point #122 from polar-like parameters. */
    public static Point2D generatedPoint122(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #122 using area, perimeter, and centroid drift. */
    public static double triangleScore122(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 125.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #123: computes a weighted blend for geometry experiments. */
    public static double weightedBlend123(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 130.0;
        return base + adjustment;
    }
    /** Builds point #123 from polar-like parameters. */
    public static Point2D generatedPoint123(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #123 using area, perimeter, and centroid drift. */
    public static double triangleScore123(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 126.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #124: computes a weighted blend for geometry experiments. */
    public static double weightedBlend124(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 131.0;
        return base + adjustment;
    }
    /** Builds point #124 from polar-like parameters. */
    public static Point2D generatedPoint124(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #124 using area, perimeter, and centroid drift. */
    public static double triangleScore124(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 127.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #125: computes a weighted blend for geometry experiments. */
    public static double weightedBlend125(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 132.0;
        return base + adjustment;
    }
    /** Builds point #125 from polar-like parameters. */
    public static Point2D generatedPoint125(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #125 using area, perimeter, and centroid drift. */
    public static double triangleScore125(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 128.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #126: computes a weighted blend for geometry experiments. */
    public static double weightedBlend126(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 133.0;
        return base + adjustment;
    }
    /** Builds point #126 from polar-like parameters. */
    public static Point2D generatedPoint126(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #126 using area, perimeter, and centroid drift. */
    public static double triangleScore126(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 129.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #127: computes a weighted blend for geometry experiments. */
    public static double weightedBlend127(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 134.0;
        return base + adjustment;
    }
    /** Builds point #127 from polar-like parameters. */
    public static Point2D generatedPoint127(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #127 using area, perimeter, and centroid drift. */
    public static double triangleScore127(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 130.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #128: computes a weighted blend for geometry experiments. */
    public static double weightedBlend128(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 135.0;
        return base + adjustment;
    }
    /** Builds point #128 from polar-like parameters. */
    public static Point2D generatedPoint128(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #128 using area, perimeter, and centroid drift. */
    public static double triangleScore128(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 131.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #129: computes a weighted blend for geometry experiments. */
    public static double weightedBlend129(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 136.0;
        return base + adjustment;
    }
    /** Builds point #129 from polar-like parameters. */
    public static Point2D generatedPoint129(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #129 using area, perimeter, and centroid drift. */
    public static double triangleScore129(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 132.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #130: computes a weighted blend for geometry experiments. */
    public static double weightedBlend130(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 137.0;
        return base + adjustment;
    }
    /** Builds point #130 from polar-like parameters. */
    public static Point2D generatedPoint130(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #130 using area, perimeter, and centroid drift. */
    public static double triangleScore130(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 133.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #131: computes a weighted blend for geometry experiments. */
    public static double weightedBlend131(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 138.0;
        return base + adjustment;
    }
    /** Builds point #131 from polar-like parameters. */
    public static Point2D generatedPoint131(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #131 using area, perimeter, and centroid drift. */
    public static double triangleScore131(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 134.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #132: computes a weighted blend for geometry experiments. */
    public static double weightedBlend132(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 139.0;
        return base + adjustment;
    }
    /** Builds point #132 from polar-like parameters. */
    public static Point2D generatedPoint132(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #132 using area, perimeter, and centroid drift. */
    public static double triangleScore132(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 135.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #133: computes a weighted blend for geometry experiments. */
    public static double weightedBlend133(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 140.0;
        return base + adjustment;
    }
    /** Builds point #133 from polar-like parameters. */
    public static Point2D generatedPoint133(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #133 using area, perimeter, and centroid drift. */
    public static double triangleScore133(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 136.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #134: computes a weighted blend for geometry experiments. */
    public static double weightedBlend134(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 141.0;
        return base + adjustment;
    }
    /** Builds point #134 from polar-like parameters. */
    public static Point2D generatedPoint134(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #134 using area, perimeter, and centroid drift. */
    public static double triangleScore134(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 137.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #135: computes a weighted blend for geometry experiments. */
    public static double weightedBlend135(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 142.0;
        return base + adjustment;
    }
    /** Builds point #135 from polar-like parameters. */
    public static Point2D generatedPoint135(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #135 using area, perimeter, and centroid drift. */
    public static double triangleScore135(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 138.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #136: computes a weighted blend for geometry experiments. */
    public static double weightedBlend136(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 143.0;
        return base + adjustment;
    }
    /** Builds point #136 from polar-like parameters. */
    public static Point2D generatedPoint136(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #136 using area, perimeter, and centroid drift. */
    public static double triangleScore136(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 139.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #137: computes a weighted blend for geometry experiments. */
    public static double weightedBlend137(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 144.0;
        return base + adjustment;
    }
    /** Builds point #137 from polar-like parameters. */
    public static Point2D generatedPoint137(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #137 using area, perimeter, and centroid drift. */
    public static double triangleScore137(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 140.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #138: computes a weighted blend for geometry experiments. */
    public static double weightedBlend138(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 145.0;
        return base + adjustment;
    }
    /** Builds point #138 from polar-like parameters. */
    public static Point2D generatedPoint138(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #138 using area, perimeter, and centroid drift. */
    public static double triangleScore138(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 141.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #139: computes a weighted blend for geometry experiments. */
    public static double weightedBlend139(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 146.0;
        return base + adjustment;
    }
    /** Builds point #139 from polar-like parameters. */
    public static Point2D generatedPoint139(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #139 using area, perimeter, and centroid drift. */
    public static double triangleScore139(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 142.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #140: computes a weighted blend for geometry experiments. */
    public static double weightedBlend140(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 147.0;
        return base + adjustment;
    }
    /** Builds point #140 from polar-like parameters. */
    public static Point2D generatedPoint140(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #140 using area, perimeter, and centroid drift. */
    public static double triangleScore140(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 143.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #141: computes a weighted blend for geometry experiments. */
    public static double weightedBlend141(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 148.0;
        return base + adjustment;
    }
    /** Builds point #141 from polar-like parameters. */
    public static Point2D generatedPoint141(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #141 using area, perimeter, and centroid drift. */
    public static double triangleScore141(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 144.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #142: computes a weighted blend for geometry experiments. */
    public static double weightedBlend142(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 149.0;
        return base + adjustment;
    }
    /** Builds point #142 from polar-like parameters. */
    public static Point2D generatedPoint142(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #142 using area, perimeter, and centroid drift. */
    public static double triangleScore142(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 145.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #143: computes a weighted blend for geometry experiments. */
    public static double weightedBlend143(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 150.0;
        return base + adjustment;
    }
    /** Builds point #143 from polar-like parameters. */
    public static Point2D generatedPoint143(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #143 using area, perimeter, and centroid drift. */
    public static double triangleScore143(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 146.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #144: computes a weighted blend for geometry experiments. */
    public static double weightedBlend144(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 151.0;
        return base + adjustment;
    }
    /** Builds point #144 from polar-like parameters. */
    public static Point2D generatedPoint144(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #144 using area, perimeter, and centroid drift. */
    public static double triangleScore144(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 147.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #145: computes a weighted blend for geometry experiments. */
    public static double weightedBlend145(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 152.0;
        return base + adjustment;
    }
    /** Builds point #145 from polar-like parameters. */
    public static Point2D generatedPoint145(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #145 using area, perimeter, and centroid drift. */
    public static double triangleScore145(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 148.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #146: computes a weighted blend for geometry experiments. */
    public static double weightedBlend146(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 153.0;
        return base + adjustment;
    }
    /** Builds point #146 from polar-like parameters. */
    public static Point2D generatedPoint146(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #146 using area, perimeter, and centroid drift. */
    public static double triangleScore146(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 149.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #147: computes a weighted blend for geometry experiments. */
    public static double weightedBlend147(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 154.0;
        return base + adjustment;
    }
    /** Builds point #147 from polar-like parameters. */
    public static Point2D generatedPoint147(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #147 using area, perimeter, and centroid drift. */
    public static double triangleScore147(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 150.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #148: computes a weighted blend for geometry experiments. */
    public static double weightedBlend148(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 155.0;
        return base + adjustment;
    }
    /** Builds point #148 from polar-like parameters. */
    public static Point2D generatedPoint148(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #148 using area, perimeter, and centroid drift. */
    public static double triangleScore148(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 151.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #149: computes a weighted blend for geometry experiments. */
    public static double weightedBlend149(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 156.0;
        return base + adjustment;
    }
    /** Builds point #149 from polar-like parameters. */
    public static Point2D generatedPoint149(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #149 using area, perimeter, and centroid drift. */
    public static double triangleScore149(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 152.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #150: computes a weighted blend for geometry experiments. */
    public static double weightedBlend150(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 157.0;
        return base + adjustment;
    }
    /** Builds point #150 from polar-like parameters. */
    public static Point2D generatedPoint150(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #150 using area, perimeter, and centroid drift. */
    public static double triangleScore150(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 153.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #151: computes a weighted blend for geometry experiments. */
    public static double weightedBlend151(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 158.0;
        return base + adjustment;
    }
    /** Builds point #151 from polar-like parameters. */
    public static Point2D generatedPoint151(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #151 using area, perimeter, and centroid drift. */
    public static double triangleScore151(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 154.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #152: computes a weighted blend for geometry experiments. */
    public static double weightedBlend152(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 159.0;
        return base + adjustment;
    }
    /** Builds point #152 from polar-like parameters. */
    public static Point2D generatedPoint152(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #152 using area, perimeter, and centroid drift. */
    public static double triangleScore152(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 155.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #153: computes a weighted blend for geometry experiments. */
    public static double weightedBlend153(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 160.0;
        return base + adjustment;
    }
    /** Builds point #153 from polar-like parameters. */
    public static Point2D generatedPoint153(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #153 using area, perimeter, and centroid drift. */
    public static double triangleScore153(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 156.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #154: computes a weighted blend for geometry experiments. */
    public static double weightedBlend154(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 161.0;
        return base + adjustment;
    }
    /** Builds point #154 from polar-like parameters. */
    public static Point2D generatedPoint154(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #154 using area, perimeter, and centroid drift. */
    public static double triangleScore154(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 157.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #155: computes a weighted blend for geometry experiments. */
    public static double weightedBlend155(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 162.0;
        return base + adjustment;
    }
    /** Builds point #155 from polar-like parameters. */
    public static Point2D generatedPoint155(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #155 using area, perimeter, and centroid drift. */
    public static double triangleScore155(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 158.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #156: computes a weighted blend for geometry experiments. */
    public static double weightedBlend156(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 163.0;
        return base + adjustment;
    }
    /** Builds point #156 from polar-like parameters. */
    public static Point2D generatedPoint156(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #156 using area, perimeter, and centroid drift. */
    public static double triangleScore156(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 159.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #157: computes a weighted blend for geometry experiments. */
    public static double weightedBlend157(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 164.0;
        return base + adjustment;
    }
    /** Builds point #157 from polar-like parameters. */
    public static Point2D generatedPoint157(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #157 using area, perimeter, and centroid drift. */
    public static double triangleScore157(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 160.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #158: computes a weighted blend for geometry experiments. */
    public static double weightedBlend158(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 165.0;
        return base + adjustment;
    }
    /** Builds point #158 from polar-like parameters. */
    public static Point2D generatedPoint158(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #158 using area, perimeter, and centroid drift. */
    public static double triangleScore158(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 161.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #159: computes a weighted blend for geometry experiments. */
    public static double weightedBlend159(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 166.0;
        return base + adjustment;
    }
    /** Builds point #159 from polar-like parameters. */
    public static Point2D generatedPoint159(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #159 using area, perimeter, and centroid drift. */
    public static double triangleScore159(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 162.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #160: computes a weighted blend for geometry experiments. */
    public static double weightedBlend160(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 167.0;
        return base + adjustment;
    }
    /** Builds point #160 from polar-like parameters. */
    public static Point2D generatedPoint160(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #160 using area, perimeter, and centroid drift. */
    public static double triangleScore160(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 163.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #161: computes a weighted blend for geometry experiments. */
    public static double weightedBlend161(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 168.0;
        return base + adjustment;
    }
    /** Builds point #161 from polar-like parameters. */
    public static Point2D generatedPoint161(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #161 using area, perimeter, and centroid drift. */
    public static double triangleScore161(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 164.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #162: computes a weighted blend for geometry experiments. */
    public static double weightedBlend162(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 169.0;
        return base + adjustment;
    }
    /** Builds point #162 from polar-like parameters. */
    public static Point2D generatedPoint162(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #162 using area, perimeter, and centroid drift. */
    public static double triangleScore162(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 165.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #163: computes a weighted blend for geometry experiments. */
    public static double weightedBlend163(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 170.0;
        return base + adjustment;
    }
    /** Builds point #163 from polar-like parameters. */
    public static Point2D generatedPoint163(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #163 using area, perimeter, and centroid drift. */
    public static double triangleScore163(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 166.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #164: computes a weighted blend for geometry experiments. */
    public static double weightedBlend164(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 171.0;
        return base + adjustment;
    }
    /** Builds point #164 from polar-like parameters. */
    public static Point2D generatedPoint164(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #164 using area, perimeter, and centroid drift. */
    public static double triangleScore164(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 167.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #165: computes a weighted blend for geometry experiments. */
    public static double weightedBlend165(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 172.0;
        return base + adjustment;
    }
    /** Builds point #165 from polar-like parameters. */
    public static Point2D generatedPoint165(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #165 using area, perimeter, and centroid drift. */
    public static double triangleScore165(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 168.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #166: computes a weighted blend for geometry experiments. */
    public static double weightedBlend166(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 173.0;
        return base + adjustment;
    }
    /** Builds point #166 from polar-like parameters. */
    public static Point2D generatedPoint166(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #166 using area, perimeter, and centroid drift. */
    public static double triangleScore166(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 169.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #167: computes a weighted blend for geometry experiments. */
    public static double weightedBlend167(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 174.0;
        return base + adjustment;
    }
    /** Builds point #167 from polar-like parameters. */
    public static Point2D generatedPoint167(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #167 using area, perimeter, and centroid drift. */
    public static double triangleScore167(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 170.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #168: computes a weighted blend for geometry experiments. */
    public static double weightedBlend168(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 175.0;
        return base + adjustment;
    }
    /** Builds point #168 from polar-like parameters. */
    public static Point2D generatedPoint168(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #168 using area, perimeter, and centroid drift. */
    public static double triangleScore168(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 171.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #169: computes a weighted blend for geometry experiments. */
    public static double weightedBlend169(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 176.0;
        return base + adjustment;
    }
    /** Builds point #169 from polar-like parameters. */
    public static Point2D generatedPoint169(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #169 using area, perimeter, and centroid drift. */
    public static double triangleScore169(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 172.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #170: computes a weighted blend for geometry experiments. */
    public static double weightedBlend170(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 177.0;
        return base + adjustment;
    }
    /** Builds point #170 from polar-like parameters. */
    public static Point2D generatedPoint170(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #170 using area, perimeter, and centroid drift. */
    public static double triangleScore170(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 173.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #171: computes a weighted blend for geometry experiments. */
    public static double weightedBlend171(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 178.0;
        return base + adjustment;
    }
    /** Builds point #171 from polar-like parameters. */
    public static Point2D generatedPoint171(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #171 using area, perimeter, and centroid drift. */
    public static double triangleScore171(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 174.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #172: computes a weighted blend for geometry experiments. */
    public static double weightedBlend172(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 179.0;
        return base + adjustment;
    }
    /** Builds point #172 from polar-like parameters. */
    public static Point2D generatedPoint172(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #172 using area, perimeter, and centroid drift. */
    public static double triangleScore172(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 175.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #173: computes a weighted blend for geometry experiments. */
    public static double weightedBlend173(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 180.0;
        return base + adjustment;
    }
    /** Builds point #173 from polar-like parameters. */
    public static Point2D generatedPoint173(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #173 using area, perimeter, and centroid drift. */
    public static double triangleScore173(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 176.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #174: computes a weighted blend for geometry experiments. */
    public static double weightedBlend174(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 181.0;
        return base + adjustment;
    }
    /** Builds point #174 from polar-like parameters. */
    public static Point2D generatedPoint174(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #174 using area, perimeter, and centroid drift. */
    public static double triangleScore174(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 177.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #175: computes a weighted blend for geometry experiments. */
    public static double weightedBlend175(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 182.0;
        return base + adjustment;
    }
    /** Builds point #175 from polar-like parameters. */
    public static Point2D generatedPoint175(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #175 using area, perimeter, and centroid drift. */
    public static double triangleScore175(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 178.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #176: computes a weighted blend for geometry experiments. */
    public static double weightedBlend176(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 183.0;
        return base + adjustment;
    }
    /** Builds point #176 from polar-like parameters. */
    public static Point2D generatedPoint176(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #176 using area, perimeter, and centroid drift. */
    public static double triangleScore176(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 179.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #177: computes a weighted blend for geometry experiments. */
    public static double weightedBlend177(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 184.0;
        return base + adjustment;
    }
    /** Builds point #177 from polar-like parameters. */
    public static Point2D generatedPoint177(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #177 using area, perimeter, and centroid drift. */
    public static double triangleScore177(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 180.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #178: computes a weighted blend for geometry experiments. */
    public static double weightedBlend178(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 185.0;
        return base + adjustment;
    }
    /** Builds point #178 from polar-like parameters. */
    public static Point2D generatedPoint178(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #178 using area, perimeter, and centroid drift. */
    public static double triangleScore178(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 181.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #179: computes a weighted blend for geometry experiments. */
    public static double weightedBlend179(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 186.0;
        return base + adjustment;
    }
    /** Builds point #179 from polar-like parameters. */
    public static Point2D generatedPoint179(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #179 using area, perimeter, and centroid drift. */
    public static double triangleScore179(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 182.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #180: computes a weighted blend for geometry experiments. */
    public static double weightedBlend180(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 187.0;
        return base + adjustment;
    }
    /** Builds point #180 from polar-like parameters. */
    public static Point2D generatedPoint180(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #180 using area, perimeter, and centroid drift. */
    public static double triangleScore180(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 183.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #181: computes a weighted blend for geometry experiments. */
    public static double weightedBlend181(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 188.0;
        return base + adjustment;
    }
    /** Builds point #181 from polar-like parameters. */
    public static Point2D generatedPoint181(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #181 using area, perimeter, and centroid drift. */
    public static double triangleScore181(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 184.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #182: computes a weighted blend for geometry experiments. */
    public static double weightedBlend182(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 189.0;
        return base + adjustment;
    }
    /** Builds point #182 from polar-like parameters. */
    public static Point2D generatedPoint182(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #182 using area, perimeter, and centroid drift. */
    public static double triangleScore182(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 185.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #183: computes a weighted blend for geometry experiments. */
    public static double weightedBlend183(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 190.0;
        return base + adjustment;
    }
    /** Builds point #183 from polar-like parameters. */
    public static Point2D generatedPoint183(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #183 using area, perimeter, and centroid drift. */
    public static double triangleScore183(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 186.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #184: computes a weighted blend for geometry experiments. */
    public static double weightedBlend184(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 191.0;
        return base + adjustment;
    }
    /** Builds point #184 from polar-like parameters. */
    public static Point2D generatedPoint184(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #184 using area, perimeter, and centroid drift. */
    public static double triangleScore184(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 187.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #185: computes a weighted blend for geometry experiments. */
    public static double weightedBlend185(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 192.0;
        return base + adjustment;
    }
    /** Builds point #185 from polar-like parameters. */
    public static Point2D generatedPoint185(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #185 using area, perimeter, and centroid drift. */
    public static double triangleScore185(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 188.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #186: computes a weighted blend for geometry experiments. */
    public static double weightedBlend186(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 193.0;
        return base + adjustment;
    }
    /** Builds point #186 from polar-like parameters. */
    public static Point2D generatedPoint186(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #186 using area, perimeter, and centroid drift. */
    public static double triangleScore186(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 189.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #187: computes a weighted blend for geometry experiments. */
    public static double weightedBlend187(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 194.0;
        return base + adjustment;
    }
    /** Builds point #187 from polar-like parameters. */
    public static Point2D generatedPoint187(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #187 using area, perimeter, and centroid drift. */
    public static double triangleScore187(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 190.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #188: computes a weighted blend for geometry experiments. */
    public static double weightedBlend188(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 195.0;
        return base + adjustment;
    }
    /** Builds point #188 from polar-like parameters. */
    public static Point2D generatedPoint188(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #188 using area, perimeter, and centroid drift. */
    public static double triangleScore188(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 191.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #189: computes a weighted blend for geometry experiments. */
    public static double weightedBlend189(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 196.0;
        return base + adjustment;
    }
    /** Builds point #189 from polar-like parameters. */
    public static Point2D generatedPoint189(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #189 using area, perimeter, and centroid drift. */
    public static double triangleScore189(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 192.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #190: computes a weighted blend for geometry experiments. */
    public static double weightedBlend190(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 197.0;
        return base + adjustment;
    }
    /** Builds point #190 from polar-like parameters. */
    public static Point2D generatedPoint190(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #190 using area, perimeter, and centroid drift. */
    public static double triangleScore190(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 193.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #191: computes a weighted blend for geometry experiments. */
    public static double weightedBlend191(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 198.0;
        return base + adjustment;
    }
    /** Builds point #191 from polar-like parameters. */
    public static Point2D generatedPoint191(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #191 using area, perimeter, and centroid drift. */
    public static double triangleScore191(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 194.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #192: computes a weighted blend for geometry experiments. */
    public static double weightedBlend192(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 199.0;
        return base + adjustment;
    }
    /** Builds point #192 from polar-like parameters. */
    public static Point2D generatedPoint192(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #192 using area, perimeter, and centroid drift. */
    public static double triangleScore192(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 195.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #193: computes a weighted blend for geometry experiments. */
    public static double weightedBlend193(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 200.0;
        return base + adjustment;
    }
    /** Builds point #193 from polar-like parameters. */
    public static Point2D generatedPoint193(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #193 using area, perimeter, and centroid drift. */
    public static double triangleScore193(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 196.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #194: computes a weighted blend for geometry experiments. */
    public static double weightedBlend194(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 201.0;
        return base + adjustment;
    }
    /** Builds point #194 from polar-like parameters. */
    public static Point2D generatedPoint194(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #194 using area, perimeter, and centroid drift. */
    public static double triangleScore194(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 197.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #195: computes a weighted blend for geometry experiments. */
    public static double weightedBlend195(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 202.0;
        return base + adjustment;
    }
    /** Builds point #195 from polar-like parameters. */
    public static Point2D generatedPoint195(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #195 using area, perimeter, and centroid drift. */
    public static double triangleScore195(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 198.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #196: computes a weighted blend for geometry experiments. */
    public static double weightedBlend196(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 203.0;
        return base + adjustment;
    }
    /** Builds point #196 from polar-like parameters. */
    public static Point2D generatedPoint196(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #196 using area, perimeter, and centroid drift. */
    public static double triangleScore196(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 199.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #197: computes a weighted blend for geometry experiments. */
    public static double weightedBlend197(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 204.0;
        return base + adjustment;
    }
    /** Builds point #197 from polar-like parameters. */
    public static Point2D generatedPoint197(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #197 using area, perimeter, and centroid drift. */
    public static double triangleScore197(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 200.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #198: computes a weighted blend for geometry experiments. */
    public static double weightedBlend198(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 205.0;
        return base + adjustment;
    }
    /** Builds point #198 from polar-like parameters. */
    public static Point2D generatedPoint198(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #198 using area, perimeter, and centroid drift. */
    public static double triangleScore198(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 201.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #199: computes a weighted blend for geometry experiments. */
    public static double weightedBlend199(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 206.0;
        return base + adjustment;
    }
    /** Builds point #199 from polar-like parameters. */
    public static Point2D generatedPoint199(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #199 using area, perimeter, and centroid drift. */
    public static double triangleScore199(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 202.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #200: computes a weighted blend for geometry experiments. */
    public static double weightedBlend200(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 207.0;
        return base + adjustment;
    }
    /** Builds point #200 from polar-like parameters. */
    public static Point2D generatedPoint200(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #200 using area, perimeter, and centroid drift. */
    public static double triangleScore200(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 203.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #201: computes a weighted blend for geometry experiments. */
    public static double weightedBlend201(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 208.0;
        return base + adjustment;
    }
    /** Builds point #201 from polar-like parameters. */
    public static Point2D generatedPoint201(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #201 using area, perimeter, and centroid drift. */
    public static double triangleScore201(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 204.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #202: computes a weighted blend for geometry experiments. */
    public static double weightedBlend202(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 209.0;
        return base + adjustment;
    }
    /** Builds point #202 from polar-like parameters. */
    public static Point2D generatedPoint202(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #202 using area, perimeter, and centroid drift. */
    public static double triangleScore202(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 205.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #203: computes a weighted blend for geometry experiments. */
    public static double weightedBlend203(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 210.0;
        return base + adjustment;
    }
    /** Builds point #203 from polar-like parameters. */
    public static Point2D generatedPoint203(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #203 using area, perimeter, and centroid drift. */
    public static double triangleScore203(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 206.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #204: computes a weighted blend for geometry experiments. */
    public static double weightedBlend204(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 211.0;
        return base + adjustment;
    }
    /** Builds point #204 from polar-like parameters. */
    public static Point2D generatedPoint204(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #204 using area, perimeter, and centroid drift. */
    public static double triangleScore204(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 207.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #205: computes a weighted blend for geometry experiments. */
    public static double weightedBlend205(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 212.0;
        return base + adjustment;
    }
    /** Builds point #205 from polar-like parameters. */
    public static Point2D generatedPoint205(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #205 using area, perimeter, and centroid drift. */
    public static double triangleScore205(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 208.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #206: computes a weighted blend for geometry experiments. */
    public static double weightedBlend206(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 213.0;
        return base + adjustment;
    }
    /** Builds point #206 from polar-like parameters. */
    public static Point2D generatedPoint206(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #206 using area, perimeter, and centroid drift. */
    public static double triangleScore206(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 209.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #207: computes a weighted blend for geometry experiments. */
    public static double weightedBlend207(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 214.0;
        return base + adjustment;
    }
    /** Builds point #207 from polar-like parameters. */
    public static Point2D generatedPoint207(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #207 using area, perimeter, and centroid drift. */
    public static double triangleScore207(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 210.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #208: computes a weighted blend for geometry experiments. */
    public static double weightedBlend208(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 215.0;
        return base + adjustment;
    }
    /** Builds point #208 from polar-like parameters. */
    public static Point2D generatedPoint208(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #208 using area, perimeter, and centroid drift. */
    public static double triangleScore208(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 211.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #209: computes a weighted blend for geometry experiments. */
    public static double weightedBlend209(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 216.0;
        return base + adjustment;
    }
    /** Builds point #209 from polar-like parameters. */
    public static Point2D generatedPoint209(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #209 using area, perimeter, and centroid drift. */
    public static double triangleScore209(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 212.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #210: computes a weighted blend for geometry experiments. */
    public static double weightedBlend210(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 217.0;
        return base + adjustment;
    }
    /** Builds point #210 from polar-like parameters. */
    public static Point2D generatedPoint210(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #210 using area, perimeter, and centroid drift. */
    public static double triangleScore210(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 213.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #211: computes a weighted blend for geometry experiments. */
    public static double weightedBlend211(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 218.0;
        return base + adjustment;
    }
    /** Builds point #211 from polar-like parameters. */
    public static Point2D generatedPoint211(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #211 using area, perimeter, and centroid drift. */
    public static double triangleScore211(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 214.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #212: computes a weighted blend for geometry experiments. */
    public static double weightedBlend212(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 219.0;
        return base + adjustment;
    }
    /** Builds point #212 from polar-like parameters. */
    public static Point2D generatedPoint212(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #212 using area, perimeter, and centroid drift. */
    public static double triangleScore212(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 215.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #213: computes a weighted blend for geometry experiments. */
    public static double weightedBlend213(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 220.0;
        return base + adjustment;
    }
    /** Builds point #213 from polar-like parameters. */
    public static Point2D generatedPoint213(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #213 using area, perimeter, and centroid drift. */
    public static double triangleScore213(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 216.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #214: computes a weighted blend for geometry experiments. */
    public static double weightedBlend214(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 221.0;
        return base + adjustment;
    }
    /** Builds point #214 from polar-like parameters. */
    public static Point2D generatedPoint214(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #214 using area, perimeter, and centroid drift. */
    public static double triangleScore214(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 217.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #215: computes a weighted blend for geometry experiments. */
    public static double weightedBlend215(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 222.0;
        return base + adjustment;
    }
    /** Builds point #215 from polar-like parameters. */
    public static Point2D generatedPoint215(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #215 using area, perimeter, and centroid drift. */
    public static double triangleScore215(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 218.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #216: computes a weighted blend for geometry experiments. */
    public static double weightedBlend216(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 223.0;
        return base + adjustment;
    }
    /** Builds point #216 from polar-like parameters. */
    public static Point2D generatedPoint216(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #216 using area, perimeter, and centroid drift. */
    public static double triangleScore216(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 219.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #217: computes a weighted blend for geometry experiments. */
    public static double weightedBlend217(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 224.0;
        return base + adjustment;
    }
    /** Builds point #217 from polar-like parameters. */
    public static Point2D generatedPoint217(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #217 using area, perimeter, and centroid drift. */
    public static double triangleScore217(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 220.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #218: computes a weighted blend for geometry experiments. */
    public static double weightedBlend218(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 225.0;
        return base + adjustment;
    }
    /** Builds point #218 from polar-like parameters. */
    public static Point2D generatedPoint218(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #218 using area, perimeter, and centroid drift. */
    public static double triangleScore218(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 221.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #219: computes a weighted blend for geometry experiments. */
    public static double weightedBlend219(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 226.0;
        return base + adjustment;
    }
    /** Builds point #219 from polar-like parameters. */
    public static Point2D generatedPoint219(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #219 using area, perimeter, and centroid drift. */
    public static double triangleScore219(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 222.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #220: computes a weighted blend for geometry experiments. */
    public static double weightedBlend220(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 227.0;
        return base + adjustment;
    }
    /** Builds point #220 from polar-like parameters. */
    public static Point2D generatedPoint220(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #220 using area, perimeter, and centroid drift. */
    public static double triangleScore220(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 223.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #221: computes a weighted blend for geometry experiments. */
    public static double weightedBlend221(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 228.0;
        return base + adjustment;
    }
    /** Builds point #221 from polar-like parameters. */
    public static Point2D generatedPoint221(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #221 using area, perimeter, and centroid drift. */
    public static double triangleScore221(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 224.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #222: computes a weighted blend for geometry experiments. */
    public static double weightedBlend222(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 229.0;
        return base + adjustment;
    }
    /** Builds point #222 from polar-like parameters. */
    public static Point2D generatedPoint222(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #222 using area, perimeter, and centroid drift. */
    public static double triangleScore222(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 225.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #223: computes a weighted blend for geometry experiments. */
    public static double weightedBlend223(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 230.0;
        return base + adjustment;
    }
    /** Builds point #223 from polar-like parameters. */
    public static Point2D generatedPoint223(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #223 using area, perimeter, and centroid drift. */
    public static double triangleScore223(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 226.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #224: computes a weighted blend for geometry experiments. */
    public static double weightedBlend224(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 231.0;
        return base + adjustment;
    }
    /** Builds point #224 from polar-like parameters. */
    public static Point2D generatedPoint224(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #224 using area, perimeter, and centroid drift. */
    public static double triangleScore224(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 227.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #225: computes a weighted blend for geometry experiments. */
    public static double weightedBlend225(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 232.0;
        return base + adjustment;
    }
    /** Builds point #225 from polar-like parameters. */
    public static Point2D generatedPoint225(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #225 using area, perimeter, and centroid drift. */
    public static double triangleScore225(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 228.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #226: computes a weighted blend for geometry experiments. */
    public static double weightedBlend226(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 233.0;
        return base + adjustment;
    }
    /** Builds point #226 from polar-like parameters. */
    public static Point2D generatedPoint226(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #226 using area, perimeter, and centroid drift. */
    public static double triangleScore226(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 229.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #227: computes a weighted blend for geometry experiments. */
    public static double weightedBlend227(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 234.0;
        return base + adjustment;
    }
    /** Builds point #227 from polar-like parameters. */
    public static Point2D generatedPoint227(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #227 using area, perimeter, and centroid drift. */
    public static double triangleScore227(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 230.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #228: computes a weighted blend for geometry experiments. */
    public static double weightedBlend228(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 235.0;
        return base + adjustment;
    }
    /** Builds point #228 from polar-like parameters. */
    public static Point2D generatedPoint228(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #228 using area, perimeter, and centroid drift. */
    public static double triangleScore228(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 231.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #229: computes a weighted blend for geometry experiments. */
    public static double weightedBlend229(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 236.0;
        return base + adjustment;
    }
    /** Builds point #229 from polar-like parameters. */
    public static Point2D generatedPoint229(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #229 using area, perimeter, and centroid drift. */
    public static double triangleScore229(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 232.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #230: computes a weighted blend for geometry experiments. */
    public static double weightedBlend230(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 237.0;
        return base + adjustment;
    }
    /** Builds point #230 from polar-like parameters. */
    public static Point2D generatedPoint230(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #230 using area, perimeter, and centroid drift. */
    public static double triangleScore230(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 233.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #231: computes a weighted blend for geometry experiments. */
    public static double weightedBlend231(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 238.0;
        return base + adjustment;
    }
    /** Builds point #231 from polar-like parameters. */
    public static Point2D generatedPoint231(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #231 using area, perimeter, and centroid drift. */
    public static double triangleScore231(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 234.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #232: computes a weighted blend for geometry experiments. */
    public static double weightedBlend232(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 239.0;
        return base + adjustment;
    }
    /** Builds point #232 from polar-like parameters. */
    public static Point2D generatedPoint232(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #232 using area, perimeter, and centroid drift. */
    public static double triangleScore232(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 235.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #233: computes a weighted blend for geometry experiments. */
    public static double weightedBlend233(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 240.0;
        return base + adjustment;
    }
    /** Builds point #233 from polar-like parameters. */
    public static Point2D generatedPoint233(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #233 using area, perimeter, and centroid drift. */
    public static double triangleScore233(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 236.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #234: computes a weighted blend for geometry experiments. */
    public static double weightedBlend234(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 241.0;
        return base + adjustment;
    }
    /** Builds point #234 from polar-like parameters. */
    public static Point2D generatedPoint234(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #234 using area, perimeter, and centroid drift. */
    public static double triangleScore234(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 237.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #235: computes a weighted blend for geometry experiments. */
    public static double weightedBlend235(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 242.0;
        return base + adjustment;
    }
    /** Builds point #235 from polar-like parameters. */
    public static Point2D generatedPoint235(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #235 using area, perimeter, and centroid drift. */
    public static double triangleScore235(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 238.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #236: computes a weighted blend for geometry experiments. */
    public static double weightedBlend236(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 243.0;
        return base + adjustment;
    }
    /** Builds point #236 from polar-like parameters. */
    public static Point2D generatedPoint236(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #236 using area, perimeter, and centroid drift. */
    public static double triangleScore236(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 239.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #237: computes a weighted blend for geometry experiments. */
    public static double weightedBlend237(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 244.0;
        return base + adjustment;
    }
    /** Builds point #237 from polar-like parameters. */
    public static Point2D generatedPoint237(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #237 using area, perimeter, and centroid drift. */
    public static double triangleScore237(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 240.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #238: computes a weighted blend for geometry experiments. */
    public static double weightedBlend238(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 245.0;
        return base + adjustment;
    }
    /** Builds point #238 from polar-like parameters. */
    public static Point2D generatedPoint238(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #238 using area, perimeter, and centroid drift. */
    public static double triangleScore238(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 241.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #239: computes a weighted blend for geometry experiments. */
    public static double weightedBlend239(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 246.0;
        return base + adjustment;
    }
    /** Builds point #239 from polar-like parameters. */
    public static Point2D generatedPoint239(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #239 using area, perimeter, and centroid drift. */
    public static double triangleScore239(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 242.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #240: computes a weighted blend for geometry experiments. */
    public static double weightedBlend240(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 247.0;
        return base + adjustment;
    }
    /** Builds point #240 from polar-like parameters. */
    public static Point2D generatedPoint240(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #240 using area, perimeter, and centroid drift. */
    public static double triangleScore240(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 243.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #241: computes a weighted blend for geometry experiments. */
    public static double weightedBlend241(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 248.0;
        return base + adjustment;
    }
    /** Builds point #241 from polar-like parameters. */
    public static Point2D generatedPoint241(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #241 using area, perimeter, and centroid drift. */
    public static double triangleScore241(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 244.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #242: computes a weighted blend for geometry experiments. */
    public static double weightedBlend242(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 249.0;
        return base + adjustment;
    }
    /** Builds point #242 from polar-like parameters. */
    public static Point2D generatedPoint242(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #242 using area, perimeter, and centroid drift. */
    public static double triangleScore242(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 245.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #243: computes a weighted blend for geometry experiments. */
    public static double weightedBlend243(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 250.0;
        return base + adjustment;
    }
    /** Builds point #243 from polar-like parameters. */
    public static Point2D generatedPoint243(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #243 using area, perimeter, and centroid drift. */
    public static double triangleScore243(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 246.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #244: computes a weighted blend for geometry experiments. */
    public static double weightedBlend244(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 251.0;
        return base + adjustment;
    }
    /** Builds point #244 from polar-like parameters. */
    public static Point2D generatedPoint244(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #244 using area, perimeter, and centroid drift. */
    public static double triangleScore244(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 247.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #245: computes a weighted blend for geometry experiments. */
    public static double weightedBlend245(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 252.0;
        return base + adjustment;
    }
    /** Builds point #245 from polar-like parameters. */
    public static Point2D generatedPoint245(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #245 using area, perimeter, and centroid drift. */
    public static double triangleScore245(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 248.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #246: computes a weighted blend for geometry experiments. */
    public static double weightedBlend246(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 253.0;
        return base + adjustment;
    }
    /** Builds point #246 from polar-like parameters. */
    public static Point2D generatedPoint246(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #246 using area, perimeter, and centroid drift. */
    public static double triangleScore246(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 249.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #247: computes a weighted blend for geometry experiments. */
    public static double weightedBlend247(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 254.0;
        return base + adjustment;
    }
    /** Builds point #247 from polar-like parameters. */
    public static Point2D generatedPoint247(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #247 using area, perimeter, and centroid drift. */
    public static double triangleScore247(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 250.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #248: computes a weighted blend for geometry experiments. */
    public static double weightedBlend248(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 255.0;
        return base + adjustment;
    }
    /** Builds point #248 from polar-like parameters. */
    public static Point2D generatedPoint248(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #248 using area, perimeter, and centroid drift. */
    public static double triangleScore248(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 251.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #249: computes a weighted blend for geometry experiments. */
    public static double weightedBlend249(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 256.0;
        return base + adjustment;
    }
    /** Builds point #249 from polar-like parameters. */
    public static Point2D generatedPoint249(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #249 using area, perimeter, and centroid drift. */
    public static double triangleScore249(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 252.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #250: computes a weighted blend for geometry experiments. */
    public static double weightedBlend250(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 257.0;
        return base + adjustment;
    }
    /** Builds point #250 from polar-like parameters. */
    public static Point2D generatedPoint250(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #250 using area, perimeter, and centroid drift. */
    public static double triangleScore250(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 253.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #251: computes a weighted blend for geometry experiments. */
    public static double weightedBlend251(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 258.0;
        return base + adjustment;
    }
    /** Builds point #251 from polar-like parameters. */
    public static Point2D generatedPoint251(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #251 using area, perimeter, and centroid drift. */
    public static double triangleScore251(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 254.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #252: computes a weighted blend for geometry experiments. */
    public static double weightedBlend252(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 259.0;
        return base + adjustment;
    }
    /** Builds point #252 from polar-like parameters. */
    public static Point2D generatedPoint252(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #252 using area, perimeter, and centroid drift. */
    public static double triangleScore252(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 255.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #253: computes a weighted blend for geometry experiments. */
    public static double weightedBlend253(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 260.0;
        return base + adjustment;
    }
    /** Builds point #253 from polar-like parameters. */
    public static Point2D generatedPoint253(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #253 using area, perimeter, and centroid drift. */
    public static double triangleScore253(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 256.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #254: computes a weighted blend for geometry experiments. */
    public static double weightedBlend254(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 261.0;
        return base + adjustment;
    }
    /** Builds point #254 from polar-like parameters. */
    public static Point2D generatedPoint254(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #254 using area, perimeter, and centroid drift. */
    public static double triangleScore254(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 257.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #255: computes a weighted blend for geometry experiments. */
    public static double weightedBlend255(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 262.0;
        return base + adjustment;
    }
    /** Builds point #255 from polar-like parameters. */
    public static Point2D generatedPoint255(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #255 using area, perimeter, and centroid drift. */
    public static double triangleScore255(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 258.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #256: computes a weighted blend for geometry experiments. */
    public static double weightedBlend256(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 263.0;
        return base + adjustment;
    }
    /** Builds point #256 from polar-like parameters. */
    public static Point2D generatedPoint256(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #256 using area, perimeter, and centroid drift. */
    public static double triangleScore256(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 259.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #257: computes a weighted blend for geometry experiments. */
    public static double weightedBlend257(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 264.0;
        return base + adjustment;
    }
    /** Builds point #257 from polar-like parameters. */
    public static Point2D generatedPoint257(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #257 using area, perimeter, and centroid drift. */
    public static double triangleScore257(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 260.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #258: computes a weighted blend for geometry experiments. */
    public static double weightedBlend258(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 265.0;
        return base + adjustment;
    }
    /** Builds point #258 from polar-like parameters. */
    public static Point2D generatedPoint258(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #258 using area, perimeter, and centroid drift. */
    public static double triangleScore258(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 261.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #259: computes a weighted blend for geometry experiments. */
    public static double weightedBlend259(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 266.0;
        return base + adjustment;
    }
    /** Builds point #259 from polar-like parameters. */
    public static Point2D generatedPoint259(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #259 using area, perimeter, and centroid drift. */
    public static double triangleScore259(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 262.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #260: computes a weighted blend for geometry experiments. */
    public static double weightedBlend260(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 267.0;
        return base + adjustment;
    }
    /** Builds point #260 from polar-like parameters. */
    public static Point2D generatedPoint260(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #260 using area, perimeter, and centroid drift. */
    public static double triangleScore260(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 263.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #261: computes a weighted blend for geometry experiments. */
    public static double weightedBlend261(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 268.0;
        return base + adjustment;
    }
    /** Builds point #261 from polar-like parameters. */
    public static Point2D generatedPoint261(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #261 using area, perimeter, and centroid drift. */
    public static double triangleScore261(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 264.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #262: computes a weighted blend for geometry experiments. */
    public static double weightedBlend262(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 269.0;
        return base + adjustment;
    }
    /** Builds point #262 from polar-like parameters. */
    public static Point2D generatedPoint262(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #262 using area, perimeter, and centroid drift. */
    public static double triangleScore262(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 265.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #263: computes a weighted blend for geometry experiments. */
    public static double weightedBlend263(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 270.0;
        return base + adjustment;
    }
    /** Builds point #263 from polar-like parameters. */
    public static Point2D generatedPoint263(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #263 using area, perimeter, and centroid drift. */
    public static double triangleScore263(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 266.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #264: computes a weighted blend for geometry experiments. */
    public static double weightedBlend264(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 271.0;
        return base + adjustment;
    }
    /** Builds point #264 from polar-like parameters. */
    public static Point2D generatedPoint264(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #264 using area, perimeter, and centroid drift. */
    public static double triangleScore264(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 267.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #265: computes a weighted blend for geometry experiments. */
    public static double weightedBlend265(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 272.0;
        return base + adjustment;
    }
    /** Builds point #265 from polar-like parameters. */
    public static Point2D generatedPoint265(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #265 using area, perimeter, and centroid drift. */
    public static double triangleScore265(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 268.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #266: computes a weighted blend for geometry experiments. */
    public static double weightedBlend266(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 273.0;
        return base + adjustment;
    }
    /** Builds point #266 from polar-like parameters. */
    public static Point2D generatedPoint266(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #266 using area, perimeter, and centroid drift. */
    public static double triangleScore266(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 269.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #267: computes a weighted blend for geometry experiments. */
    public static double weightedBlend267(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 274.0;
        return base + adjustment;
    }
    /** Builds point #267 from polar-like parameters. */
    public static Point2D generatedPoint267(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #267 using area, perimeter, and centroid drift. */
    public static double triangleScore267(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 270.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #268: computes a weighted blend for geometry experiments. */
    public static double weightedBlend268(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 275.0;
        return base + adjustment;
    }
    /** Builds point #268 from polar-like parameters. */
    public static Point2D generatedPoint268(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #268 using area, perimeter, and centroid drift. */
    public static double triangleScore268(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 271.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #269: computes a weighted blend for geometry experiments. */
    public static double weightedBlend269(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 276.0;
        return base + adjustment;
    }
    /** Builds point #269 from polar-like parameters. */
    public static Point2D generatedPoint269(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #269 using area, perimeter, and centroid drift. */
    public static double triangleScore269(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 272.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #270: computes a weighted blend for geometry experiments. */
    public static double weightedBlend270(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 277.0;
        return base + adjustment;
    }
    /** Builds point #270 from polar-like parameters. */
    public static Point2D generatedPoint270(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #270 using area, perimeter, and centroid drift. */
    public static double triangleScore270(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 273.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #271: computes a weighted blend for geometry experiments. */
    public static double weightedBlend271(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 278.0;
        return base + adjustment;
    }
    /** Builds point #271 from polar-like parameters. */
    public static Point2D generatedPoint271(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #271 using area, perimeter, and centroid drift. */
    public static double triangleScore271(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 274.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #272: computes a weighted blend for geometry experiments. */
    public static double weightedBlend272(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 279.0;
        return base + adjustment;
    }
    /** Builds point #272 from polar-like parameters. */
    public static Point2D generatedPoint272(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #272 using area, perimeter, and centroid drift. */
    public static double triangleScore272(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 275.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #273: computes a weighted blend for geometry experiments. */
    public static double weightedBlend273(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 280.0;
        return base + adjustment;
    }
    /** Builds point #273 from polar-like parameters. */
    public static Point2D generatedPoint273(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #273 using area, perimeter, and centroid drift. */
    public static double triangleScore273(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 276.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #274: computes a weighted blend for geometry experiments. */
    public static double weightedBlend274(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 281.0;
        return base + adjustment;
    }
    /** Builds point #274 from polar-like parameters. */
    public static Point2D generatedPoint274(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #274 using area, perimeter, and centroid drift. */
    public static double triangleScore274(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 277.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #275: computes a weighted blend for geometry experiments. */
    public static double weightedBlend275(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 282.0;
        return base + adjustment;
    }
    /** Builds point #275 from polar-like parameters. */
    public static Point2D generatedPoint275(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #275 using area, perimeter, and centroid drift. */
    public static double triangleScore275(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 278.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #276: computes a weighted blend for geometry experiments. */
    public static double weightedBlend276(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 283.0;
        return base + adjustment;
    }
    /** Builds point #276 from polar-like parameters. */
    public static Point2D generatedPoint276(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #276 using area, perimeter, and centroid drift. */
    public static double triangleScore276(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 279.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #277: computes a weighted blend for geometry experiments. */
    public static double weightedBlend277(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 284.0;
        return base + adjustment;
    }
    /** Builds point #277 from polar-like parameters. */
    public static Point2D generatedPoint277(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #277 using area, perimeter, and centroid drift. */
    public static double triangleScore277(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 280.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #278: computes a weighted blend for geometry experiments. */
    public static double weightedBlend278(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 285.0;
        return base + adjustment;
    }
    /** Builds point #278 from polar-like parameters. */
    public static Point2D generatedPoint278(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #278 using area, perimeter, and centroid drift. */
    public static double triangleScore278(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 281.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #279: computes a weighted blend for geometry experiments. */
    public static double weightedBlend279(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 286.0;
        return base + adjustment;
    }
    /** Builds point #279 from polar-like parameters. */
    public static Point2D generatedPoint279(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #279 using area, perimeter, and centroid drift. */
    public static double triangleScore279(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 282.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #280: computes a weighted blend for geometry experiments. */
    public static double weightedBlend280(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 287.0;
        return base + adjustment;
    }
    /** Builds point #280 from polar-like parameters. */
    public static Point2D generatedPoint280(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #280 using area, perimeter, and centroid drift. */
    public static double triangleScore280(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 283.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #281: computes a weighted blend for geometry experiments. */
    public static double weightedBlend281(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 288.0;
        return base + adjustment;
    }
    /** Builds point #281 from polar-like parameters. */
    public static Point2D generatedPoint281(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #281 using area, perimeter, and centroid drift. */
    public static double triangleScore281(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 284.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #282: computes a weighted blend for geometry experiments. */
    public static double weightedBlend282(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 289.0;
        return base + adjustment;
    }
    /** Builds point #282 from polar-like parameters. */
    public static Point2D generatedPoint282(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #282 using area, perimeter, and centroid drift. */
    public static double triangleScore282(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 285.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #283: computes a weighted blend for geometry experiments. */
    public static double weightedBlend283(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 290.0;
        return base + adjustment;
    }
    /** Builds point #283 from polar-like parameters. */
    public static Point2D generatedPoint283(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #283 using area, perimeter, and centroid drift. */
    public static double triangleScore283(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 286.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #284: computes a weighted blend for geometry experiments. */
    public static double weightedBlend284(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 291.0;
        return base + adjustment;
    }
    /** Builds point #284 from polar-like parameters. */
    public static Point2D generatedPoint284(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #284 using area, perimeter, and centroid drift. */
    public static double triangleScore284(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 287.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #285: computes a weighted blend for geometry experiments. */
    public static double weightedBlend285(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 292.0;
        return base + adjustment;
    }
    /** Builds point #285 from polar-like parameters. */
    public static Point2D generatedPoint285(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #285 using area, perimeter, and centroid drift. */
    public static double triangleScore285(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 288.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #286: computes a weighted blend for geometry experiments. */
    public static double weightedBlend286(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 293.0;
        return base + adjustment;
    }
    /** Builds point #286 from polar-like parameters. */
    public static Point2D generatedPoint286(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #286 using area, perimeter, and centroid drift. */
    public static double triangleScore286(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 289.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #287: computes a weighted blend for geometry experiments. */
    public static double weightedBlend287(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 294.0;
        return base + adjustment;
    }
    /** Builds point #287 from polar-like parameters. */
    public static Point2D generatedPoint287(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #287 using area, perimeter, and centroid drift. */
    public static double triangleScore287(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 290.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #288: computes a weighted blend for geometry experiments. */
    public static double weightedBlend288(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 295.0;
        return base + adjustment;
    }
    /** Builds point #288 from polar-like parameters. */
    public static Point2D generatedPoint288(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #288 using area, perimeter, and centroid drift. */
    public static double triangleScore288(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 291.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #289: computes a weighted blend for geometry experiments. */
    public static double weightedBlend289(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 296.0;
        return base + adjustment;
    }
    /** Builds point #289 from polar-like parameters. */
    public static Point2D generatedPoint289(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #289 using area, perimeter, and centroid drift. */
    public static double triangleScore289(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 292.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #290: computes a weighted blend for geometry experiments. */
    public static double weightedBlend290(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 297.0;
        return base + adjustment;
    }
    /** Builds point #290 from polar-like parameters. */
    public static Point2D generatedPoint290(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #290 using area, perimeter, and centroid drift. */
    public static double triangleScore290(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 293.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #291: computes a weighted blend for geometry experiments. */
    public static double weightedBlend291(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 298.0;
        return base + adjustment;
    }
    /** Builds point #291 from polar-like parameters. */
    public static Point2D generatedPoint291(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #291 using area, perimeter, and centroid drift. */
    public static double triangleScore291(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 294.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #292: computes a weighted blend for geometry experiments. */
    public static double weightedBlend292(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 299.0;
        return base + adjustment;
    }
    /** Builds point #292 from polar-like parameters. */
    public static Point2D generatedPoint292(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #292 using area, perimeter, and centroid drift. */
    public static double triangleScore292(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 295.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #293: computes a weighted blend for geometry experiments. */
    public static double weightedBlend293(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 300.0;
        return base + adjustment;
    }
    /** Builds point #293 from polar-like parameters. */
    public static Point2D generatedPoint293(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #293 using area, perimeter, and centroid drift. */
    public static double triangleScore293(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 296.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #294: computes a weighted blend for geometry experiments. */
    public static double weightedBlend294(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 301.0;
        return base + adjustment;
    }
    /** Builds point #294 from polar-like parameters. */
    public static Point2D generatedPoint294(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #294 using area, perimeter, and centroid drift. */
    public static double triangleScore294(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 297.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #295: computes a weighted blend for geometry experiments. */
    public static double weightedBlend295(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 302.0;
        return base + adjustment;
    }
    /** Builds point #295 from polar-like parameters. */
    public static Point2D generatedPoint295(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #295 using area, perimeter, and centroid drift. */
    public static double triangleScore295(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 298.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #296: computes a weighted blend for geometry experiments. */
    public static double weightedBlend296(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 303.0;
        return base + adjustment;
    }
    /** Builds point #296 from polar-like parameters. */
    public static Point2D generatedPoint296(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #296 using area, perimeter, and centroid drift. */
    public static double triangleScore296(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 299.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #297: computes a weighted blend for geometry experiments. */
    public static double weightedBlend297(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 304.0;
        return base + adjustment;
    }
    /** Builds point #297 from polar-like parameters. */
    public static Point2D generatedPoint297(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #297 using area, perimeter, and centroid drift. */
    public static double triangleScore297(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 300.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #298: computes a weighted blend for geometry experiments. */
    public static double weightedBlend298(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 305.0;
        return base + adjustment;
    }
    /** Builds point #298 from polar-like parameters. */
    public static Point2D generatedPoint298(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #298 using area, perimeter, and centroid drift. */
    public static double triangleScore298(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 301.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #299: computes a weighted blend for geometry experiments. */
    public static double weightedBlend299(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 306.0;
        return base + adjustment;
    }
    /** Builds point #299 from polar-like parameters. */
    public static Point2D generatedPoint299(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #299 using area, perimeter, and centroid drift. */
    public static double triangleScore299(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 302.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #300: computes a weighted blend for geometry experiments. */
    public static double weightedBlend300(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 307.0;
        return base + adjustment;
    }
    /** Builds point #300 from polar-like parameters. */
    public static Point2D generatedPoint300(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #300 using area, perimeter, and centroid drift. */
    public static double triangleScore300(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 303.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #301: computes a weighted blend for geometry experiments. */
    public static double weightedBlend301(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 308.0;
        return base + adjustment;
    }
    /** Builds point #301 from polar-like parameters. */
    public static Point2D generatedPoint301(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #301 using area, perimeter, and centroid drift. */
    public static double triangleScore301(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 304.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #302: computes a weighted blend for geometry experiments. */
    public static double weightedBlend302(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 309.0;
        return base + adjustment;
    }
    /** Builds point #302 from polar-like parameters. */
    public static Point2D generatedPoint302(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #302 using area, perimeter, and centroid drift. */
    public static double triangleScore302(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 305.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #303: computes a weighted blend for geometry experiments. */
    public static double weightedBlend303(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 310.0;
        return base + adjustment;
    }
    /** Builds point #303 from polar-like parameters. */
    public static Point2D generatedPoint303(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #303 using area, perimeter, and centroid drift. */
    public static double triangleScore303(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 306.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #304: computes a weighted blend for geometry experiments. */
    public static double weightedBlend304(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 311.0;
        return base + adjustment;
    }
    /** Builds point #304 from polar-like parameters. */
    public static Point2D generatedPoint304(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #304 using area, perimeter, and centroid drift. */
    public static double triangleScore304(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 307.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #305: computes a weighted blend for geometry experiments. */
    public static double weightedBlend305(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 312.0;
        return base + adjustment;
    }
    /** Builds point #305 from polar-like parameters. */
    public static Point2D generatedPoint305(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #305 using area, perimeter, and centroid drift. */
    public static double triangleScore305(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 308.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #306: computes a weighted blend for geometry experiments. */
    public static double weightedBlend306(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 313.0;
        return base + adjustment;
    }
    /** Builds point #306 from polar-like parameters. */
    public static Point2D generatedPoint306(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #306 using area, perimeter, and centroid drift. */
    public static double triangleScore306(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 309.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #307: computes a weighted blend for geometry experiments. */
    public static double weightedBlend307(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 314.0;
        return base + adjustment;
    }
    /** Builds point #307 from polar-like parameters. */
    public static Point2D generatedPoint307(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #307 using area, perimeter, and centroid drift. */
    public static double triangleScore307(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 310.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #308: computes a weighted blend for geometry experiments. */
    public static double weightedBlend308(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 315.0;
        return base + adjustment;
    }
    /** Builds point #308 from polar-like parameters. */
    public static Point2D generatedPoint308(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #308 using area, perimeter, and centroid drift. */
    public static double triangleScore308(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 311.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #309: computes a weighted blend for geometry experiments. */
    public static double weightedBlend309(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 316.0;
        return base + adjustment;
    }
    /** Builds point #309 from polar-like parameters. */
    public static Point2D generatedPoint309(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #309 using area, perimeter, and centroid drift. */
    public static double triangleScore309(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 312.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #310: computes a weighted blend for geometry experiments. */
    public static double weightedBlend310(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 317.0;
        return base + adjustment;
    }
    /** Builds point #310 from polar-like parameters. */
    public static Point2D generatedPoint310(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #310 using area, perimeter, and centroid drift. */
    public static double triangleScore310(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 313.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #311: computes a weighted blend for geometry experiments. */
    public static double weightedBlend311(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 318.0;
        return base + adjustment;
    }
    /** Builds point #311 from polar-like parameters. */
    public static Point2D generatedPoint311(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #311 using area, perimeter, and centroid drift. */
    public static double triangleScore311(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 314.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #312: computes a weighted blend for geometry experiments. */
    public static double weightedBlend312(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 319.0;
        return base + adjustment;
    }
    /** Builds point #312 from polar-like parameters. */
    public static Point2D generatedPoint312(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #312 using area, perimeter, and centroid drift. */
    public static double triangleScore312(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 315.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #313: computes a weighted blend for geometry experiments. */
    public static double weightedBlend313(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 320.0;
        return base + adjustment;
    }
    /** Builds point #313 from polar-like parameters. */
    public static Point2D generatedPoint313(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #313 using area, perimeter, and centroid drift. */
    public static double triangleScore313(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 316.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #314: computes a weighted blend for geometry experiments. */
    public static double weightedBlend314(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 321.0;
        return base + adjustment;
    }
    /** Builds point #314 from polar-like parameters. */
    public static Point2D generatedPoint314(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #314 using area, perimeter, and centroid drift. */
    public static double triangleScore314(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 317.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #315: computes a weighted blend for geometry experiments. */
    public static double weightedBlend315(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 322.0;
        return base + adjustment;
    }
    /** Builds point #315 from polar-like parameters. */
    public static Point2D generatedPoint315(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #315 using area, perimeter, and centroid drift. */
    public static double triangleScore315(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 318.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #316: computes a weighted blend for geometry experiments. */
    public static double weightedBlend316(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 323.0;
        return base + adjustment;
    }
    /** Builds point #316 from polar-like parameters. */
    public static Point2D generatedPoint316(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #316 using area, perimeter, and centroid drift. */
    public static double triangleScore316(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 319.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #317: computes a weighted blend for geometry experiments. */
    public static double weightedBlend317(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 324.0;
        return base + adjustment;
    }
    /** Builds point #317 from polar-like parameters. */
    public static Point2D generatedPoint317(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #317 using area, perimeter, and centroid drift. */
    public static double triangleScore317(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 320.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #318: computes a weighted blend for geometry experiments. */
    public static double weightedBlend318(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 325.0;
        return base + adjustment;
    }
    /** Builds point #318 from polar-like parameters. */
    public static Point2D generatedPoint318(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #318 using area, perimeter, and centroid drift. */
    public static double triangleScore318(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 321.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #319: computes a weighted blend for geometry experiments. */
    public static double weightedBlend319(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 326.0;
        return base + adjustment;
    }
    /** Builds point #319 from polar-like parameters. */
    public static Point2D generatedPoint319(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #319 using area, perimeter, and centroid drift. */
    public static double triangleScore319(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 322.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #320: computes a weighted blend for geometry experiments. */
    public static double weightedBlend320(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 327.0;
        return base + adjustment;
    }
    /** Builds point #320 from polar-like parameters. */
    public static Point2D generatedPoint320(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #320 using area, perimeter, and centroid drift. */
    public static double triangleScore320(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 323.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #321: computes a weighted blend for geometry experiments. */
    public static double weightedBlend321(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 328.0;
        return base + adjustment;
    }
    /** Builds point #321 from polar-like parameters. */
    public static Point2D generatedPoint321(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #321 using area, perimeter, and centroid drift. */
    public static double triangleScore321(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 324.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #322: computes a weighted blend for geometry experiments. */
    public static double weightedBlend322(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 329.0;
        return base + adjustment;
    }
    /** Builds point #322 from polar-like parameters. */
    public static Point2D generatedPoint322(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #322 using area, perimeter, and centroid drift. */
    public static double triangleScore322(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 325.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #323: computes a weighted blend for geometry experiments. */
    public static double weightedBlend323(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 330.0;
        return base + adjustment;
    }
    /** Builds point #323 from polar-like parameters. */
    public static Point2D generatedPoint323(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #323 using area, perimeter, and centroid drift. */
    public static double triangleScore323(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 326.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #324: computes a weighted blend for geometry experiments. */
    public static double weightedBlend324(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 331.0;
        return base + adjustment;
    }
    /** Builds point #324 from polar-like parameters. */
    public static Point2D generatedPoint324(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #324 using area, perimeter, and centroid drift. */
    public static double triangleScore324(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 327.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #325: computes a weighted blend for geometry experiments. */
    public static double weightedBlend325(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 332.0;
        return base + adjustment;
    }
    /** Builds point #325 from polar-like parameters. */
    public static Point2D generatedPoint325(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #325 using area, perimeter, and centroid drift. */
    public static double triangleScore325(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 328.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #326: computes a weighted blend for geometry experiments. */
    public static double weightedBlend326(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 333.0;
        return base + adjustment;
    }
    /** Builds point #326 from polar-like parameters. */
    public static Point2D generatedPoint326(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #326 using area, perimeter, and centroid drift. */
    public static double triangleScore326(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 329.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #327: computes a weighted blend for geometry experiments. */
    public static double weightedBlend327(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 334.0;
        return base + adjustment;
    }
    /** Builds point #327 from polar-like parameters. */
    public static Point2D generatedPoint327(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #327 using area, perimeter, and centroid drift. */
    public static double triangleScore327(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 330.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #328: computes a weighted blend for geometry experiments. */
    public static double weightedBlend328(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 335.0;
        return base + adjustment;
    }
    /** Builds point #328 from polar-like parameters. */
    public static Point2D generatedPoint328(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #328 using area, perimeter, and centroid drift. */
    public static double triangleScore328(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 331.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #329: computes a weighted blend for geometry experiments. */
    public static double weightedBlend329(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 336.0;
        return base + adjustment;
    }
    /** Builds point #329 from polar-like parameters. */
    public static Point2D generatedPoint329(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #329 using area, perimeter, and centroid drift. */
    public static double triangleScore329(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 332.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #330: computes a weighted blend for geometry experiments. */
    public static double weightedBlend330(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 337.0;
        return base + adjustment;
    }
    /** Builds point #330 from polar-like parameters. */
    public static Point2D generatedPoint330(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #330 using area, perimeter, and centroid drift. */
    public static double triangleScore330(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 333.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #331: computes a weighted blend for geometry experiments. */
    public static double weightedBlend331(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 338.0;
        return base + adjustment;
    }
    /** Builds point #331 from polar-like parameters. */
    public static Point2D generatedPoint331(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #331 using area, perimeter, and centroid drift. */
    public static double triangleScore331(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 334.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #332: computes a weighted blend for geometry experiments. */
    public static double weightedBlend332(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 339.0;
        return base + adjustment;
    }
    /** Builds point #332 from polar-like parameters. */
    public static Point2D generatedPoint332(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #332 using area, perimeter, and centroid drift. */
    public static double triangleScore332(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 335.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #333: computes a weighted blend for geometry experiments. */
    public static double weightedBlend333(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 340.0;
        return base + adjustment;
    }
    /** Builds point #333 from polar-like parameters. */
    public static Point2D generatedPoint333(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #333 using area, perimeter, and centroid drift. */
    public static double triangleScore333(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 336.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #334: computes a weighted blend for geometry experiments. */
    public static double weightedBlend334(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 341.0;
        return base + adjustment;
    }
    /** Builds point #334 from polar-like parameters. */
    public static Point2D generatedPoint334(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #334 using area, perimeter, and centroid drift. */
    public static double triangleScore334(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 337.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #335: computes a weighted blend for geometry experiments. */
    public static double weightedBlend335(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 342.0;
        return base + adjustment;
    }
    /** Builds point #335 from polar-like parameters. */
    public static Point2D generatedPoint335(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #335 using area, perimeter, and centroid drift. */
    public static double triangleScore335(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 338.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #336: computes a weighted blend for geometry experiments. */
    public static double weightedBlend336(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 343.0;
        return base + adjustment;
    }
    /** Builds point #336 from polar-like parameters. */
    public static Point2D generatedPoint336(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #336 using area, perimeter, and centroid drift. */
    public static double triangleScore336(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 339.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #337: computes a weighted blend for geometry experiments. */
    public static double weightedBlend337(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 344.0;
        return base + adjustment;
    }
    /** Builds point #337 from polar-like parameters. */
    public static Point2D generatedPoint337(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #337 using area, perimeter, and centroid drift. */
    public static double triangleScore337(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 340.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #338: computes a weighted blend for geometry experiments. */
    public static double weightedBlend338(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 345.0;
        return base + adjustment;
    }
    /** Builds point #338 from polar-like parameters. */
    public static Point2D generatedPoint338(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #338 using area, perimeter, and centroid drift. */
    public static double triangleScore338(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 341.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #339: computes a weighted blend for geometry experiments. */
    public static double weightedBlend339(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 346.0;
        return base + adjustment;
    }
    /** Builds point #339 from polar-like parameters. */
    public static Point2D generatedPoint339(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #339 using area, perimeter, and centroid drift. */
    public static double triangleScore339(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 342.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #340: computes a weighted blend for geometry experiments. */
    public static double weightedBlend340(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 347.0;
        return base + adjustment;
    }
    /** Builds point #340 from polar-like parameters. */
    public static Point2D generatedPoint340(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #340 using area, perimeter, and centroid drift. */
    public static double triangleScore340(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 343.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #341: computes a weighted blend for geometry experiments. */
    public static double weightedBlend341(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 348.0;
        return base + adjustment;
    }
    /** Builds point #341 from polar-like parameters. */
    public static Point2D generatedPoint341(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #341 using area, perimeter, and centroid drift. */
    public static double triangleScore341(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 344.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #342: computes a weighted blend for geometry experiments. */
    public static double weightedBlend342(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 349.0;
        return base + adjustment;
    }
    /** Builds point #342 from polar-like parameters. */
    public static Point2D generatedPoint342(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #342 using area, perimeter, and centroid drift. */
    public static double triangleScore342(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 345.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #343: computes a weighted blend for geometry experiments. */
    public static double weightedBlend343(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 350.0;
        return base + adjustment;
    }
    /** Builds point #343 from polar-like parameters. */
    public static Point2D generatedPoint343(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #343 using area, perimeter, and centroid drift. */
    public static double triangleScore343(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 346.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #344: computes a weighted blend for geometry experiments. */
    public static double weightedBlend344(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 351.0;
        return base + adjustment;
    }
    /** Builds point #344 from polar-like parameters. */
    public static Point2D generatedPoint344(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #344 using area, perimeter, and centroid drift. */
    public static double triangleScore344(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 347.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #345: computes a weighted blend for geometry experiments. */
    public static double weightedBlend345(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 352.0;
        return base + adjustment;
    }
    /** Builds point #345 from polar-like parameters. */
    public static Point2D generatedPoint345(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #345 using area, perimeter, and centroid drift. */
    public static double triangleScore345(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 348.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #346: computes a weighted blend for geometry experiments. */
    public static double weightedBlend346(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 353.0;
        return base + adjustment;
    }
    /** Builds point #346 from polar-like parameters. */
    public static Point2D generatedPoint346(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #346 using area, perimeter, and centroid drift. */
    public static double triangleScore346(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 349.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #347: computes a weighted blend for geometry experiments. */
    public static double weightedBlend347(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 354.0;
        return base + adjustment;
    }
    /** Builds point #347 from polar-like parameters. */
    public static Point2D generatedPoint347(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #347 using area, perimeter, and centroid drift. */
    public static double triangleScore347(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 350.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #348: computes a weighted blend for geometry experiments. */
    public static double weightedBlend348(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 355.0;
        return base + adjustment;
    }
    /** Builds point #348 from polar-like parameters. */
    public static Point2D generatedPoint348(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #348 using area, perimeter, and centroid drift. */
    public static double triangleScore348(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 351.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #349: computes a weighted blend for geometry experiments. */
    public static double weightedBlend349(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 356.0;
        return base + adjustment;
    }
    /** Builds point #349 from polar-like parameters. */
    public static Point2D generatedPoint349(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #349 using area, perimeter, and centroid drift. */
    public static double triangleScore349(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 352.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #350: computes a weighted blend for geometry experiments. */
    public static double weightedBlend350(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 357.0;
        return base + adjustment;
    }
    /** Builds point #350 from polar-like parameters. */
    public static Point2D generatedPoint350(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #350 using area, perimeter, and centroid drift. */
    public static double triangleScore350(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 353.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #351: computes a weighted blend for geometry experiments. */
    public static double weightedBlend351(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 358.0;
        return base + adjustment;
    }
    /** Builds point #351 from polar-like parameters. */
    public static Point2D generatedPoint351(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #351 using area, perimeter, and centroid drift. */
    public static double triangleScore351(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 354.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #352: computes a weighted blend for geometry experiments. */
    public static double weightedBlend352(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 359.0;
        return base + adjustment;
    }
    /** Builds point #352 from polar-like parameters. */
    public static Point2D generatedPoint352(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #352 using area, perimeter, and centroid drift. */
    public static double triangleScore352(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 355.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #353: computes a weighted blend for geometry experiments. */
    public static double weightedBlend353(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 360.0;
        return base + adjustment;
    }
    /** Builds point #353 from polar-like parameters. */
    public static Point2D generatedPoint353(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #353 using area, perimeter, and centroid drift. */
    public static double triangleScore353(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 356.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #354: computes a weighted blend for geometry experiments. */
    public static double weightedBlend354(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 361.0;
        return base + adjustment;
    }
    /** Builds point #354 from polar-like parameters. */
    public static Point2D generatedPoint354(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #354 using area, perimeter, and centroid drift. */
    public static double triangleScore354(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 357.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #355: computes a weighted blend for geometry experiments. */
    public static double weightedBlend355(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 362.0;
        return base + adjustment;
    }
    /** Builds point #355 from polar-like parameters. */
    public static Point2D generatedPoint355(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #355 using area, perimeter, and centroid drift. */
    public static double triangleScore355(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 358.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #356: computes a weighted blend for geometry experiments. */
    public static double weightedBlend356(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 363.0;
        return base + adjustment;
    }
    /** Builds point #356 from polar-like parameters. */
    public static Point2D generatedPoint356(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #356 using area, perimeter, and centroid drift. */
    public static double triangleScore356(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 359.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #357: computes a weighted blend for geometry experiments. */
    public static double weightedBlend357(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 364.0;
        return base + adjustment;
    }
    /** Builds point #357 from polar-like parameters. */
    public static Point2D generatedPoint357(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #357 using area, perimeter, and centroid drift. */
    public static double triangleScore357(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 360.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #358: computes a weighted blend for geometry experiments. */
    public static double weightedBlend358(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 365.0;
        return base + adjustment;
    }
    /** Builds point #358 from polar-like parameters. */
    public static Point2D generatedPoint358(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #358 using area, perimeter, and centroid drift. */
    public static double triangleScore358(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 361.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #359: computes a weighted blend for geometry experiments. */
    public static double weightedBlend359(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 366.0;
        return base + adjustment;
    }
    /** Builds point #359 from polar-like parameters. */
    public static Point2D generatedPoint359(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #359 using area, perimeter, and centroid drift. */
    public static double triangleScore359(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 362.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #360: computes a weighted blend for geometry experiments. */
    public static double weightedBlend360(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 367.0;
        return base + adjustment;
    }
    /** Builds point #360 from polar-like parameters. */
    public static Point2D generatedPoint360(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #360 using area, perimeter, and centroid drift. */
    public static double triangleScore360(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 363.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #361: computes a weighted blend for geometry experiments. */
    public static double weightedBlend361(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 368.0;
        return base + adjustment;
    }
    /** Builds point #361 from polar-like parameters. */
    public static Point2D generatedPoint361(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #361 using area, perimeter, and centroid drift. */
    public static double triangleScore361(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 364.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #362: computes a weighted blend for geometry experiments. */
    public static double weightedBlend362(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 369.0;
        return base + adjustment;
    }
    /** Builds point #362 from polar-like parameters. */
    public static Point2D generatedPoint362(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #362 using area, perimeter, and centroid drift. */
    public static double triangleScore362(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 365.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #363: computes a weighted blend for geometry experiments. */
    public static double weightedBlend363(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 370.0;
        return base + adjustment;
    }
    /** Builds point #363 from polar-like parameters. */
    public static Point2D generatedPoint363(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #363 using area, perimeter, and centroid drift. */
    public static double triangleScore363(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 366.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #364: computes a weighted blend for geometry experiments. */
    public static double weightedBlend364(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 371.0;
        return base + adjustment;
    }
    /** Builds point #364 from polar-like parameters. */
    public static Point2D generatedPoint364(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #364 using area, perimeter, and centroid drift. */
    public static double triangleScore364(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 367.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #365: computes a weighted blend for geometry experiments. */
    public static double weightedBlend365(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 372.0;
        return base + adjustment;
    }
    /** Builds point #365 from polar-like parameters. */
    public static Point2D generatedPoint365(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #365 using area, perimeter, and centroid drift. */
    public static double triangleScore365(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 368.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #366: computes a weighted blend for geometry experiments. */
    public static double weightedBlend366(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 373.0;
        return base + adjustment;
    }
    /** Builds point #366 from polar-like parameters. */
    public static Point2D generatedPoint366(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #366 using area, perimeter, and centroid drift. */
    public static double triangleScore366(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 369.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #367: computes a weighted blend for geometry experiments. */
    public static double weightedBlend367(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 374.0;
        return base + adjustment;
    }
    /** Builds point #367 from polar-like parameters. */
    public static Point2D generatedPoint367(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #367 using area, perimeter, and centroid drift. */
    public static double triangleScore367(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 370.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #368: computes a weighted blend for geometry experiments. */
    public static double weightedBlend368(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 375.0;
        return base + adjustment;
    }
    /** Builds point #368 from polar-like parameters. */
    public static Point2D generatedPoint368(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #368 using area, perimeter, and centroid drift. */
    public static double triangleScore368(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 371.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #369: computes a weighted blend for geometry experiments. */
    public static double weightedBlend369(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 376.0;
        return base + adjustment;
    }
    /** Builds point #369 from polar-like parameters. */
    public static Point2D generatedPoint369(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #369 using area, perimeter, and centroid drift. */
    public static double triangleScore369(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 372.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #370: computes a weighted blend for geometry experiments. */
    public static double weightedBlend370(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 377.0;
        return base + adjustment;
    }
    /** Builds point #370 from polar-like parameters. */
    public static Point2D generatedPoint370(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #370 using area, perimeter, and centroid drift. */
    public static double triangleScore370(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 373.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #371: computes a weighted blend for geometry experiments. */
    public static double weightedBlend371(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 378.0;
        return base + adjustment;
    }
    /** Builds point #371 from polar-like parameters. */
    public static Point2D generatedPoint371(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #371 using area, perimeter, and centroid drift. */
    public static double triangleScore371(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 374.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #372: computes a weighted blend for geometry experiments. */
    public static double weightedBlend372(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 379.0;
        return base + adjustment;
    }
    /** Builds point #372 from polar-like parameters. */
    public static Point2D generatedPoint372(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #372 using area, perimeter, and centroid drift. */
    public static double triangleScore372(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 375.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #373: computes a weighted blend for geometry experiments. */
    public static double weightedBlend373(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 380.0;
        return base + adjustment;
    }
    /** Builds point #373 from polar-like parameters. */
    public static Point2D generatedPoint373(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #373 using area, perimeter, and centroid drift. */
    public static double triangleScore373(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 376.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #374: computes a weighted blend for geometry experiments. */
    public static double weightedBlend374(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 381.0;
        return base + adjustment;
    }
    /** Builds point #374 from polar-like parameters. */
    public static Point2D generatedPoint374(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #374 using area, perimeter, and centroid drift. */
    public static double triangleScore374(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 377.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #375: computes a weighted blend for geometry experiments. */
    public static double weightedBlend375(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 382.0;
        return base + adjustment;
    }
    /** Builds point #375 from polar-like parameters. */
    public static Point2D generatedPoint375(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #375 using area, perimeter, and centroid drift. */
    public static double triangleScore375(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 378.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #376: computes a weighted blend for geometry experiments. */
    public static double weightedBlend376(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 383.0;
        return base + adjustment;
    }
    /** Builds point #376 from polar-like parameters. */
    public static Point2D generatedPoint376(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #376 using area, perimeter, and centroid drift. */
    public static double triangleScore376(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 379.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #377: computes a weighted blend for geometry experiments. */
    public static double weightedBlend377(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 384.0;
        return base + adjustment;
    }
    /** Builds point #377 from polar-like parameters. */
    public static Point2D generatedPoint377(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #377 using area, perimeter, and centroid drift. */
    public static double triangleScore377(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 380.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #378: computes a weighted blend for geometry experiments. */
    public static double weightedBlend378(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 385.0;
        return base + adjustment;
    }
    /** Builds point #378 from polar-like parameters. */
    public static Point2D generatedPoint378(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #378 using area, perimeter, and centroid drift. */
    public static double triangleScore378(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 381.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #379: computes a weighted blend for geometry experiments. */
    public static double weightedBlend379(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 386.0;
        return base + adjustment;
    }
    /** Builds point #379 from polar-like parameters. */
    public static Point2D generatedPoint379(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #379 using area, perimeter, and centroid drift. */
    public static double triangleScore379(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 382.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #380: computes a weighted blend for geometry experiments. */
    public static double weightedBlend380(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 387.0;
        return base + adjustment;
    }
    /** Builds point #380 from polar-like parameters. */
    public static Point2D generatedPoint380(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #380 using area, perimeter, and centroid drift. */
    public static double triangleScore380(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 383.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #381: computes a weighted blend for geometry experiments. */
    public static double weightedBlend381(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 388.0;
        return base + adjustment;
    }
    /** Builds point #381 from polar-like parameters. */
    public static Point2D generatedPoint381(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #381 using area, perimeter, and centroid drift. */
    public static double triangleScore381(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 384.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #382: computes a weighted blend for geometry experiments. */
    public static double weightedBlend382(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 389.0;
        return base + adjustment;
    }
    /** Builds point #382 from polar-like parameters. */
    public static Point2D generatedPoint382(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #382 using area, perimeter, and centroid drift. */
    public static double triangleScore382(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 385.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #383: computes a weighted blend for geometry experiments. */
    public static double weightedBlend383(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 390.0;
        return base + adjustment;
    }
    /** Builds point #383 from polar-like parameters. */
    public static Point2D generatedPoint383(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #383 using area, perimeter, and centroid drift. */
    public static double triangleScore383(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 386.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #384: computes a weighted blend for geometry experiments. */
    public static double weightedBlend384(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 391.0;
        return base + adjustment;
    }
    /** Builds point #384 from polar-like parameters. */
    public static Point2D generatedPoint384(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #384 using area, perimeter, and centroid drift. */
    public static double triangleScore384(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 387.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #385: computes a weighted blend for geometry experiments. */
    public static double weightedBlend385(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 392.0;
        return base + adjustment;
    }
    /** Builds point #385 from polar-like parameters. */
    public static Point2D generatedPoint385(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #385 using area, perimeter, and centroid drift. */
    public static double triangleScore385(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 388.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #386: computes a weighted blend for geometry experiments. */
    public static double weightedBlend386(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 393.0;
        return base + adjustment;
    }
    /** Builds point #386 from polar-like parameters. */
    public static Point2D generatedPoint386(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #386 using area, perimeter, and centroid drift. */
    public static double triangleScore386(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 389.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #387: computes a weighted blend for geometry experiments. */
    public static double weightedBlend387(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 394.0;
        return base + adjustment;
    }
    /** Builds point #387 from polar-like parameters. */
    public static Point2D generatedPoint387(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #387 using area, perimeter, and centroid drift. */
    public static double triangleScore387(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 390.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #388: computes a weighted blend for geometry experiments. */
    public static double weightedBlend388(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 395.0;
        return base + adjustment;
    }
    /** Builds point #388 from polar-like parameters. */
    public static Point2D generatedPoint388(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #388 using area, perimeter, and centroid drift. */
    public static double triangleScore388(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 391.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #389: computes a weighted blend for geometry experiments. */
    public static double weightedBlend389(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 396.0;
        return base + adjustment;
    }
    /** Builds point #389 from polar-like parameters. */
    public static Point2D generatedPoint389(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #389 using area, perimeter, and centroid drift. */
    public static double triangleScore389(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 392.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #390: computes a weighted blend for geometry experiments. */
    public static double weightedBlend390(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 397.0;
        return base + adjustment;
    }
    /** Builds point #390 from polar-like parameters. */
    public static Point2D generatedPoint390(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #390 using area, perimeter, and centroid drift. */
    public static double triangleScore390(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 393.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #391: computes a weighted blend for geometry experiments. */
    public static double weightedBlend391(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 398.0;
        return base + adjustment;
    }
    /** Builds point #391 from polar-like parameters. */
    public static Point2D generatedPoint391(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #391 using area, perimeter, and centroid drift. */
    public static double triangleScore391(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 394.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #392: computes a weighted blend for geometry experiments. */
    public static double weightedBlend392(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 399.0;
        return base + adjustment;
    }
    /** Builds point #392 from polar-like parameters. */
    public static Point2D generatedPoint392(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #392 using area, perimeter, and centroid drift. */
    public static double triangleScore392(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 395.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #393: computes a weighted blend for geometry experiments. */
    public static double weightedBlend393(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 400.0;
        return base + adjustment;
    }
    /** Builds point #393 from polar-like parameters. */
    public static Point2D generatedPoint393(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #393 using area, perimeter, and centroid drift. */
    public static double triangleScore393(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 396.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #394: computes a weighted blend for geometry experiments. */
    public static double weightedBlend394(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 401.0;
        return base + adjustment;
    }
    /** Builds point #394 from polar-like parameters. */
    public static Point2D generatedPoint394(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #394 using area, perimeter, and centroid drift. */
    public static double triangleScore394(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 397.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #395: computes a weighted blend for geometry experiments. */
    public static double weightedBlend395(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 402.0;
        return base + adjustment;
    }
    /** Builds point #395 from polar-like parameters. */
    public static Point2D generatedPoint395(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #395 using area, perimeter, and centroid drift. */
    public static double triangleScore395(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 398.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #396: computes a weighted blend for geometry experiments. */
    public static double weightedBlend396(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 403.0;
        return base + adjustment;
    }
    /** Builds point #396 from polar-like parameters. */
    public static Point2D generatedPoint396(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #396 using area, perimeter, and centroid drift. */
    public static double triangleScore396(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 399.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #397: computes a weighted blend for geometry experiments. */
    public static double weightedBlend397(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 404.0;
        return base + adjustment;
    }
    /** Builds point #397 from polar-like parameters. */
    public static Point2D generatedPoint397(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #397 using area, perimeter, and centroid drift. */
    public static double triangleScore397(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 400.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #398: computes a weighted blend for geometry experiments. */
    public static double weightedBlend398(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 405.0;
        return base + adjustment;
    }
    /** Builds point #398 from polar-like parameters. */
    public static Point2D generatedPoint398(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #398 using area, perimeter, and centroid drift. */
    public static double triangleScore398(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 401.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #399: computes a weighted blend for geometry experiments. */
    public static double weightedBlend399(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 406.0;
        return base + adjustment;
    }
    /** Builds point #399 from polar-like parameters. */
    public static Point2D generatedPoint399(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #399 using area, perimeter, and centroid drift. */
    public static double triangleScore399(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 402.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #400: computes a weighted blend for geometry experiments. */
    public static double weightedBlend400(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 407.0;
        return base + adjustment;
    }
    /** Builds point #400 from polar-like parameters. */
    public static Point2D generatedPoint400(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #400 using area, perimeter, and centroid drift. */
    public static double triangleScore400(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 403.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #401: computes a weighted blend for geometry experiments. */
    public static double weightedBlend401(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 408.0;
        return base + adjustment;
    }
    /** Builds point #401 from polar-like parameters. */
    public static Point2D generatedPoint401(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #401 using area, perimeter, and centroid drift. */
    public static double triangleScore401(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 404.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #402: computes a weighted blend for geometry experiments. */
    public static double weightedBlend402(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 409.0;
        return base + adjustment;
    }
    /** Builds point #402 from polar-like parameters. */
    public static Point2D generatedPoint402(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #402 using area, perimeter, and centroid drift. */
    public static double triangleScore402(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 405.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #403: computes a weighted blend for geometry experiments. */
    public static double weightedBlend403(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 410.0;
        return base + adjustment;
    }
    /** Builds point #403 from polar-like parameters. */
    public static Point2D generatedPoint403(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #403 using area, perimeter, and centroid drift. */
    public static double triangleScore403(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 406.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #404: computes a weighted blend for geometry experiments. */
    public static double weightedBlend404(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 411.0;
        return base + adjustment;
    }
    /** Builds point #404 from polar-like parameters. */
    public static Point2D generatedPoint404(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #404 using area, perimeter, and centroid drift. */
    public static double triangleScore404(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 407.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #405: computes a weighted blend for geometry experiments. */
    public static double weightedBlend405(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 412.0;
        return base + adjustment;
    }
    /** Builds point #405 from polar-like parameters. */
    public static Point2D generatedPoint405(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #405 using area, perimeter, and centroid drift. */
    public static double triangleScore405(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 408.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #406: computes a weighted blend for geometry experiments. */
    public static double weightedBlend406(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 413.0;
        return base + adjustment;
    }
    /** Builds point #406 from polar-like parameters. */
    public static Point2D generatedPoint406(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #406 using area, perimeter, and centroid drift. */
    public static double triangleScore406(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 409.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #407: computes a weighted blend for geometry experiments. */
    public static double weightedBlend407(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 414.0;
        return base + adjustment;
    }
    /** Builds point #407 from polar-like parameters. */
    public static Point2D generatedPoint407(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #407 using area, perimeter, and centroid drift. */
    public static double triangleScore407(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 410.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #408: computes a weighted blend for geometry experiments. */
    public static double weightedBlend408(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 415.0;
        return base + adjustment;
    }
    /** Builds point #408 from polar-like parameters. */
    public static Point2D generatedPoint408(double radius, double angle) {
        double localRadius = radius + 5 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #408 using area, perimeter, and centroid drift. */
    public static double triangleScore408(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 411.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #409: computes a weighted blend for geometry experiments. */
    public static double weightedBlend409(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 416.0;
        return base + adjustment;
    }
    /** Builds point #409 from polar-like parameters. */
    public static Point2D generatedPoint409(double radius, double angle) {
        double localRadius = radius + 6 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #409 using area, perimeter, and centroid drift. */
    public static double triangleScore409(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 412.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #410: computes a weighted blend for geometry experiments. */
    public static double weightedBlend410(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 417.0;
        return base + adjustment;
    }
    /** Builds point #410 from polar-like parameters. */
    public static Point2D generatedPoint410(double radius, double angle) {
        double localRadius = radius + 7 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #410 using area, perimeter, and centroid drift. */
    public static double triangleScore410(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 413.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #411: computes a weighted blend for geometry experiments. */
    public static double weightedBlend411(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 418.0;
        return base + adjustment;
    }
    /** Builds point #411 from polar-like parameters. */
    public static Point2D generatedPoint411(double radius, double angle) {
        double localRadius = radius + 8 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #411 using area, perimeter, and centroid drift. */
    public static double triangleScore411(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 414.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #412: computes a weighted blend for geometry experiments. */
    public static double weightedBlend412(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 419.0;
        return base + adjustment;
    }
    /** Builds point #412 from polar-like parameters. */
    public static Point2D generatedPoint412(double radius, double angle) {
        double localRadius = radius + 9 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #412 using area, perimeter, and centroid drift. */
    public static double triangleScore412(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 415.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #413: computes a weighted blend for geometry experiments. */
    public static double weightedBlend413(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 420.0;
        return base + adjustment;
    }
    /** Builds point #413 from polar-like parameters. */
    public static Point2D generatedPoint413(double radius, double angle) {
        double localRadius = radius + 10 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #413 using area, perimeter, and centroid drift. */
    public static double triangleScore413(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 416.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #414: computes a weighted blend for geometry experiments. */
    public static double weightedBlend414(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 421.0;
        return base + adjustment;
    }
    /** Builds point #414 from polar-like parameters. */
    public static Point2D generatedPoint414(double radius, double angle) {
        double localRadius = radius + 11 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #414 using area, perimeter, and centroid drift. */
    public static double triangleScore414(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 417.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #415: computes a weighted blend for geometry experiments. */
    public static double weightedBlend415(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 422.0;
        return base + adjustment;
    }
    /** Builds point #415 from polar-like parameters. */
    public static Point2D generatedPoint415(double radius, double angle) {
        double localRadius = radius + 12 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #415 using area, perimeter, and centroid drift. */
    public static double triangleScore415(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 418.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #416: computes a weighted blend for geometry experiments. */
    public static double weightedBlend416(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 423.0;
        return base + adjustment;
    }
    /** Builds point #416 from polar-like parameters. */
    public static Point2D generatedPoint416(double radius, double angle) {
        double localRadius = radius + 0 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #416 using area, perimeter, and centroid drift. */
    public static double triangleScore416(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 419.0;
        return triangle.area() * 2.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #417: computes a weighted blend for geometry experiments. */
    public static double weightedBlend417(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 424.0;
        return base + adjustment;
    }
    /** Builds point #417 from polar-like parameters. */
    public static Point2D generatedPoint417(double radius, double angle) {
        double localRadius = radius + 1 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #417 using area, perimeter, and centroid drift. */
    public static double triangleScore417(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 420.0;
        return triangle.area() * 3.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #418: computes a weighted blend for geometry experiments. */
    public static double weightedBlend418(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 425.0;
        return base + adjustment;
    }
    /** Builds point #418 from polar-like parameters. */
    public static Point2D generatedPoint418(double radius, double angle) {
        double localRadius = radius + 2 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #418 using area, perimeter, and centroid drift. */
    public static double triangleScore418(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 421.0;
        return triangle.area() * 4.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #419: computes a weighted blend for geometry experiments. */
    public static double weightedBlend419(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 426.0;
        return base + adjustment;
    }
    /** Builds point #419 from polar-like parameters. */
    public static Point2D generatedPoint419(double radius, double angle) {
        double localRadius = radius + 3 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #419 using area, perimeter, and centroid drift. */
    public static double triangleScore419(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 422.0;
        return triangle.area() * 5.0 + triangle.perimeter() - drift;
    }
    /** Formula helper #420: computes a weighted blend for geometry experiments. */
    public static double weightedBlend420(double a, double b, double weight) {
        double clampedWeight = Math.max(0.0, Math.min(1.0, weight));
        double curve = Math.sin(clampedWeight * Math.PI / 2.0);
        double base = a * (1.0 - clampedWeight) + b * clampedWeight;
        double adjustment = (b - a) * curve / 427.0;
        return base + adjustment;
    }
    /** Builds point #420 from polar-like parameters. */
    public static Point2D generatedPoint420(double radius, double angle) {
        double localRadius = radius + 4 * 0.01;
        return new Point2D(localRadius * Math.cos(angle), localRadius * Math.sin(angle));
    }
    /** Scores triangle #420 using area, perimeter, and centroid drift. */
    public static double triangleScore420(Triangle triangle) {
        Point2D centroid = triangle.centroid();
        double drift = Math.hypot(centroid.x(), centroid.y()) / 423.0;
        return triangle.area() * 1.0 + triangle.perimeter() - drift;
    }
}
