package bmcrm.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import bmcrm.DatabaaseHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_Field;

    @FXML
    private PasswordField password_Field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {



        signUpButton.setOnAction(actionEvent -> {

            DatabaaseHandler dbHandler = new DatabaaseHandler();
            dbHandler.signUpUser(signUpName.getText(), signUpLastName.getText(), login_Field.getText(), password_Field.getText(), signUpCountry.getText(), "Male" );

        });

    }
}
