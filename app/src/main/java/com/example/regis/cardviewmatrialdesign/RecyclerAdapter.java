package com.example.regis.cardviewmatrialdesign;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolders> {
    List<AlbumModel> albumModels;
    Context context;

    public RecyclerAdapter(Context context, List<AlbumModel> albumModels) {
        this.albumModels = albumModels;
        this.context = context;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolders holders = new ViewHolders(view);
        return holders;
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.title.setText(albumModels.get(position).getTitle());
        holder.count.setText(albumModels.get(position).getCount());
        Glide.with(context)
                .load(albumModels.get(position).getImgOfSong())
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return albumModels.size();
    }

    class ViewHolders extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title, count;
        ImageView img;

        public ViewHolders(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
            title = (TextView) itemView.findViewById(R.id.title);
            count = (TextView) itemView.findViewById(R.id.count);
            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}





