// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class ArmstrongRange {
   public ArmstrongRange() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter start: ");
      int var2 = var1.nextInt();
      System.out.print("Enter end: ");
      int var3 = var1.nextInt();
      System.out.println("Armstrong numbers are:");

      for(int var4 = var2; var4 <= var3; ++var4) {
         int var5 = var4;
         int var6 = 0;

         for(int var7 = String.valueOf(var4).length(); var5 > 0; var5 /= 10) {
            int var8 = var5 % 10;
            var6 = (int)((double)var6 + Math.pow((double)var8, (double)var7));
         }

         if (var6 == var4) {
            System.out.println(var4);
         }
      }

      var1.close();
   }
}
