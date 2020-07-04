package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    //Variables
    private TextView resultado;
    private Button Key_Pad0, Key_Pad1, Key_Pad2, Key_Pad3, Key_Pad4, Key_Pad5, Key_Pad6, Key_Pad7, Key_Pad8, Key_Pad9;
    private Button Key_PadResta, Key_PadSuma, Key_PadMulti, Key_PadDiv, Key_PadClear, Key_PadIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);

        Key_Pad0 = findViewById(R.id.num_cero);
        Key_Pad1 = findViewById(R.id.num_uno);
        Key_Pad2 = findViewById(R.id.num_dos);
        Key_Pad3 = findViewById(R.id.num_tres);
        Key_Pad4 = findViewById(R.id.num_cuatro);
        Key_Pad5 = findViewById(R.id.num_cinco);
        Key_Pad6 = findViewById(R.id.num_seis);
        Key_Pad7 = findViewById(R.id.num_siete);
        Key_Pad8 = findViewById(R.id.num_ocho);
        Key_Pad9 = findViewById(R.id.num_nueve);

        Key_PadResta = findViewById(R.id.resta);
        Key_PadDiv = findViewById(R.id.div);
        Key_PadMulti = findViewById(R.id.multi);
        Key_PadSuma = findViewById(R.id.suma);
        Key_PadClear = findViewById(R.id.clear);
        Key_PadIgual = findViewById(R.id.igual);

        //Setear listener
        Key_Pad0.setOnClickListener(this);
        Key_Pad1.setOnClickListener(this);
        Key_Pad2.setOnClickListener(this);
        Key_Pad3.setOnClickListener(this);
        Key_Pad4.setOnClickListener(this);
        Key_Pad5.setOnClickListener(this);
        Key_Pad6.setOnClickListener(this);
        Key_Pad7.setOnClickListener(this);
        Key_Pad8.setOnClickListener(this);
        Key_Pad9.setOnClickListener(this);

        Key_PadResta.setOnClickListener(this);
        Key_PadDiv.setOnClickListener(this);
        Key_PadMulti.setOnClickListener(this);
        Key_PadSuma.setOnClickListener(this);
        Key_PadClear.setOnClickListener(this);
        Key_PadIgual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;

            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;

            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;

            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;

            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;

            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;

            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;

            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;

            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;

            case R.id.resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.suma:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.div:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.multi:
                symbol = "x";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.igual:
                num2 = Integer.parseInt(numero);

                switch (symbol){
                    case "-":
                        resultado.setText("resultado" + (num1 - num2));
                        break;

                    case "/":
                        resultado.setText("resultado" + (num1 / num2));
                        break;

                    case "x":
                        resultado.setText("resultado" + (num1 * num2));
                        break;

                    case "+":
                        resultado.setText("resultado" + (num1 + num2));
                        break;

                }
                numero = "";
                num1 = "";
                num2 = "";

                break;


            case R.id.clear:
                symbol = "";
                num1 = 0;
                num2 = 0;
                numero = "";
                resultado.setText("");
                break;
        }
    }
}
