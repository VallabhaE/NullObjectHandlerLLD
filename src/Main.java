
public class  Main {
    public static void main(String[] args) {
        Vehicle client = VehicleFactory.getVehicleObj("cat");
        PrintVehicleDetails(client);

    }

    static void PrintVehicleDetails(Vehicle client){
        System.out.println("Vehicle Tank: "+client.FuelCapasity());
        System.out.println("Vehicle Capasity: "+client.SittingCapasity());
    }
}

