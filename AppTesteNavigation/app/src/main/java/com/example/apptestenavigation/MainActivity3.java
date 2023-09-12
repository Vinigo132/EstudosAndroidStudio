package com.example.apptestenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //Recuperar dados extras do Intent
        String valor = getIntent().getStringExtra("item_selecionado");

        TextView txt = (TextView)findViewById(R.id.txtItemSelecionado);
        txt.setText(valor);



        // btn voltar
        Button btn = (Button)findViewById(R.id.btnVoltar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(
                        MainActivity3.this,
                        MainActivity.class
                );
                startActivity(it);
            }
        });
    }
}