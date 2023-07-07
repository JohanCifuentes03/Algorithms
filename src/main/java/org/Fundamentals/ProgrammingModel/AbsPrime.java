package org.Fundamentals.ProgrammingModel;

public class AbsPrime {
    public static double abs(double x ){
        if(x < 0.0) return -x;
        else return x;
    }

    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0)return false;

        }
        return true;
    }

    public static void firstNPrimes(int N){
        int count  = 0;
        int number = 2;
        while (count!=N){
            boolean isPrime = true;
            for(int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
    }
}
