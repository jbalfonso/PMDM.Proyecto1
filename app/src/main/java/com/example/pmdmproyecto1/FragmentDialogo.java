package com.example.pmdmproyecto1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentDialogo extends DialogFragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_dialogo, container, false);
        final EditText editText = view.findViewById(R.id.editTextNombre);
        Button botonAceptar = view.findViewById(R.id.botonAceptar);
        Button botonCancelar = view.findViewById(R.id.botonCancelar);

        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = editText.getText().toString();

                if (!texto.equals("")) {
                    ((MainActivity) getActivity()).texto.setText(texto);


                    getDialog().dismiss();
                } else {
                    Toast.makeText(getActivity(), "Introduce el texto", Toast.LENGTH_SHORT).show();
                }
            }
        });
        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        return view;
    }
}
