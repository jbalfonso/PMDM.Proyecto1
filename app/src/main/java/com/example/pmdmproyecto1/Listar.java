package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    private ArrayList<Pedido> listadoPedidos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        listadoPedidos = (ArrayList<Pedido>) getIntent().getSerializableExtra("listaPedidos");
        final RecyclerView recycler = findViewById(R.id.reciclerView);

       recycler.setHasFixedSize(true);

        recycler.addItemDecoration(new DividerItemDecoration(Listar.this,1));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);

        PedidoAdapter adapter = new PedidoAdapter(listadoPedidos);

        Toast.makeText(Listar.this, String.valueOf(listadoPedidos.size()), Toast.LENGTH_LONG).show();

        adapter.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pedido pedido = listadoPedidos.get(recycler.getChildAdapterPosition(v));
                Toast.makeText(Listar.this,"HAS HECHO CLICK", Toast.LENGTH_LONG).show();
                Intent intentact3 = new Intent(Listar.this, ResumenDeListaPedidos.class);
                intentact3.putExtra("pedido",pedido);
                startActivity(intentact3);
            }
        });
        recycler.setAdapter(adapter);
    }
}
