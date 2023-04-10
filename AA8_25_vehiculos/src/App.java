public class App {
    public static void main(String[] args) throws Exception {

//        Vehiculo v1 = new Vehiculo("A1","A","1"); // Cannot instance the type vehiculo
//        Vehiculo v2 = new Vehiculo();
        Moto v2 = new Moto("Rally");

        v2.setMatricula("A2");
        System.out.println("La matricula es: "+ v2.getMatricula());
        v2.setMarca("A");
        System.out.println("La marca introducida es: "+ v2.getMarca());
        v2.setColor("2");
        System.out.println("El color es:"+ v2.getColor());

    }
}
