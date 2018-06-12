package com.example.jkd.kvkolkataregion;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AnimationPage extends AppCompatActivity {

    
    LinearLayout line1,line2;
    Button button;
    Animation up,down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_page);


        button=findViewById(R.id.button);
        line1=findViewById(R.id.l1);
        line2=findViewById(R.id.l2);
        up = AnimationUtils.loadAnimation(this,R.anim.up);
        down = AnimationUtils.loadAnimation(this,R.anim.down);
        line1.setAnimation(up);
        line2.setAnimation(down);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AnimationPage.this,Navigation.class);
                startActivity(intent);






            }
    });
    }

}
