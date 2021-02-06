package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class preorder_menu extends AppCompatActivity implements View.OnClickListener{
    private CardView cardview_carrot, cardview_apple,cardview_potato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preorder_menu);
        cardview_carrot=(CardView)findViewById(R.id.cardview_carrot);
        cardview_apple=(CardView)findViewById(R.id.cardview_apple);
        cardview_potato=(CardView)findViewById(R.id.cardview_potato);

        cardview_carrot.setOnClickListener(this);
        cardview_apple.setOnClickListener(this);
        cardview_potato.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i;

        switch(v.getId()){
            case R.id.cardview_carrot : i = new Intent(this,preorder_carrot.class); startActivity(i); break;
            case R.id.cardview_apple : i = new Intent(this, preorder_apple.class); startActivity(i); break;
            case R.id.cardview_potato : i = new Intent(this, preorder_potato.class); startActivity(i); break;
            default: break;
        }
    }
}
