
class Solution {
    public Node insertAtEnd(Node head, int x) {
       
        //handling the edge cases
        if(head==null){
            head=new Node(x);
            return head;
            
        }

        //writing the main logic
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node val=new Node(x);
        temp.next=val;
        val.next=null;
    
        //returning the value
        return head;
    }
}