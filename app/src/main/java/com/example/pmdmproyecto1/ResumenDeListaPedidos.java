package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumenDeListaPedidos extends AppCompatActivity {
    private Pedido pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_de_lista_pedidos);
        pd = (Pedido) getIntent().getExtras().getSerializable("pedido");

        TextView nombrePedido = findViewById(R.id.nombredelpedidonuevo);
        TextView nombrePizza = findViewById(R.id.nombrepizza);
        TextView cantidadPorciones = findViewById(R.id.cantidadPorciones);
        TextView nombreBebida = findViewById(R.id.nombrepizza);
        TextView precioTotal = findViewById(R.id.preciototal);

        nombrePedido.setText(pd.getNombrePedido());
        nombrePizza.setText(pd.getPizza().getNombre());
        cantidadPorciones.setText(String.valueOf(pd.getPizza().getCantidadPorciones()));
        nombreBebida.setText(pd.getBebida().getNombre());
        precioTotal.setText(String.valueOf(pd.getPrecioPedido()));

    }

}
