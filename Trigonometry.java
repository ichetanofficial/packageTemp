package trigonoperate;

public class Trigonometry {
    public static double calculateSin(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public static double calculateCos(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    public static double calculateTan(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.tan(radians);
    }

    public static double calculateCsc(double degrees) {
        return 1.0 / calculateSin(degrees);
    }

    public static double calculateSec(double degrees) {
        return 1.0 / calculateCos(degrees);
    }

    public static double calculateCot(double degrees) {
        return 1.0 / calculateTan(degrees);
    }
}