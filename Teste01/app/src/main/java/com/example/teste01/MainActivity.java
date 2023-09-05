package com.example.teste01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void cliqueBotao1(View view){
        Toast t = Toast.makeText(getApplicationContext(), "Bom dia", Toast.LENGTH_LONG);
        t.show();
    }

    public void cliqueBotao2(View view){
        Toast t = Toast.makeText(getApplicationContext(), "Boa tarde", Toast.LENGTH_LONG);
        t.show();
    }
}