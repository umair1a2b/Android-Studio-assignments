package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent il=getIntent();
        if(il!=null){
            String Str= il.getStringExtra( "msgl");
            EditText TV=findViewById(R.id.R1Window);
            TV.setText(Str);


        }
    }
    public void onclick_send(View view)
    {
        EditText TB=findViewById(R.id.S1Window);
        String Str =TB.getText().toString();
        Intent i=new Intent( getApplicationContext(), Main2Activity.class);
        i.putExtra(  "msgl" ,Str);
        startActivity(i);


    }
}
