package basicjava;
import java.util.*;

public class Framework {
    public static void main(String [] args){

        // 1. ArrayList

        ArrayList <String> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.set(0,"zero");
        l.remove(3);
        l.remove("three");
        System.out.println(l.size());

        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        Collections.sort(l);
        System.out.println(l);

        ArrayList <String> l2 = new ArrayList<>(l.subList(0,1));
        System.out.println(l2);
        System.out.println(l.containsAll(l2));

        Object[] o = l.toArray();
        for (int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }

        Iterator <String> iter = l.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Stack <String> st = new Stack<>();
        st.push("red");
        st.push("blue" );
        st.push("yellow");
        st.push("green");
        st.push("black");

        String s = st.pop();
        System.out.println(s);

        int index = st.search("red");
        System.out.println(index);

        while(!st.empty()){
            System.out.println(st.pop());
        }

        Queue<String> q = new LinkedList<>();

        q.offer("red");
        q.offer("yellow");
        q.offer("green");

        String color = q.peek();
        System.out.println(color);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        HashSet <Integer> h = new HashSet<>();

        for (int i=0;i<10;i++){
            h.add((int)Math.random()*45+1);
        }
        System.out.println(h);

        List <Integer> list = new LinkedList<>(h);
        Collections.sort(list);
        System.out.println(list);

    }
}
