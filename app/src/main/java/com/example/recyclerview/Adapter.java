package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private final List <Data> movielist;
    private final AdapterListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tvRilis, tvJudul;
        public ImageView ivGambar;

        public MyViewHolder (View view) {
            super(view);
            tvJudul = view.findViewById(R.id.tvjudul);
            tvRilis = view.findViewById(R.id.tvrilis);
            ivGambar = view.findViewById(R.id.ivgambar);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onDataSelected(movielist.get(getAdapterPosition()));
                }
            });
        }
    }


    public Adapter(Context context, List<Data> movielist, AdapterListener listener) {
        this.context = context;
        this.movielist = movielist;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(ItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        final Data data = this.movielist.get(position);
        holder.tvJudul.setText(data.getJudul());
        holder.tvRilis.setText(data.getRilis());
        Glide.with(holder.itemView.getContext()).load(data.getImage()).into(holder.ivGambar);
    }

    @Override
    public int getItemCount() {
        return this.movielist.size();
    }
    public interface AdapterListener {
        void onDataSelected(Data data);
    }

}
