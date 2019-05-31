package com.example.mireles.conocete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    // Metodo para asignar las funciones correspondientes a las opciones del menu
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if (id == R.id.huesos){
            Intent i = new Intent(this, huesos.class);
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
