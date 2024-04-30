
class car{
    String color;
}
class bike{
    String color;
}
class cycle{
    String color;
}
public class vehicle {
    public static void main(String[] args) {
        car car=new car();//instance for class
        car.color="red";
        System.out.println(car.color);

        bike b= new bike();
        b.color="blue";
        System.out.println(b.color);

        cycle c=new cycle();
        c.color="black";
        System.out.println(c.color);
    }
}
