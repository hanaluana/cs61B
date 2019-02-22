package lecture9;

public class RotatingSLList<Item> extends SLList<Item> {

    public void rotateRight(){
        Item x = removeLast();
        addFirst(x);
    }
    public static void main(String[] args){
        RotatingSLList<Integer>rs1 = new RotatingSLList<>();
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);

        rs1.rotateRight();
        rs1.print();
    }
}
