package com.example.polirouteapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class configActivity extends AppCompatActivity  {

    private Spinner spinner;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> ConfigIdioma= new ArrayList ();

        ConfigIdioma.add("Español");
        ConfigIdioma.add("Inglés");

        ArrayAdapter adpidiom= new ArrayAdapter(configActivity.this, android.R.layout.simple_spinner_dropdown_item, ConfigIdioma );

        spinner.setAdapter(adpidiom);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String ConfigIdioma=(String) spinner.getAdapter().getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayList<String> ConfigTema= new ArrayList ();

        ConfigTema.add("Claro");
        ConfigTema.add("Oscuro");

        ArrayAdapter adptema= new ArrayAdapter(configActivity.this, android.R.layout.simple_spinner_dropdown_item, ConfigTema );

        spinner2.setAdapter(adptema);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ConfigTema=(String) spinner2.getAdapter().getItem(position);
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
