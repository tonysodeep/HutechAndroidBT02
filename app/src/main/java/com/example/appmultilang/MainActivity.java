package com.example.appmultilang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView messageView;
    Button btnvi, btneng, btnfr, btnes, btnbr;
    Context context;
    Resources resources;
    LinearLayout linearLayout;

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
        linearLayout = findViewById(R.id.ll_main_layout);



        // setting up on click listener event over the button
        // in order to change the language with the help of
        // LocaleHelper class
        btnvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "vi");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
                linearLayout.setBackgroundColor(Color.RED);
            }
        });

        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "eng");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
                linearLayout.setBackgroundColor(Color.GRAY);
                btnvi.setBackgroundResource(R.drawable.red_background);

            }
        });
        btnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "fr");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
                linearLayout.setBackgroundColor(Color.BLUE);
            }
        });
        btnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "es");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
                linearLayout.setBackgroundColor(Color.YELLOW);
            }
        });
        btnbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "brx");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.language));
                linearLayout.setBackgroundColor(Color.CYAN);
            }
        });


    }
}
