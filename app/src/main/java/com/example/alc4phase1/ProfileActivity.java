package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initializeProfileImage();
        initializeFullNameText();
        initializeTrackLabelText();
        initializeTrackTitleText();
        initializeCountryLabelText();
        initializeCountryNameText();
        initializeEmailLabelText();
        initializeEmailText();
        initializePhoneLabelText();
        initializePhoneText();
    }

    private void initializeProfileImage() {
        ImageView profileImage = findViewById(R.id.imageView_avatar);
        profileImage.setImageResource(R.mipmap.profile_avatar);
    }

    private void initializeFullNameText() {
        TextView fullNameText = findViewById(R.id.text_fullname);
        fullNameText.setText(R.string.full_name);
    }

    private void initializeTrackLabelText() {
        TextView trackLabelText = findViewById(R.id.text_track_label);
        trackLabelText.setText(R.string.track_label);
    }

    private void initializeTrackTitleText() {
        TextView trackTitleText = findViewById(R.id.text_track_title);
        trackTitleText.setText(R.string.track_title);
    }

    private void initializeCountryLabelText() {
        TextView countryLabelText = findViewById(R.id.text_country_label);
        countryLabelText.setText(R.string.country_label);
    }

    private void initializeCountryNameText() {
        TextView countryNameText = findViewById(R.id.text_country_title);
        countryNameText.setText(R.string.country_name);
    }

    private void initializeEmailLabelText() {
        TextView emailLabelText = findViewById(R.id.text_email_label);
        emailLabelText.setText(R.string.email_label);
    }

    private void initializeEmailText() {
        TextView emailText = findViewById(R.id.text_email);
        emailText.setText(R.string.email);
    }

    private void initializePhoneLabelText() {
        TextView phoneLabelText = findViewById(R.id.text_phone_label);
        phoneLabelText.setText(R.string.phone_label);
    }

    private void initializePhoneText() {
        TextView phoneNumberText = findViewById(R.id.text_phone_number);
        phoneNumberText.setText(R.string.phone_number);
    }
}
