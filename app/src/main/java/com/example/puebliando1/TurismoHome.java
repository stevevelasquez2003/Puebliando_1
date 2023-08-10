package com.example.puebliando1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurismoHome extends AppCompatActivity {

    Button botonVermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo_home);
        botonVermas=findViewById(R.id.botonvermas);

        botonVermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(TurismoHome.this,ListaSitiosTuristicos.class);
                startActivity(intent);
            }
        });

    }
}