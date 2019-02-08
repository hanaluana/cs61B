package lecture2;

public class Dog {

    public int weightInPounds;

    public static String binomen = "Canis familiaris";

    public Dog(int n){
        weightInPounds=n;
    }

    public void makeNoise(){
        if (weightInPounds<10) {
            System.out.println("yp!");
        } else if (weightInPounds <30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static Dog maxDog(Dog a, Dog b){
        if (a.weightInPounds > b.weightInPounds){
            return a;
        }
        return b;
    }

    public Dog maxDog(Dog d){
        if (this.weightInPounds > d.weightInPounds){
            return this;
        }
        return d;
    }
}
