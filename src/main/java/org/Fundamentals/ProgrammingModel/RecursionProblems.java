package org.Fundamentals.ProgrammingModel;

public class RecursionProblems {


    //                                     FROM     TO     AUXILIARY
    public static void towerOfHanoi(int n, char A , char C, char B){
        // If only 1 disk, make the move and return
        if (n == 1){
            System.out.println("Move disk 1 From " + A + " to " + C);
            return;
        }

        // Move top n-1 from A to B, using C as auxiliary
        towerOfHanoi(n-1, A,B,C);
        // Move remaining disk from A to C
        System.out.println("Move disk " + n + " from " + A + " to " + C );

        // Move n-1 disks from B to C using A as auxiliary
        towerOfHanoi(n - 1, B, C, A );

    }

    public static int recursiveSum(int n){
        if (n == 0) return 0;
        else {
            return n + recursiveSum(n - 1);
        }

    }

    //public static int isArrayInSortedOrden(int A[], int n){

    //}


    public static void main(String[] args) {
        //System.out.println(recursiveSum(10));
        towerOfHanoi(4, 'A', 'C', 'B');
    }
}
