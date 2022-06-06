package com.example.polirouteapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Bienvenida  extends AppCompatActivity {

    private Spinner spinner3;
    private Spinner spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicioexito);

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayList<String> origenes= new ArrayList ();

        origenes.add("Seleccione");
        origenes.add("Parqueadero Vehiculos");
        origenes.add("Paradero Buses");
        origenes.add("Cancha Multiple");
        origenes.add("Cafeteria Central");
        origenes.add("Rectoria");
        origenes.add("Campo de Tenis");
        origenes.add("Auditorio Jaime Michelsen");
        origenes.add("Biblioteca");
        origenes.add("Bloque A");
        origenes.add("Bloque B");
        origenes.add("Bloque C");
        origenes.add("Bloque D");
        origenes.add("Bloque E");
        origenes.add("Bloque F");
        origenes.add("Bloque G");
        origenes.add("Bloque H");
        origenes.add("Bloque I");
        origenes.add("Bloque J");
        origenes.add("Bloque K");
        origenes.add("Bloque L");


        ArrayAdapter Adporigen= new ArrayAdapter(Bienvenida.this, android.R.layout.simple_spinner_dropdown_item, origenes );

        spinner3.setAdapter(Adporigen);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String origenes=(String) spinner3.getAdapter().getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4 = (Spinner) findViewById(R.id.spinner4);
        ArrayList<String> destinos= new ArrayList ();

        destinos.add("Seleccione");
        destinos.add("Parqueadero Vehiculos");
        destinos.add("Paradero Buses");
        destinos.add("Cancha Multiple");
        destinos.add("Cafeteria Central");
        destinos.add("Rectoria");
        destinos.add("Campo de Tenis");
        destinos.add("Auditorio Jaime Michelsen");
        destinos.add("Biblioteca");
        destinos.add("Bloque A");
        destinos.add("Bloque B");
        destinos.add("Bloque C");
        destinos.add("Bloque D");
        destinos.add("Bloque E");
        destinos.add("Bloque F");
        destinos.add("Bloque G");
        destinos.add("Bloque H");
        destinos.add("Bloque I");
        destinos.add("Bloque J");
        destinos.add("Bloque K");
        destinos.add("Bloque L");


        ArrayAdapter Adpdest = new ArrayAdapter(Bienvenida.this, android.R.layout.simple_spinner_dropdown_item, destinos );

        spinner4.setAdapter(Adpdest);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String destinos=(String) spinner4.getAdapter().getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void retrocesoconfig(View view){
        Intent retconfig =new Intent(this, MainActivity.class);
        startActivity(retconfig);
    }



}