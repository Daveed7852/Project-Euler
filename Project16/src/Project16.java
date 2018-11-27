import java.math.BigInteger;

public class Project16 {
    public static void main(String [] args){
        new Project16().run();
    }

    private void run() {
        BigInteger n = new BigInteger("2");
        BigInteger sum;
        int p =1000;
        sum = n.pow(p);
        String number = sum.toString();

        System.out.println(number);
        long product = 0;

        for (char digit : number.toCharArray()) {
            product += Integer.parseInt(String.valueOf(digit));
        }

        System.out.println(product);
    }
}
