package com.example.btvn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnJumpToB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJumpToB = findViewById(R.id.btnJumpToB);

        btnJumpToB.setOnClickListener(view -> {
            Intent intent = new Intent(this, CoderActivity.class);
            startActivity(intent);
        });
    }
}