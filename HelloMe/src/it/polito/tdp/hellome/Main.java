package it.polito.tdp.hellome;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application { // tutti i programmi javaFX definiscono una classe che estende la classe Application
	// sa gia' cosa fare nelle operazioni normali (base)
	@Override
	public void start(Stage primaryStage) { // ci mette il codice di avvio della mia applicazione
		try {
			// creo una scena
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("HelloMe.fxml"));
			Scene scene = new Scene(root); // non dico le misure della finestra
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene); // imposta la scena sullo stage
			primaryStage.show(); // mostra lo stage
			
			//per metterci qualcosa dentro, devo editare il file fxml
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
