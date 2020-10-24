package com.example.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent il = getIntent();
        String Str = il.getStringExtra("msgl");
        EditText TV = findViewById(R.id.R2Window);
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
