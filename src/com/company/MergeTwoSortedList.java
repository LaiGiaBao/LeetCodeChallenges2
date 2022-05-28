package com.company;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val) {
                pointer.next = list1;
                list1= list1.next;
            }
            else {
                pointer.next = list2;
                list2= list2.next;
            }
            pointer = pointer.next;
        }
//        System.out.println(list1==null);
//        System.out.println(list2==null);
        if(list1 != null) {
            pointer.next = list1;
        } else if (list2 != null) {
            pointer.next = list2;
        }

        return result.next;
    }
}
