import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MyController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private Button createAccountBtn;

    @FXML
    private Button loginBtn;

    // List of image URLs
    private final List<String> imageUrls = List.of(
            "/Images/1.png",    // First page welcome
            "/Images/2.png",    // Sign up
            "/Images/3.png",    // Start chatting
            "/Images/4.png",    // Find people near you
            "/Images/5.png"     // Chat with volunteers
    );

    // Index to keep track of the current image
    private int currentImageIndex = 1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Set the action for the createAccountBtn button
        createAccountBtn.setOnAction(event -> handleCreateAccountButton());

        // Add event handler for the AnchorPane (changeImageOnSceneClick)
        imageView.getParent().addEventHandler(MouseEvent.MOUSE_CLICKED, this::changeImageOnSceneClick);
    }

    private void handleCreateAccountButton() {
        // Change the image
        Image newImage = new Image("/Images/2.png");
        imageView.setImage(newImage);
        currentImageIndex = currentImageIndex + 1;

        // Hide the buttons
        createAccountBtn.setVisible(false);
        loginBtn.setVisible(false);
    }

    private void changeImageOnSceneClick(MouseEvent event) {
        // Change the image to the next scene
        Image newImage = new Image(imageUrls.get(currentImageIndex));
        imageView.setImage(newImage);

        // Increment the index to get the next image URL
        currentImageIndex = currentImageIndex + 1;
        if (currentImageIndex >= 5) {
            currentImageIndex = 0;

            // Hide the buttons
            createAccountBtn.setVisible(true);
            loginBtn.setVisible(true);
        }
    }
}
