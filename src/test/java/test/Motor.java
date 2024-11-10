package test;

public class Motor {
    String tipo;
    int numeroCilindros;
    int registro;
    static String[] tipopos = {"electrico", "gasolina"};

    void cambiarRegistro(int registro){
        this.registro=registro;
    }


    void asignarTipo(String tipo){
        for (String i : tipopos) {
    if(i.equals(tipo)){
        this.tipo= tipo;
        brak;
    }
}
