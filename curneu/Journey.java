package com.example.preethi.curneu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Journey extends AppCompatActivity {


    TextView from;
    TextView to;

    Button print;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.journey);

        from = (TextView) findViewById(R.id.from);

           to = (TextView) findViewById(R.id.to);
           print=(Button) findViewById(R.id.print);

        print.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(Journey.this,Print.class);
                startActivity(intent);
            }

        });
       } }