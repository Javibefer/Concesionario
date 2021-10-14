package test;

import dao.VehiclesDao;
import domain.Fecha;
import domain.Vehicle;
import java.util.Scanner;
import service.ConcesionarioService;
import service.IConcesionarioService;

public class Prueba {
    public static void main(String[] args) {
        
        var opcion = -1;
        var scanner = new Scanner(System.in);
        IConcesionarioService concesionario = new ConcesionarioService();
        
        while(opcion != 0){
            System.out.println("Elige una opcion: \n"
                + "1. Listar\n"
                + "2. Consultar\n"
                + "3. Venta\n"
                + "4. Ventas\n"
                + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    concesionario.vehicleList();
                    break;
                case 2:
                    System.out.println("Introduce el id del vehiculo");
                    var idVehicle = Integer.parseInt(scanner.nextLine());
                    concesionario.query(idVehicle);
                    break;
                case 3:
                    System.out.println("Introduce el id del vehiculo");
                    var idVehicle2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce el nombre del comprador");
                    var comprador = scanner.nextLine();
                    System.out.println("Introduce el dia de la venta");
                    var dia = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce el mes de la venta");
                    var mes = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce el año de la venta");
                    var año = Integer.parseInt(scanner.nextLine());
                    Fecha fecha = new Fecha(dia, mes, año);
                    concesionario.vender(idVehicle2, comprador, fecha);
                    break;
                case 4:
                    System.out.println("Introduce el id de la venta");
                    var peticion = scanner.nextLine();
                    if(peticion != ""){
                        int idSale = Integer.parseInt(peticion);
                        concesionario.ventas(idSale);
                    }
                    else{
                        System.out.println("Introduce el año de la venta");
                        var peticion2 = scanner.nextLine();
                        if(peticion2 != ""){
                            int year = Integer.parseInt(peticion2);
                            concesionario.ventasYears(year);
                        }
                        else{
                            System.out.println("Listando todas las ventas registradas");
                            concesionario.ventas();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}
