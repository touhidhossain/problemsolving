package random;

public class AddTwoNumbers {
    public static void main(String[] args) {
        addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode nextNodeOfL1 = l1;
        ListNode nextNodeOfL2 = l2;

        boolean sumDone = false;

        int carry = 0;

        ListNode tempNode = result;

        while (!sumDone){

            String sum = sum((nextNodeOfL1.val + carry), nextNodeOfL1.val);
            int res = Integer.parseInt(String.valueOf(sum.charAt(0)));
            carry = sum.length() > 1 ? Integer.parseInt(String.valueOf(sum.charAt(1))) : 0;

            tempNode.val = res;
            tempNode.next = new ListNode();


            nextNodeOfL1 = nextNodeOfL1.next;
            nextNodeOfL2 = nextNodeOfL2.next;

            if(nextNodeOfL1 == null) {
                sumDone = true;
            }

            if (nextNodeOfL2 == null){
                sumDone = true;
            }

        }
        return result;
    }

    private static String sum(int val1, int val2){
        return String.valueOf(val1 + val2);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next =  next; }
}
