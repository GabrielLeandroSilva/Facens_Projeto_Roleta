package com.example.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sortear(View view) {
        TextView texto = findViewById(R.id.textView2);
        TextView textoParabens = findViewById(R.id.textView3);
        TextInputEditText numeroInformado = findViewById(R.id.inputText1);

        if(numeroInformado.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Por favor insira um número", Toast.LENGTH_SHORT).show();
            return;
        }

        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        String numeroSorteado = String.valueOf(numero);
        texto.setText(numeroSorteado);

        if(numero == Integer.parseInt(numeroInformado.getText().toString())) {
            textoParabens.setText("Parabens você ganhou");
        } else {
            textoParabens.setText("Que pena... você perdeu");
        }


    }
}