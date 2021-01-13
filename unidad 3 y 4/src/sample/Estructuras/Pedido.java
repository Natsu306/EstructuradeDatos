package sample.Estructuras;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {
    SimpleStringProperty bebida;
    SimpleStringProperty cantidadbebida;
    SimpleStringProperty platillo;
    SimpleStringProperty cantidadplatillo;

    public Pedido(String Bebida, String cantB, String Platillo, String cantP){
        this.bebida=new SimpleStringProperty(Bebida);
        this.cantidadbebida=new SimpleStringProperty(cantB);
        this.platillo=new SimpleStringProperty(Platillo);
        this.cantidadplatillo=new SimpleStringProperty(cantP);


    }
    public String getBebida() {
        return bebida.get();
    }

    public SimpleStringProperty bebidaProperty() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida.set(bebida);
    }

    public String getCantidadbebida() {
        return cantidadbebida.get();
    }

    public SimpleStringProperty cantidadbebidaProperty() {
        return cantidadbebida;
    }

    public void setCantidadbebida(String cantidadbebida) {
        this.cantidadbebida.set(cantidadbebida);
    }

    public String getPlatillo() {
        return platillo.get();
    }

    public SimpleStringProperty platilloProperty() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo.set(platillo);
    }

    public String getCantidadplatillo() {
        return cantidadplatillo.get();
    }

    public SimpleStringProperty cantidadplatilloProperty() {
        return cantidadplatillo;
    }

    public void setCantidadplatillo(String cantidadplatillo) {
        this.cantidadplatillo.set(cantidadplatillo);
    }


}
