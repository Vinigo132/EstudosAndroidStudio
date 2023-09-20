package com.example.apptarefas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TarefaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Associar o conjunto de dados (Lista) ao adapter
        List<Tarefa> lista = Tarefa.criarListaTarefas(5);
        adapter = new TarefaAdapter(lista);

        RecyclerView rv = findViewById(R.id.rvTarefas);
        rv.setAdapter(adapter);;
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    public void adicionarTarefa(View view){
        EditText txtTarefa = findViewById(R.id.txtTarefa);
        adapter.adicionarItem(new Tarefa(txtTarefa.getText().toString()));
        txtTarefa.setText("");
        Toast.makeText(this,"Tarefa aidcionada com sucesso!",Toast.LENGTH_SHORT).show();
    }
}