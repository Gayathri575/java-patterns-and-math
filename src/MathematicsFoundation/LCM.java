package MathematicsFoundation;

public class LCM {
    public static void main(String [] args){
        int a = 4, b = 6;
        int gcd = 1;
        int x = a, y = b;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println("LCM is " + lcm);

    }
}
