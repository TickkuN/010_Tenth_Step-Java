public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (1<= year && year <= 9999){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){

        if (month < 1 || 12 < month || year < 1 || 9999 < year){
            return -1;
        } else {
            if (isLeapYear(year)){
                switch (month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        return 29;
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            } else {
                switch (month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            }
        }
    }
}
