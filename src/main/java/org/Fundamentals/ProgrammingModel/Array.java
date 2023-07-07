package org.Fundamentals.ProgrammingModel;

public class Array {
    public static double findMaximumValue (int[] a ){
        double max = a[0];
        for(int i = 1; i< a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static double avaregeArrayValues(int[] a) {
        double sum = 0;
        int N = a.length;
        for(int i = 0; i < N ; i++){
            sum+=a[i];
        }
        double avg = sum/N ;

        return avg;
    }

    public static double [] copyToAnotherArray(double[] a, double[] b){
        int N = a.length;
        for(int i = 0; i < N ; i++){
            b[i] = a[i];
        }

        return b;
    }

    public static double [] reverseArray(double[] a){
        int N = a.length;
        for(int i = 0; i < N/2; i++){
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }
        return a;
    }

    // square matrices
    public static double[][] matrixMultiplication(double a[][], double b[][]){
        int N = a.length;
        double c[][] = new double[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

            }
        }

        return c;
    }
    public static void main(String[] args) {

    }
}
