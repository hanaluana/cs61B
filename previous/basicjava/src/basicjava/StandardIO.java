package basicjava;
import java.util.*;
import java.io.*;

public class StandardIO {
    public static void main(String[] args) throws IOException{

        // 1. Scanner
        Scanner sc = new Scanner(System.in);

        /*
        byte byt = sc.nextByte();
        short srt = sc.nextShort();
        long lng = sc.nextLong();
        float flt = sc.nextFloat();
        double dbl = sc.nextDouble();
        boolean ble = sc.nextBoolean();

        String strLine = sc.nextLine();
        String str = sc.next();
        next랑 newLine() 사용시 주의점
        */

        /*
        System.out.println("배열 크기를 입력하세요");
        int ArraySize = sc.nextInt();
        String [] StrArray = new String[ArraySize];

        System.out.println("문자열을 스페이스바로 띄워서 입력하세요");
        String strInput = sc.nextLine();

        /* next() 실행 라인에서 숫자 2와 Enter를 입력 시, nextLine()에서 입력을 기다리지 않고 바로 통과 되어 버린다.
        그 이유는, nextInt()가 실행될때 숫자 2만 읽고, Enter(\r\n)값은 입력 스트림 버퍼에 남아 있기 때문이다.
        따라서, nextLine() 실행 시, 남아 있는 Enter 값을 읽어 들이고 통과하게 된다.
        * /

        System.out.println("배열 크기를 입력하시오");
        ArraySize = sc.nextInt();
        sc.nextLine();
        StrArray = new String[ArraySize];
        System.out.println("문자열을 스페이스바로 띄워서 입력하세요");
        strInput = sc.nextLine();
        sc.close();
        */

        // System.int.read()

        /*
		System 클래스에서 제공하는 read() 라는 함수를 이용하여 키보드 입력을 받아보자.
		read() 함수는 1byte 크기만 입력스트림에서 읽어와 ASCII 코드에 해당하는 int 값을 리턴한다.
		그래서 문자를 입력받을 때 주요 사용된다.
		*/

        //char ch = (char) System.in.read();
        //int ascii = System.in.read();

        // 그러면, Enter에 대한 예외 처리는 어떻게 할 것인가?
        /*
         * 숫자 + Enter 입력 시, Enter(\r\n) 값은 입력스트림 버퍼에 그대로 남아 있게 된다.
         */
        /*
        char ch = (char) System.in.read();
        System.in.read(); // 또는 System.in.skip(1);
        char ch2 = (char) System.in.read();
        System.out.println(ch+""+ch2);
        */

        /*
        System.out.println("정수를 입력하세요");
        int n1 = System.in.read();
        System.in.read();
        int n2 = System.in.read();
        System.out.printf("%d: %d",n1-48, n2-48);

        //Input Stream
        InputStream is = System.in;
        int a2 = is.read();

        byte[] a = new byte[3];
        is.read(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        */

        /* BufferedReader 객체는 문자를 스트림에서 읽을 때 버퍼를 사용하여
        좀더 문자열 처리를 편리하게 해주는 객체이다.
		InputStreamReader의 경우 한 문자씩 스트림에서 읽어 오지만,
		BufferedReader는 미리 스트림에 있는 데이터를 버퍼에 받아 온다.
		*/

        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str1= in.readLine();
        int str2 = in.read();
        int str3 = in.read();
        System.out.println(str1);
        System.out.println((char)str2);
        System.out.println((char)str3);
        */

        /* 위와 같이 readLine() 함수를 사용하면 \r\n을 인식하며 한 줄을 읽어온다. Scanner의 nextLine() 함수와 유사하게 동작한다.
		문자 하나만 읽고 싶을 때는 방법2의 System.in.read()함수를 사용한다.
		*/

        /*
         * Parsing 작업
         * 점수는 두글자이므로, BufferedReader를 통해 입력 받는다.
         * 그러나, in.readLine()은 엔터전까지 입력 받는 건데,
         * 여기서 in.readLine()은 문자열(String)을 입력 받으므로,
         * 정수로 바꿔줘야 함. 그것이 바로 Parse
         * 방법: Integer.parseInt() 사용한다!
        */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("국어 점수");
        String korean = in.readLine();
        int korean2 = Integer.parseInt(korean);
        System.out.println("국어점수는 "+korean2);


    }
}
