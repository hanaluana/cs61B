package lecture7;

public class callbyreference {

    public static void main(String[] args) {

        // Call by Value : 값에 의한 호출
        //   메소드 호출하는측의 원본은 변화가 없다.
        //   자바에선 일반적인 primitive 변수를 매개변수로 주고 받을때
        //   Call by value 가 발생한다.

        System.out.println("== Call by Value : 값에 의한 호출 ==");
        int n = 100;
        add(n);
        System.out.println("메소드 add(int) 호출후 원본값: " + n);
        System.out.println();

        // Call by Reference : 참조에 의한 호출
        //   메소드 호출하는측의 원본에 영향을 받는다 (원본값의 변화 발생)
        //   자바에선 일반적인 reference 변수를 주고 받을때
        //   Call by value 가 발생한다.
        //   자바의 대표적인 reference 변수 2가지 : 배열, 클래스

        System.out.println("== Call by Reference : 참조에 의한 호출 ==");
        int [] array = {10, 20, 30, 40, 50};
        add(array);        // 배열이름을 매개변수로 넘김은 Call by Reference 이다
        System.out.print("메소드 add(int []) 호출후 원본값: ");
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        Numeric numericObj = new Numeric();
        numericObj.num = 1000;
        add(numericObj);
        System.out.println("메소드 add(Numeric) 호출후 원본값: " + numericObj.num);
        System.out.println();

        // 그러나!
        // 레퍼런스 변수가 아닌 그 '값'을 매개변수로 넘긴 경우는
        // Call by Reference 가 아닌 Call by Value 이다
        System.out.println("== '레퍼런스 변수'가 아닌 '레퍼런스의 값'을 매개변수로 호출한 경우 ==");

        add(array[0]);
        System.out.println("메소드 add(int) 호출후 원본값: " + array[0]);
        System.out.println();

        add(numericObj.num);
        System.out.println("메소드 add(int) 호출후 원본값: " + numericObj.num);
        System.out.println();

    } // end main()


    public static void add(int intArg){
        intArg = intArg + 1;
        System.out.println("메소드 add(int) 결과: " + intArg);
    } // end add()

    public static void add(int [] arrArg){
        System.out.print("메소드 add(int []) 결과: ");
        for(int i=0; i< arrArg.length; i++){
            arrArg[i] = arrArg[i] + 1;
            System.out.print(arrArg[i] + " ");
        }
        System.out.println();
    } // end add()

    public static void add(Numeric numericArg){
        numericArg.num += 1;
        System.out.println("메소드 add(Numeric) 결과: " + numericArg.num);
    } // end add()
} // end class


class Numeric{
    public int num;
} // end class Numeric

