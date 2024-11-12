package test;


public class Asiento {
    static String[] coloresPermitidos = {"rojo", "verde", "azul", "amarillo", "negro", "blanco"};
    String color;
    int precio;
    int registro;

    
    void cambiarColor(String color){
        for (String i : coloresPermitidos) {
            if(i.equals(color)){
                this.color= color;
                break;
            }
        }    
    }
}
