package dad.calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	private Controller control;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.control=new Controller();
		
		primaryStage.setTitle("Calculadora");
		
		primaryStage.setScene(new Scene(control.getGridpa(), 500, 400));
	
		primaryStage.show();
		//primaryStage.setMinHeight(300);
	}
	public static void main(String[] args) {
		launch(args);
	}

}
