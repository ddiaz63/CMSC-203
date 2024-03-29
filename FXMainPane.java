PK
    ϘZXpG0��  �     Lab2_GUI_FX/src/FXMainPane.java


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	private Button buttonHello;
    private Button buttonHowdy;
    private Button buttonChinese;
    private Button buttonClear;
    private Button buttonExit;
    private Label Feedback;
    private TextField textField;
    private HBox hboxButtons;
    private HBox hboxTextField;
    private DataManager dataManager;
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		buttonHello = new Button("Hello");
        buttonHowdy = new Button("Howdy");
        buttonChinese = new Button("Chinese");
        buttonClear = new Button("Clear");
        buttonExit = new Button("Exit");

        // Task #2: Instantiate the label and text field
        Feedback = new Label("Feedback:");
        textField = new TextField();

        // Task #2: Instantiate the HBoxes
        hboxButtons = new HBox();
        hboxTextField = new HBox();
        
        dataManager = new DataManager();

        // Task #2: Add buttons to the buttons HBox
        hboxButtons.getChildren().addAll(buttonHello, buttonHowdy, buttonChinese, buttonClear, buttonExit);

        // Task #2: Add label and text field to the text field HBox
        hboxTextField.getChildren().addAll(Feedback, textField);

        // Task #2: Add HBoxes to the VBox
        getChildren().addAll(hboxButtons, hboxTextField);
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
        // Task #3: Add HBoxes to the VBox
        Insets inset = new Insets(10);
        HBox.setMargin(buttonHello, inset);
        HBox.setMargin(buttonHowdy, inset);
        HBox.setMargin(buttonChinese, inset);
        HBox.setMargin(buttonClear, inset);
        HBox.setMargin(buttonExit, inset);

        hboxButtons.setAlignment(Pos.CENTER);
        hboxTextField.setAlignment(Pos.CENTER);

        // Task #4: Set actions for buttons using ButtonHandler
        buttonHello.setOnAction(new ButtonHandler());
        buttonHowdy.setOnAction(new ButtonHandler());
        buttonChinese.setOnAction(new ButtonHandler());
        buttonClear.setOnAction(new ButtonHandler());
        buttonExit.setOnAction(new ButtonHandler());
	}
	 class ButtonHandler implements EventHandler<ActionEvent> {
	        @Override
	        public void handle(ActionEvent event) {
	            if (event.getTarget() == buttonHello) {
	                textField.setText(dataManager.getHello());
	            } else if (event.getTarget() == buttonHowdy) {
	                textField.setText(dataManager.getHowdy());
	            } else if (event.getTarget() == buttonChinese) {
	                textField.setText(dataManager.getChinese());
	            } else if (event.getTarget() == buttonClear) {
	                textField.setText("");
	            } else if (event.getTarget() == buttonExit) {
	                Platform.exit();
	                System.exit(0);
	            }
	        }
	    }
	}	
	
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	
PK
 
    ϘZXpG0��  �                   Lab2_GUI_FX/src/FXMainPane.javaPK      M       