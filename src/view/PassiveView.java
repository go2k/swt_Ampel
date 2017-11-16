package view;

import java.net.URL;
import java.util.ResourceBundle;

import model.Model;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import presenter.Presenter;

public class PassiveView implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------        
    @FXML
    private Circle circleRot;

    @FXML
    private Circle circleGelb;

    @FXML
    private Circle circleGruen;

    @FXML
    private Button buttonWeiter;

    private Presenter presenter;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonWeiter.setOnAction(event -> {
           //Model.weiter();
            presenter.weiter();
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
        presenter = new Presenter(this);
    }


    public void rotAn(){
        circleRot.setFill(Color.RED);
    }
    public void rotAus(){
        circleRot.setFill(Color.GRAY);
    }
    public void gelbAn(){
        circleGelb.setFill(Color.YELLOW);
    }
    public void gelbAus(){
        circleGelb.setFill(Color.GRAY);
    }
    public void gruenAn(){
        circleGruen.setFill(Color.GREEN);
    }
    public void gruenAus(){
        circleGruen.setFill(Color.GRAY);
    }



}
