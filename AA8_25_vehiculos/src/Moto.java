public class Moto extends Vehiculo {
    String caracteristicaEspecial;

    public double numeroRuedas() {
        double d = 2;
        return d;
    }

    public Moto(String a, String b, String c, String caracteristicaEspecial) {
        super(a, b, c);
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

    public Moto(String caracteristicaEspecial) {
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

}
