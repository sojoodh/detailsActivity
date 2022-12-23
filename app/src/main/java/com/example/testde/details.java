package com.example.testde;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {


    private TextView name;
    private TextView price;
    private TextView details;
    private ImageView heartImg;
    private Button btnGotoBag;
    private Integer tester=0;

    String value1 ;
    String value2 ;
    String value3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        heartImg = findViewById(R.id.heart);

        Bundle extras = getIntent().getExtras();
         value1 = extras.getString("Value1");
         value2 = extras.getString("Value2");
         value3 = extras.getString("Value3");

        name = findViewById(R.id.nameWatch1);
        price = findViewById(R.id.priceWatch1);
        details = findViewById(R.id.detailsWatch1);

        name.setText(value1);
        price.setText(value2);
        details.setText(value3);

        btnGotoBag = findViewById(R.id.btnToBag);



    }


    public void btnAddToBagWatch1(View view) {

        Intent sendingIntent= new Intent(this, bagActivity.class);
        sendingIntent.putExtra("Value1", value1);
        sendingIntent.putExtra("Value2", value2);
        sendingIntent.putExtra("Value3", value3);
        startActivity(sendingIntent);

    }



    public void heartOnClick(View view) {


        //heartImg.setVisibility(View.VISIBLE);
        String str= "added the watch to the wish list screen";
        String str2= "deleted the watch from the wish list screen";

        if(tester == 0) {
            heartImg.setColorFilter(getResources().getColor(R.color.purple_700), android.graphics.PorterDuff.Mode.MULTIPLY);
            //heartImg.setVisibility(View.VISIBLE);
            tester=1;
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//            Intent sendingIntent= new Intent(this, wishActivity.class);
//            sendingIntent.putExtra("Value1", value1);
//            sendingIntent.putExtra("Value2", value2);
//            sendingIntent.putExtra("Value3", value3);
//            startActivity(sendingIntent);


        }
        else if (tester == 1){
            heartImg.setColorFilter(getResources().getColor(R.color.black), android.graphics.PorterDuff.Mode.MULTIPLY);
            //heartImg.setVisibility(View.VISIBLE);
            tester=0;
            Toast.makeText(this, str2, Toast.LENGTH_SHORT).show();

        }

        heartImg.setVisibility(View.VISIBLE);


    }

}