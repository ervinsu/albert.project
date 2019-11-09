package com.me.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdaptor extends RecyclerView.Adapter<MainAdaptor.MainViewHolder> {
    private List<Album> albums = new ArrayList<>();
private Context context;

    public MainAdaptor(Context context) {
        this.context = context;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cv_list_twice, viewGroup, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {
        final Album album = albums.get(position);
        holder.thn.setText(album.getThnAlbum());
        holder.deskripsi.setText(album.getDescAlbum());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(context,DetailAlbumActivity.class);
                pindah.putExtra("resi",album);
                pindah.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(pindah);

            }
        });
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView deskripsi;
        TextView thn;
        ConstraintLayout constraintLayout;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
        gambar = itemView.findViewById(R.id.imageViewAlbum);
        deskripsi = itemView.findViewById(R.id.textDesc);
        thn = itemView.findViewById(R.id.textTahun);
        constraintLayout = itemView.findViewById(R.id.consParent);

        }
    }
}
