package com.ProtonDev.androidreactionbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout button_green;
    private RelativeLayout button_smooth;
    private RelativeLayout button_ghost;
    private RelativeLayout button_raised;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setType();
        clickGreenButton();
        clickSmoothButton();
        clickGhostButton();
        clickRaisedButton();
    }

    private void setType() {
        button_green = findViewById(R.id.button_green);
        button_smooth = findViewById(R.id.button_smooth);
        button_ghost = findViewById(R.id.button_ghost);
        button_raised = findViewById(R.id.button_raised);
    }

    private void clickGreenButton() {
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_1), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void clickSmoothButton() {
        button_smooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_2), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void clickGhostButton() {
        button_ghost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_3), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void clickRaisedButton() {
        button_raised.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_4), Toast.LENGTH_LONG).show();
            }
        });
    }
}

