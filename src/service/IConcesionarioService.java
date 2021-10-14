package service;

import domain.Fecha;
import domain.Vehicle;
import java.util.List;

public interface IConcesionarioService {
    
    public void vehicleList();
    
    public void query(int idVehicle);
    
    public void vender(int idVehicle, String comprador, Fecha fecha);
    
    public void ventas(int idSale);
    
    public void ventasYears(int year);
    
    public void ventas();
}
