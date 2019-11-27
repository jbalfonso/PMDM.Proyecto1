package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResumenDelPedido extends AppCompatActivity {
private String nombrecliente="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_del_pedido);
        final TextView resumen = findViewById(R.id.txvresumenPedido);
        Bundle parametrosTotal = getIntent().getExtras();
        Button aceptar = findViewById(R.id.btnFormularioPago);
        Button cancelar = findViewById(R.id.btnCancelar);
        if(parametrosTotal !=null){
             nombrecliente = parametrosTotal.getString("nombreusuario");
             String nombrePizza = parametrosTotal.getString("nombrePizza");
            String nombreBebida = parametrosTotal.getString("nombreBebida");
            String cantidad = parametrosTotal.getString("cantidad");
            String precioTotal = parametrosTotal.getString("preciototal");
            String total= String.format("%n %n %n Nombre del cliente: %s %n Pizza: %s %n Bebida: %s %n Cantidad: %s %n Precio Total= %s€ %n",nombrecliente,nombrePizza,nombreBebida,cantidad,precioTotal);
            resumen.setText(resumen.getText()+total);

        }
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentact2 = new Intent(ResumenDelPedido.this, FormularioDelPago.class);
                intentact2.putExtra("datos",resumen.getText().toString());
                intentact2.putExtra("nombre",nombrecliente);
                startActivity(intentact2);
            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}

