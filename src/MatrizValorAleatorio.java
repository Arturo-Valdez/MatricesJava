import java.util.Random;


public class MatrizValorAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("*** Matriz con valores aleatorios ***");

        //Generar Matriz
        int[][] numeros = new int[6][4];

        //Agregar valores a matriz aleatoriamente
        for (var i = 0; i < numeros.length; i ++){
            for (var j = 0; j<numeros[i].length; j++){{
                numeros[i][j] = random.nextInt(100)+1;
            }}
        }

        //Imprimir valores de la matriz
        for (var i = 0; i < numeros.length; i ++){
            for (var j = 0; j<numeros[i].length; j++){
                    System.out.println("Valor [" + i + "][" + j + "] = " + numeros[i][j]);
                }
            System.out.println();
        }
    }
}
