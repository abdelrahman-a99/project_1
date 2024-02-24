package project_1;

import java.util.Scanner;

public class main_project_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hello world");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 10);

        System.out.println(r1.get_perimeter() + " " + r1.get_area());
        System.out.println(r2.get_perimeter() + " " + r2.get_area());

        scanner.close();
    }
}