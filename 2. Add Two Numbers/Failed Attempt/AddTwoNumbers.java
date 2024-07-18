public class AddTwoNumbers{
    public static void main(String[] args) {
        
    }
}

//  * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       String list1 = "", list2 = "";
       int l1values, l2values, sum, sumLength;

       while(l1 != null){
        list1 += String.valueOf(l1.val);
        l1 = l1.next;
       }

       while(l2 != null){
        list2 += String.valueOf(l2.val);
        l2 = l2.next;
       }

        l1values = Integer.parseInt(list1);
        l2values = Integer.parseInt(list2);

        sum = l1values + l2values;
        sumLength = String.valueOf(sum).length();

        if(sum == 0){
            return new ListNode(sum);
        }

        ListNode head = null;
        ListNode current = null;

        for(int i=0; i<sumLength; i++){
            ListNode newNode = new ListNode(sum%10);

            if(head == null){
                head = newNode;
                current = head;
            }else{
                current.next = newNode;
                current = current.next;
            }
            sum = sum/10;
        }
        return head;
    }
}