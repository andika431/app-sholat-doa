package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g4Activity extends AppCompatActivity {
    Button btnn4, btnp4;
    MediaPlayer s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g4);
        s4 = MediaPlayer.create(this, R.raw.s4);
        s4.setLooping(true);
        s4.setVolume(1,1);
        s4.start();
        btnn4=findViewById(R.id.btn_n4);
        btnn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(g4Activity.this,g5Activity.class);
                s4.stop();
                startActivity(d);
            }
        });
        btnp4=findViewById(R.id.btn_p4);
        btnp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(g4Activity.this,g3Activity.class);
                s4.stop();
                startActivity(k);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s4.setVolume(0,0);
        }
        else{
            s4.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s4.stop();
        s4.setVolume(0,0);
    }
}