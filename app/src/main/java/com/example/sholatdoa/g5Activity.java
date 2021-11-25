package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g5Activity extends AppCompatActivity {
    Button btnn5, btnp5;
    MediaPlayer s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g5);
        s5 = MediaPlayer.create(this, R.raw.s5);
        s5.setLooping(true);
        s5.setVolume(1,1);
        s5.start();
        btnn5=findViewById(R.id.btn_n5);
        btnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(g5Activity.this,g6Activity.class);
                s5.stop();
                startActivity(e);
            }
        });
        btnp5=findViewById(R.id.btn_p5);
        btnp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(g5Activity.this,g4Activity.class);
                s5.stop();
                startActivity(l);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s5.setVolume(0,0);
        }
        else{
            s5.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s5.stop();
        s5.setVolume(0,0);
    }
}