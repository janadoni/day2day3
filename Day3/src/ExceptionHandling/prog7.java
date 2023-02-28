package ExceptionHandling;


class SubException extends Exception { }
class SubSubException extends SubException { }
public class JH
{
    public void doStuff() throws SubException {}
}
class JH2 extends JH
{
    public  void doStuff() throws SubSubException {}
}
class JH3 extends JH
{
    public  void doStuff() throws Exception {}
}
class JH4 extends JH
{
    public  void doStuff(int x) throws Exception {}
}
class JH5 extends JH
{
    public  void doStuff()  {}
}



