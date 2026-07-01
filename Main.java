public class Main
{
    public static void main(String[] args)
    {
        double totalValue = 0;
        double highestPrice = 0;
        String expensiveCar = "";
        Car[] cars = new Car[6];
        cars[0] = new PetrolCar("Toyota", "Fortuner Legender", 5473,
                "Black", 19599000, 2755.0);
        cars[1] = new ElectricCar("Tesla", "Model 3", 6389,
                "Gray", 12000000, 75);
        cars[2] = new PetrolCar("Honda", "Civic", 2702,
                "White",  8499000, 1498);
        cars[3] = new ElectricCar("Hyundai", "Ioniq 5", 5223,
                "Blue", 16500000, 72);
        cars[4] = new PetrolCar("Suzuki", "Cultus", 5193,
                "White", 4591460, 1000);
        cars[5] = new ElectricCar("Kia", "EV6", 4493,
                "Red", 18500000, 77);

        System.out.println("\n==========Car Showroom Management System==========\n");
        for(int i = 0; i < cars.length; i ++) {
            cars[i].showInfo();
            cars[i].calculatePrice();
            totalValue += cars[i].getPrice();
            if(cars[i].getPrice() > highestPrice)
            {
                highestPrice = cars[i].getPrice();
                expensiveCar = cars[i].getBrand() + " " + cars[i].getModel();
            }
            System.out.println("===========================================");
        }
        System.out.println("Total Showroom Inventory Value : " + totalValue);
        System.out.println("===========================================");
        System.out.println("Most Expensive Car : " + expensiveCar);
        System.out.println("Car Price : " + highestPrice);
        System.out.println("===========================================");
    }
}
