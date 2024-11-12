package test;

public class Auto {
    String modelo;
    int precio;
    Asiento []asientos;
    Motor motor ;
    String marca;
    int registro;
    static int cantidadCreados;

    
    int cantidadAsientos(){
        int numeroAsientos= 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                numeroAsientos++;
            }
        } 
        return numeroAsientos;

    }

    String verificarIntegridad(){
        int registroAuto = this.registro;
        for (Asiento asiento : this.asientos) {
            if(asiento != null){
                if (asiento.registro != registroAuto) {
                    return "Las piezas no son originales";
                }
            }
        }
        if (this.motor.registro != registroAuto) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }

}
