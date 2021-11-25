package com.example.sholatdoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnniat, btngsholat, btndoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnniat=findViewById(R.id.btn_niat);
        btnniat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(MainActivity.this,NiatActivity.class);
                startActivity(b1);
            }
        });
        btngsholat=findViewById(R.id.btn_gsholat);
        btngsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b2 = new Intent(MainActivity.this,g1Activity.class);
                startActivity(b2);
            }
        });
        btndoa=findViewById(R.id.btn_doa);
        btndoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b3 = new Intent(MainActivity.this,DoaActivity.class);
                startActivity(b3);
            }
        });
    }
}