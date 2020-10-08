package bmcrm.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AutorisationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView setButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button enterButton;

    @FXML
    void initialize() {

        enterButton.setOnAction(actionEvent -> {
            String loginText = loginField.getText().trim();
            String loginPassword = passwordField.getText().trim();

            if (!loginText.equals("") && !loginPassword.equals("")) {
                loginUser (loginText, loginPassword);
            } else
                System.out.println("Error login empty");

        });



    }

    private void loginUser(String loginText, String loginPassword) {

            }
}
