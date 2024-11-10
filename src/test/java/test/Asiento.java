package test;

public class Asiento {
    static String[] colors = {"rojo", "verde", "azul", "amarillo", "negro", "blanco"};
    String color;
    int precio;
    int registro;

    void cambiarColor(String color){
        if ("rojo".equals(color) || "verde".equals(color) || 
            "amarillo".equals(color) || "negro".equals(color) || 
            "blanco".equals(color)) {
            
            this.color = color;
        }    
    }
}
