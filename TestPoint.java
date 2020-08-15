
package Lesson06;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point(2,3,4);
        p2.show();
        
        System.out.println("---Biểu diễn điểm trong không gian---");
        System.out.print("Nhap vao gia tri hoanh do: ");
        p1.setX(sc.nextInt());
        System.out.print("Nhap vao gia tri tung do: ");
        p1.setY(sc.nextInt());
        System.out.print("Nhap vao gia tri cao do: ");
        p1.setZ(sc.nextInt());
        p1.show();
    }
}
