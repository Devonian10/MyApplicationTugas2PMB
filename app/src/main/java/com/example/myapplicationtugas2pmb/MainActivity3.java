package com.example.myapplicationtugas2pmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void toMainMenu(View view) {
    Intent c = new Intent(MainActivity3.this, MainActivity.class);
    startActivity(c);
        Toast.makeText(this, "Return Main Menu", Toast.LENGTH_SHORT).show();

    }

    public void toMyBiodata(View view) {
        Intent d = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(d);
            Toast.makeText(this, "My Biodata", Toast.LENGTH_SHORT).show();

    }

    public void toArticle(View view) {
        Intent e = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(e);
            Toast.makeText(this,"article", Toast.LENGTH_SHORT).show();

    }
}