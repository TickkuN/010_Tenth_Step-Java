public class NumberToWords {
    public static int getDigitCount(int number){
        if (number < 0) return -1;
        if (number == 0) return 1;
        int countDigits = 0;
        while (number > 0){
            countDigits++;
            number /= 10;

        }
        return countDigits;
    }
    public static int reverse(int number){
        boolean isMinus = false;
        if (number < 0){
            number *= -1;
            isMinus = true;
        }

        int reverseNumber = 0;
        while (number > 0){
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }

        if (isMinus){
            return reverseNumber * -1;
        } else {
            return reverseNumber;
        }
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int target = reverse(number);
        for(int i = 0; i < getDigitCount(number); i++){
            int currentNum = target % 10;
            switch (currentNum){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            target /= 10;
        }
    }
}
