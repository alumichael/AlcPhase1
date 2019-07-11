package com.mike4christ.alcphase1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    public TextView name,country,email,phone_no,slack_Uname,track_txt;
    public Toolbar toolBar;
    private CircleImageView user_photo;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=findViewById(R.id.name);
        track_txt=findViewById(R.id.track_txt);
        country=findViewById(R.id.country);
        email=findViewById(R.id.email);
        phone_no=findViewById(R.id.phone_no);
        slack_Uname=findViewById(R.id.slack_username);
        user_photo=findViewById(R.id.profile_photo);
        toolBar=findViewById(R.id.toolbar);

        applyToolbar("My Profile");


        track_txt.setText(" Android");
        name.setText("Alu Michael");
        country.setText(" Nigeria");
        email.setText(" alumichael9@gmail.com");
        phone_no.setText(" +2348106746804");
        slack_Uname.setText(" Michael Boluwaji");





    }

    private void applyToolbar(String title) {
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(title);
    }
}
