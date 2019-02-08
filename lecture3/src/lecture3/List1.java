package lecture3;
import java.util.*;


public class List1 {
    public int first;
    public List1 rest;

    public List1(int f, List1 h){
        this.first = f;
        this.rest = h;
    }

    public int size(){
        if (rest == null){
            return 1;
        }
        return 1+this.rest.size();
    }

    /*
    Return the size of hte list using no recursion!
     */
    public int iterativeSize(){
        List1 p = this;
        int totalSize = 0;
        while(p!=null){
            totalSize+=1;
            p=p.rest;
        }
        return totalSize;
    }

    public int ithItem(int ith){
        List1 p = this;
        while(ith>0){
            p = p.rest;
            ith-=1;
        }
        return p.first;

    }

    public int get(int i){
        if (i==0){
            return this.first;
        }
        return this.rest.get(i-1);
    }

    public static void main(String[] args){

        List1 L = new List1(15, null);
        L = new List1(10,L);
        L = new List1(5, L);

        int [] A = new int[5];
        ArrayList <Integer> B = new ArrayList<>();

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(A.length);
        System.out.println(B.size());

        System.out.println(L.ithItem(2));
        System.out.println(L.get(2));
    }
}
