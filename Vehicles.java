abstract class Vehicles
{
    private String name;
    private String fuel;
    public double price;
    public void get(String n , String f)
    {
        name = n;
        fuel = f;
    }
    public abstract void cost();//Data Abstraction
    public void put()
    {
        System.out.println("Name = "+name);
        System.out.println("Fuel = "+fuel);
    }
}