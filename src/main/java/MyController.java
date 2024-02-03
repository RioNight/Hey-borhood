

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyController implements Initializable {
	
	@FXML
	private VBox buttonVBox;
	
	@FXML
	private BorderPane root;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private TextField centerText;
    
    @FXML
    private TextField rightText;


    
    //static so each instance of controller can access to update 
    private static String textEntered = "";
	private static String textMessage = "";
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
        
	}

    public void b1Method(ActionEvent e) throws IOException{

        textEntered = centerText.getText();
        textMessage = textEntered + ": from the center text field!";
        rightText.setText(textMessage);

        System.out.println("Message Entered: " + textEntered);
        System.out.println(textMessage);

        button1.setDisable(true);
        button1.setText("pressed");
    }

    public void b2Method(ActionEvent e) throws IOException{
        rightText.setText("final string goes here");
        centerText.clear();

        System.out.println("message cleared");

        button1.setDisable(false);
        button1.setText("Button 1");
    }
}
