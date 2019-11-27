package com.example.pmdmproyecto1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.MiViewHolder> {
private ArrayList<Pedido> lista;


    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from());
        MiViewHolder miViewHolder = new MiViewHolder(view);

        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MiViewHolder extends RecyclerView.ViewHolder {
    public TextView nombretextView;
    public TextView apariciontextView;

    public MiViewHolder(View view) {
        super(view);

        nombretextView = itemView.findViewById(R.id.nombrePedidoTextView);
        apariciontextView = itemView.findViewById(R.id.precioPedidoTextView);
    }
}
}
