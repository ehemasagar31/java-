

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Calculator {
   public Calculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter second number: ");
      double var4 = var1.nextDouble();
      System.out.print("Enter operator (+, -, *, /): ");
      char var6 = var1.next().charAt(0);
      if (var6 == '+') {
         double var7 = var2 + var4;
         System.out.println("Result = " + var7);
      } else if (var6 == '-') {
         double var9 = var2 - var4;
         System.out.println("Result = " + var9);
      } else if (var6 == '*') {
         double var10 = var2 * var4;
         System.out.println("Result = " + var10);
      } else if (var6 == '/') {
         if (var4 != (double)0.0F) {
            double var11 = var2 / var4;
            System.out.println("Result = " + var11);
         } else {
            System.out.println("Cannot divide by zero");
         }
      } else {
         System.out.println("Invalid operator");
      }

      var1.close();
   }
}
