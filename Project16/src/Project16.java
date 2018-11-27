import java.math.BigInteger;

public class Project16 {
    public static void main(String [] args){
        BigInteger n = new BigInteger("2");
        BigInteger sum;
        int p =1000;
        sum = n.pow(p);
        String number = sum.toString();

        System.out.printf("%d%n",sum);
        System.out.println(number);
        long product = 0;
        for(int i= 0;i<number.length();i++){

            for(int j=i;j<i+1;j++){
                product += Integer.parseInt(number.substring(j , j+1));
            }

        }
        System.out.println(product);


    }
}
