package Interface;

abstract class A
{
    {
        methodA();
    }

    abstract void methodA();
}

class B extends A
{
    @Override
    void methodA()
    {
        System.out.println("methodA");
    }
}

public class prog16
{
    public static void main(String[] args)
    {
        new B();
    }
}
