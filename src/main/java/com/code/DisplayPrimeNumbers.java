package com.code;

public class DisplayPrimeNumbers {
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        StringBuilder primeNumbers = new StringBuilder(" ");
        while (count != 20){
            if (isPrime(i)){
                primeNumbers.append(i).append("\t");
                count++;
            }
            i++;
        }
        System.out.println("20 Prime numbers first is: "+ primeNumbers);
    }
}
