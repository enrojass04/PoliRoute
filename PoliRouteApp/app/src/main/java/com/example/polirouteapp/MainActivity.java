package com.example.polirouteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickConfig(View view){
        Intent iconfig =new Intent(this, configActivity.class);
        startActivity(iconfig);
    }

    public void onClickRegistro(View view){
        Intent iregister =new Intent(this, Registrarse.class);
        startActivity(iregister);
    }

    public void onClickpaginicio(View view){
        Intent iniciosesion =new Intent(this, InicioSesion.class);
        startActivity(iniciosesion);
    }

}
