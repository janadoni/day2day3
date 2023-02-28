package Interface;


abstract class X
{
    int i = 111;

    int methodX()
    {
        return methodX(i);
    }

    abstract int methodX(int i);
}

class Y extends X
{
    @Override
    int methodX(int i)
    {
        return ++i + i++;
    }
}

public class prog15
{
    public static void main(String[] args)
    {
        Y y = new Y();

        System.out.println(y.methodX());
    }
}

