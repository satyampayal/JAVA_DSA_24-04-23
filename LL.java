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
        while(currNode!=null){
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
            System.out.print(curr.next+"->");
            curr=curr.next;
        }
        System.out.print("->null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("This");        
        list.addFirst("is");
        list.addFirst("This");        
        list.addFirst("is");

        list.print();
    }
}