package javafx2;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Jonathan_Tillaguango
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnareaT;
    @FXML
    private TextField txtbaseT;
    @FXML
    private TextField txtalturaT;
    @FXML
    private Button btnC;
    @FXML
    private TextField txtladoC;
    @FXML
    private TextField JTPerimetroT;
    @FXML
    private TextField JTPerimetroCir;
    @FXML
    private TextField JTAreaCir;
    @FXML
    private TextField JTAreaT;
    @FXML
    private TextField JTAreaCu;
    @FXML
    private TextField JTPerimetroCu;
    @FXML
    private TextField JTBase;
    @FXML
    private TextField JTAltura;
    @FXML
    private TextField JTRadio;
    @FXML
    private TextField JTLadoC;
    @FXML
    private ComboBox Seleción;

    @FXML
    private void comBxAction(ActionEvent event) {
        String option = (String) Seleción.getValue();
        switch (option) {
            case "Triangulo":
                //acativa la visivilidad de la caja de texto
                JTAltura.setVisible(true);
                JTBase.setVisible(true);
                //mantine Ocultos el resto de cajas de texto
                JTLadoC.setVisible(false);
                JTRadio.setVisible(false);

                break;
            case "Circulo":
                //acativa la visivilidad de la caja de texto
                JTRadio.setVisible(true);
                //mantine Ocultos el resto de cajas de texto
                //cuadrado
                JTLadoC.setVisible(false);
                //triangulo
                JTAltura.setVisible(false);
                JTBase.setVisible(false);

                break;
            case "Cuadrado":
                //acativa la visivilidad de la caja de texto
                JTLadoC.setVisible(true);
                //mantine Ocultos el resto de cajas de texto
                //Circulo
                JTRadio.setVisible(false);
                //triangulo
                JTAltura.setVisible(false);
                JTBase.setVisible(false);
                break;
        }
    }

    @FXML

    private void actionTri(ActionEvent event) {
        int base = Integer.parseInt(JTBase.getText());
        int altura = Integer.parseInt(JTAltura.getText());
        int areaT = (base * altura) / 2;
        int perimetroT = (2 * base) + (2 * altura);
        JTPerimetroT.setText(String.valueOf(perimetroT));
        JTAreaT.setText(String.valueOf(areaT));
      
    }

    @FXML
    private void actionCU(ActionEvent e) {
        int lado = Integer.parseInt(JTLadoC.getText());
        int areaC = 4 * lado;
        int perimetroC = lado * lado;
        JTAreaCu.setText(String.valueOf(areaC));
        JTPerimetroCu.setText(String.valueOf(perimetroC));
        

    }

    @FXML
    private void actionCir(ActionEvent e) {
        int radio = Integer.parseInt(JTRadio.getText());
        double areaC = (Math.PI) * (Math.pow(radio, 2));
        double perimetroC = 2 * (Math.PI * radio);
        JTAreaCir.setText(String.valueOf(areaC));
        JTPerimetroCir.setText(String.valueOf(perimetroC));
       
        
    }
    @FXML
    private void actionClear(ActionEvent e) {
       JTRadio.setText("");
       JTLadoC.setText("");  
       JTAltura.setText("");
       JTBase.setText("");
       JTAreaT.setText("");
       JTAreaCir.setText("");
       JTAreaCu.setText("");
       JTPerimetroCir.setText("");
       JTPerimetroT.setText("");
       JTPerimetroCu.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //observable list sirve para almacenar datos en los controles

        Seleción.getItems().removeAll(Seleción.getItems());
        Seleción.getItems().addAll("Triangulo", "Circulo", "Cuadrado");
        Seleción.getSelectionModel().select("");
        

    }

}
