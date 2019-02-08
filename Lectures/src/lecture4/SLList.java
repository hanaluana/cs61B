package lecture4;

// Naked IntList
// Nested Class
public class SLList <Lochness>{

    private class IntNode {
        public Lochness item;
        public IntNode next;
        public IntNode(Lochness i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    // first item (if it exists) is at sentinel next;
    private int size;

//    public SLList(){
//        size = 0;
//        sentinel = new IntNode(63, null);
//    }
    public SLList (Lochness x){
        sentinel = new IntNode(x, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }
    public void addFirst(Lochness x){
        sentinel.next = new IntNode(x, sentinel.next);
        size+=1;
    }

    public Lochness getFirst(){
        return sentinel.next.item;
    }

    public void removeFirst(){
        sentinel.next = sentinel.next.next;
        size-=1;
    }

    public void addLast(Lochness x){

        IntNode p = sentinel;
        while(p.next!=null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size+=1;
    }

    /*
    private static int size(IntNode p){
        if (p.next==null){
            return 1;
        }
        return 1+size(p.next);
    }

    public int size(){
        return size(first);
    }
    */

    public int size(){
        return size;
    }

    public static void main(String[] args){
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
        L.removeFirst();
        System.out.println(L.getFirst());
        L.addLast(20);
        System.out.println(L.size());
    }
}
