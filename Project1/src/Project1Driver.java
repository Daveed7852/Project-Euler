public class Project1Driver {
    public static void main(String[]args){
        int sum=0;

        for(int i=0;i<=999;i++){
            if(i%3==0 || i % 5 ==0){
                sum = sum + i;
            }

        }
        System.out.print(sum);
    }
}
