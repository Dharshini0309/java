public class construct {
    
    int rollno;
    String name;
    int age;

    construct(int r,String n)
    {
        rollno=r;
        name=n;
    }
    construct(int r,String n,int a)
    {
        rollno=r;
        name=n;
        age = a;
    }

    public static void main(String[] args) {
        construct c=new construct(1,"dharsh");
        construct c1=new construct(2,"madhu",21);

        System.out.println("rollno:"+c.rollno+"Name :"+c.name);
        System.out.println("rollno:"+c1.rollno+"  name :  "+c1.name+"  age : "+c1.age);
    }
}
