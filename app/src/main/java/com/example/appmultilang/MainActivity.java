package com.example.appmultilang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView messageView;
    Button btnvi, btneng, btnfr, btnes, btnbr;
    Context context;
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageView = (TextView) findViewById(R.id.TextView);
        btnvi = findViewById(R.id.btnvi);
        btneng = findViewById(R.id.btneng);
        btnfr = findViewById(R.id.btnfr);
        btnes = findViewById(R.id.btnes);
        btnbr = findViewById(R.id.btnbr);



        // setting up on click listener event over the button
        // in order to change the language with the help of
        // LocaleHelper class
        btnvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "vi");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
            }
        });

        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "eng");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));

            }
        });
        btnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "fr");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
            }
        });
        btnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "es");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
            }
        });
        btnbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "brx");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
            }
        });


    }
}
