public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1) return -1;

        int latgestPrime = 0;

        for(int i=1; i <= number; i++){
            boolean isPrime = true;
            if (number % i == 0){
                for(int j=2; j<=Math.sqrt(i); j++){
                    if((i % j == 0)) isPrime = false;
                }
                if(isPrime) latgestPrime = i;
            }
        }
        return latgestPrime;
    }
}