package com.aqil.androidui;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt1 = findViewById(R.id.txt1);
        final TextView txt2 = findViewById(R.id.txt2);
        final TextView txt3 = findViewById(R.id.txt3);

        final String[] adlar = {"ELI", "METIN", "AQIL"};

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndObject = new Random();
                int myRandomNumber = rndObject.nextInt(3);
                String  a = adlar[myRandomNumber];

                myRandomNumber = rndObject.nextInt(3);
                String  b = adlar[myRandomNumber];

                myRandomNumber = rndObject.nextInt(3);
                String  c = adlar[myRandomNumber];


                if (a != b && a != c && b != c) {

                    txt1.setText(a);
                    txt2.setText(b);
                    txt3.setText(c);
                }
            }});

    }
}
