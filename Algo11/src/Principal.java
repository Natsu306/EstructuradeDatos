public class Principal {
    public static void main(String[] args) {
        int base = 10;
        int exponente = -2;
        System.out.println(pp(base, exponente));
    }
    public static double pp(int base, int exponente) {
        if (exponente == 0) { //caso base
            return 1; //10^0 = 1
        } else if (exponente == 1) { //caso base
            return base; //10^1 = 10
        } else if (exponente < 0) { //Exponente negativo
            return pp(base, exponente + 1) / base;
        } else {  //Exponente positivo
            return base * pp(base, exponente - 1);
        }
    }
    }
