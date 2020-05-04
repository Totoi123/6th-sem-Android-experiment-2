package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button submit;
    TextView text;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        submit= (Button) findViewById(R.id.submit);
        text= (TextView)findViewById(R.id.textView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.length()== 0){
                    username.setError("Enter Username");
                }
                else if (password.length()==0){
                    password.setError("Enter Password");
                }
                else {
                    validate(username.getText().toString(), password.getText().toString());
                }

            }
        });


    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("123456"))){
            st = username.getText().toString();

            Intent intent = new Intent(MainActivity.this, start.class);
            intent.putExtra("username", st);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Login Failed. Invalid Credentials", Toast.LENGTH_SHORT).show();
        }

    }
}
