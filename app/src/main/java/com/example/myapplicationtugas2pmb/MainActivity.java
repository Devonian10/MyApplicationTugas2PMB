package com.example.myapplicationtugas2pmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toArticle(View view) {
        Intent a = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "Article", Toast.LENGTH_SHORT).show();
        onStop();
    }

    public void toMyBiodata(View view) {
        Intent b = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(b);
        Toast.makeText(this, "My Biodata", Toast.LENGTH_SHORT).show();
        onStop();
    }

}