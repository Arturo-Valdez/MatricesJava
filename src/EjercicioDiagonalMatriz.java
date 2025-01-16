public class EjercicioDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma Diagonal Matriz ***");

        //Generamos la matriz
        int[][] matriz = new int[3][3];

        //Ingrsamos valores a Matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;

        int sumaDiagonal = 0;
        for (var i = 0; i<matriz.length; i++){
            for (var j = 0; j<matriz[i].length; j++){
                System.out.println("Valor [" + i + "][" + j + "] = " + matriz[i][j]);
                if(i == j){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println("Suma de diagonal = " + sumaDiagonal);
    }
}
