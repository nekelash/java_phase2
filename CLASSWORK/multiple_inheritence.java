interface empolyee
{
    void work();
    void activity();
}
interface work
{
    void work();
    void activity();
}
class per implements empolyee,work
{
    public void work()
    {
        System.out.println("Work: empolyee");
    }
    public void activity()
    {
        System.out.println("Activity: working");
    }
}
public class multiple_inheritence {
    public static void main(String[] args) {
        per p = new per();
        p.work();   
        p.activity();
        }

    }
