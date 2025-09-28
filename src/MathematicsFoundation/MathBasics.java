package MathematicsFoundation;
import java.util.*;

public class MathBasics {


        // GCD using Euclidean Algorithm
        static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // LCM using GCD
        static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.println("\n--- Math Programs Menu ---");
                System.out.println("1. Even or Odd");
                System.out.println("2. Floor & Ceil");
                System.out.println("3. Sum of first n natural numbers");
                System.out.println("4. GCD of two numbers");
                System.out.println("5. LCM of two numbers");
                System.out.println("6. Perfect Number Check");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch(choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();
                        if(n % 2 == 0) System.out.println(n + " is Even");
                        else System.out.println(n + " is Odd");
                        break;

                    case 2:
                        System.out.print("Enter a decimal number: ");
                        double num = sc.nextDouble();
                        System.out.println("Floor: " + Math.floor(num));
                        System.out.println("Ceil: " + Math.ceil(num));
                        break;

                    case 3:
                        System.out.print("Enter n: ");
                        int k = sc.nextInt();
                        int sum = k * (k + 1) / 2;
                        System.out.println("Sum of first " + k + " natural numbers = " + sum);
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("GCD = " + gcd(a, b));
                        break;

                    case 5:
                        System.out.print("Enter two numbers: ");
                        int x = sc.nextInt(), y = sc.nextInt();
                        System.out.println("LCM = " + lcm(x, y));
                        break;

                    case 6:
                        System.out.print("Enter a number: ");
                        int num2 = sc.nextInt();
                        int sumDiv = 0;
                        for(int i=1; i<num2; i++) {
                            if(num2 % i == 0) sumDiv += i;
                        }
                        if(sumDiv == num2) System.out.println(num2 + " is a Perfect Number");
                        else System.out.println(num2 + " is NOT a Perfect Number");
                        break;

                    case 7:
                        System.out.println("Exiting... Bye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }


