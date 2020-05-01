package com.example.comunicacionentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.botonSiguiente = findViewById(R.id.mainActivityBotonSiguiente);

        this.botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creo intencion de ir de un lado a otro
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                // creo un Bundle o valija donde guardo la info que quiero llevar
                Bundle unBundle = new Bundle();
                //le agrego informacion
                unBundle.putString("nombre","Luisa Wallet");
                //Asocio el bundle a la intencion, los conecto
                intent.putExtras(unBundle);

                //Este es el iniciador de la conexion
                startActivity(intent);

            }
        });


    }
}
