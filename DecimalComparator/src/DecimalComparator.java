public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        double a_minus_b = Math.abs(a - b);
        if (a_minus_b <= 0.0009){
            return true;
        } else {
            return false;
        }
    }
}
