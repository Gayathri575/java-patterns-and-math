package MathematicsFoundation;

public class Deci2Binary {
    public static void main(String [] args){
        int n = 280;
        String Value = "";
        while( n > 0){
            Value = (n % 2 ) + Value ;
            n /= 2 ;
        }
        System.out.print(Value );
    }
}
