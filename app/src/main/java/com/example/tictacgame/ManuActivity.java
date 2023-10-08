package com.example.tictacgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ManuActivity extends AppCompatActivity {
    public CheckBox checkBox1, checkBox2;
    public int player;
    Button enterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        enterButton = findViewById(R.id.btn_enter);

        enterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    player=2;
                    Intent intent = new Intent(ManuActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }  else if (checkBox1.isChecked()) {
                    player=1;
                    Intent intent = new Intent(ManuActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(ManuActivity.this, "Пожалуйста, выберите себе элемент", Toast.LENGTH_SHORT).show();
                }
        }
    });
    }
}