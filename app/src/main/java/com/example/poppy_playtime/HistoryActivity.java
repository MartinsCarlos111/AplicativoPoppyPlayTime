package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HistoryActivity extends AppCompatActivity {
    Button mapButton;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        backButton = findViewById(R.id.backButton);
        mapButton = findViewById(R.id.buttonMap);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(HistoryActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location= Uri.parse("geo:0,0?q=St.+Louis,+Missouri,+EUA");
                Intent mapIntent= new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);

            }
        });

    }
}