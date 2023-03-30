public class Caja {
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho=ancho;
        this.alto=alto;
        this.fondo=fondo;
        this.unidad=unidad;
    }

    public double getVolumen(){
        double result;
        result = ancho*alto*fondo;
        return result;
    }


    public int getAncho(){
        return this.ancho;
    }

    public int getAlto(){
        return this.alto;
    }

    public int getFondo(){
        return this.fondo;
    }

    public void setAncho(int ancho){
        this.ancho=ancho;
    }
    public void setAlto(int alto){
        this.alto=alto;
    }

    public void setFondo(int fondo){
        this.fondo=fondo;
    }

    public void setEtiqueta(String etiqueta){
        this.etiqueta=etiqueta;
    }

    public String toString(){
        String result;
        result = "Ancho: " + this.ancho + " Alto: " + this.alto + " Fondo: " + this.fondo + " Unidad" + this.unidad + " Etiqueta: " + this.etiqueta;
        return result;
    }



}

    
