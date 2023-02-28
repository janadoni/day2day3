package Interface;

interface X
{
    void methodX();}
interface Y extends X
{
    void methodY();}
class Z implements Y
{
    public void methodY()
    {        System.out.println("Method Y");    }
}



