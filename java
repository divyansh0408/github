interface K
{
    void reset();
}
interface O
{
    void burn();
}
class ABC implements K
{
    public void reset()
    {
        System.out.println("This is interface K");
    }
    void burn ()
    {
        System.out.println("This is interface O");
    }
    public static void main(String ar[])
    {
        ABC a1=new ABC();
        a1.reset();
        a1.burn();
    }
}
