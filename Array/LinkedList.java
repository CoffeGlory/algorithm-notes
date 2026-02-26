/*
 * LinkedList
 * This is a simple implementation of a singly linked list in Java. It includes basic operations such as adding, removing, and displaying elements in the list.
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){ val = x;};
}

// Enter an array and convert it to a linked list
ListNode createLinkedList(int[] arr){
    // Guard clause for empty array
    if (arr == null || arr.length == 0) {
        return null;   
    }

    // new a head and make a pointer cur pointing to the head.
    ListNode head = new ListNode(arr[0]);
    ListNode cur = head;

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

    return head;
}