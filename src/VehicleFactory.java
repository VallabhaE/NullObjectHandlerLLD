public class VehicleFactory {
    static Vehicle getVehicleObj(String type){
        if("Car".equals(type)){
            return new Car();
        }else if("Bike".equals(type)){
            return new Bike();
        }
        return new NullObject();
    }
}
