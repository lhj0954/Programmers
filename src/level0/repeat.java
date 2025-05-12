package level0;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        //String을 반복하는데 쓰이는 함수가 있다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.print(str.repeat(n));

        sc.close();
    }
}
