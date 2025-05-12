package level0;

import java.util.Scanner;

//Character c, Charater.isUpperCase(c), Character.isLowerCase(c), Character.toUpperCase(c), Character.toLowerCase(c)
public class upperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        
        for (Character c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        
        System.out.println(answer);
    }
}
