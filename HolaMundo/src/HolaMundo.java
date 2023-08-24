import tarea.Prueba;

public class HolaMundo {
    public static void main(String[] args) {
        //  Ejemplo de declaracion de variables de tipo primitiva
        int numero = 10;
        boolean cierto = true;
        short numeroShort = 1;
        long numeroLong = 2;

        //  variables referenciadas
        Integer nInteger = 11;
        String saludar = "Hola mundo desde Java con Intellij IDEA";

        //  condicional simple con boolean
        if (cierto) {
            System.out.println("numero = " + numero);

            //  pistas del tema de alcances de variables
            int numero2 = 5;
        }

        //  ejemplo de uso de variables dinamicas, segun el valor
        var valorDinamico = "1500";

        //  SALIDA de la variable
        System.out.println("saludar = " + saludar);
        
        //  SALIDA de la tarea
        Prueba.mostrarNombre("Angel Sebastian Franco Lopez");
    }
}
