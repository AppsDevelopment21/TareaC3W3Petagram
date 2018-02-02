package com.androidstudiocourse.tareac3w3petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listaPets;
    ArrayList<Pet> pets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        listaPets = (RecyclerView) findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets.setLayoutManager(llm);
        inicializarListaPets();
        inicializarAdaptador();

        //PetAdaptador adaptador;
    }
    public void clickFavoritos (View view){
        Intent intent = new Intent(MainActivity.this, Favoritos.class);
        startActivity(intent);
    }

    public PetAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new PetAdaptador(pets, this);
        listaPets.setAdapter(adaptador);

    }
    public void inicializarListaPets(){
        pets = new ArrayList<Pet>();

        pets.add(new Pet("Zeus", R.drawable.pet1));
        pets.add(new Pet("Flash", R.drawable.pet2));
        pets.add(new Pet("Stee", R.drawable.pet3));
        pets.add(new Pet("Manchas", R.drawable.pet4));
        pets.add(new Pet("Dollar", R.drawable.pet5));
        pets.add(new Pet("Copito", R.drawable.pet6));
        pets.add(new Pet("Nero", R.drawable.pet7));
        pets.add(new Pet("Chocli", R.drawable.pet8));
        pets.add(new Pet("Randy", R.drawable.pet9));
        pets.add(new Pet("Ronny", R.drawable.pet10));
    }
}

