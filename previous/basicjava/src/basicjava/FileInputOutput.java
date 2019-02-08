package basicjava;
import java.io.*;
import java.util.*;

public class FileInputOutput {

    public static void main (String[] args)throws IOException{

        /*
        파일 쓰기!
         */

        FileOutputStream f1 = new FileOutputStream("./resources/text.txt");
        for (int i=0;i<11;i++){
            String data = i+"번째 줄입니다.\r\n";
            f1.write(data.getBytes());
        }
        f1.close();

        FileWriter f2 = new FileWriter("./resources/text.txt");
        for (int i=1;i<11;i++){
            String data2 = i+"번째 줄입니다!\r\n";
            f2.write(data2);
        }
        f2.close();

        PrintWriter f3 = new PrintWriter("./resources/text.txt");
        for (int i=1;i<11;i++){
            String data3 = i+"번째 줄입니다...";
            f3.println(data3);
        }
        f3.close();

        FileWriter f4 = new FileWriter("./resources/text.txt",true);
        for (int i=11;i<21;i++){
            String data4 = i+"번째 줄입니닷!\r\n";
            f4.write(data4);
        }
        f4.close();

        PrintWriter f5 = new PrintWriter(new FileWriter("./resources/text.txt",true));
        for (int i=21;i<31;i++){
            String data5 = i+"번째 줄이라굿";
            f5.println(data5);
        }
        f5.close();

        /*/
        파일 읽어오기!
         */
        BufferedReader br = new BufferedReader(new FileReader("./resources/text.txt"));
        while(true){
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();

        FileReader reader = new FileReader("./resources/text.txt");
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();

        Scanner sc = new Scanner(new File("./resources/text.txt"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}
