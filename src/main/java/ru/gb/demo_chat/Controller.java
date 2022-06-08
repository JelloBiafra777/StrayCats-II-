package ru.gb.demo_chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea chatArea;
    @FXML
    private TextField userText;

    public void clickEnter(ActionEvent actionEvent) {

        if (userText.getText().isBlank()) {
            return;
        }

        chatArea.appendText(userText.getText() + "\n");
        userText.setText("");
    }
}