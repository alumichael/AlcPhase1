package com.mike4christ.alcphase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button about_btn,profile_btn;
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about_btn=findViewById(R.id.about_btn);
        profile_btn=findViewById(R.id.profile_btn);
        toolBar=findViewById(R.id.toolbar);
        applyToolbar("Alc4Phase1");

        about_btn.setOnClickListener(this);
        profile_btn.setOnClickListener(this);

    }

    private void applyToolbar(String title) {
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.about_btn:
                startActivity(new Intent(this,AboutActivity.class));
                break;

            case R.id.profile_btn:
                startActivity(new Intent(this,ProfileActivity.class));
                break;

        }
    }
}
