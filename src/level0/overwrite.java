package level0;

//String str.charAt() = 문자열에서 문자 추출

public class overwrite {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        String answer = "";
        int s = 2;
        int o = 0;
        
        for(int i = 0; i < my_string.length(); i++) {

            if(i >= s && i < (s + overwrite_string.length())) {
                answer += overwrite_string.charAt(o);
                o++;
            } else {
                answer += my_string.charAt(i);
            }
        }

        System.err.println(answer);
        
    }
    
}
