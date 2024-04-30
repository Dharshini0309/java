import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int number; //declare

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number :");
        number= scan.nextInt();
        System.out.println("The number is :" +number);
        scan.nextLine();
        System.out.println("Enter a name :");
        String name= scan.nextLine();
        System.out.println("Enter the character");
        char ch = scan.nextLine().charAt(0);

        System.out.println("The number is "+ number);
        System.out.println("The name is "+ name);
        System.out.println("The character is "+ ch);
        scan.close();


    }
}
