import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MyController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private Button createAccountBtn;

    @FXML
    private Button loginBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Set the action for the createAccountBtn button
        createAccountBtn.setOnAction(event -> handleCreateAccountButton());
    }

    private void handleCreateAccountButton() {
        // Change to sign in page
        Image newImage = new Image("/Images/2.png");
        imageView.setImage(newImage);

        // Hide the buttons
        createAccountBtn.setVisible(false);
        loginBtn.setVisible(false);
    }
}
