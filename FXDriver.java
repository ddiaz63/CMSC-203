PK
    f�ZX��g܃  �     Lab2_GUI_FX/src/FXDriver.java


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
	//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
	//  set the scene to hold root
		int width = 800; // Specify width of the scene
        int height = 600; // Specify height of the scene
         stage.setScene(new Scene(root, width, height));

		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}
PK
 
    f�ZX��g܃  �                   Lab2_GUI_FX/src/FXDriver.javaPK      K   �    