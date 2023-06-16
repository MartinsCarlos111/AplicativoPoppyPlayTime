package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {
    Button buttonSite;

    ImageView backButton;

    TextView textView10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        buttonSite = findViewById(R.id.buttonSite);
        textView10 = findViewById(R.id.textView10);
        backButton = findViewById(R.id.backButton);

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pockettactics.com/poppy-playtime/chapter-1"));
                startActivity(implicitIntent2);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(DesignActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });

        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Poppy_Playtime"));
                startActivity(implicitIntent1);
            }
        });
    }
}