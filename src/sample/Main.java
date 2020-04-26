/***********************************************
 *Frederik: 66454
 *Kathrine: 65204
 *Mikkel: 66370
 *Tobias: 66715
 *
 *
 *Some code has been borrowed by our teacher:
 *https://github.com/EbbeVang
 ************************************************/

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Drone Emulator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
