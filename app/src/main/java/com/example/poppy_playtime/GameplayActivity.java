package com.example.poppy_playtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameplayActivity extends AppCompatActivity {

    Button buttonSite;
    ImageView backButton;
    //constantes devem ser declaradas sempre em CAIXA ALTA
    //define a constante que será utilizada como chave
    public final static String EXTRA_MESSAGE = ".MESSAGE";

    //declara um elemento edit Text
    TextView elemento_edit;
    TextView textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        elemento_edit = findViewById(R.id.elemento_edit);
        backButton = findViewById(R.id.backButton);
        textView10 = findViewById(R.id.textView10);
        elemento_edit = findViewById(R.id.elemento_edit);
        buttonSite = findViewById(R.id.buttonSite);


        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://holdtoreset.com/poppy-playtime-chapter-1-a-tight-squeeze-full-guide/"));
                startActivity(implicitIntent3);
            }
        });


        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Poppy_Playtime"));
                startActivity(implicitIntent1);
            }
        });

        elemento_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-iBPKU1AQlM"));
                startActivity(implicitIntent4);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(GameplayActivity.this, MainActivity.class);
                startActivity(backHome);
            }

        });
    }
    public void sendMenssage(View view){
        //Instancia a Intent
        Intent intent = new Intent(this, GameplayActivity.class);

        //recupera o valor do elemento já instanciado
        String message = elemento_edit.getText().toString();

        //adiciona o valor ao parâmetro
        intent.putExtra(EXTRA_MESSAGE, message);

        //inicia a Intent
        startActivity(intent);
    }
}