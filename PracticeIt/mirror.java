/* Write a method mirror that doubles the size of a list of integers by 
appending the mirror image of the original sequence to the end of the list. The 
mirror image is the same sequence of values in reverse order. For example, if a 
variable called list stores this sequence of values: 

        [1, 3, 2, 7]
		
and we make the following call:

        list.mirror();
		
then it should store the following values after the call:

        [1, 3, 2, 7, 7, 2, 3, 1]
		
Notice that it has been doubled in size by having the original sequence 
appearing in reverse order at the end of the list. You may not make assumptions 
about how many elements are in the list. 

You are writing a method for the ArrayIntList class discussed in lecture 
(handout 3): 

        public class ArrayIntList {
            private int[] elementData; // list of integers
            private int size;          // current # of elements in the list

            <methods>
        }
		
You are not to call any other ArrayIntList methods to solve this problem. You 
may assume that the array has sufficient capacity to store the new sequence of 
values. 

Write your solution to mirror below. */

public void mirror() {
    Stack<Integer> s = new Stack<Integer>();
    for (int i = 0; i < size; i++) {
        s.push(elementData[i]);
    }
    for(int i = size; i < size*2; i++) {
        elementData[i] = s.pop();
    }
    size *= 2;
}