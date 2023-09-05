package com.example.teste02contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    private TextView valorCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //referencia o widget da view
        valorCont = findViewById(R.id.valorCont);
        atualiza();

        //Evento de Clique no botão decrementar
        Button btn = (Button)findViewById(R.id.btnDecremento);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador--;
                atualiza();
            }
        });
    }


    private void atualiza(){
        valorCont.setText(String.valueOf(contador));
    }

//    public void decrementar(View view){
//        contador--;
//        atualiza();
//    }

    public void incrementar(View view){
        contador++;
        atualiza();
    }
}