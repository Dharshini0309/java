import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();

        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        double num1 = scan.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scan.nextDouble();

        System.out.print("Number 3: ");
        double num3 = scan.nextDouble();

        double greatestNumber = findGreatestNumber(num1, num2, num3);

        System.out.println("The greatest number is: " + greatestNumber);
    }


    public static double findGreatestNumber(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
