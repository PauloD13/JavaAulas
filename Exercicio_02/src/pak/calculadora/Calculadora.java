package pak.calculadora;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent; // Corrigido: import do JavaFX, não do AWT
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Calculadora implements Initializable {

    // Componentes mapeados do FXML
    @FXML private TextField txtN1;
    @FXML private TextField txtN2;
    @FXML private Label lblRs;
    @FXML private ComboBox<String> cmbOP; // O ComboBox agora está aqui!

    // Lista com os sinais das operações matemáticas
    private ObservableList<String> listaItens = FXCollections.observableArrayList(
            "+", "-", "x", "/"
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Alimenta o ComboBox com os sinais assim que a tela abre
        cmbOP.setItems(listaItens);
        // Opcional: define a primeira opção (+) como selecionada por padrão
        cmbOP.getSelectionModel().selectFirst();
    }

    @FXML
    private void onClickCalculate(ActionEvent event) {
        // Validação simples para evitar erro caso nenhum item esteja selecionado
        String opcao = cmbOP.getSelectionModel().getSelectedItem();
        if (opcao == null) {
            lblRs.setText("Selecione uma operação!");
            return;
        }

        try {
            float n1 = Float.parseFloat(txtN1.getText());
            float n2 = Float.parseFloat(txtN2.getText());
            float rs = 0;

            switch (opcao) {
                case "+":
                    rs = n1 + n2;
                    break;
                case "-":
                    rs = n1 - n2;
                    break;
                case "x":
                    rs = n1 * n2;
                    break;
                case "/":
                    if (n2 == 0) {
                        lblRs.setText("Erro: Divisão por 0");
                        return;
                    }
                    rs = n1 / n2;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }

            lblRs.setText(String.valueOf(rs));

        } catch (NumberFormatException e) {
            lblRs.setText("Insira números válidos!");
        }
    }
}
