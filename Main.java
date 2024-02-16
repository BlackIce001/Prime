import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of prime numbers
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2; // Starting from 2 as it is the first prime number

        while (primes.size() < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(num);
            }

            num++;
        }

        System.out.println("First " + n + " prime numbers:");
        System.out.println(primes);
    }
}
