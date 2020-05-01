package com.example.comunicacionentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //¿Quien tiene el bundle? Lo tiene el intent
        //¿Quien tiene el intent?
        Intent intentRecibido = getIntent();

        Bundle unBundleRecibido = intentRecibido.getExtras();

        //lo guardo en una variable nueva tipo String para poder imprimirlo
        String saludo = unBundleRecibido.getString("nombre");

        //imprimo entonces el valor
        Toast.makeText(this, saludo, Toast.LENGTH_SHORT).show();
    }
}
