package com.androidstudiocourse.tareac3w3petagram;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Jhoanpaul on 2/1/2018.
 */

public class PetAdaptador extends RecyclerView.Adapter<PetAdaptador.PetViewHolder>{
    ArrayList<Pet> pets;
    Activity activity;

    public PetAdaptador(ArrayList<Pet> pets, Activity activity){
        this.pets = pets;
        this.activity = activity;
    }
    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pets, parent, false);
        return new PetViewHolder(v);
    }
    @Override
    public void onBindViewHolder (PetViewHolder PetViewHolder, int position){
        final Pet pet = pets.get(position);
        PetViewHolder.imgFoto.setImageResource(pet.getFoto());
        PetViewHolder.tvNombreCV.setText(pet.getNombre());

        PetViewHolder.btnlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste like a" + pet.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() { return  pets.size(); }

    public static class PetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tvNombreCV;
        private ImageButton btnlike;

        public PetViewHolder(View itemView){
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imageview_cadview);
            tvNombreCV = (TextView) itemView.findViewById(R.id.textview_cardview);
            btnlike = (ImageButton) itemView.findViewById(R.id.btnLike);
        }
    }


}
