package com.example.testde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //private ImageView image;
    private String nameText;
    private String priceText;
    private String detailsText;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btn1);
    }



    public void btn1OnClick(View view) {
        nameText=" watch1";
        priceText="300";
        detailsText="details details details details details details details";
        Intent sendingIntent= new Intent(this, details.class);
        sendingIntent.putExtra("Value1", nameText);
        sendingIntent.putExtra("Value2", priceText);
        sendingIntent.putExtra("Value3", detailsText);
        startActivity(sendingIntent);
    }
}