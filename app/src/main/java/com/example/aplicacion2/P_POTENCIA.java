package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class P_POTENCIA extends AppCompatActivity {

    private static EditText valor1;

    private static EditText valor2;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppotencia);

        valor1=findViewById(R.id.cuadrito1);
        valor2=findViewById(R.id.cuadrito2);
        resultado=findViewById(R.id.respuesta);
    }

    public void Potencia(View view) {
        String numero = valor1.getText().toString();
        String numero2 = valor2.getText().toString();

        if (numero.isEmpty() && numero2.isEmpty() ) {
            resultado.setText("Digite Numeros");
        }else if(numero.isEmpty() && !numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numero.isEmpty() && numero2.isEmpty()){
            resultado.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numero.isEmpty() && !numero2.isEmpty() ){

            int base = Integer.parseInt(valor1.getText().toString());
            int exponente = Integer.parseInt(valor2.getText().toString());
            int resultadop = Potencia1(base, exponente);

            resultado.setText(Integer.toString(resultadop));
        }

    }

    public static int Potencia1(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a 0 es 1
        } else if (exponente == 1) {
            return base; // La potencia de cualquier número a la 1 es el mismo número
        } else if (exponente > 0) {
            return PotenciaSumar(base , Potencia1(base, exponente - 1)); // Recursión para calcular la potencia
        } else {
            return 1 / (PotenciaSumar(base, Potencia1(base, -exponente - 1))); // Manejo de exponentes negativos
        }
    }
    public static int PotenciaSumar(int num1, int contador) {
        if (contador == 0) {
            return 0;
        } else if (contador > 0) {
            return num1 + PotenciaSumar(num1, contador - 1);
        } else {
            return -PotenciaSumar(num1, -contador);
        }
    }

    public void volver(View view){

        finishActivity();
    }

    private void finishActivity() {
        Intent c= new Intent(this,P_DIVISION.class);
        finish();
    }
}