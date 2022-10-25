package com.example.menuprueba;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        Intent botonMenu = new Intent(this, Main2.class);
        switch (item.getItemId()) {
            case R.id.Empezar:
                Toast.makeText(MainActivity.this,"ACERCA DE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Siguiente:
                startActivity(botonMenu);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

