class ElectricCar extends Car
{
    private double basePrice;
    private double batteryCapacity;
    public ElectricCar(String brand, String model, int id, String color, double basePrice, double batteryCapacity)
    {
        super(brand , model, id, color);
        this.basePrice = basePrice;
        this.batteryCapacity = batteryCapacity;
    }
    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }
    public double getBasePrice()
    {
        return basePrice;
    }
    public void setBatteryCapacity(double batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }
    public double getBatteryCapacity()
    {
        return batteryCapacity;
    }
    public void calculatePrice()
    {
        double finalPrice = basePrice + (batteryCapacity * 2000);
        System.out.println("Base Price of Car is : " + basePrice);
        System.out.println("Battery Capacity Of Car : " + batteryCapacity + " kWh");
        if(batteryCapacity >= 80)
        {
            System.out.println("Car Capacity : Long Range EV");
        }
        else
        {
            System.out.println("Car Capacity : City EV");
        }
        System.out.println("Final Price : " + finalPrice);
    }
    public double getPrice()
    {
        return basePrice + (batteryCapacity * 2000);
    }
}
