package com.me.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailAlbumActivity extends AppCompatActivity {
TextView textViewNamaAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_album);

        Album fs = getIntent().getParcelableExtra("resi");

        textViewNamaAlbum = findViewById(R.id.textViewNamaAlbum);
        assert fs != null;
        textViewNamaAlbum.setText(fs.getDescAlbum());
    }
}
