class methodsample{
    int rollno;
    String name;
    int age;

    void insertData (int r,String n,int a)
    {
        rollno = r;
        name = n;
        age = a;
    }
    void display(){
        System.out.println("rollno"+rollno);
        System.out.println("name"+name);
        System.out.println("age"+age);

    }
}
public class method1 {
    public static void main(String[] args) {
        methodsample m=new methodsample();
        // m.rollno=1;
        // m.name="dharsh";
        // m.age=22;
      m.insertData(1, "dharsh", 22);
        m.display();

        

    }
}
