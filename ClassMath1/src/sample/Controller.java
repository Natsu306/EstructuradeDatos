package sample;

import Calculos.Calculos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtAreglo1, txtAreglo2;
    @FXML
    ListView lista1, lista2;
    double[] arreglo1 = new double[5];
    double[][] arreglo2 = new double[2][4];
    int cont = 0;
    int con2 = 0;
    int con3 = 0;

    public void insertar1(ActionEvent event) {
        if (cont < 5) {
            double dato =Double.parseDouble(txtAreglo1.getText());
            arreglo1[cont] = dato;
            cont++;
            txtAreglo1.setText("");
            im(arreglo1);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreeglo lleno");
            alert.show();
        }
    }

    public void insertar2(ActionEvent event) {
        if (con2 < 2) {
            double dato = Double.parseDouble(txtAreglo2.getText());
            arreglo2[con2][con3] = dato;
            con3++;
            if(con3 == 4 ){
                con3=0;
                con2++;
            }
            txtAreglo2.setText("");
            im1(arreglo2);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreeglo lleno");
            alert.show();
        }
    }

    public void procesar1(ActionEvent event) {
        Calculos calculos=new Calculos(arreglo1,arreglo2);
        double[] res = calculos.procesarCoseno();
        for (double dato:res){
            lista1.getItems().add(dato+"");
        }
    }

    public void procesar2(ActionEvent event) {
        Calculos calculos=new Calculos(arreglo1,arreglo2);
        double [][] res = calculos.procesarSeno();
        for (int x=0;x<res.length; x++) {
            String columna ="";
            for (int y = 0; y < res[x].length;y++) {
                columna= columna+res[x][y]+",";
            }
            lista2.getItems().add(columna);
            }
        }

    public void im(double[] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + ",");
        }
        System.out.println("");
    }

    public void im1(double[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length;y++) {
                System.out.print(arr[x][y] + ",");
            }
            System.out.println("");
        }
    }
}
