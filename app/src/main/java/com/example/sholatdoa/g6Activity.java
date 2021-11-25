package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g6Activity extends AppCompatActivity {
    Button btnn6, btnp6;
    MediaPlayer s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g6);
        s6 = MediaPlayer.create(this, R.raw.thiat1);
        s6.setLooping(true);
        s6.setVolume(1,1);
        s6.start();
        btnn6=findViewById(R.id.btn_n6);
        btnn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(g6Activity.this,g7Activity.class);
                s6.stop();
                startActivity(f);
            }
        });
        btnp6=findViewById(R.id.btn_p6);
        btnp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(g6Activity.this,g5Activity.class);
                s6.stop();
                startActivity(m);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s6.setVolume(0,0);
        }
        else{
            s6.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s6.stop();
        s6.setVolume(0,0);
    }
}