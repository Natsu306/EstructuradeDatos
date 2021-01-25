package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    public static Stage stage;
    public static String datosN="";
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.getIcons().add(new Image("https://stardewcommunitywiki.com/mediawiki/images/4/47/Calendar_Flag_Anim.gif'"));
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Salon Fruta Estelar");
        primaryStage.setScene(new Scene(root, 427, 610));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
