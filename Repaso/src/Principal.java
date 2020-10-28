public class Principal {

    public  static void main (String[]args){
        int[][] arreglo={
                {1,3,5},
                {2,3,1},
                {8,7,6}
        };
        String[] array2=new String [10];
        int suma=0;
        for(int x=0;x<arreglo.length;x++){
            for(int y=0;y<arreglo[x].length;y++);
            suma=suma+arreglo[x][x];
        }
        System.out.println(suma);
    }
}
