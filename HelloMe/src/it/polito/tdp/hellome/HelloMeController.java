/**
 * Sample Skeleton for 'HelloMe.fxml' Controller Class
 */

package it.polito.tdp.hellome;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloMeController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtNome"
	private TextField txtNome; // Value injected by FXMLLoader

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader

	@FXML
	void handleCiao(ActionEvent event) {
		// System.out.println("ahi!"); // al click su Ciao stampa nella console
		String nome = txtNome.getText();
		if (nome.length() == 0) {
			txtResult.setText("Errore: devi inserire un nome\n");
		} else {
			String msg = "Benvenuto, " + nome + "!\n";
			txtResult.setText(msg);
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HelloMe.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'HelloMe.fxml'.";

	}
}
