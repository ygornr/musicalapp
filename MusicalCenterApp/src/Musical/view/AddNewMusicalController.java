package Musical.view;

import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddNewMusicalController {

	ObservableList<String> estadoCivilList = FXCollections.observableArrayList("Casado(a)", "Divorciado(a)",
			"Solteiro(a)");
	ObservableList<String> tipoList = FXCollections.observableArrayList("Corda", "Percussão", "Sopro");
	ObservableList<String> instrumentoList = FXCollections.observableArrayList("Baixo", "Bateria", "Flauta", "Guitarra",
			"Lira", "Teclado", "Trompete", "Viola", "Violão");

	// DADOS DO ALUNO

	@FXML
	private TextField nameField;
	@FXML
	private TextField enderecoField;
	@FXML
	private TextField cidadeField;
	@FXML
	private TextField telefoneField;
	@FXML
	private TextField emailField;

	// INFORMAÇÕES DO ALUNO
	@FXML
	private DatePicker dataAniversario;
	@FXML
	private TextField idadeField;
	@FXML
	private ChoiceBox estadoCivilBox;
	@FXML
	private RadioButton femininoBtn;
	@FXML
	private RadioButton masculinoBtn;

	// DADOS DO INSTRUMENTO OU ACESSÓRIO

	@FXML
	private TextField marcaField;
	@FXML
	private TextField corField;
	@FXML
	private ComboBox tipoBox;
	@FXML
	private ComboBox instrumentoBox;
	@FXML
	private TextField acessorioField;
	@FXML
	private TextField precoField;

	@FXML
	private void initialize() {
		estadoCivilBox.setValue("Casado(a)");
		estadoCivilBox.setItems(estadoCivilList);

		tipoBox.setValue("Corda");
		tipoBox.setItems(tipoList);
		
		instrumentoBox.setValue("Baixo");
		instrumentoBox.setItems(instrumentoList);
	}

	@FXML
	private void showIdade() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int anoAniversario = (dataAniversario.getValue().getYear());
		int idade = year - anoAniversario;
		idadeField.setText(Integer.toString(idade) + " anos");
	}
	
}
