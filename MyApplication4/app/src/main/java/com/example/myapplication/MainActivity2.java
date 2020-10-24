package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent il = getIntent();
        String Str = il.getStringExtra("msgl");
        TextView TV = findViewById(R.id.R2Window);
        TV.setText(Str);

    }
    public void onclick_send(View view)
    {
        EditText TB=findViewById(R.id.S2Window);
        String Str =TB.getText().toString();
        Intent i=new Intent( getApplicationContext(), MainActivity.class);
        i.putExtra( "msgl" ,Str);
        startActivity(i);


    }



}
