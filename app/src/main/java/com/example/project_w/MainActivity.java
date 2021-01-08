package com.example.project_w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button room_B01;
    Button room_101;
    Button room_102;
    Button room_103;
    Button room_104;
    Button room_201;
    Button room_202;
    Button room_203;
    Button room_204;
    Button room_301;
    Button room_302;
    Button room_303;
    Button room_304;
    Button room_401;
    Button room_402;
    Button room_501;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        room_B01 = findViewById(R.id.room_B01);
        room_B01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Room_B01.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, btn_add.getText().toString()+"B01로 이동하였습니다", Toast.LENGTH_SHORT).show();


            }
        });

        room_101 = findViewById(R.id.room_101);
        room_102 = findViewById(R.id.room_102);
        room_103 = findViewById(R.id.room_103);
        room_104 = findViewById(R.id.room_104);
        room_201 = findViewById(R.id.room_201);
        room_202 = findViewById(R.id.room_202);
        room_203 = findViewById(R.id.room_203);
        room_204 = findViewById(R.id.room_204);
        room_301 = findViewById(R.id.room_301);
        room_302 = findViewById(R.id.room_302);
        room_303 = findViewById(R.id.room_303);
        room_304 = findViewById(R.id.room_304);
        room_401 = findViewById(R.id.room_401);
        room_402 = findViewById(R.id.room_402);
        room_501 = findViewById(R.id.room_501);

        btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}