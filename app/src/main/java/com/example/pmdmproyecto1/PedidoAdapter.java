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

    public PedidoAdapter(ArrayList<Pedido> lista){this.lista=lista;}

    @NonNull
    @Override
    public PedidoAdapter.MiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.elementoslista, viewGroup, false);
        MiViewHolder miViewHolder = new MiViewHolder(view);

        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        String nombre = lista.get(position).getNombrePedido();
        holder.nombretextView.setText(nombre);

        double precio = lista.get(position).getPrecioPedido();
        holder.preciotextView.setText(String.valueOf(precio));

    }

    @Override
    public int getItemCount() {
        if (lista == null)
            return 0;
        else
            return lista.size();

    }

    public static class MiViewHolder extends RecyclerView.ViewHolder {
        public TextView nombretextView;
        public TextView preciotextView;

        public MiViewHolder(View view) {
            super(view);

            nombretextView = itemView.findViewById(R.id.nombrePedidoTextView);
            preciotextView = itemView.findViewById(R.id.precioPedidoTextView);
        }
    }
}
