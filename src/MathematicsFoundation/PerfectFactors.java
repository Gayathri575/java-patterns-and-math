package MathematicsFoundation;

public class PerfectFactors {
    public static void main(String [] args){
        int a = 18 ;
        for(int i = 1; i*i <= a ; i ++){
            if (a % i == 0){
                System.out.print(i + " ");
            }
            if(i != a/i){
                System.out.print((a/i) + " ");
            }
        }
    }

}
