package com.example.ejemplojavafxvideo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onInicializarAMiNombreBtnClick(){
        welcomeText.setText("Raquel y Sergio");
    }
    @FXML
    protected void onEjercicioLaboratorio(){
        try{
            int x = 6/0;
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}