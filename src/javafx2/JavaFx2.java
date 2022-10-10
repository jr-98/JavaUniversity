/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Jonathan_Tillaguango
 */
public class JavaFx2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //Image View
//        ImageView img=new ImageView();
//        img.setFitHeight(20);
//        img.setFitWidth(30);
//        
//        //lsita de imagenes
//        List<File>imagenes=new ArrayList<>();
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         
        Scene scene = new Scene(root);
        stage.setTitle("CALCULAR PERIMETRO AREA");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
