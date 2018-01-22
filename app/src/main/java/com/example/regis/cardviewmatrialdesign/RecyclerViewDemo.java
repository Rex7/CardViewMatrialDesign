package com.example.regis.cardviewmatrialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {
    RecyclerView recyclerView;
    List<AlbumModel> albumModelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        albumModelList.add(new AlbumModel("Charlix", "1", R.drawable.album1));
        albumModelList.add(new AlbumModel("micheal jackson", "1", R.drawable.album2));
        albumModelList.add(new AlbumModel("maroon 5", "3", R.drawable.album3));
        albumModelList.add(new AlbumModel("Lana del rey", "1", R.drawable.album4));
        albumModelList.add(new AlbumModel("Lana del rey", "1", R.drawable.album5));
        albumModelList.add(new AlbumModel("Eminem", "1", R.drawable.album6));
        albumModelList.add(new AlbumModel("Rihanna", "1", R.drawable.album7));
        albumModelList.add(new AlbumModel("bob marley", "1", R.drawable.album8));
        albumModelList.add(new AlbumModel("adele", "1", R.drawable.album9));
        albumModelList.add(new AlbumModel("Enrique", "1", R.drawable.album10));
        albumModelList.add(new AlbumModel("Justine timberlake", "1", R.drawable.album11));
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, albumModelList);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setHasFixedSize(true);
    }
}
