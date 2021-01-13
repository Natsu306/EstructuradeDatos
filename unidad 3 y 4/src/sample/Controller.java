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
import sample.Main;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class Controller {
    @FXML
    TextField txtusuario;
    @FXML PasswordField txtclave;
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
        if (u.equals("") && c.equals("")) {
            try {
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
        String path = "src/sample/Audio/RelaxStardewValley.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setVolume(.1);
        MediaView mediaView = new MediaView(mediaPlayer);
    }
}