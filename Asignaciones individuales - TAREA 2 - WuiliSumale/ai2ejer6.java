import java.util.Scanner;

public class ai2ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el ano: ");
        int anio = scanner.nextInt();
        
        boolean esBisiesto;
        
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }
        
        if (esBisiesto) {
            System.out.println("El ano " + anio + " es bisiesto.");
        } else {
            System.out.println("El ano " + anio + " no es bisiesto.");
        }
        
        scanner.close();
    }
}
