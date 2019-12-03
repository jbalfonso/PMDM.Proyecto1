package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class FormularioDelPago extends AppCompatActivity {
   private ArrayList<Pedido> listadoPedidos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_del_pago);
        Bundle parametrosTotal = getIntent().getExtras();
        Button pagar = findViewById(R.id.BotonPagar);

        listadoPedidos = (ArrayList<Pedido>) getIntent().getSerializableExtra("listaPedidos");
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentact3 = new Intent(FormularioDelPago.this, ResumenDelPago.class);
                EditText numeroTarjeta = findViewById(R.id.numerotarjeta);
                EditText caducidad = findViewById(R.id.caducidadtarjeta);
                EditText seguridad = findViewById(R.id.codigoSeguridad);
                RadioButton visa = findViewById(R.id.visa);
                RadioButton mastercard = findViewById(R.id.mastercard);
                RadioButton euro6000 = findViewById(R.id.euro6000);
                String id=" ";
                if(visa.isChecked()){
                    id="visa";
                }else if(mastercard.isChecked()){
                    id="mastercard";
                }else if(euro6000.isChecked()){
                    id="euro6000";
                }
                Tarjeta tarjeta = new Tarjeta(numeroTarjeta.getText().toString(),id,caducidad.getText().toString(),seguridad.getText().toString());

                intentact3.putExtra("datos",listadoPedidos);
                intentact3.putExtra("tarjeta",tarjeta);

                startActivity(intentact3);
            }
        });

    }
}
