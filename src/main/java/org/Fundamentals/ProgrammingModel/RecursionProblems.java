package org.Fundamentals.ProgrammingModel;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public static void backtrackingSum(int n, LinkedList<Integer> list, int sum){


        for(int i = 1; i <= n; i++){
            if(n == sum) {
                System.out.println(list);
                return;
            }

            sum = sum + i;
            if (sum <= n){
                list.add(i);
                backtrackingSum(n, list, sum);
                list.removeLast();
            }
            sum = sum - i;
        }
    }

    public static int isArrayInSortedOrder(int A[], int n){
        if (n == 1) return 1;

        return (A[n-1] < A[n] ? isArrayInSortedOrder(A, n - 1) : 0);
    }








    public static void main(String[] args) {
        //int[] array = {1, 4, 3, 4, 5};
        int n = 15;
        LinkedList<Integer> nums = new LinkedList<>();
        backtrackingSum(n,nums,0);
        //System.out.println(recursiveSum(10));
        //towerOfHanoi(4, 'A', 'C', 'B');
        //System.out.println(isArrayInSortedOrder(array, array.length - 1));

    }
}
