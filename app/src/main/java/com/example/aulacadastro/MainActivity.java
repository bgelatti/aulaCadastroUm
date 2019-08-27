package com.example.aulacadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNome = findViewById(R.id.editText);
        edtNome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN  &&
                        edtNome.getText().toString().equals("Nome")) {
                    edtNome.setText("");
                }

                return false;
            }
        });

        final EditText edtSobreNome = findViewById(R.id.editText2);
        edtSobreNome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN  &&
                        edtSobreNome.getText().toString().equals("Sobrenome")) {
                    edtSobreNome.setText("");
                }

                return false;
            }
        });

        Button btnCadastrar = findViewById(R.id.button);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNome.getText().toString().equals("Nome") ||
                        edtSobreNome.getText().toString().equals("Sobrenome")) {
                    Toast.makeText(MainActivity.this,
                            "Preencha antes de cadastrar",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Cadastrado com Sucesso",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}