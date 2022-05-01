public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || 99 < a || b < 10 || 99 < b) return false;

        int digit_a_1 = a % 10;
        int digit_a_2 = a / 10;
        int digit_b_1 = b % 10;
        int digit_b_2 = b / 10;

        if (digit_a_1 == digit_b_1) return true;
        if (digit_a_1 == digit_b_2) return true;
        if (digit_a_2 == digit_b_1) return true;
        if (digit_a_2 == digit_b_2) return true;

        return false;
    }
}
