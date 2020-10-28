public class asdsad {

    public  static void main (String[]args){
        int[][] arreglo={
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}};
        boolean magico = true;
        int x = 0;
        int suma =0;
        int suma1=0;
        for(int a= 0; a < arreglo.length; a++){
        suma=0;
        suma1=0;
        for(int c=0; c<arreglo.length; c++) {
            suma = suma + arreglo [a][c];
            suma1=suma1+ arreglo[a][c];
        }
        if (a==0) {
            x = suma;
        }
            if (x != suma) {
                magico = false;
            }
            if (x != suma1) {
                magico = false;
            }
        }
        int di1=0;
        for (int a =0; a<arreglo.length; a++){
            di1=di1+arreglo[a][a];
        }
        int y2 = 1;
        int d2=0;
        for(int a=0; a< arreglo.length;a++){
            d2=d2+arreglo[a][arreglo.length-y2];
            y2++;
        }
        if(d2!=di1 || d2!=x){
            magico=false;
        }
        if (magico==true){
            System.out.println("Es un cuadro magico");
            System.out.println("El numero magio es de:" +x);
        }else{
            System.out.println("No es un cuadro magico");
        }
    }
}