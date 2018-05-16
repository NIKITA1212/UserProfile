package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profile = (ImageView) findViewById(R.id.profile_picture);
        profile.setImageResource(R.drawable.profile);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("NIKITA");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("12/12/1993");

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("INDIA");

        }
    }

