package com.arcdrive.arc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private ImageButton arrowButton;
    private Button arrowNoBorder;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        t = (TextView) findViewById(R.id.etName);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont);

        t = (TextView) findViewById(R.id.etLastname);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont1);

        t = (TextView) findViewById(R.id.etPhone);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont2);

        t = (TextView) findViewById(R.id.etConfirmPassword);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont3);

        t = (TextView) findViewById(R.id.etPassword);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont5);

        t = (TextView) findViewById(R.id.etEmail);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont4);

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
