package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
public class Controller {
    @FXML TextField txtAreglo1, txtAreglo2;
    @FXML ListView  lista1,lista2;
    int [] arreglo1=new int[5];
    int cont=0;
    public void procesar1 (ActionEvent event){
    int dato = Integer.parseInt(txtAreglo1.getText());
    arreglo1[cont] = dato;
    cont++;
    txtAreglo1.setText("");
    }
    public void procesar2 (ActionEvent event){

    }
}


