package lecture7;

//Selection sort

public class Sort {
    public static void sort(String[] s){
        sort(s,0);
    }
    private static void sort(String[] s, int k){
        // find the smallest item
        // swap it into the front position
        // sort the rest(recursion)

        if (k==s.length){
            return;
        }
        int smallest = findSmallest(s, k);
        swap(s, k, smallest);
        sort(s, k+1);
    }

    private static int findSmallest(String[] s, int k){
        int smallest = k;
        for (int x=k+1;x<s.length;x++){
            if (s[x].compareTo(s[smallest])<0){
                smallest = x;
            }
        }
        return smallest;
    }
    private static void swap(String[] s, int k, int smallest){
        String temp= s[smallest];
        s[smallest]=s[k];
        s[k]=temp;
    }

    public static void print(String[] s){

    }
    public static void main(String[] args){

    }
}
