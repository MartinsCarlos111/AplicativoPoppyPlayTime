package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CharactersActivity extends AppCompatActivity {


    ImageView backButton;
    Button buttonSite, buttonQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        backButton = findViewById(R.id.backButton);
        buttonSite = findViewById(R.id.buttonSite);
        buttonQuiz = findViewById(R.id.buttonQuiz);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(CharactersActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });

        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.quizur.com/list/lista-dos-personagens-de-poppy-playtime-PXiH"));
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
    }
}