package dad.calculadorafxml;

	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;

	public class Controller implements Initializable{
		//Model
		
    	Calculadora calculadora=new Calculadora();
		//View
		public Controller() throws IOException {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
			loader.setController(this);
			loader.load();
		}
		

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			//visualizarText.textProperty().bind(pantalla);
			
		}
		
	    @FXML
	    private Button CeBut;

	    @FXML
	    private Button cBut;

	    @FXML
	    private Button ceroBut;

	    @FXML
	    private Button divideBut;

	    @FXML
	    private Button eightBut;

	    @FXML
	    private Button equalsBut;

	    @FXML
	    private Button fiveBut;

	    @FXML
	    private Button fourBut;

	    @FXML
	    private GridPane gridpa;

		@FXML
	    private Button minusBut;

	    @FXML
	    private Button multiplyBut;

	    @FXML
	    private Button nineBut;

	    @FXML
	    private Button oneBut;

	    @FXML
	    private Button plusBut;

	    @FXML
	    private Button pointBut;

	    @FXML
	    private Button sevenBut;

	    @FXML
	    private Button sixBut;

	    @FXML
	    private Button threeBut;

	    @FXML
	    private Button twoBut;

	    @FXML
	    private TextField visualizarText;

	    @FXML
	    void CeButOnAction(ActionEvent event) {
	    	calculadora.borrarTodo();
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void cButOnAction(ActionEvent event) {
	    	calculadora.borrar();
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void ceroButOnAction(ActionEvent event) {
	    	calculadora.insertar('0');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void oneButOnAction(ActionEvent event) {
	    	calculadora.insertar('1');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void twoButOnAction(ActionEvent event) {
	    	calculadora.insertar('2');
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void threeButOnAction(ActionEvent event) {
	    	calculadora.insertar('3');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void fourButOnAction(ActionEvent event) {
	    	calculadora.insertar('4');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void fiveButOnAction(ActionEvent event) {
	    	calculadora.insertar('5');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void sixButOnAction(ActionEvent event) {
	    	calculadora.insertar('6');
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void sevenButOnAction(ActionEvent event) {
	    	calculadora.insertar('7');
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void eightButOnAction(ActionEvent event) {
	    	calculadora.insertar('8');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void nineButOnAction(ActionEvent event) {
	    	calculadora.insertar('9');
	    	visualizarText.setText(calculadora.getPantalla());
	    }
	    
	    @FXML
	    void divideButOnAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.DIVIDIR);;
	    	visualizarText.setText(calculadora.getPantalla());
	    }


	    @FXML
	    void equalsButOnAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.IGUAL);
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void minusButOnAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.RESTAR);
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void multiplyButOnAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.MULTIPLICAR);
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void plusButOnAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.SUMAR);
	    	visualizarText.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void pointButOnAction(ActionEvent event) {
	    	calculadora.insertarComa();
	    	visualizarText.setText(calculadora.getPantalla());
	    }


	    public GridPane getGridpa() {
			return gridpa;
		}
	}
