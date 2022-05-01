public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        if (c-b-a == 0){
            return true;
        } else {
            return false;
        }
    }
}
