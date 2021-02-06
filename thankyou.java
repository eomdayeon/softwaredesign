package com.example.testing;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class thankyou extends AppCompatActivity  {

    TextView TextView_address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thankyou);

        TextView_address=findViewById(R.id.TextView_address);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String address = bundle.getString("address");
        TextView_address.setText(address);


        TextView_address.setText(address);


    }


}

