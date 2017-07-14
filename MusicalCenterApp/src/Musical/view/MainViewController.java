package Musical.view;

import java.io.IOException;

import Musical.Main;
import javafx.fxml.FXML;

public class MainViewController {
	
	private Main main;
	
	@FXML
	private void goHome() throws IOException{
		main.showMainItems();
	}
	@FXML
	private void addBtn() throws IOException{
		main.showAddStage();
	}

}
