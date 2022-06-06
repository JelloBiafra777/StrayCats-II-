module ru.gb.demo_chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.demo_chat to javafx.fxml;
    exports ru.gb.demo_chat;
}