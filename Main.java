
public class Main {
    public static void main(String[] args) {
        // Example usage of the Interface and Implementation classes
        Car car = new Car(2008,75000,400.0,150.0,25500,2000.0,"Clean","Honda","None");
        Interface obj = new Implementation();
//another little test here, currently figuring things out
//checkin to see how quick it updates the actual file
        System.out.println("Car Details:\n " + car);
        System.out.println("Market Value: " + obj.marketValue(car));
        System.out.println("Repair Cost: " + obj.repairCost(car));
        System.out.println("Title Factor: " + obj.titleFactor(car));
        System.out.println("Max Bid: " + obj.maxBid(car)+"\n");
    }
    
}
