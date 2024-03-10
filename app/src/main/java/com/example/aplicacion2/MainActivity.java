package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiar_suma(View view){
        Intent c = new Intent(this, P_SUMA.class);
        startActivity(c);
    }
    public void cambiar_resta(View view){
        Intent c = new Intent(this, P_RESTA.class);
        startActivity(c);
    }
    public void cambiar_multiplicacion(View view){
        Intent c = new Intent(this, P_MULTIPLICACION.class);
        startActivity(c);
    }
    public void cambiar_division(View view){
        Intent c = new Intent(this, P_DIVISION.class);
        startActivity(c);
    }
    public void cambiar_fibonacci(View view){
        Intent c = new Intent(this, P_FIBONACCI.class);
        startActivity(c);
    }
    public void cambiar_factorial(View view){
        Intent c = new Intent(this, P_FACTORIAL.class);
        startActivity(c);
    }
    public void cambiar_potencia(View view){
        Intent c = new Intent(this, P_POTENCIA.class);
        startActivity(c);
    }
}