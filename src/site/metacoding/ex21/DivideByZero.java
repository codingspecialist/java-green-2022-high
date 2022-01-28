package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신, 사용자입력 예외처리!!

        try {
            int x = sc.nextInt();
            int result = x / 0;
            System.out.println("받은 값 : " + x);
        } catch (InputMismatchException e) {
            System.out.println("============");
            System.out.println("문자를 넣지마 좀!!");
            System.out.println("============");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("============");
            System.out.println("0 나누지마 좀!!");
            System.out.println("============");
            e.printStackTrace();
        }

    }
}
