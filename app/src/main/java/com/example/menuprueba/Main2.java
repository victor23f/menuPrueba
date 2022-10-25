package com.example.menuprueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Main2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_main);

    }
    public void recogerDatosRegistro(View view){
        Bundle extras = getIntent().getExtras();
        TextView texto = (TextView) findViewById(R.id.textoInicial);
        String usuario,pass;
        if (extras != null) {
            usuario= extras.getString("usuario");
            pass=extras.getString("pass");

            texto.setText(usuario+"   "+pass);
        }else{
            texto.setText("Problema al recoger tus datos");
        }

    }
}
