package com.example.lomoljo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view) {
        TextView messageShow = findViewById(R.id.messageShow);
        EditText fullName = findViewById(R.id.fullName);


        String fullnameShow = "HELLO!! " + fullName.getText().toString();

        messageShow.setText(fullnameShow);
    }
}