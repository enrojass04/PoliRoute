package com.example.polirouteapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
    }
    public void retrocesoconfig(View view){
        Intent retconfig =new Intent(this, MainActivity.class);
        startActivity(retconfig);
    }
}


