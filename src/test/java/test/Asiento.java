package test;

public class Asiento {
    static String[] colors = {"rojo", "verde", "azul", "amarillo", "negro", "blanco"};
    String color;
    int precio;
    int registro;

    void cambiarColor(String color){
        for (String i : colors) {
            if(i.equals(color)){
                this.color= color;
                break;
            }
            this.color = color;
        }    
    }
}
