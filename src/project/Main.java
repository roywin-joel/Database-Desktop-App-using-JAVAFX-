package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage mystage) throws Exception {
			Parent root =FXMLLoader.load(getClass().getResource("gui.fxml"));
			mystage.setScene(new Scene(root));
			mystage.setTitle("MYSQL_UI");
			mystage.show();
		}
		public static void main(String[] args)
		{
			launch(args);
		}
	}

