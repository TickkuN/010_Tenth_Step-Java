public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == false){
            return false;
        } else {
            if ((0 <= hourOfDay && hourOfDay < 8) || (hourOfDay == 23)){
                return true;
            } else {
                return false;
            }
        }
    }
}