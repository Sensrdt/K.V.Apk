package com.example.jkd.kvkolkataregion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CosAd extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cos_ad);

        Button button = findViewById(R.id.ad);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CosAd.this,CosLo.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Tap on the marker",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Click here ->",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
