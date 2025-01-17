package PersonalFinance;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ExpensesController {

    @FXML
    DatePicker datePicker = new DatePicker();
    @FXML
    TextField tfDescription = new TextField();
    @FXML
    TextField tfValue = new TextField();
    @FXML
    TextField tfCategory = new TextField();
    @FXML
    TextArea taExpenses = new TextArea();
    @FXML
    Label lbExpenses = new Label();

    public void onClickSetExpenses(ActionEvent actionEvent) {
    }

    public void onClickSeeExpenses(ActionEvent actionEvent) {
    }

    public void onClickAddEntry(ActionEvent actionEvent) {
    }

    public void onClickAddExpense(ActionEvent actionEvent) {
        //read values from input
        LocalDate ld = datePicker.getValue();
        String desc = tfDescription.getText();
        String cat = tfCategory.getText();
        double value = Double.parseDouble(tfValue.getText());

        //new object from ExpensesType
        ExpensesType e1 = new ExpensesType(cat, value, desc, ld);

        //calculate totalExpenses
        e1.addTotalExpenses();

        //show out
        taExpenses.setText(taExpenses.getText() + e1.toString());
        lbExpenses.setText("Total expenses: $"+ ExpensesType.getTotalExpenses());
    }
}
