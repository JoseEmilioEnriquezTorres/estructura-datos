package recursivo;

public class recursividad {

    public int invertirNumero(int n, int numeroAcumulador){
        if (n == 0){
            return numeroAcumulador;
        }

        int ultimoDigito = n % 10;
        int nuevoNumero = numeroAcumulador * 10 + ultimoDigito;

        return invertirNumero(n/10, nuevoNumero);
    }

    public static void main(String[] args) {
        recursividad r = new recursividad();
        System.out.println(r.invertirNumero(4851, 0));
    }


}
