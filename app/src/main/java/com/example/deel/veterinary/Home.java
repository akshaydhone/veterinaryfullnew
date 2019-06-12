package com.example.deel.veterinary;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    Spinner s1;
    TextView t13;
    ImageView imageView,imageView3,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t13=(TextView)findViewById(R.id.t13);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView2=(ImageView)findViewById(R.id.imageView2);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Ai.class);
                startActivity(i);

            }
        });


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Pregnancy.class);
                startActivity(i);

            }
        });


        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Calving.class);
                startActivity(i);

            }
        });


    }
}
