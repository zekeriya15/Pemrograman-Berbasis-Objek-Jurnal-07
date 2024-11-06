public class Lingkaran {
    // private double r;

    public static double getLuas(float r) {
        return Math.PI * r * r;
    }

    public static double getLuas(double diameter) {
        double r = diameter / 2;
        return Math.PI * r * r;
    }

    public static double getKeliling(float r) {
        return 2 * Math.PI * r;
    }

    public static double getKeliling(double diameter) {
        return Math.PI * diameter;
    }
}