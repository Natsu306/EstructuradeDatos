package sample.Estructuras;

public class Busqueda {
    public int secuencial(String[][] array, String dato1, String dato2) {
        int indice = -1;
        for (int x = 0; x < array.length; x++) {
            if (array[x][1].equals(dato1) && array[x][2].equals(dato2)) {
                indice = x;
                return indice;
            }
        }
        return indice;
    }

    public static int[] burbuja(int[] arreglo) {
        int auxiliar;
        int[] arregloOrdenado;
        for (int i = 2; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }

    public String[][] burbujaArray(String[][] arreglo) {
        String auxiliar;//respladar nombre del platillo
        String auxiliar1;//respaldar el precio
        String[][] arregloOrdenado;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (Integer.parseInt(arreglo[j][1]) > Integer.parseInt(arreglo[j + 1][1])) {
                    auxiliar = arreglo[j][0];
                    auxiliar1 = arreglo[j][1];
                    arreglo[j][0] = arreglo[j + 1][0];
                    arreglo[j][1] = arreglo[j + 1][1];
                    arreglo[j + 1][0] = auxiliar;
                    arreglo[j + 1][1] = auxiliar1;
                }
            }
        }

        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    public void mostrarArreglo(int[]arreglo){
        int j;
        for (j=0;j<arreglo.length;j++){
            System.out.println(" [ " + arreglo[j] + " ] ");
        }
        System.out.println();
    }

    public String[][] burbujaAlfa(String[][] arreglo) {
        String auxiliar;
        String auxiliar2;
        String[][] arregloOrdenado;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j][0].compareTo(arreglo[j + 1][0]) > 0) {
                    auxiliar = arreglo[j][0];
                    auxiliar2 = arreglo[j][1];
                    arreglo[j][0] = arreglo[j + 1][0];
                    arreglo[j][1] = arreglo[j + 1][1];
                    arreglo[j + 1][0] = auxiliar;
                    arreglo[j + 1][1] = auxiliar2;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    public void bBinaria(int[] arreglo, int elemneto){
        int centro,primero,ultimo,valorCentro;
        primero=0;
        ultimo=arreglo.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo)/2;
            valorCentro=arreglo[centro];

        }
    }
}