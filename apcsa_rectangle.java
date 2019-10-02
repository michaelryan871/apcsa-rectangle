

import java.util.Scanner;

public class apcsa_rectangle {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

      System.out.print("Length: ");
      double length = in.nextDouble();
      System.out.print("Width: ");
      double width = in.nextDouble();

      double area = length * width;

      System.out.printf("The area of a " + String.format("%.1f", length) + "-by-" + String.format("%.1f", width) + " rectangle is " + String.format("%.1f", area) + ".\n");


    in.close();

  }
}
