public class Project2 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1, fib, n = 10;
        int sum=0;
        for (int i = 0; i < n; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            if(fib>n){
                break;

            }
            if(fib%2==0){
                sum= sum+fib;
            }

        }
        System.out.println(sum);
    }
}
