package com.example.puebliando1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate  (savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitiosturisticos);

        //detectando eventos
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthotel = new Intent(Home.this,HotelesHome.class);
                startActivity(intenthotel);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrest = new Intent(Home.this,Restaurantes.class);
                startActivity(intentrest);
            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenturismo = new Intent(Home.this,Sitios.class);
                startActivity(intenturismo);            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menujava){
        getMenuInflater().inflate(R.menu.menu,menujava);
        return true;

    }
    public boolean onOptionsItemSelect(MenuItem item){
    int itemseleccionado= item.getItemId();
    switch (itemseleccionado){
        case(R.id.opcion1):
            break;
        case (R.id.opcion2) :
            break;
        case (R.id.opcion3) :
            break;
        case (R.id.opcion4) :

            Intent intent = new Intent(Home.this,Acerca.class);
            startActivity(intent);
            break;


    }
return super.onOptionsItemSelected(item);
    }
public void cambiaridioma(String idiooma){

}
}