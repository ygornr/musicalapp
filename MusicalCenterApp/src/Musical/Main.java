package Musical;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Musical Center");
		showMainView();
		showMainItems();		
	}

	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void showMainItems() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
		
	}
	
	public static void showAlunosScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("alunos/AlunosCadastrados.fxml"));
		BorderPane alunosCadastrados = loader.load();
		mainLayout.setCenter(alunosCadastrados);
	}
	public static void showInstrumentosScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("instrumentos/InstrumentosCadastrados.fxml"));
		BorderPane intrumentosCadastrados = loader.load();
		mainLayout.setCenter(intrumentosCadastrados);
	}
	
	public static void showAddStage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddNewMusical.fxml"));
		BorderPane addNewMusical = loader.load();
	
		Stage addDialogStage = new Stage();
		addDialogStage.setTitle("Cadastrar novo Aluno");
		addDialogStage.initModality(Modality.WINDOW_MODAL);
		addDialogStage.initOwner(primaryStage);
		Scene scene = new Scene(addNewMusical);
		addDialogStage.setScene(scene);
		addDialogStage.showAndWait();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
