package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);

        final SharedPreferences sharedPreferences=getSharedPreferences("com.example.myapplication.MainActivity", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        String a=e1.getText().toString();
        String b=e2.getText().toString();
        editor.putString("user",a);
        editor.putString("pass",b);
        editor.commit();

        if(sharedPreferences.contains("user"))
        {
            Intent intent =new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

        }
    }
}
