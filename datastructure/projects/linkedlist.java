public class linkedlist {
       Node head;
       class Node{
                int data;
                Node next;
                Node(int val){
                    data=val;
                    next=null;
                }
       } 
       linkedlist()
       {
            head=null;
       }
        public  void insertAtBegining(int val)
       {
          Node newnode=new Node(val);
          if(head==null)
          {
             head=newnode;   
         }
         else{
             newnode.next=head;
             head=newnode;
         }
      }
      public  void display(){
          Node temp=head;
          while(temp!=null)
          {
            System.out.println(temp.data+" ");
          temp=temp.next;
          }
      }
     public  void insertAtPos(int position,int val)
      {
          if(position==0)
          {
                insertAtBegining(val);
                return;
          }
            Node newNode=new Node(val);
            Node temp=head;
            for(int i=1;i<=position-1;i++)
            {
                temp=temp.next;
                if(temp==null){
                   throw new IndexOutOfBoundsException("invalid position"+""+position);
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void deleteAtPos(int position)
       {
           if(head==null){
               throw new IndexOutOfBoundsException("Deletion attempted on empty list");
           }
           if(position==0)
           {
               head=head.next;
               return;
           }
           Node temp=head;
           Node prev=null;
           for(int i=1;i<=position;i++){
               prev= temp;
               temp=temp.next;
           }
           prev.next=temp.next;
       }
       public void insertAtEnd(int val){
           Node newnode=new Node(val);
           Node temp=head;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=newnode;
           newnode.next=null;
       }
       public static void main(String args[])
       {
           linkedlist list=new linkedlist();
           list.insertAtBegining(5);
           list.insertAtBegining(9);
           list.display();
            System.out.println("");
           list.insertAtPos(1,10);
           list.display();
           System.out.println("");
           list.deleteAtPos(0);
           list.display();
           System.out.println("");
          list.insertAtEnd(56);
           list.display();
       }
}
