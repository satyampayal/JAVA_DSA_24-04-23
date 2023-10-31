class LL{
     
      Node Head;
    // private int size;
    // LL(){
    //     this.size=0;
    // }
    class Node{
      String data;
      Node next;

      Node(String data){
        this.data=data;
        this.next=null;
        //size++;
      }
    }
   
    // add first
    public  void addFirst(String data){
        Node newNode=new Node(data);
      //  size++;
        if(Head==null){
            Head=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
    }

    // add Last 
    public  void addLast(String data){
        Node newNode=new Node(data);
      //  size++;
        if(Head==null){
            Head=newNode;
            return;
        }
        Node currNode=Head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
       

    }
    public void print(){
        if(Head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=Head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void deletFirst(){
        if(Head==null){
            System.out.println("List is empty");
            return;
        }
       // System.out.println("Delte is ->"+Head.data);
        Head=Head.next;
    }
    public void lastDelete(){
        if(Head==null){
             System.out.println("List is empty");
            return;
        }
        if(Head.next==null){
            Head=null;
            return;
        }
        Node secondLast=Head;
        Node lastNode=Head.next;// if Head.next.next then its delet two 

        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
               
        //System.out.println("Last Node Delte "+lastNode.data);
       secondLast.next=null;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("This");        
        list.addFirst("is");
        list.addFirst("3");        
        list.addFirst("4");
        list.addLast("last");
        list.deletFirst();        
        list.deletFirst();
         list.print();
        System.out.println();

        list.lastDelete();


        list.print();
    }
}