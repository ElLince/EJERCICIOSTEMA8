import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        Caja c = new Caja(1,2,3,Unidad.cm);
        System.out.println("Introducir valor de etiqueta:");
        s=sc.nextLine();
        c.etiqueta=s;
        System.out.println(c);
    }
}
