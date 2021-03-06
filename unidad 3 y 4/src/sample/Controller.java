package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import sample.Estructuras.Busqueda;
import sample.Main;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class Controller {
    @FXML TextField txtusuario;
    @FXML PasswordField txtclave;
    String [][] arrayUsuarios=new String[3][3];
    @FXML protected void initialize(){
        arrayUsuarios[0][0]="Gus";arrayUsuarios[0][1]="";arrayUsuarios[0][2]="";
        arrayUsuarios[1][0]="nombre2";arrayUsuarios[1][1]="admin2";arrayUsuarios[1][2]="clave2";
        arrayUsuarios[2][0]="nombre3";arrayUsuarios[2][1]="admin3";arrayUsuarios[2][2]="clave3";
    }
    public void login(javafx.event.ActionEvent event) {
        ingresar();
    }
    public void enter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            ingresar();
        }
    }
    public void ingresar(){
        String u = txtusuario.getText();
        String c = txtclave.getText();
        Busqueda busqueda=new Busqueda();
        int indice=busqueda.secuencial(arrayUsuarios,u,c);
        if (indice >=0) {
            try {
                Main.datosN=arrayUsuarios[indice][0];
                Parent root = FXMLLoader.load(getClass().getResource("PantallaCobro.fxml"));
                Scene scene=new Scene(root);

                Main.stage.setScene(scene);
                Main.stage.setHeight(452);
                Main.stage.setWidth(650);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Salon Fruta Estelar");
            alert.setContentText("Datos invalidos");
            alert.show();

        }

    }
}