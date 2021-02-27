package com.example.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sortear(View view) {
        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        TextView texto = findViewById(R.id.textView2);
        String numeroSorteado = String.valueOf(numero);
        texto.setText(numeroSorteado);
    }
}