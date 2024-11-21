



public class MaxyMin {
    public static void main(String[] args) {
        int[] arry = {89, -90, 65, 880, 11, 897}; // Array definit
        
        int max = arry[0];
        int min = arry[0];
        
        for (int valor : arry) { // Iteració sobre els elements de l'array
            if (valor > max) max = valor;
            if (valor < min) min = valor;
        }
        
        System.out.println("Màx: " + max);
        System.out.println("Mín: " + min);
    }
}














