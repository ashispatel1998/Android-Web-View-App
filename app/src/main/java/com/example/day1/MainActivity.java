package com.example.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);

        txt_signup=(TextView)findViewById(R.id.txt_signup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Welcome To my App",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Homepage.class);
                //Intent intent=new Intent(getApplicationContext(),SignUp.class);
                startActivity(intent);
            }
        });

        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,SignUp.class);
                //Intent intent=new Intent(getApplicationContext(),SignUp.class);
                startActivity(intent);

            }
        });

    }
}
