package Assignments;

import java.math.BigInteger;


public class QNo7 {
    public static void main(String[] args) {
        
        long result = 0;
        long number = (long) 10000000000.0;

        for (int i = 1; i <= 1000; i++) {
            long temp = i;
            for (int j = 1; j < i; j++) {
                temp *= i;

                temp %= number;

            }
            result += temp;
            result %= number;
        }
        System.out.println(result);
    }
  
}