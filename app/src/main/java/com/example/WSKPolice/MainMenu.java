package com.example.WSKPolice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainMenu extends AppCompatActivity {

    Intent intent;
    LinearLayout criminalCases;
    LinearLayout departments;
    LinearLayout wanted;
    LinearLayout detectives;
    LinearLayout photoRobot;
    LinearLayout aboutUs;
    LinearLayout logout;
    LinearLayout photorobotnew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //приводит content  к объектам LL
        criminalCases = findViewById(R.id.CriminalLayout);
        departments = findViewById(R.id.DepartLayout);
        wanted = findViewById(R.id.WantedLayout);
        detectives = findViewById(R.id.DetectivesLayout);
        photoRobot = findViewById(R.id.PhotoRobotLayout);
        aboutUs = findViewById(R.id.AboutLayout);
        logout = findViewById(R.id.LogoutLayout);


        // обработка кнопки logout и редактирование ключа remember
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                String checkbox = preferences.getString("remember", "");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember", "false");
                editor.apply();
                finish();
            }
        });
// обработка кнопки aboutUs
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(About.class);
            }

        });
// обработка кнопки departments
        departments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(Department.class);
            }
        });
// обработка кнопки wanted
        wanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(Wanted.class);
            }
        });
// обработка кнопки prohoRobot
        photoRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(PhotoRobot.class);
            }
        });
// обработка кнопки criminalCases
        criminalCases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(CriminalCases.class);
            }
        });
// обработка кнопки detectives
        detectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivity(Detectives.class);
            }
        });
    }

    // инициализация контекста соответствующей кнопке
    public void goToActivity(Class activity) {
        intent = new Intent(this, activity);
        startActivity(intent);
    }
}