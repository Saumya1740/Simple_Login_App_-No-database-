package com.example.simple_login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView info;
    private Button login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etusername);
        Password = findViewById(R.id.etpassword);
        info = findViewById(R.id.tv);
        login = findViewById(R.id.bulogin);

        info.setText("No of attempts remaining : 5");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

            }

            private void validate(String UserName, String Password){
        if (UserName.equals("Saumya") && Password.equals("170400")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);}
        else{
            counter--;

            info.setText("No.of attemps remaining: " +String.valueOf(counter));

            if(counter == 0){
                login.setEnabled(false);

            }
        }
        }

            }
