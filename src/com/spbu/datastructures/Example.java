package com.spbu.datastructures;

import com.spbu.datastructures.queue.PriorityQueue;
import com.spbu.datastructures.queue.SortedPriorityQueue;

public class Example {
    public static void main(String[] argv){
        PriorityQueue<Integer, String> queue = new SortedPriorityQueue<>();
        queue.insert(1, "1-1");
        queue.insert(1, "1-2");
        queue.insert(2, "1-2");

        System.out.println(queue.removeMin().getValue());
        System.out.println(queue.removeMin().getValue());
        System.out.println(queue.removeMin().getValue());

    }
}
