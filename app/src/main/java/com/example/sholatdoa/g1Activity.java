package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class g1Activity extends AppCompatActivity {
    Button btnn1, btnp1;
    MediaPlayer s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1);
        s1 = MediaPlayer.create(this, R.raw.s1);
        s1.setLooping(true);
        s1.setVolume(1,1);
        s1.start();
        btnn1=findViewById(R.id.btn_n1);
        btnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(g1Activity.this,g2Activity.class);
                s1.stop();
                startActivity(a);
            }
        });
        btnp1=findViewById(R.id.btn_p1);
        btnp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h =new Intent(g1Activity.this,MainActivity.class);
                s1.stop();
                startActivity(h);
            }
        });
    }
    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            s1.setVolume(0,0);
        }
        else{
            s1.setVolume(1,1);
        }
    }
    public void onBackPressed(View view){
        s1.stop();
        s1.setVolume(0,0);
    }
}