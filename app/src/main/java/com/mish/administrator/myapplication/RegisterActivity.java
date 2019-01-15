package com.mish.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getName,getAdmnno,getMobileno,getEmail,getusername,getPassword,getConfirmpassword
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.admn);
        ed3=(EditText)findViewById(R.id.mobile);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.user);
        ed6=(EditText)findViewById(R.id.pass);
        ed7=(EditText)findViewById(R.id.confirm);
        b1=(Button)findViewById(R.id.buttonreg);
        b2=(Button)findViewById(R.id.buttonal);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getName=ed1.getText().toString();
                getAdmnno=ed2.getText().toString();
                getMobileno=ed3.getText().toString();
                getEmail=ed4.getText().toString();
                getusername=ed5.getText().toString();
                getPassword=ed6.getText().toString();
                getConfirmpassword=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
            }
        });
    }
}
