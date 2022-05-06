import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter counter");
        int counter = scanner.nextInt();
        scanner.nextLine();
        return counter;
    }

    private static int[] readElements(int counter){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[counter];

        for(int i=0; i<counter; i++){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
