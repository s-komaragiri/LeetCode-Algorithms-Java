package AddRopesMinCost;

/*
For example if we are given 4 ropes of lengths 4, 3, 2 and 6. We can connect the ropes in following ways.
1) First connect ropes of lengths 2 and 3. Now we have three ropes of lengths 4, 6 and 5.
2) Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and 9.
3) Finally connect the two ropes and all ropes have connected.
 */

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Solution {
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
    static int[] ropes = {2, 4, 6, 4};

    public static void main(String args[]) {
        int min1, min2, sum = 0;
        for (int ropes : ropes) {
            priorityQueue.add(ropes);
        }
        while (priorityQueue.size() > 0) {
            min1 = priorityQueue.poll();
            min2 = priorityQueue.poll();
            sum = min1 + min2;
            priorityQueue.add(sum);
            if (priorityQueue.size() == 2) {
                min1 = priorityQueue.poll();
                min2 = priorityQueue.poll();
                sum = min1 + min2;
            }
        }
        System.out.println(sum);
    }
}
