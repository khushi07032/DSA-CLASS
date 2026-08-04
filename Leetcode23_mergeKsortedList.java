import java.util.*;

public class Leetcode23_mergeKsortedList {
    int val;
    Leetcode23_mergeKsortedList next;

    Leetcode23_mergeKsortedList() {}

    Leetcode23_mergeKsortedList(int val) {
        this.val = val;
    }

    Leetcode23_mergeKsortedList(int val, Leetcode23_mergeKsortedList next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public Leetcode23_mergeKsortedList mergeKLists(Leetcode23_mergeKsortedList[] lists) {
        PriorityQueue<Leetcode23_mergeKsortedList> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        for (Leetcode23_mergeKsortedList n : lists) {
            if (n != null) {
                pq.offer(n);
            }
        }

        Leetcode23_mergeKsortedList dummy = new Leetcode23_mergeKsortedList(-1);
        Leetcode23_mergeKsortedList curr = dummy;

        while (!pq.isEmpty()) {
            Leetcode23_mergeKsortedList node = pq.poll();

            curr.next = node;
            curr = curr.next;

            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }
}