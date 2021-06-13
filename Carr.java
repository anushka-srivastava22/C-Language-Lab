class Carr extends Vehicles//Inheritance
{
    private double mileage;
    private String color;
    public void get(double m , String c , double p)//Polymorphism
    {
        mileage = m;
        color = c;
        price = p;
    }
    public void cost()
    {
        System.out.println("Cost is "+price+" lakhs");
    }
    public void putinfo()
    {
        System.out.println("Mileage = "+mileage);
        System.out.println("Color = "+color);
    }
    public static void main(String args[])
    {
        Carr ob = new Carr();
        ob.get("Xcent","Petrol");
        ob.get(7,"Red",20);
        ob.put();
        ob.putinfo();
        ob.cost();
    }
}
    