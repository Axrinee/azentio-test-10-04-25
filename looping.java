// 2. You are given the head of a singly linked list. Your task is to determine if the linked list contains a loop. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

// A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.

// Example:

// Input: head: 1 -> 3 -> 4, pos = 2
// Output: true

class node {
    int data;
    node next;
    
    node(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class looping {
    public static boolean hasLoop (node head){
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
             
            if(slow== fast){
                return true;
            }
        }
        return false;
    }

public static void main (String[]args){
    node head = new node(1);
    node second = new node(3);
    node third = new node(4);

    head.next = second;
    second.next = third;
    third.next = second;

    if (hasLoop(head)){
        
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}
