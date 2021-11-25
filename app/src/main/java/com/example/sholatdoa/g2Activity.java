package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g2Activity extends AppCompatActivity {
    Button btnn2, btnp2;
    MediaPlayer s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2);
        s2 = MediaPlayer.create(this, R.raw.s2);
        s2.setLooping(true);
        s2.setVolume(1,1);
        s2.start();
        btnn2=findViewById(R.id.btn_n2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(g2Activity.this,g3Activity.class);
                s2.stop();
                startActivity(b);
            }
        });
        btnp2=findViewById(R.id.btn_p2);
        btnp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o =new Intent(g2Activity.this,g1Activity.class);
                s2.stop();
                startActivity(o);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s2.setVolume(0,0);
        }
        else{
            s2.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s2.pause();
        s2.setVolume(0,0);
    }
}