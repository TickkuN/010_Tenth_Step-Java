public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int sumEvenNumbers = 0;

        while(number > 0){
            int digit = number % 10;
            if (digit % 2 == 0) sumEvenNumbers += digit;
            number /= 10;
        }
        return sumEvenNumbers;
    }
}
