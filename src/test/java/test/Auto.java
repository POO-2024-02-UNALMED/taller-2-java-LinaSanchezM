package test;

public class Auto {
    String modelo;
    int precio;
    Asiento []asientos;
    Motor motor ;
    String marca;
    int registro;
    static int cantidadCreados;



    int cantidadAsientos(int Asiento){
        int contadorasientos = 0;
        for (Asiento i : this.asientos) {
            if (i instanceof Asiento) {
                contadorasientos++;
            }
        }
        return contadorasientos;
    }



    String verificarIntegridad(String motor){
        for (Asiento i : this.asientos) {
            if (i instanceof Asiento) {
                    if (i.registro != this.motor.registro) {
                       return "Las piezas no son originales";
            }else if(i.registro != this.registro) {
                       return "Las piezas no son originales";
            }else if(i.registro != this.motor.registro) {
                       return "Las piezas no son originales";
            } 
       }
    }
    return "Auto original";
}
}