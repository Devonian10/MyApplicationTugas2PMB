package com.example.myapplicationtugas2pmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void toMainMenu(View view) {
        Intent a = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(a);
        Toast.makeText(this, "Main Menu", Toast.LENGTH_SHORT).show();
        onStop();
    }

    public void toArticle(View view) {
        Intent b = new Intent(MainActivity4.this, MainActivity2.class);
        startActivity(b);
        Toast.makeText(this, "Article", Toast.LENGTH_SHORT).show();
        onStop();
    }
}