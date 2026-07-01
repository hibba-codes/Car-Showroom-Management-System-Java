abstract class Car
{
    private String brand;
    private String model;
    private int carID;
    private String color;

    public Car(String brand, String model, int id, String color)
    {
        this.brand = brand;
        this.model = model;
        this.carID = id;
        this.color = color;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return model;
    }
    public void setCarID(int id)
    {
        this.carID = id;
    }
    public int getCarID()
    {
        return carID;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public void showInfo()
    {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car ID : " + carID);
        System.out.println("Car Color : " + color);
    }
    abstract public void calculatePrice();
    abstract public double getPrice();
}
