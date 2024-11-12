 class name{
 public void sayHello(){
 System.out.println("Hello from parent");
 }
}
class child extends name
{
    @Override
    public void sayHello(){
        System.out.println("Hello from child");
}
}
class Main{
    public static void main(String[]args)
    {
        name p = new child();
        p.sayHello();
    }

}

