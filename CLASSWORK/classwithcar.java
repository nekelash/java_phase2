interface car
{
    void start();
    void stop();
}
interface tata extends car
{
    void start();
    void stop();
}
interface nano extends tata
{
    void start();
    void stop();
}
interface deisel extends nano
{
    void start();
    void stop();
}
interface petrol extends nano
{
    void start();
    void stop();
}
interface electric extends nano
{
    void start();
    void stop();
}
class owner implements deisel,petrol,electric
{
    public void start()
    {
        System.out.println("Car started");
    }
    public void stop()
    {
        System.out.println("Car stopped");
    }
}
public class classwithcar {
    public static void main(String[] args) {
        owner o = new owner();
        o.start();
        o.stop();
    }
}