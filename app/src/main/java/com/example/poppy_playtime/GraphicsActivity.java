package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GraphicsActivity extends AppCompatActivity {

    Button buttonSite;
    ImageView backButton;

    TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics);

        backButton = findViewById(R.id.backButton);
        buttonSite = findViewById(R.id.buttonSite);
        textView9 = findViewById(R.id.textView9);

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://culturageek.com.ar/review-poppy-playtime-chapter-2-mas-terror-mas-enemigos-mas-largo-y-con-muchos-mas-puzzles/poppy-playtime-chapter-2-2-www-culturageek-com-ar/"));
                startActivity(implicitIntent1);
            }
        });

        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Poppy_Playtime"));
                startActivity(implicitIntent1);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(GraphicsActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });
    }
}