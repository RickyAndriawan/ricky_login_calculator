package com.example.calculator_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username = "admin";
    String password = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUserid = findViewById(R.id.edtUserid);
        EditText edtPassword = findViewById(R.id.edtPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUserid.getText().toString().equalsIgnoreCase(username)&& edtPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }else{
                    Toast.makeText(MainActivity.this,"Unsername/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}