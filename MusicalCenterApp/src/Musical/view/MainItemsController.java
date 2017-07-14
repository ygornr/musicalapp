package Musical.view;

import java.io.IOException;

import Musical.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	
	private Main main;
	
	@FXML
	private void goAlunos() throws IOException{
		main.showAlunosScene();
		
	}

	@FXML
	private void goInstrumentos() throws IOException{
		main.showInstrumentosScene();
	}
	
}
