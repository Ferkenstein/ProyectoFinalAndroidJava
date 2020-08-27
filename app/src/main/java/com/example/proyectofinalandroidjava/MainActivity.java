package com.example.proyectofinalandroidjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Departament> departamentList;
    RecyclerView recyclerDepartament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        departamentList = new ArrayList<>();
        recyclerDepartament = findViewById(R.id.recycler_id);
        recyclerDepartament.setLayoutManager(new LinearLayoutManager(this));

        fillApartament();

        DepartamentAdapter adapter = new DepartamentAdapter(departamentList);
        recyclerDepartament.setAdapter(adapter);

    }

    private void fillApartament() {
        Departament apartment01 = new Departament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " , R.drawable.edificio1);
        Departament apartment02 = new Departament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " , R.drawable.edificio1);
        Departament apartment03 = new Departament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " , R.drawable.edificio1);

        departamentList.add(apartment01);
        departamentList.add(apartment02);
        departamentList.add(apartment03);

    }
}