package com.example.mireles.conocete;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class huesos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huesos);
        Button espanol = findViewById(R.id.espagnol);
        Button ingles = findViewById(R.id.ingles);
        Button frances = findViewById(R.id.frances);
        espanol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale localizacion = new Locale("es", "ES");
                Locale.setDefault(localizacion);
                Configuration config = new Configuration();
                config.locale = localizacion;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                finish();
                startActivity(getIntent());
            }
        });

        ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale localizacion = new Locale("en", "EN");
                Locale.setDefault(localizacion);
                Configuration config = new Configuration();
                config.locale = localizacion;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                finish();
                startActivity(getIntent());
            }
        });
        frances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale localizacion = new Locale("fr", "FR");
                Locale.setDefault(localizacion);
                Configuration config = new Configuration();
                config.locale = localizacion;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                finish();
                startActivity(getIntent());
            }
        });

    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_huesos, menu);

        return true;
    }

    // Metodo para asignar las funciones correspondientes a las opciones del menu
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if (id == R.id.main){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }else if (id == R.id.musculos){
            Intent i = new Intent(this, musculos.class);
            startActivity(i);

        }else if (id == R.id.nervios){
            Intent i = new Intent(this, nervios.class);
            startActivity(i);

        }else if(id == R.id.organos){
            Intent i = new Intent(this, organos.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}
