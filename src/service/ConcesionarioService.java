package service;

import dao.*;
import domain.*;
import java.time.*;
import java.util.*;

public class ConcesionarioService implements IConcesionarioService{
    
    private final VehiclesDao vehiclesDao;
    private final SalesDao salesDao;

    public ConcesionarioService() {
        this.vehiclesDao = new VehiclesDao<>();
        this.salesDao = new SalesDao<>();
        Vehicle vehicle1 = new Vehicle("Coche", "Peugeot", 2020, 10000);
        Vehicle vehicle2 = new Vehicle("Moto", "Honda", 2019, 5100);
        Vehicle vehicle3 = new Vehicle("Limusina", "Audi", 2021, 60000.87);
        Vehicle vehicle4 = new Vehicle("Bus", "Toyota", 2015, 50550.43);
        
        this.vehiclesDao.agregateVehicle(vehicle1);
        this.vehiclesDao.agregateVehicle(vehicle2);
        this.vehiclesDao.agregateVehicle(vehicle3);
        this.vehiclesDao.agregateVehicle(vehicle4);
    }
    
    @Override
    public void vehicleList() {
        this.vehiclesDao.printVehicles();
    }

    @Override
    public void query(int idVehicle) {
        this.vehiclesDao.printVehicle(idVehicle);
    }

    @Override
    public void vender(int idVehicle, String comprador, Fecha fecha) {
        var deletedVehicle = new Vehicle();
        for(Vehicle vehicle: this.vehiclesDao.getVehicles()){
            if(vehicle.getIdVehicle() == idVehicle){
                this.salesDao.agregateSale(new Sale(comprador, fecha, vehicle));
                deletedVehicle = vehicle;
            }
        }
        this.vehiclesDao.deleteVehicle(deletedVehicle);
    }

    @Override
    public void ventas(int idSale) {
        for(Sale sale: this.salesDao.sales){
            if(sale.getIdSale(sale) == idSale){
                this.salesDao.printSale(sale);
            }
        }
    }

    @Override
    public void ventasYears(int year) {
        for(Sale sale: this.salesDao.sales){
            if(sale.getFecha().año == year){
                this.salesDao.printSale(sale);
            }
        }
        
    }

    @Override
    public void ventas() {
        this.salesDao.printSales();
    }
    
}
