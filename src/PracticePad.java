public class PracticePad {
    public static void main(String[] args) throws Exception {
        int n = 7;
        int answer = 0;

        if(n % 2 == 1) {
            for (int i = 0; i < n; i + 2) {
                answer += i;
            }
        } else {
            for (int i = 0; i <= n; i + 2) {
                answer += (double)Math.pow(i, 2); 
            }
        }
    }
}
