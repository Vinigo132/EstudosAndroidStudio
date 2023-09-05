package com.example.extabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numero = 0 ;

    private TextView tabuadaNmrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabuadaNmrs = findViewById(R.id.tabuadaNmrs);

    }

    public void tabuada(View view){
        Button nmr = (Button) findViewById(view.getId());
        nmr.setBackgroundColor(Color.RED);
        numero = Integer.parseInt(nmr.getText().toString());
        String tabu = "";

        for (int i = 1; i<=10; i++){
            tabu += numero +  " x " + i + " = " + numero*i + "\n";
        }

        tabuadaNmrs.setText(tabu);


    }

}