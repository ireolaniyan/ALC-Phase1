package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        initializeWelcomeText();
        initializeAboutButton();
        initializeProfileButton();
    }

    private void initializeWelcomeText() {
        TextView welcomeText = findViewById(R.id.text_welcome);

        welcomeText.setText(R.string.welcome_message);
    }

    private void initializeAboutButton() {
        Button aboutALCButton = findViewById(R.id.button_about_alc);

        aboutALCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutALCIntent =  new Intent(WelcomeActivity.this, AboutALCActivity.class);
                startActivity(aboutALCIntent);
            }
        });
    }

    private void initializeProfileButton() {
        Button profileButton = findViewById(R.id.button_profile);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent =  new Intent(WelcomeActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });
    }
}
