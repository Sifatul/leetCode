import org.w3c.dom.NodeList;

import java.util.List;

public class Main {
    public static void main(String []args){
        System.out.println("hello world");
        //starting AddTwoNumbers


//        ListNode listNode = new ListNode();
//        ListNode l1 = listNode.arrToListNode(new int[]{9});
//        ListNode l2 = listNode.arrToListNode(new int[]{1,9,9,9,9,9,9,9,9,9});
//

        Easy easy = new Easy();
        int output = easy.removeDuplicatesFromSortedArray( new int[]{0,0,1,1,2});
//        listNode.print(output);
        System.out.println(output);
    }
}
