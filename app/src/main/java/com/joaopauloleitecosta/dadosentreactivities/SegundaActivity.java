package com.joaopauloleitecosta.dadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textIdade;
    private TextView textAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.text_nome);
        textIdade = findViewById(R.id.text_idade);
        textAltura = findViewById(R.id.text_altura);

        Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");

        textNome.setText(pessoa.getNome());
        textIdade.setText(String.valueOf(pessoa.getIdade()));
        textAltura.setText(String.valueOf(pessoa.getAltura()));
    }
}