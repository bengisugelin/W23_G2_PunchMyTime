package com.example.punchmytimebgv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewWorkingHours extends AppCompatActivity {

    TextView NewCoRoRaTxt;
    Button SubmitNewHour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_working_hours);

        NewCoRoRaTxt = findViewById(R.id.txtNewCoRoRa);
        SubmitNewHour = findViewById(R.id.btnAddNewHours);

        NewCoRoRaTxt.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent goToCoRoRaPage = new Intent(NewWorkingHours.this, NewCompanyRoleRate.class);
                                                startActivity(goToCoRoRaPage);

                                            }
                                        });

        SubmitNewHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHomePage = new Intent(NewWorkingHours.this, HomePageActivity.class);
                startActivity(goToHomePage);
            }
        }

        );



    }
}