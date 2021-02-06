
package com.example.testing;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;
public class finalorder extends AppCompatActivity {


    TextView TextView_total;
    Button button;
    EditText shipptextedit;

    private RadioGroup radiogroup_grade, radiogroup_weigh;
    private RadioButton radiobutton_A, radiobutton_B, radiobutton_C, radiobutton_1, radiobutton_3, radiobutton_5, radiobutton_7, radiobutton_10;
    private String str;
    private int per_price, per, price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalorder);

        final String[] addres = new String[1];

        TextView_total = findViewById(R.id.TextView_total);
        shipptextedit = findViewById(R.id.shipptextedit);
        button = findViewById(R.id.shopbutton);  //여기 button!1

        radiogroup_grade = findViewById(R.id.radiogroup_grade);
        radiogroup_weigh = findViewById(R.id.radiogroup_weight);
        radiobutton_A = findViewById(R.id.radiobutton_A);
        radiobutton_B = findViewById(R.id.radiobutton_B);
        radiobutton_C = findViewById(R.id.radiobutton_C);
        radiobutton_1 = findViewById(R.id.radiobutton_1);
        radiobutton_3 = findViewById(R.id.radiobutton_3);
        radiobutton_5 = findViewById(R.id.radiobutton_5);
        radiobutton_7 = findViewById(R.id.radiobutton_7);
        radiobutton_10 = findViewById(R.id.radiobutton_10);

        radiogroup_grade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radiobutton_A:
                        per_price = 1000;
                        break;
                    case R.id.radiobutton_B:
                        per_price = 800;
                        break;
                    case R.id.radiobutton_C:
                        per_price = 750;
                        break;
                    default:
                        break;
                }
                price = per_price * per;
                str = String.valueOf(price);
                TextView_total.setText(str);
            }

        });

        radiogroup_weigh.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radiobutton_1:
                        per = 1;
                        break;
                    case R.id.radiobutton_3:
                        per = 3;
                        break;
                    case R.id.radiobutton_5:
                        per = 5;
                        break;
                    case R.id.radiobutton_7:
                        per = 7;
                        break;
                    case R.id.radiobutton_10:
                        per = 10;
                        break;
                    default:
                        break;
                }
                price = per_price * per;
                str = String.valueOf(price);
                TextView_total.setText(str);
            }
        });



        button.setClickable(true);  //클릭이 가능한 것.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addres[0] = shipptextedit.getText().toString();

                //그냥 외워
                Intent intent = new Intent(getApplicationContext(), thankyou.class);
                intent.putExtra("address", addres[0]);

                startActivity(intent);

            }
        });


    }
}



