public class newword {
    public static void main (String [] args) {
         int num = 6;
         int sum = 0;
        for(int i = 1 ; i < num ; i ++){
            if(num % i == 0){
                sum += i;
            }
            }
        if(num == sum){
            System.out.println("Mr Perfect");
        }
        else {
            System.out.println("Im Not Perfect");
        }

    }
    }
