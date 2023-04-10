public abstract class Vehiculo {
    String matricula;
    String marca;
    String color;

    Vehiculo(String a, String b, String c){
        this.matricula=a;
        this.marca=b;
        this.color=c;
    }

    Vehiculo(){
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public void setMatricula(String a){
        this.matricula=a;
    }

    public void setMarca(String a){
        this.marca=a;
    }

    public void setColor(String a){
        this.color=a;
    }

    public abstract double numeroRuedas();

    
}
