package lecture2;

public class DogLauncher {

    public static void main (String[] args){
        Dog d = new Dog(51);
        d.makeNoise();

        Dog d1 = new Dog(50);
        Dog d2 = new Dog(20);

        Dog bigger = d1.maxDog(d2);
        bigger.makeNoise();
        System.out.println(Dog.binomen);

    }
}
