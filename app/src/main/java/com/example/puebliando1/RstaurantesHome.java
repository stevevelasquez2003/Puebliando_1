package com.example.puebliando1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RstaurantesHome extends AppCompatActivity {

    Button botonVermas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rstaurantes_home);

        botonVermas2=findViewById(R.id.botonvermasr);

        botonVermas2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v){

                    Intent intent = new Intent(RstaurantesHome.this,ListaRestaurantes.class);
                    startActivity(intent);
                }
            });
    }
}