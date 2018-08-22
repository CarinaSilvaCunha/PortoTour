package com.example.carinacunha.portotour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Get the activity_main so there's this splash page
    // page only appears once for context
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the text to be clickable
        TextView mainButton = findViewById(R.id.porto_come_explore);
        mainButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Get the Real layout
                Intent mainIntent = new Intent(MainActivity.this, PortoActivity.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });
    }
}
