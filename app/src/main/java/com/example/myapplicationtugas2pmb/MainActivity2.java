package com.example.myapplicationtugas2pmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void toNextArticle(View view) {
        Intent c = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(c);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void toMainMenu(View view) {
        Intent d = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(d);
        Toast.makeText(this,"Main Menu", Toast.LENGTH_SHORT).show();

    }

}