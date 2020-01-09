package dad.javafx.pruebajdate;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import dad.javafx.componentes.DateChooser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {
		@FXML 
		private BorderPane root;
	
		@FXML
	    private Button initializeButton;

	    @FXML
	    private Button consultButton;

	    @FXML
	    private DateChooser dateChooser;
	    
	    public Controller() throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PruebaDateChooser.fxml"));
			loader.setController(this);
					//loader.setRoot(this); //establecer la rootView
			loader.load();
	    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeButton.setOnAction(e -> initializeAction());
		consultButton.setOnAction(e -> consultAction());

	}
	
	private void consultAction() {
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setTitle("Fecha");
	alert.setHeaderText("");
	alert.setContentText("La fecha seleccionada es: " + dateChooser.getDateProperty().toString());
	alert.showAndWait();
}

private void initializeAction() {
	LocalDate now = LocalDate.now();
	dateChooser.setDateProperty(now);

}

public BorderPane getRoot() {
	return root;
}
}
