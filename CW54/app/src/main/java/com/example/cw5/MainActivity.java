package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final  String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.but1);
        Button button1 = (Button) findViewById(R.id.but2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText edittext1 = (EditText) findViewById(R.id.edittext1);
                String text = edittext1.getText().toString();
                Intent int1 = new Intent(MainActivity.this, MainActivity2.class);
                int1.putExtra(EXTRA_TEXT, text);
                startActivity(int1);
            }
        });

        Button button2 = (Button) findViewById(R.id.but2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(int2);


            }
        });

    }
}