package com.arcdrive.arc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SignupActivity extends AppCompatActivity {

    private ImageButton arrowButton;
    private Button arrowNoBorder;


     // otvori ovdje ono sto si mi poslao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final Intent intent1 = new Intent(this, ApplicationActivity.class);
        final Intent intent2 = new Intent(this, LoginSignupActivity.class);

        arrowButton = (ImageButton) findViewById(R.id.arrowButton);
        arrowNoBorder = (Button) findViewById(R.id.button4);

        arrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        arrowNoBorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
