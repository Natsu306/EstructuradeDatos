package Pez;

public class Pez {
    String Tipo_pez ;
    int por_nacimiento;

    public Pez(String tipo_pez, int por_nacimiento) {
        this.Tipo_pez = tipo_pez;
        this.por_nacimiento = por_nacimiento;
    }
    public double peces_al_anio() {
        double nacidos = this.por_nacimiento;
        double muertos=0, esta_vivo=0;
        muertos = nacidos * 0.1;
        esta_vivo = nacidos-muertos;
        nacidos = esta_vivo;
        return nacidos;

    }

    public String getTipo_pez() {
        return Tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        this.Tipo_pez = tipo_pez;
    }

    public int getPor_nacimiento() {
        return por_nacimiento;
    }

    public void setPor_nacimiento(int por_nacimiento) {
        this.por_nacimiento = por_nacimiento;
    }


}
