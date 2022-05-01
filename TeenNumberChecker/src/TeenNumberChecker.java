public class TeenNumberChecker {
    public static boolean isTeen(int num){
        return 13 <= num && num <= 19;
    }

    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
}