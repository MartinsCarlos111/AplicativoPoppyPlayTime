package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonHistory, buttonCharacters, buttonDesign, buttonGraphics, buttonGameplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHistory = findViewById(R.id.buttonHistory);
        buttonCharacters = findViewById(R.id.buttonCharacters);
        buttonDesign = findViewById(R.id.buttonDesign);
        buttonGraphics = findViewById(R.id.buttonGraphics);
        buttonGameplay = findViewById(R.id.buttonGameplay);

        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HistoryScreen = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(HistoryScreen);
            }
        });

        buttonCharacters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CharactersScreen = new Intent(MainActivity.this, CharactersActivity.class);
                startActivity(CharactersScreen);
            }
        });

        buttonDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DesignScreen = new Intent(MainActivity.this, DesignActivity.class);
                startActivity(DesignScreen);
            }
        });

        buttonGraphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GraphicsScreen = new Intent(MainActivity.this, GraphicsActivity.class);
                startActivity(GraphicsScreen);
            }
        });

        buttonGameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GameplayScreen = new Intent(MainActivity.this, GameplayActivity.class);
                startActivity(GameplayScreen);
            }
        });
    }
}