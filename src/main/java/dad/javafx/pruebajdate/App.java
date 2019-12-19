package dad.javafx.pruebajdate;


import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	private Controller controller; 
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();
		Scene scene = new Scene(controller.getRoot(), 500, 300);
		
		primaryStage.setTitle("Probando JDate");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
