package com.example.module4intentex2java_new;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.module4intentex2java_new.modul.User;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    void initView() {
        TextView tv_second = (TextView) findViewById(R.id.tv_second);
        User user = (User) getIntent().getSerializableExtra("user");
        tv_second.setText(user.toString());
    }
}
