package com.example.pmdmproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String url = "https://pizzatime2dam.herokuapp.com/";
    private double precioCarbonara = 3.50;
    private double precioRomana = 4.50;
    private double precioBarbacoa = 5.50;
    private double precioAgua = 1;
    private double precioCocacola = 1.50;
    private double precioTotal_var = 0;
    private boolean bolagua = true;
    private boolean bolcocacola = true;
    private int cantidadPorciones = 1;
    private int pizzaid = 0;
    private int bebidaid = 0;
    private double totalpizza = 0;
    private double totalbebida = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton carbonara = findViewById(R.id.btnCarbonara);
        final ImageButton barbacoa = findViewById(R.id.btnBarbacoa);
        final ImageButton romana = findViewById(R.id.btnRomana);
        final ImageButton agua = findViewById(R.id.btnAgua);
        final ImageButton cocacola = findViewById(R.id.btnCocaCola);
        final EditText nombreusuario = findViewById(R.id.nombreUsuario);
        final TextView cantidad = findViewById(R.id.txtvcantidad);
        cantidad.setText(String.valueOf(cantidadPorciones));
        final TextView precioTotal = findViewById(R.id.txvprecioTotal);


        precioTotal.setText(String.valueOf(0));


        Button menos = findViewById(R.id.btnMenos);
        Button mas = findViewById(R.id.btnMas);
        Button enviar = findViewById(R.id.btnEnviar);


        carbonara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidadPorciones = 1;
                cantidad.setText(String.valueOf(cantidadPorciones));


                int color = Color.parseColor("#b0deff");
                carbonara.setBackgroundColor(color);
                romana.setBackgroundColor(0);
                barbacoa.setBackgroundColor(0);
                pizzaid = 1;
                totalpizza = precioCarbonara;
                precioTotal_var = totalpizza + totalbebida;
                precioTotal.setText(String.valueOf(precioTotal_var));

            }
        });
        barbacoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidadPorciones = 1;
                cantidad.setText(String.valueOf(cantidadPorciones));
               /* if (bebidaid==1){
                    precioTotal_var += precioAgua;
                }else if (bebidaid==2){
                    precioTotal_var+=precioCocacola;
                }else{
                    precioTotal_var=0;
                }*/
                int color = Color.parseColor("#b0deff");
                barbacoa.setBackgroundColor(color);
                carbonara.setBackgroundColor(0);
                romana.setBackgroundColor(0);
                pizzaid = 2;
                totalpizza = precioBarbacoa;
                precioTotal_var = totalpizza + totalbebida;
                precioTotal.setText(String.valueOf(precioTotal_var));
            }
        });
        romana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidadPorciones = 1;
                cantidad.setText(String.valueOf(cantidadPorciones));
               /* if (bebidaid==1){
                    precioTotal_var += precioAgua;
                }else if (bebidaid==2){
                    precioTotal_var+=precioCocacola;
                }else{
                    precioTotal_var=0;
                }*/

                int color = Color.parseColor("#b0deff");
                romana.setBackgroundColor(color);
                carbonara.setBackgroundColor(0);
                barbacoa.setBackgroundColor(0);
                pizzaid = 3;
                totalpizza = precioRomana;
                precioTotal_var = totalpizza + totalbebida;
                precioTotal.setText(String.valueOf(precioTotal_var));
            }
        });
        agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // bolcocacola = true;
                totalbebida = precioAgua;
                int color = Color.parseColor("#b0ceff");
                agua.setBackgroundColor(color);
                cocacola.setBackgroundColor(0);
                bebidaid = 1;
                cantidadPorciones = 1;
                cantidad.setText(String.valueOf(cantidadPorciones));
                precioTotal_var = totalpizza + totalbebida;
                precioTotal.setText(String.valueOf(precioTotal_var));
               /* if (bolagua) {
                    precioTotal_var += precioAgua;
                    precioTotal.setText(String.valueOf(precioTotal_var));
                    bolagua = false;
                }*/


            }
        });

        cocacola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   bolagua = true;
              /*  if (bebidaid == 1) {
                    totalbebida -= precioAgua;
                }*/
                totalbebida = precioCocacola;
                int color = Color.parseColor("#b0ceff");
                cocacola.setBackgroundColor(color);
                agua.setBackgroundColor(0);
                bebidaid = 2;
                cantidadPorciones = 1;
                cantidad.setText(String.valueOf(cantidadPorciones));
                precioTotal_var = totalpizza + totalbebida;
                precioTotal.setText(String.valueOf(precioTotal_var));
             /*   if (bolcocacola) {
                    precioTotal_var += precioCocacola;
                    precioTotal.setText(String.valueOf(precioTotal_var));
                    bolcocacola = false;
                }*/

            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cantidadPorciones >= 1) {
                    cantidadPorciones--;
                    cantidad.setText(String.valueOf(cantidadPorciones));
                   /* if (pizzaid == 1) {
                        precioTotal_var -= precioCarbonara;
                    } else if (pizzaid == 2) {
                        precioTotal_var -= precioBarbacoa;
                    } else if (pizzaid == 3) {
                        precioTotal_var -= precioRomana;
                    }*/
                    precioTotal_var = totalpizza * cantidadPorciones;
                    precioTotal_var += totalbebida;
                    precioTotal.setText(String.valueOf(precioTotal_var));
                }

            }
        });
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cantidadPorciones < 100) {
                    cantidadPorciones++;
                    cantidad.setText(String.valueOf(cantidadPorciones));
                    /*if (pizzaid == 1) {
                        precioTotal_var += precioCarbonara;
                    } else if (pizzaid == 2) {
                        precioTotal_var += precioBarbacoa;
                    } else if (pizzaid == 3) {
                        precioTotal_var += precioRomana;
                    }*/
                    precioTotal_var = totalpizza * cantidadPorciones;
                    precioTotal_var += totalbebida;
                    precioTotal.setText(String.valueOf(precioTotal_var));
                }
            }
        });
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAct1 = new Intent(MainActivity.this, ResumenDelPedido.class);
                String nombrepizza = " ";
                String nombrebebida = " ";
                if (pizzaid == 1) {
                    nombrepizza = "Carbonara";
                } else if (pizzaid == 2) {
                    nombrepizza = "Barbacoa";
                } else if (pizzaid == 3) {
                    nombrepizza = "Romana";
                }
                intentAct1.putExtra("nombrePizza", nombrepizza);
                if (bebidaid == 1) {
                    nombrebebida = "Agua";
                } else if (bebidaid == 2) {
                    nombrebebida = "Cocacola";
                }


                intentAct1.putExtra("nombreusuario", nombreusuario.getText().toString());
                intentAct1.putExtra("nombreBebida", nombrebebida);
                intentAct1.putExtra("cantidad", String.valueOf(cantidadPorciones));
                intentAct1.putExtra("preciototal", String.valueOf(precioTotal_var));
                startActivity(intentAct1);
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        boolean bol = false;
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;

            case R.id.Web:

                Intent i = new Intent(Intent.ACTION_VIEW);
                bol = false;
                i.setData(Uri.parse(url));
                startActivity(i);
                break;

        }
        return bol;
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}

