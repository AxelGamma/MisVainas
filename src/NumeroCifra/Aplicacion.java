package NumeroCifra;

public class Aplicacion {
    public static void main(String[]args){
        System.out.println("El numero tiene:");

        //Metiendo numeros en el metodo Recursivo
        System.out.println(new Recursividad().numeroCifrasRecu(1234));
        //Metiendo numeros en el metodo Iterativo
        System.out.println(new Recursividad().numerCifraIter(1234));
    }
}
