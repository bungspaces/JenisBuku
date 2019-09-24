package com.example.jenisbuku.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.jenisbuku.R;
import com.example.jenisbuku.detailActivity;
import com.example.jenisbuku.model.Buku;

import java.util.ArrayList;

public class AdapterBuku extends Activity.Adapter<AdapterBuku.ListViewHolder> {
    private ArrayList<Buku> listBuku;
    Context context ;

    public AdapterBuku(ArrayList<Buku> list, Context context){
        this.listBuku = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_buku, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Buku buku = listBuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(50,50).centerCrop())
                .into(holder.imgPhoto);
        holder.tvNama.setText(buku.getNama());
        holder.tvAsal.setText(buku.getAsal());
        holder.tvKarakter.setText(buku.getKarakter());
        holder.LLItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, detailActivity.class);
                intent.putExtra("putNama", listBuku.get(position).getNama());
                intent.putExtra("putAsal", listBuku.get(position).getAsal());
                intent.putExtra("putKar", listBuku.get(position).getKarakter());
                intent.putExtra("putKet", listBuku.get(position).getKeterangan());
                intent.putExtra("putPhoto", listBuku.get(position).getPhoto());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public class ListViewHolder extends Activity.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvAsal,tvKarakter,tvKeterangan;
        LinearLayout LLItem;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.imgBuku);
            tvNama = itemView.findViewById(R.id.nmBuku);
            tvAsal = itemView.findViewById(R.id.asalBuku);
            tvKarakter = itemView.findViewById(R.id.karBuku);
            tvKeterangan = itemView.findViewById(R.id.ketDetailBuku);
            LLItem = itemView.findViewById(R.id.LLItem);
        }
    }
}
