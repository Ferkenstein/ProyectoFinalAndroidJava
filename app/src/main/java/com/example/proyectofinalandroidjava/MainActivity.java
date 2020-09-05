package com.example.proyectofinalandroidjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Apartament> apartamentList;
    RecyclerView recyclerDepartament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apartamentList = new ArrayList<>();
        recyclerDepartament = findViewById(R.id.recycler_id);
        recyclerDepartament.setLayoutManager(new LinearLayoutManager(this));

        fillApartament();

        ApartamentAdapter adapter = new ApartamentAdapter(apartamentList);
        recyclerDepartament.setAdapter(adapter);

    }

    private void fillApartament() {
        Apartament apartment01 = new Apartament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " ,"https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Apartament apartment02 = new Apartament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " , "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Apartament apartment03 = new Apartament("Edificio Almendro", "San jose 345, La florida , Santiago", "Torre 1, depto 2002 " , "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");

        apartamentList.add(apartment01);
        apartamentList.add(apartment02);
        apartamentList.add(apartment03);

    }
}