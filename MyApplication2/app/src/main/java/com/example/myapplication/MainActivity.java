package com.example.simpleapp;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    text.setText("چمکتے چمکتے چھوٹے ستارے. حیرت کیسی ہے کہ آپ کیا ہیں!");
                    flag = false;
                } else {
                    text.setText("        Twinkle twinkle little star. how are wonder what you are!");
                    flag = true;
                }
            }

        });


    }

}