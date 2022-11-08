package com.example.bbms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Dashboard extends Activity {
    Button adminbutton;
    Button donatebutton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        adminbutton = (Button) findViewById(R.id.adminbtn);
        adminbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,AdminLogin.class);
                startActivity(intent);
            }
        });

        donatebutton=(Button) findViewById(R.id.donatebtn);
        donatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,Donate.class);
                startActivity(intent);
            }
        });

    }
}
