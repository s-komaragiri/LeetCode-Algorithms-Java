package SquaresOfArray;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            int a = A[i];
            A[i]=a*a;
        }

        Arrays.sort(A);
        return A;
    }
}
