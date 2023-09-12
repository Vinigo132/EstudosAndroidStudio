package com.example.apptestenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private String[] itens = {"Item 1","Item 2","Item 3","Item 4","Item 5"};

    private String ItemSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        //  preencher o spinner
        Spinner spin = (Spinner) findViewById(R.id.spnUsuarios);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item, itens
        );
        spin.setAdapter(adapter);

        // IDENTIFICAR O ITEM SELECIONADO NO ADAPTER
        //
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ItemSelecionado = itens[i];
            }
            
            // usar quando n tiver nd selecioando
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }



    // voltar aplicacao
    public void onClickVoltar(View view){
        finish();
    }

    //ir para 3 tela a partir do selecionado
    public void onClickSelecionar(View view){
        Intent it = new Intent(
                MainActivity2.this,
                MainActivity3.class
        );
        it.putExtra("item_selecionado", ItemSelecionado);
        startActivity(it);
    }
}