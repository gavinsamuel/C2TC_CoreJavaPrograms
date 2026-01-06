//Program to demonstrate a Priority Queue
package com.tnsif.collection.day2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("PyTorch");
        pq.add("React");
        pq.add("Docker");
        pq.add("Github");

        System.out.println(pq);
        pq.remove("Github");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);

        Iterator<String> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());
    }

}
