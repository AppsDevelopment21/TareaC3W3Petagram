package com.androidstudiocourse.tareac3w3petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;



public class Favoritos extends AppCompatActivity {


    private RecyclerView listaPets2;
    ArrayList<Fav> pets2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaPets2 = (RecyclerView) findViewById(R.id.rvFavoritos);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets2.setLayoutManager(llm2);
        inicializarListaFavs();
        inicializarFAdaptador();

    }
    public FavAdaptador adaptador2;
    public void inicializarFAdaptador(){
        adaptador2 = new FavAdaptador(pets2, this);
        listaPets2.setAdapter(adaptador2);

    }
    public void inicializarListaFavs(){
        pets2 = new ArrayList<Fav>();

        pets2.add(new Fav("Zeus", R.drawable.pet1));
        pets2.add(new Fav("Flash", R.drawable.pet2));
        pets2.add(new Fav("Stee", R.drawable.pet3));
        pets2.add(new Fav("Manchas", R.drawable.pet4));
        pets2.add(new Fav("Dollar", R.drawable.pet5));
    }

}
