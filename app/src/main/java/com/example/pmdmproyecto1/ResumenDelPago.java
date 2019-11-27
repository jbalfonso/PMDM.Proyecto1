package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResumenDelPago extends AppCompatActivity {
    private String datos = " ";
    private String cuerpo_mensaje = " ";
    private String caducidad = " ";
    private String numeroTarjeta = " ";
    private String numeroseguridad = " ";
    private String tipoTargeta = " ";
    private String nombrecliente = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_del_pago);
        Button cancelar = findViewById(R.id.btnCancelarPago);
        Button aceptar = findViewById(R.id.btnAceptarPago);
        Bundle parametrosTotal = getIntent().getExtras();
        TextView resumenpago = findViewById(R.id.txvresumenPago);
        if (parametrosTotal != null) {

            nombrecliente = parametrosTotal.getString("nombrecliente");
            datos = parametrosTotal.getString("datos");
            caducidad = parametrosTotal.getString("caducidad");
            numeroseguridad = parametrosTotal.getString("seguridad");
            numeroTarjeta = parametrosTotal.getString("numerotarjeta");
            tipoTargeta = parametrosTotal.getString("tipotarjeta");
            String pago = String.format(" %n Numero tarjeta: %S Caducidad: %s %n Numero de seguridad: %s %n Tipo de tarjeta: %s %n", numeroTarjeta, caducidad, numeroseguridad, tipoTargeta);
            cuerpo_mensaje = String.format("Pedido: %s %n Datos de Pago: %s %n", datos, pago);
            resumenpago.setText(cuerpo_mensaje);
        }
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pago="Pago realizado";
                Toast.makeText(ResumenDelPago.this,pago,Toast.LENGTH_LONG).show();
            }
        });
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String asunto = String.format("Justificante de pago de: %s", nombrecliente);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
                intent.putExtra(Intent.EXTRA_TEXT, cuerpo_mensaje);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });

    }

}
