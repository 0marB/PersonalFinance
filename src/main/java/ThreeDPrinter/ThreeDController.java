package ThreeDPrinter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class ThreeDController {

    @FXML
    TextField dfWeight = new TextField();
    @FXML
    TextField dfPrintname = new TextField();
    @FXML
    TextField dfFilamenttype = new TextField();
    @FXML
    ColorPicker dfColor = new ColorPicker();
    @FXML
    TextArea dfTextarea = new TextArea();


    public ThreeDController() throws FileNotFoundException {

    }
    public void dfButton(ActionEvent actionEvent){
         double Weight = Double.parseDouble(dfWeight.getText());
        String pn = dfPrintname.getText();
        String ft = dfFilamenttype.getText();
        String color = dfColor.getValue().toString();
        //calculation:
        // take the color string and remove the 0x from the beginning and the ff from the end
        color = color.substring(2,color.length()-2);
        System.out.println("Cleaned Color:" + color);





//        Color c = cp.getValue();
//
//        // set text of the label to RGB value of color
//        .setText("Red = " + c.getRed() + ", Green = " + c.getGreen()
//                + ", Blue = " + c.getBlue());

        Prints print = new Prints(Weight, ft, color, 0.4, 215, 60, pn);
        dfTextarea.setText(dfTextarea.getText() + "\n" + print.toString());
    }
}
