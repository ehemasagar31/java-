// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class FibonacciSeries {
   public FibonacciSeries() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter n: ");
      int var2 = var1.nextInt();
      int var3 = 0;
      int var4 = 1;
      System.out.print("Series: ");

      for(int var5 = 0; var5 < var2; ++var5) {
         System.out.print(var3 + " ");
         int var6 = var3 + var4;
         var3 = var4;
         var4 = var6;
      }

   }
}
