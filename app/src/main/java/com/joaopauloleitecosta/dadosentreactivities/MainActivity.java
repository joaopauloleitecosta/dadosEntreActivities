package com.joaopauloleitecosta.dadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editIdade;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.edit_nome);
        editIdade = findViewById(R.id.edit_idade);
        editAltura = findViewById(R.id.edit_altura);

        findViewById(R.id.botao_enviar).setOnClickListener(view -> {
            String nome = editNome.getText().toString();
            int idade = Integer.parseInt(editIdade.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.setAltura(altura);

            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("pessoa", pessoa);
            startActivity(intent);
        });
    }
}