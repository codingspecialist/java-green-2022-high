package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // InputMismatchException

        // 통신, 사용자입력 예외처리!!

        while (true) {

            System.out.println("반복시작");

            try {
                int x = sc.nextInt();
                int result = x / 0;
                System.out.println("받은 값 : " + x);
            } catch (Exception e) {
                System.out.println("============");
                System.out.println(e.getMessage());
                System.out.println("============");
                e.printStackTrace();
                sc.nextLine(); // 버퍼 비워!!
            }
        }

    }
}
