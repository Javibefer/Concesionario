package domain;

import java.util.Date;

public class Sale {
    private final int idSale;
    private String comprador;
    private Fecha fecha;
    private static int saleCount;
    private Vehicle vehicle;

    public Sale() {
        this.idSale = ++Sale.saleCount;
    }

    public Sale(String comprador, Fecha fecha, Vehicle vehicle) {
        this();
        this.comprador = comprador;
        this.fecha = fecha;
        this.vehicle = vehicle;
    }

    public String getComprador() {
        return this.comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public static int getSaleCount() {
        return Sale.saleCount;
    }

    public static void setSaleCount(int saleCount) {
        Sale.saleCount = saleCount;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public int getIdSale(Sale sale){
        return this.idSale;
    }

    @Override
    public String toString() {
        return "Sale{" + "idSale=" + idSale + ", comprador=" + comprador + ", fecha=" + fecha + ", vehicle=" + vehicle + '}';
    }
    
}
