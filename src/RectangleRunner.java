import org.w3c.dom.css.Rect;

import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1L = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1W = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1H = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2L = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2W = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2H = myScanner.nextDouble();
        Rectangle rect1 = new Rectangle(rect1L,rect1W);
        Rectangle rect2 = new Rectangle(rect2L,rect2W);
        System.out.println("Rectangle 1's Area: " + rect1.calculateArea() + "\n Rectangle 1's Volume: " + rect1.calculateBoxVolume(rect1H));
        System.out.println("Rectangle 2's Area: " + rect2.calculateArea() + "\n Rectangle 2's Volume: " + rect2.calculateBoxVolume(rect2H));

        // write the rest of your program below
   }
}
