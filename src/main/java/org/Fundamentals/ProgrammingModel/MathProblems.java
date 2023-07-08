package org.Fundamentals.ProgrammingModel;

public class MathProblems {
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


    public static double sqrt(double c){
        if(c < 0 ) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while(Math.abs(t - c/t) > err * t){
            t = (c/t + t) / 2.0;

        }
        return  t;
    }


    public static double hypotenuse(double a, double b){
        return (a*a + b*b);
    }



    public static void main(String[] args) {
    }
}
