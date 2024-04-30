class calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(int a,float b,int c){
        return a+b+c;
    }
    float add(float a,float b){
        return a+b;
    }
}
public class overloading {
    public static void main(String[] args) {
        calculator obj=new calculator();
        System.out.println(obj.add(6, 9));
        System.out.println(obj.add(10, 5, 3));
        System.out.println(obj.add(2, 2.6f, 6));
        System.out.println(obj.add(2.1f, 5.3f));


    }
}
