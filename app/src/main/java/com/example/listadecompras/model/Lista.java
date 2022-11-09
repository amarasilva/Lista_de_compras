package com.example.listadecompras.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Lista /*implements Parcelable*/ {

    private int id;
    private String nomeLista;
    private String item;


    public Lista(int id, String nomeLista, String item) {
        this.id = id;
        this.nomeLista = nomeLista;
        this.item = item;
    }


    public int getId() {
        return id;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

/*
    protected Lista(Parcel in) {
        id = in.readInt();
        nomeLista = in.readString();
        item = in.readString();
    }

    public static final Creator<Lista> CREATOR = new Creator<Lista>() {
        @Override
        public Lista createFromParcel(Parcel in) {
            return new Lista(in);
        }

        @Override
        public Lista[] newArray(int size) {
            return new Lista[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(nomeLista);
        parcel.writeString(item);
    }*/
}
