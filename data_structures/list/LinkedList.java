package data_structures.list;

public class LinkedList {
    // first node of the list.
    private ListNode head;

    // Insert value at tail
    // Cases: 1. empty list, 2. move to last node and insert
    // Loop invariant: current always points to a valid node in the list.
    // Complexity: O(n) time, O(1) extra space.
    public void insert(int val) {
        ListNode newNode = new ListNode(val);

        // Case 1: empty list, end the method.
        if (head == null) {
            head = newNode;
            return; 
        }

        // Case 2: move to last node
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    
    //Array to Linkedlist
    ListNode ArrayToLinkedList(int[] arr){
        // Case 1：empty array, return null
        if (arr == null || arr.length == 0) {
            return null;   
        }

        // Case 2: create a linked list from the array.
        ListNode localHead = new ListNode(arr[0]);
        ListNode cur = localHead;

        //iterating the whole array
        for (int i = 1; i < arr.length; i++) {
            // don't overthink abstract stuff, just focus on what happened to current iteration. 
            /*
                What happened here:
                    1. JVM finds the address cur.next pointing to.
                    2. JVM doing what's on the right of "="
                    3. JVM assign the address of new ListNode(arr[i]) to cur.next
                    4. JVM assign the address of cur.next to cur, 
                    which means cur is now pointing to the new ListNode(arr[i])
            */
            cur.next = new ListNode(arr[i]);
            cur = cur.next;

            /*
                cur.next = new ListNode(arr[i]), we are creating a new node and making cur.next point to it. 
                cur = cur.next, we are moving the cur pointer to the next node we just created.
            */
        }

    return localHead;
}
    // Traverse and print
    public void printList() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}