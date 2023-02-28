package Interface;

interface I
{
    class C implements I
    {
        public void methodI(int i)
        {            System.out.println(i);        }
    }

    void methodI(int i);
}
