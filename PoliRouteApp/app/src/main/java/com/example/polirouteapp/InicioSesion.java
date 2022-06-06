package com.example.polirouteapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciarsesion);

    }

    public void onClickRegistro(View view){
        Intent iregister =new Intent(this, Registrarse.class);
        startActivity(iregister);
    }
    public void retrocesoconfig(View view){
        Intent retconfig =new Intent(this, MainActivity.class);
        startActivity(retconfig);
    }
    public void onClickiniciosesion(View view){
        Intent bienvenida =new Intent(this, Bienvenida.class);
        startActivity(bienvenida);
    }

}