package com.example.appteste03widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
    }



    public void realizarLogin(View view){
        String email = txtEmail.getText().toString();
        String senha = txtSenha.getText().toString();

        String msg = "Falha no login! Tente novamente";
        if(email.equals("teste@email.com") && senha.equals("12345")){
            msg = "Login realizado!";
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();


    }
}