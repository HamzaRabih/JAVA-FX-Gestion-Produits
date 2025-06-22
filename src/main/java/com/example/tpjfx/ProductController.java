package com.example.tpjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


// Contrôleur ProductController
public class ProductController {
    @FXML private TextField nameField;
    @FXML private TextField priceField;
    @FXML private Button addButton;
    @FXML private ListView<Product> productList;

    private final ObservableList<Product> products = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        productList.setItems(products);
    }

    @FXML
    private void addProduct() {
        String name = nameField.getText();
        String priceText = priceField.getText();

        if (!name.isEmpty() && !priceText.isEmpty()) {
            try {
                double price = Double.parseDouble(priceText);
                products.add(new Product(name, price));
                nameField.clear();
                priceField.clear();
            } catch (NumberFormatException e) {
                showAlert("Erreur", "Prix invalide", "Veuillez entrer un prix valide.");
            }
        } else {
            showAlert("Erreur", "Champs vides", "Veuillez remplir tous les champs.");
        }
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
