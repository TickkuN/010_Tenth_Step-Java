public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number < 0){
            number = number * -1;
        }
        int reverse = 0;
        int cloneNumber = number;

        while(number > 0){
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }

        return reverse == cloneNumber;
    }
}
