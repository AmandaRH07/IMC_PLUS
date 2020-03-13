package com.example.imc_plus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    EditText txt1, txt2;
    TextView resposta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        txt1 = findViewById(R.id.editText);
        txt2 = findViewById(R.id.editText2);
        resposta = findViewById(R.id.textView3);
    }

    public void calcular(View view) {
        double peso= Double.parseDouble(txt1.getText().toString());
        double altura= Double.parseDouble(txt2.getText().toString());
        double imc =0;

        imc = peso / (altura * altura);

        if(imc <= 18.5){
            imageView.setImageResource(R.drawable.abaixopeso);
            resposta.setText("Acima do Peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            imageView.setImageResource(R.drawable.normal);
            resposta.setText("Peso Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            imageView.setImageResource(R.drawable.sobrepeso);
            resposta.setText("Sobrepeso");
        }  else if (imc >= 30 && imc <= 34.9) {
            imageView.setImageResource(R.drawable.obesidade1);
            resposta.setText("Obesidade Grau 1");
        }  else if (imc >= 35 && imc <= 39.9) {
            imageView.setImageResource(R.drawable.obesidade2);
            resposta.setText("Obesidade Grau 2");
        } else {
            imageView.setImageResource(R.drawable.obesidade3);
            resposta.setText("Obesidade Grau 3");

        }
    }
}
