package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class preorder_carrot extends AppCompatActivity {

    TextView TextView_get;
    Button button_payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preorder_carrot);
        button_payment=findViewById(R.id.button_payment);
        button_payment.setClickable(true);
        button_payment.setOnClickListener(new View.OnClickListener() {
            @Override  //여기서 처리해주면 됨
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),preorder.class);
                startActivity(intent);
            }
        });




    }

}