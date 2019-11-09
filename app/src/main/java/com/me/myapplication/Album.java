package com.me.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Album implements Parcelable {
    private String descAlbum;
    private String thnAlbum;
    private String gambarAlbum;
    private List<Song> listLagu;

    public Album(String descAlbum, String thnAlbum, String gambarAlbum, List<Song> listLagu) {
        this.descAlbum = descAlbum;
        this.thnAlbum = thnAlbum;
        this.gambarAlbum = gambarAlbum;
        this.listLagu = listLagu;
    }

    protected Album(Parcel in) {
        descAlbum = in.readString();
        thnAlbum = in.readString();
        gambarAlbum = in.readString();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public String getDescAlbum() {
        return descAlbum;
    }

    public String getThnAlbum() {
        return thnAlbum;
    }

    public String getGambarAlbum() {
        return gambarAlbum;
    }

    public List<Song> getListLagu() {
        return listLagu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(descAlbum);
        parcel.writeString(thnAlbum);
        parcel.writeString(gambarAlbum);
    }
}
