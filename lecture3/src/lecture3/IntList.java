package lecture3;

public class IntList {

    IntList rest;
    int first;

    IntList(){};

    IntList(int f, IntList h){
        first = f;
        rest = h;
    }
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList Q = new IntList();
        if (L==null){
            return null;
        }
        Q.rest = incrList(L.rest,x);
        Q.first = L.first+x;
        return Q;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList Q = L;
        if (L==null){
            return null;
        }
        Q.rest = dincrList(L.rest, x);
        Q.first = L.first+x;

        return L;
    }

    public int size(){
        if (this.rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }

    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while(p!=null){
            totalSize+=1;
            p=p.rest;
        }
        return totalSize;
    }
    public int get(int i){
        if (i==1){
            return first;
        }
        return rest.get(i-1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
         System.out.println(L.get(1));
         System.out.println(incrList(L, 3).first);
         System.out.println(dincrList(L, 3).rest.first);
    }
}
