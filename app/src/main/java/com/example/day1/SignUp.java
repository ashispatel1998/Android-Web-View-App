package com.example.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView txt1;
    EditText ed1,ed2,ed3;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txt1=(TextView)findViewById(R.id.txt1);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        ed3=(EditText)findViewById(R.id.ed3);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }
    public void validate()
    {
        String user=(ed1).getText().toString().trim();
        String pass=(ed2).getText().toString().trim();
        String confirm=(ed3).getText().toString().trim();

        if(user.isEmpty())
        {
            ed1.setError("Cannot be empty");
            ed1.requestFocus();
            return;
        }
        if(pass.isEmpty())
        {
            ed2.setError("Cannot be empty");
            ed2.requestFocus();
            return;
        }
        if(confirm.isEmpty())
        {
            ed3.setError("Cannot be empty");
            ed3.requestFocus();
            return;
        }

        if(pass.length()<8)
        {
            ed2.setError("Password cannot be shorter than 8 characters");
            ed2.requestFocus();
            return;
        }
        if(!confirm.equals(pass))
        {
            ed3.setError("Mismatch");
            ed3.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(user).matches())
        {
            ed1.setError("Please enter a valid email");
            ed1.requestFocus();
            return;
        }

        Intent obj=new Intent(getApplicationContext(),Homepage.class);
        finish();
        startActivity(obj);

    }



}
