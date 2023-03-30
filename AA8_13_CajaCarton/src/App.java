import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        Caja c = new Caja(10,10,20,Unidad.cm);
        System.out.println("Introducir valor de etiqueta:");
        s=sc.nextLine();
        c.etiqueta=s;
        System.out.println(c);
        CajaCarton cc = new CajaCarton(10,10,20,Unidad.cm,4);
        System.out.println("La superficie total es "+cc.superficieTotal());
        
    }
}
