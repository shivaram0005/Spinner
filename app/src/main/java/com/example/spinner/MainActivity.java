package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
       spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Toast.makeText(MainActivity.this, "You selected is " , Toast.LENGTH_SHORT).show();
           }
       });
    }
    String name[]={"Spinner1","Spinner2","Spinner3","Spinner4","Spinner5","Spinner6","Spinner7","Spinner8"};
}