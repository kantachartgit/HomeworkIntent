package com.iamdeveloper.homeworkintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    EditText phone;
    String data_user;
    String data_password;
    String data_phonenumber;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        phone = (EditText) findViewById(R.id.phone);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data_user = username.getText().toString();
                data_password = password.getText().toString();
                data_phonenumber = phone.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("data1",data_user);
                intent.putExtra("data2",data_password);
                intent.putExtra("data3",data_phonenumber);
                startActivity(intent);
                }
        });
    }
}
