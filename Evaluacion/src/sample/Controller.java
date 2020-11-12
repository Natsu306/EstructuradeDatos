package sample;

import Pez.Pez;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField Txtarreglo1;
    @FXML ComboBox Comoboarreglo2;
    @FXML ListView lista;
    @FXML public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Trucha", "Carpa", "Lucioperca", "Bagre");
        Comoboarreglo2.setItems(list);
    }

    Pez[] arreglo = new Pez[5];
    int cont=0;
    public void insertar (ActionEvent event){
        if(cont<5) {
            try {
                String dato1 = Comoboarreglo2.getValue().toString();
                int dato2 = Integer.parseInt(Txtarreglo1.getText());
                if(dato2>0 || dato1== null){
                    arreglo[cont] = new Pez(dato1,dato2);
                    cont++;
                    Txtarreglo1.setText("");
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("Valor no valido");
                    alert.show();
                }

            }catch (Exception error){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Inserte un valor valido");
                alert.show();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Aviso");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }
    }
    public void procesar (ActionEvent event){
        for (int x=0;x<cont;x++){
            lista.getItems().add("Pescado " + arreglo[x].getTipo_pez() + " nacen " + arreglo[x].getPor_nacimiento() + " por crias y " + arreglo[x].peces_al_anio() +" anualmente");
        }
    }
}
