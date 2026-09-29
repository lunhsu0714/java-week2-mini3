import java.util.Scanner;

public class TinyCompiler {
   public static void main(String[] args) {
   Scanner keyin = new Scanner(System.in);

   keyin.next();                    // int               
   keyin.next();                    // result               
   keyin.next();                    // =               
   int first = keyin.nextInt();     // 第⼀個整數
   keyin.next();                    // +
   int second = keyin.nextInt();    // 第⼆個整數
   keyin.next();                    // +
   int third = keyin.nextInt();     // 第三個整數
   keyin.next();                    // ;
   
   System.out.println("MOVI R1, " + first);
   System.out.println("MOVI R2, " + second);
   System.out.println("MOVI R3, " + third);
   System.out.println("ADD R0, R1, R2 , R3");
   System.out.println("STORE [0], R0");
   }
}   
