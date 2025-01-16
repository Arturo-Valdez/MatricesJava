public class Matrices {
    public static void main(String[] args) {
        //Definimos una matriz
        int[][] matriz = new int[3][3];

        //Matriz con var
        //var matriz = new int[2][3];

        //Modificar valores de matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;

        //Imprimir Matriz
        for(var i = 0; i<matriz.length; i++){
            for (var j = 0; j<matriz[i].length;j++){
                System.out.println("Valor [" + i + "]["+ j +"] = " + matriz[i][j]);
            }
            //Salto de linea
            System.out.println();
        }
    }
}
