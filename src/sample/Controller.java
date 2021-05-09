package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField mainTextField;

    public void btnOneClickAction(ActionEvent actionEvent){
        mainTextArea.appendText(mainTextField.getText());
        mainTextField.clear();
        mainTextArea.appendText("\n");
    }


}
