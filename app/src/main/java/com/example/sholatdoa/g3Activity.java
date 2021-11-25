package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g3Activity extends AppCompatActivity {
    Button btnn3, btnp3;
    MediaPlayer s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g3);
        s3 = MediaPlayer.create(this, R.raw.s3);
        s3.setLooping(true);
        s3.setVolume(1,1);
        s3.start();
        btnn3=findViewById(R.id.btn_n3);
        btnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cz= new Intent(g3Activity.this,g4Activity.class);
                s3.stop();
                startActivity(cz);
            }
        });
        btnp3=findViewById(R.id.btn_p3);
        btnp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j =new Intent(g3Activity.this,g2Activity.class);
                s3.stop();
                startActivity(j);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s3.setVolume(0,0);
        }
        else{
            s3.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s3.stop();
        s3.setVolume(0,0);
    }
}