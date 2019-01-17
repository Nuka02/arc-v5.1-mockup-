package com.arcdrive.arc;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private ImageButton arrowButton;
    private Button arrowNoBorder;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t = (TextView) findViewById(R.id.etEmail);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont);


        t = (TextView) findViewById(R.id.etPassword);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont1);

        t = (TextView) findViewById(R.id.button3);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont2);

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
