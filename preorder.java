package com.example.testing;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.TextView;

public class preorder extends AppCompatActivity implements View.OnClickListener{
    private int kilogram = 0, sum=0;
    private static int deposit=1000;
    private RadioButton radiobutton_1, radiobutton_2, radiobutton_3, radiobutton_4, radiobutton_5;
    private TextView edittext_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preorder);
        radiobutton_1=findViewById(R.id.radiobutton_1);
        radiobutton_2=findViewById(R.id.radiobutton_2);
        radiobutton_3=findViewById(R.id.radiobutton_3);
        radiobutton_4=findViewById(R.id.radiobutton_4);
        radiobutton_5=findViewById(R.id.radiobutton_5);

        radiobutton_1.setOnClickListener(this);
        radiobutton_2.setOnClickListener(this);
        radiobutton_3.setOnClickListener(this);
        radiobutton_4.setOnClickListener(this);
        radiobutton_5.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i;
        String str;

        switch(v.getId()){
            case R.id.radiobutton_1 : kilogram=1; break;
            case R.id.radiobutton_2 : kilogram=3; break;
            case R.id.radiobutton_3 : kilogram=5; break;
            case R.id.radiobutton_4 : kilogram=7; break;
            case R.id.radiobutton_5 : kilogram=10; break;
            default: break;
        }

        sum=kilogram*deposit;
        str=String.valueOf(sum);

        edittext_total=findViewById(R.id.edittext_total);
        edittext_total.setText(str);
    }
}