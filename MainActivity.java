package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText_id,editText_pw;
    Button button_login;
    String emailOK="user1234";
    String passOK="1234";
    String inputemail="";
    String inputpass="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editText_id=findViewById(R.id.edittext_id);
        editText_pw=findViewById(R.id.edittext_pw);
        button_login=findViewById(R.id.button_login);
        //1.값을 가져온다 -검사해서 값 넘기기!!  user1234 /1234
        //2.클릭을 감지한다.
        //3.1번의 값을 다음 액티비티로 넘긴다.

        editText_id.addTextChangedListener(new TextWatcher() {            //
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("SENTI",s.toString());
                    if (s!=null)
                    {
                        inputemail=s.toString();   //tString 은 s에 반환해야할 값이 있어야 됨 null이면 error가 남
                        if (validation())
                        {
                            button_login.setEnabled(true);
                        }
                        else
                            button_login.setEnabled(false);

                    }



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText_pw.addTextChangedListener(new TextWatcher() {            //
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("SENTI",s.toString());
                if (s!=null)
                {
                    inputpass=s.toString();   //tString 은 s에 반환해야할 값이 있어야 됨 null이면 error가 남
                    if (validation())
                    {
                        button_login.setEnabled(true);
                    }
                    else
                        button_login.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
       //button_login.setClickable(true);
       button_login.setOnClickListener(new View.OnClickListener() {   //여기서도 clicklistener 항상 만들것이 아니라 false냐 true냐에 따라 달라지는것이 더 정상적!!
           @Override  //여기서 처리해주면 됨
           public void onClick(View v) {

               String id= editText_id.getText().toString();
               String pw= editText_pw.getText().toString();

               Intent intent=new Intent(getApplicationContext(),LoginResult.class);
               intent.putExtra("id",id);
               intent.putExtra("pass",pw);

               startActivity(intent);

           }
       });


    }

    public boolean validation()
    {
        Log.d("SENTI",inputemail+"/"+inputpass);

        return (inputemail.equals(emailOK)&&inputpass.equals(passOK));    //사실 여기서 emailOK랑 passOK가 null인지 아닌지도 검사해줘야함
    }

}
