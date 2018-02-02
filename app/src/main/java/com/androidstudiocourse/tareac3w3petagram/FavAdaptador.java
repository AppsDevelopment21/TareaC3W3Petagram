package com.androidstudiocourse.tareac3w3petagram;

/**
 * Created by Jhoanpaul on 2/2/2018.
 */
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

public class FavAdaptador extends RecyclerView.Adapter<FavAdaptador.FavViewHolder>{
    ArrayList<Fav> pets2;
    Activity activity2;

    public FavAdaptador(ArrayList<Fav> pets2, Activity activity2){
        this.pets2 = pets2;
        this.activity2 = activity2;
    }
    @Override
    public FavViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pets, parent, false);
        return new FavViewHolder(v);
    }
    @Override
    public void onBindViewHolder (FavViewHolder FavViewHolder, int position){
        final Fav pet2 = pets2.get(position);
        FavViewHolder.imgFoto2.setImageResource(pet2.getImgFoto2());
        FavViewHolder.tvNombreCV2.setText(pet2.getNombre2());

        FavViewHolder.btnlike2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity2,"Diste like a" + pet2.getNombre2(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() { return  pets2.size(); }

    public static class FavViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto2;
        private TextView tvNombreCV2;
        private ImageButton btnlike2;

        public FavViewHolder(View itemView){
            super(itemView);
            imgFoto2    = (ImageView) itemView.findViewById(R.id.imageview_cadview);
            tvNombreCV2 = (TextView) itemView.findViewById(R.id.textview_cardview);
            btnlike2    = (ImageButton) itemView.findViewById(R.id.btnLike);
        }
    }


}
