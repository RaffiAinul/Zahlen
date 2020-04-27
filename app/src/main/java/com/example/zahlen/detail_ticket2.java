package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class detail_ticket2 extends AppCompatActivity {
    Button BtnContinue;
    LinearLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ticket2);
        BtnContinue=findViewById(R.id.buttonContinue4);
        Back = findViewById(R.id.back4);
        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goChekcout = new Intent(detail_ticket2.this,Ticket_checkout.class);
                startActivity(goChekcout);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent (detail_ticket2.this,Home.class);
                startActivity(goBack);
            }
        });

    }
}
