import java.util.Scanner;

public class ai2ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();
        
        String nombreMes;
        
        if (mes == 1) {
            nombreMes = "Enero";
        } else if (mes == 2) {
            nombreMes = "Febrero";
        } else if (mes == 3) {
            nombreMes = "Marzo";
        } else if (mes == 4) {
            nombreMes = "Abril";
        } else if (mes == 5) {
            nombreMes = "Mayo";
        } else if (mes == 6) {
            nombreMes = "Junio";
        } else if (mes == 7) {
            nombreMes = "Julio";
        } else if (mes == 8) {
            nombreMes = "Agosto";
        } else if (mes == 9) {
            nombreMes = "Septiembre";
        } else if (mes == 10) {
            nombreMes = "Octubre";
        } else if (mes == 11) {
            nombreMes = "Noviembre";
        } else if (mes == 12) {
            nombreMes = "Diciembre";
        } else {
            nombreMes = "Número de mes no válido";
        }
        
        System.out.println("El mes es: " + nombreMes);
        
        scanner.close();
    }
}
