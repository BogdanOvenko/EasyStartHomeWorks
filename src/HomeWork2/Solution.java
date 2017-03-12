package HomeWork2;

/**
 * Created by Bogdan on 09.03.2017.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null){
            return null;
        }
        ListNode l3 = new ListNode(0);

        if ((l1.val + l2.val) > 9){
            if(l1.next != null){
                l1.next.val += 1;
            }else if (l1.next == null) {l1.next = new ListNode(1);}

            if(l2.next == null){l2.next = new ListNode(0);}

            if (l1 != null){
                l3.val += l1.val;
                l1 = l1.next;
                if(l1 == null && l2.next != null){l1 = new ListNode(0);}
            }
            if (l2 != null){
                l3.val +=l2.val;
                l2 = l2.next;
                if(l2 == null && l1 != null){l2 = new ListNode(0);}
            }

            l3.val = l3.val%10;
        }
        l3.next = addTwoNumbers(l1, l2);
        return l3;
    }

}
