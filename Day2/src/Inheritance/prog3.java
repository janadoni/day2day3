package Inheritance;
class A
{
    int i = 10;
}

class B extends A
{
    int i = 20;
}

public class prog3

{
    public static void main(String[] args)
    {
        A a = new B();

        System.out.println(a.i);
    }

