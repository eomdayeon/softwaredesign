package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LoginResult extends AppCompatActivity implements View.OnClickListener {

    TextView TextView_get;
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listselect);

        TextView_get=findViewById(R.id.TextView_get);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        Bundle bundle2=intent.getExtras();
        String id=bundle.getString("id");
        String pass=bundle2.getString("pass");
        TextView_get.setText(id+"/"+pass);




        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    public void onClick(View v){
        Intent i;

        switch(v.getId()){
            case R.id.button1 : i = new Intent(this,preorder_menu.class); startActivity(i); break;
            case R.id.button2 : i = new Intent(this, finalorder.class); startActivity(i); break;

            default: break;
        }


        //외워 그냥

    }

}

