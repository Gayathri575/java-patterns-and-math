package Pattern;

public class InvertedTriangle {
    public static void main(String [] args){
        int number = 1;
        for(int i = 5 ; i >= number; i --){
            for (int j = i ;j >= 1; j--){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
