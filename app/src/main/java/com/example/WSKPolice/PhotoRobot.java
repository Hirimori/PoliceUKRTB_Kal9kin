package com.example.WSKPolice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PhotoRobot extends AppCompatActivity {
    ImageView BackArrow;
    ImageView newPhotoRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_robot);

        BackArrow = findViewById(R.id.BackArrow);
        //вернуться назад
        BackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //открыть создание нового фото робота
        newPhotoRobot = findViewById((R.id.newPhotoRobot));
        newPhotoRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewPhotoRobot.class);
                startActivity(intent);
                finish();
            }
        });
    }
}