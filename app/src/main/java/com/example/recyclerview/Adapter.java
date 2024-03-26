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
    private List<Data> MakananList;
    private MainActivity adapter1;
    private ItemClickListener itemclicklistener;
    private Context context;

    public Adapter(Context context, List<Data> makananlist, MainActivity listener) {
        this.context = context;
        this.MakananList = makananlist;
        this.adapter1 = adapter1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Data data = MakananList.get(position);
        holder.tvJudul.setText(data.getJudul());
        holder.tvDeskripsi.setText(data.getDeskripsi());

        Glide.with(holder.itemView.getContext())
                .load(data.getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.ivGambar);
    }

    @Override
    public int getItemCount() {
        return MakananList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvDeskripsi, tvJudul;
        public ImageView ivGambar;

        public MyViewHolder(View view) {
            super(view);
            tvJudul = view.findViewById(R.id.tvjudul);
            tvDeskripsi = view.findViewById(R.id.tvDeskripsi);
            ivGambar = view.findViewById(R.id.ivgambar);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemclicklistener != null) itemclicklistener.onItemClick(view, getAdapterPosition());
        }
    }

    Data getItem(int id) {
        return MakananList.get(id);
    }

    void setClickListener(ItemClickListener itemClickListener) {
        this.itemclicklistener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
