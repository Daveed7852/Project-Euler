public class Project9 {
    public static void main(String [] args){

        double d,a=1,b=1,c=1;

        for(int i=1;i<1000;i++){
            for(int j=1;j<i;j++){
                a=i;
                b=j;
                d=(a*a)+(b*b);
                c= Math.sqrt(d);
                if(a+b+c==1000){
                    break;
                }

            }
            if(a+b+c==1000){
                break;
            }
        }
        System.out.println(a*b*c);


    }
}
