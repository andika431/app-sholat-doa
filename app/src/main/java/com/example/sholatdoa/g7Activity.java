package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g7Activity extends AppCompatActivity {
    Button btnn7, btnp7;
    MediaPlayer s7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g7);
        s7 = MediaPlayer.create(this, R.raw.tahiat2);
        s7.setLooping(true);
        s7.setVolume(1,1);
        s7.start();
        btnn7=findViewById(R.id.btn_n7);
        btnn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(g7Activity.this,MainActivity.class);
                s7.stop();
                startActivity(g);
            }
        });
        btnp7=findViewById(R.id.btn_p7);
        btnp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(g7Activity.this,g6Activity.class);
                s7.stop();
                startActivity(n);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s7.setVolume(0,0);
        }
        else{
            s7.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s7.stop();
        s7.setVolume(0,0);
    }
}