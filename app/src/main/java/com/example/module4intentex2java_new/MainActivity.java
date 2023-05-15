package com.example.module4intentex2java_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.module4intentex2java_new.modul.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        Button b_open_second = (Button) findViewById(R.id.b_open_second);
        b_open_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(21, "JAKHONGIR");
                openSecondActivity(user);
            }
        });
    }

    void openSecondActivity(User user) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}