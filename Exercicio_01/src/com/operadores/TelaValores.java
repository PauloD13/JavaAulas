package com.operadores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaValores {
    @FXML
    private TextField txtNum;

    @FXML
    private TextField txtDen;

    @FXML
    private Label lblDiv;

    @FXML
    private Label lblRes;

    @FXML
    private void onClickDivision(ActionEvent evt) {
        int n1 = Integer.parseInt(txtNum.getText());
        int n2 = Integer.parseInt(txtDen.getText());

        int n3 = n1/n2;
        int n4 = n1%n2;

        lblDiv.setText(String.valueOf(n3));
        lblRes.setText(String.valueOf(n4));
    }
}
