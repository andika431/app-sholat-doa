package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class DoaActivity extends AppCompatActivity {
    MediaPlayer s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        s1 = MediaPlayer.create(this, R.raw.doasholat);
        s1.setLooping(true);
        s1.setVolume(1,1);
        s1.start();
    }

    public void onToggleClicked(View view) {
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