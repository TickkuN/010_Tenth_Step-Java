public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            int lastDigitOfFirstNumber = firstNumber % 10;
            int lastDigitOfSecondNumber = secondNumber % 10;
            int lastDigitOfThirdNumber = thirdNumber % 10;
            return (lastDigitOfFirstNumber == lastDigitOfSecondNumber || lastDigitOfSecondNumber == lastDigitOfThirdNumber || lastDigitOfThirdNumber == lastDigitOfFirstNumber);
        }

        return false;

    }

    public static boolean isValid(int number){
        return (10 <= number && number <= 1000);
    }
}