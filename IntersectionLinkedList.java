import java.util.HashSet;
import java.util.Set;




public class IntersectionLinkedList {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	          val = x;
	          next = null;      
	     }
	}
	 static ListNode headA,headB;
	 
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        Set<ListNode> set = new HashSet<>();
	        while(headA!=null){
	            set.add(headA);
	            headA = headA.next;
	        }
	        
	        while(headB!=null){
	            if(set.contains(headB)){
	                return headB;
	            }
	            headB = headB.next;
	        }
	        return null;
	 }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			IntersectionLinkedList list1 = new IntersectionLinkedList();
			list1.headA = new ListNode(4);
			list1.headA.next = new ListNode(1); 
	        list1.headA.next.next = new ListNode(8); 
	        list1.headA.next.next.next = new ListNode(4); 
	        list1.headA.next.next.next.next = new ListNode(5);
	        
	        IntersectionLinkedList list2 = new IntersectionLinkedList();
	        list2.headB = new ListNode(5); 
	        list2.headB.next = new ListNode(0); 
	        list2.headB.next.next = new ListNode(1); 
	        list2.headB.next.next.next = new ListNode(8); 
	        list2.headB.next.next.next.next = new ListNode(4);
	        list2.headB.next.next.next.next.next = new ListNode(5);
	        
	        
	        System.out.println(getIntersectionNode(headA, headB));
			
	}
		
}
	
	
	
	



