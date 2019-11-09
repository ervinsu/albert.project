package com.me.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView main;

    MainAdaptor adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = findViewById(R.id.rv_album);
        main.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adaptor = new MainAdaptor(MainActivity.this);

        Song song = new Song("feels special", "02:53");
        List<Song> songs = new ArrayList<>();
        songs.add(song);

        Album album = new Album("feels special","2019","",songs);
        List<Album> albums = new ArrayList<>();
        albums.add(album);

        main.setAdapter(adaptor);
        adaptor.setAlbums(albums);


    }
}
