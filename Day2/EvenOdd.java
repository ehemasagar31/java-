// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class EvenOdd {
   public EvenOdd() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println(var2 + " is even");
      } else {
         System.out.println(var2 + " is odd");
      }

      var1.close();
   }
}
