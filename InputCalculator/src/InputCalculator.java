import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long average = 0L;

        while (true){

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                counter++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                break;
            }

        }
        average = Math.round((double)sum/counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

}
