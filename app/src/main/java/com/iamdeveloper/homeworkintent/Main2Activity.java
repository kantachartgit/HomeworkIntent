package com.iamdeveloper.homeworkintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    String data_user;
    String data_password;
    String data_phone;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            data_user = bundle.getString("data1");
            textView1.setText(data_user);

            data_password = bundle.getString("data2");
            textView2.setText(data_password);

            data_phone = bundle.getString("data3");
            textView3.setText(data_phone);
        }
    }
}
