    import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lengths of the sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scan.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scan.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scan.nextDouble();
        scan.close();

        if (isValidTriangle(side1, side2, side3)) {
            if (isEquilateral(side1, side2, side3)) {
                System.out.println("It's an equilateral triangle.");
            } else if (isIsosceles(side1, side2, side3)) {
                System.out.println("It's an isosceles triangle.");
            } else {
                System.out.println("It's a scalene triangle.");
            }
        } else {
            System.out.println("Invalid triangle. The sum of the lengths of any two sides must be greater than the length of the remaining side.");
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static boolean isEquilateral(double side1, double side2, double side3) {
        return side1 == side2 && side2 == side3;
    }

    public static boolean isIsosceles(double side1, double side2, double side3) {
        return (side1 == side2 && side2 != side3) || (side1 == side3 && side1 != side2) || (side2 == side3 && side2 != side1);
    }
    
}



