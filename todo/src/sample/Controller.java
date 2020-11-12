package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML TextField TXTedad;
    @FXML Label Label1;

    public void evento1(ActionEvent event){
        int dias = Integer.parseInt(TXTedad.getText())*365;
        Label1.setText("HAS VIVIDO"+dias+"dias");
    }

}
