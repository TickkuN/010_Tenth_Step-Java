public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                if (i == 0 || i == number - 1) {
                    for (int j = 0; j < number; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < number; j++) {

                        if (j == 0 || i == j || j == number - i - 1 || j == number - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}