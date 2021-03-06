/* Write a method called removeLast that removes and returns the last value of a 
list of integers. For example, if a variable called list stores the following 
values: 

        [3, 6, 19, 24, -8, 0, 14]

   and you make the following call:

        int n = list.removeLast();

   the variable n will be set to 14 and list will store:

        [3, 6, 19, 24, -8, 0]

   Your method should throw a NoSuchElementException if the list is empty.

   You are writing a method for the LinkedIntList class discussed in lecture:

        public class ListNode {
            public int data;       // data stored in this node
            public ListNode next;  // link to next node in the list

            <constructors>
        }
 
        public class LinkedIntList {
            private ListNode front;

            <methods>
        }

 You may not call any other methods of the LinkedIntList class and you may not 
construct any structured objects to solve this problem. */ 

public int removeLast() {
    if (front == null) {
        throw new NoSuchElementException();
    }
    ListNode curr = front;
    int result;
    if (curr.next == null) {
        result = curr.data;
        front = null;
    } else {
        while (curr.next.next != null) {
            curr = curr.next;
        }
        result = curr.next.data;
        curr.next = null;
    }
    return result;
}
