package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    private ArrayList<Pedido> listadoPedidos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        listadoPedidos = (ArrayList<Pedido>) getIntent().getSerializableExtra("listaPedidos");
        RecyclerView recycler = findViewById(R.id.reciclerView);

       // recycler.setHasFixedSize(true);

        recycler.addItemDecoration(new DividerItemDecoration(Listar.this,1));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);

        PedidoAdapter adapter = new PedidoAdapter(listadoPedidos);
        recycler.setAdapter(adapter);
        Toast.makeText(Listar.this, String.valueOf(listadoPedidos.size()), Toast.LENGTH_LONG).show();
    }
}
