package Pattern;

public class Diamond {
    public static void main(String[] args){
        int Dia = 4;
        for(int i = 1; i <= Dia; i++) {
            for(int j = 1; j <= Dia - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        for(int i = Dia - 1; i >= 1; i--) {
            for(int j = 1; j <= Dia - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
