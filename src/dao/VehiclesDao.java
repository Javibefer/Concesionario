package dao;

import domain.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehiclesDao {
    
    private List<Vehicle> vehicles;

    public VehiclesDao() {
        this.vehicles = new ArrayList<>();
    }
    
    public void agregateVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    
    public void deleteVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    
    public void printVehicles(){
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
    }
    
    public void printVehicle(int idVehicle){
        for(Vehicle vehicle: vehicles){
            if(vehicle.getIdVehicle() == idVehicle){
                System.out.println(vehicle);
            }
        }
    }
    
    public List<Vehicle> getVehicles(){
        return this.vehicles;
    }
}
