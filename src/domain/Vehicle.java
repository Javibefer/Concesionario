package domain;

public class Vehicle {
    
    private final int idVehicle;
    private String type;
    private String marca;
    private int modelo;
    private double price;
    private static int vehicleCount;

    public Vehicle() {
        this.idVehicle = ++Vehicle.vehicleCount;
    }

    public Vehicle(String type, String marca, int modelo, double price) {
        this();
        this.type = type;
        this.marca = marca;
        this.modelo = modelo;
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getVehicleCount() {
        return Vehicle.vehicleCount;
    }

    public static void setVehicleCount(int vehicleCount) {
        Vehicle.vehicleCount = vehicleCount;
    }
    
    public int getIdVehicle() {
        return this.idVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "idVehicle=" + idVehicle + ", type=" + type + ", marca=" + marca + ", modelo=" + modelo + ", price=" + price + '}';
    }
    
}
