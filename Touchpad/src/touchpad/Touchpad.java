/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touchpad;

import java.util.ArrayList; 
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Node; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Control; 
import javafx.scene.control.TextArea; 
import javafx.scene.input.KeyCode; 
import javafx.scene.input.KeyCodeCombination; 
import javafx.scene.input.KeyCombination; 
import javafx.scene.input.KeyEvent; 
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 




public class Touchpad extends Application { 

public void start(Stage primaryStage) { 

GridPane root = new GridPane(); 
HBox hb = new HBox(); 
TextArea area = new TextArea(); 
hb.setAlignment(Pos.CENTER); 
area.setMinWidth(650);
hb.getChildren().addAll(area); 
Button btn = new Button(); 
root.add(hb, 0, 0); 
Button keys [][] = {

    {new Button("`"),new Button("1"),new Button("2"),new Button("3"),new Button("4"),new Button("5"), new Button("6"),new Button("7"),new Button("8"),new Button("9"),new Button("0"),new Button("-"),new Button("="),new Button("BACK_SPACE")}, 

    {new Button("TAB"),new Button("Q"),new Button("W"),new Button("E"),new Button("R"),new Button("T"), new Button("Y"),new Button("U"),new Button("I"),new Button("O"),new Button("P"),new Button("["),new Button("]"),new Button("\\")}, 

    {new Button("CAPS"),new Button("A"),new Button("S"),new Button("D"),new Button("F"),new Button("G"),new Button("H"), new Button("J"),new Button("K"),new Button("L"),new Button(";"),new Button("'"),new Button("ENTER")}, 

    {new Button("SHIFT"),new Button("Z"),new Button("X"),new Button("C"),new Button("V"),new Button("B"), new Button("N"),new Button("M"),new Button(","),new Button("."),new Button("/"),new Button("SHIFT"),new Button("↑")}, 

    {new Button("←"),new Button("↓"),new Button("→")} 

};
area.setOnKeyPressed(new EventHandler<KeyEvent>() { 

public void handle(KeyEvent event) { 
for (int i = 0; i < keys.length; i++) { 
for(Button j :keys[i]){ 
if(event.getCode().toString().equals(j.getText()) || event.getCode().toString().equals("DIGIT" + j.getText())){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("[") && event.getCode().toString().equals("OPEN_BRACKET")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("]") && event.getCode().toString().equals("CLOSE_BRACKET")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("'") && event.getCode().toString().equals("QUOTE")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals(";") && event.getCode().toString().equals("SEMICOLON")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals(",") && event.getCode().toString().equals("COMMA")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("/") && event.getCode().toString().equals("SLASH")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("\\") && event.getCode().toString().equals("BACK_SLASH")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals(".") && event.getCode().toString().equals("PERIOD")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("`") && event.getCode().toString().equals("BACK_QUOTE")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("=") && event.getCode().toString().equals("EQUALS")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("-") && event.getCode().toString().equals("MINUS")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("↑") && event.getCode().toString().equals("UP")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("↓") && event.getCode().toString().equals("DOWN")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("→") && event.getCode().toString().equals("RIGHT")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(j.getText().equals("←") && event.getCode().toString().equals("LEFT")){ 
j.setStyle("-fx-background-color: #9DB2E4;"); 
} 
else if(btn.getText().equals("") && event.getCode().toString().equals("SPACE")){ 
btn.setStyle("-fx-background-color: #9DB2E4;"); 
} 
} 
} 

} 
}); 
area.setOnKeyReleased(new EventHandler<KeyEvent>() { 

@Override 
public void handle(KeyEvent event) { 
for (int i = 0; i < keys.length; i++) { 
    for(Button j :keys[i]){ 
    j.setStyle(null); 
    btn.setStyle(null); 
} 
} 

} 
}); 
HBox h1 = new HBox(); 
for(Button i:keys[0]){ 
if(i.getText().equals("BACK_SPACE")){ 
    i.setPrefSize(90,40);   
    h1.getChildren().add(i);} 
else{ 
    i.setPrefSize(40,40); 
    h1.getChildren().add(i);} 
} 
HBox h2 = new HBox(); 
for(Button i:keys[1]){ 
if(i.getText().equals("\\")|| i.getText().equals("TAB")){
    i.setPrefSize(70,40); 
    h2.getChildren().add(i); 
} 
else{
    i.setPrefSize(40,40);
    h2.getChildren().add(i);
    }
}
HBox h3 = new HBox(); 
for(Button i:keys[2]){ 
if(i.getText().equals("CAPS") || i.getText().equals("ENTER")){ 
    i.setPrefSize(100,40); 
    h3.getChildren().add(i);} 
else{ 
    i.setPrefSize(40,40); 
    h3.getChildren().add(i);} 
} 
HBox h4 = new HBox(); 
for(Button i:keys[3]){ 
if(i.getText().equals("SHIFT")){ 
    i.setPrefSize(65.2,40); 
    h4.getChildren().add(i);} 
else if(i.getText().equals("↑")){ 
    i.setPrefSize(40,40); 
    h4.getChildren().add(i);} 
else{ 
    i.setPrefSize(40,40); 
    h4.getChildren().add(i);} 
} 
HBox h5 = new HBox(); 
btn.setPrefSize(200,40); 
HBox h6 = new HBox(); 
h6.getChildren().add(btn); 
h6.setAlignment(Pos.CENTER); 
h6.setPadding(new Insets(0,146,0,0)); 
h5.getChildren().add(h6); 
for(Button i:keys[4]){ 
    i.setPrefSize(40,40); 
    h5.getChildren().add(i); 
} 
h1.setAlignment(Pos.CENTER); 
h1.setSpacing(3); 
h1.setPadding(new Insets(0,0,3,0)); 
h2.setSpacing(3); 
h2.setPadding(new Insets(0,0,3,0)); 
h3.setSpacing(3); 
h3.setPadding(new Insets(0,0,3,0)); 
h4.setSpacing(3); 
h4.setPadding(new Insets(0,0,3,0)); 
h5.setSpacing(3); 
h5.setPadding(new Insets(0,0,3,0)); 
h5.setAlignment(Pos.CENTER_RIGHT); 
root.add(h1, 0, 1); 
root.add(h2, 0, 2); 
root.add(h3, 0, 3); 
root.add(h4, 0, 4); 
root.add(h5, 0, 5); 




Scene scene = new Scene(root, 650, 395); 



primaryStage.setTitle("Hello World!"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
} 

/** 
* @param args the command line arguments 
*/ 
public static void main(String[] args) { 
launch(args); 
} 

}
