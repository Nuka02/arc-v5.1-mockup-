package com.arcdrive.arc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginSignupActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        t = (TextView) findViewById(R.id.button1);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont);

        t = (TextView) findViewById(R.id.button2);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont1);

        final Intent intent1 = new Intent(this, SignupActivity.class);
        final Intent intent2 = new Intent(this, LoginActivity.class);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
