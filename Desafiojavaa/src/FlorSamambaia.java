public class FlorSamambaia {

    public static String flor(int raio1, int centroX1, int centroY1, int raio2, int centroX2, int centroY2) {
    	
        int deltaX = centroX1 - centroX1;
        
        int deltaY = centroY2 - centroY1;
        
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        
        if (distancia < (raio1 + raio2)) {
            return "MORTO";
        } else {
            return "RICO";
        }
    }
    public static void main(String[] args) {
    	System.out.println(flor(1, 0, 0, 1, 2, 2));
        System.out.println(flor(5, 7, 0, 5, 6, 0));
        System.out.println(flor(2, 1, 1, 2, 5, 5));
        System.out.println(flor(6, 5, 2, 4, 7, 6));
        System.out.println(flor(2, 9, 7, 6, 8, 3));
        System.out.println(flor(2, 8, 1, 2, 5, 5));
        System.out.println(flor(2, 1, 6, 2, 2, 9));
    }
}
