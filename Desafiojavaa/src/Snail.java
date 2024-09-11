import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static List<Integer> snail(int[][] matrix) {
        List<Integer> resultado = new ArrayList<>();
        if (matrix.length == 0) {
            return resultado;
        }

        int topo = 0, baixo = matrix.length - 1;
        int esquerda = 0, direita = matrix[0].length - 1;

        while (topo <= baixo && esquerda <= direita) {
            for (int i = esquerda; i <= direita; i++) {
                resultado.add(matrix[topo][i]);
            }
            topo++;
            for (int i = topo; i <= baixo; i++) {
                resultado.add(matrix[i][direita]);
            }
            direita--;

            if (topo <= baixo) {
                for (int i = direita; i >= esquerda; i--) {
                    resultado.add(matrix[baixo][i]);
                }
                baixo--;
            }

            if (esquerda <= direita) {
                for (int i = baixo; i >= topo; i--) {
                    resultado.add(matrix[i][esquerda]);
                }
                esquerda++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 10, 12},
            {6, 7, 33}
        };
        
        int[][] matrix3 = {
        		{60, 4, 3},
        		{42, 10, 12},
        		{61, 7, 33}
        };
        
        int[][] matrix4 = {
        		{4, 4, 3},
        		{2, 10, 12},
        		{3, 5, 353}
        };

        System.out.println(snail(matrix1));
        System.out.println(snail(matrix2));
        System.out.println(snail(matrix3));
        System.out.println(snail(matrix4));
    }
}
