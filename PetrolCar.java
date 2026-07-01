class PetrolCar extends Car
{
    private double basePrice;
    private double engineCC;
    public PetrolCar(String brand, String model, int id, String color, double basePrice, double engineCC)
    {
        super(brand, model, id, color);
        this.basePrice = basePrice;
        this.engineCC = engineCC;
    }
    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }
    public double getBasePrice()
    {
        return basePrice;
    }
    public void setEngineCC(double engineCC)
    {
        this.engineCC = engineCC;
    }
    public double getEngineCC()
    {
        return engineCC;
    }

    public void calculatePrice()
    {
        double finalPrice = basePrice;
        System.out.println("Base Price of Car is : " + basePrice);
        System.out.println("Engine CC : " + engineCC);
        if(engineCC > 2000)
        {
            System.out.println("Car Type : Luxury Petrol Car");
        }
        else
        {
            System.out.println("Car Type : Standard Petrol Car");
        }
        System.out.println("final Price : " + finalPrice);
    }
    public double getPrice()
    {
        return basePrice;
    }
}
