package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FormularioDelPago extends AppCompatActivity {
   private String datos=" ";
   private String nombrecliente=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_del_pago);
        Bundle parametrosTotal = getIntent().getExtras();
        Button pagar = findViewById(R.id.BotonPagar);

        if(parametrosTotal !=null){


            datos=parametrosTotal.getString("datos");
            nombrecliente=parametrosTotal.getString("nombre");
        }
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
                intentact3.putExtra("tipotarjeta",id);
                intentact3.putExtra("datos",datos);
                intentact3.putExtra("numerotarjeta",numeroTarjeta.getText().toString());
                intentact3.putExtra("caducidad",caducidad.getText().toString());
                intentact3.putExtra("seguridad",seguridad.getText().toString());
                intentact3.putExtra("nombrecliente", nombrecliente);
                startActivity(intentact3);
            }
        });

    }
}
