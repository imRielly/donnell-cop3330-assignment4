package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class AppController {

    @FXML
    private TableView<ToDoList> tableView;
    @FXML
    private TableColumn<ToDoList, String> colDescription;
    @FXML
    private TableColumn<ToDoList, LocalDate> colDueDate;
    @FXML
    private TableColumn<ToDoList, Boolean> colCompleted;

    @FXML
    private String activeToDoListTitle;

    @FXML
    private String activeToDoItemDesc;

    @FXML
    public void btnSaveClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnLoadClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnDeleteListClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnDeleteToDoItemClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnMarkCompleteClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnNewItemClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void listTitleClicked(MouseEvent mouseEvent) {

    }

    @FXML
    public void btnCreateNewListClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void btnSaveListClicked(ActionEvent actionEvent) {

    }
}
