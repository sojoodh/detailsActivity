package com.example.testde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class bagActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);
        textView = findViewById(R.id.textBagActivity);
        Intent intent= getIntent();
        String msg1= intent.getStringExtra("Value1");
        String msg2= intent.getStringExtra("Value2");
        String msg3= intent.getStringExtra("Value3");

        String msg= msg1+msg2+msg3;
        textView.setText(msg);

    }
}