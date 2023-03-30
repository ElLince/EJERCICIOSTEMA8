public class HoraExacta extends Hora {
    protected int segundos;
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundos(segundo)) {
            System.out.println("Segundos incorrectos");
        }
    }

    public boolean equals(Object o){
        HoraExacta otroReloj = (HoraExacta) o;
        boolean iguales;
        if (this.hora == otroReloj.hora 
            && this.minutos == otroReloj.minutos
            && this.segundos == otroReloj.segundos){
            iguales = true;
            }else{
            iguales = false;
        }
        return iguales;
    }

    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            correcto = true;
        }
            return correcto;
    }   

    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }
    public String toString(){
        String result = super.toString();
        result += ":" + segundos;
        return result;
    }

}
