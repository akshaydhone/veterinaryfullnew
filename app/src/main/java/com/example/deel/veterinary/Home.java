package com.example.deel.veterinary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    Spinner s1;
    TextView t13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t13=(TextView)findViewById(R.id.t13);
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Ai.class);
                startActivity(i);
            }
        });
    }
}
