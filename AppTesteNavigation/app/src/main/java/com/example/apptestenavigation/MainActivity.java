package com.example.apptestenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    //        navegacao para tela 2

        Button btn = (Button) findViewById(R.id.btnEntrar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(
                        MainActivity.this,
                        MainActivity2.class
                );
                startActivity(it);
            }
        });
    }
}