package com.example.trying;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=findViewById(R.id.edtName);
        edtPassword=findViewById(R.id.edtPassword);
        //this is a test command for github
    }


    public void btnSubmitOnClick(View view) {
        String name=edtName.getText().toString();
        String password=edtPassword.getText().toString();

        Toast.makeText(this,name+","+password, Toast.LENGTH_SHORT).show();




    }
}