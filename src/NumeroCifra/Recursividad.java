package NumeroCifra;

public class Recursividad {
    public int  numeroCifrasRecu(int numerocifra){
        if (numerocifra<10){
            return 1;
        }
        else {
            int resultado = 1 + numeroCifrasRecu(numerocifra / 10);
            return resultado;
        }
    }

    public int numerCifraIter(int numero){
        int num=0;
        do{
            num++;
            numero/= 10;

        }while (numero!=0);

      return  num;

    }
}
