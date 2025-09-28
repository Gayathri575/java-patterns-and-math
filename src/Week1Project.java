import java.util.Scanner;

public class Week1Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- Math Master Menu ---");
            System.out.println("1. Even or Odd");
            System.out.println("2. Floor & Ceil");
            System.out.println("3. Sum of first n natural numbers");
            System.out.println("4. GCD of two numbers");
            System.out.println("5. LCM of two numbers");
            System.out.println("6. Perfect Number Check");
            System.out.println("7. Factors of a Number");
            System.out.println("8. Decimal to Binary");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    // Even or Odd
                    System.out.print("Enter a number: ");
                    int num1 = sc.nextInt();
                    if(num1 % 2 == 0)
                        System.out.println(num1 + " is Even");
                    else
                        System.out.println(num1 + " is Odd");
                    break;

                case 2:
                    // Floor & Ceil
                    System.out.print("Enter a decimal number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Floor: " + Math.floor(num2));
                    System.out.println("Ceil: " + Math.ceil(num2));
                    break;

                case 3:
                    // Sum of first n natural numbers
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    int sum = n * (n + 1) / 2;
                    System.out.println("Sum = " + sum);
                    break;

                case 4:
                    // GCD
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("GCD = " + gcd(a, b));
                    break;

                case 5:
                    // LCM
                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("LCM = " + lcm(x, y));
                    break;

                case 6:
                    // Perfect Number
                    System.out.print("Enter a number: ");
                    int p = sc.nextInt();
                    if(isPerfect(p))
                        System.out.println(p + " is a Perfect Number");
                    else
                        System.out.println(p + " is NOT a Perfect Number");
                    break;

                case 7:
                    // Factors of a Number
                    System.out.print("Enter a number: ");
                    int f = sc.nextInt();
                    System.out.print("Factors: ");
                    printFactors(f);
                    System.out.println();
                    break;

                case 8:
                    // Decimal to Binary
                    System.out.print("Enter a number: ");
                    int bnum = sc.nextInt();
                    System.out.println("Binary: " + toBinary(bnum));
                    break;

                case 9:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // --- Methods ---

    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) sum += i;
        }
        return sum == num;
    }

    static void printFactors(int num){
        for(int i = 1; i*i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                if(i != num / i) System.out.print(num / i + " ");
            }
        }
    }

    static String toBinary(int num){
        String binary = "";
        while(num > 0){
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}
