package com.androidstudiocourse.tareac3w3petagram;

/**
 * Created by Jhoanpaul on 2/1/2018.
 */

public class Pet {
    private String nombre;
    private int foto;

    public Pet(String nombre, int foto){
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
