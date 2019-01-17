package com.arcdrive.arc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button arrowNoBorderBlack;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        t = (TextView) findViewById(R.id.etNamee);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont);

        t = (TextView) findViewById(R.id.etLastnamee);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont1);

        t = (TextView) findViewById(R.id.etEmaile);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont2);

        t = (TextView) findViewById(R.id.etPhonee);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont3);

        t = (TextView) findViewById(R.id.etPassworde);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont4);

        t = (TextView) findViewById(R.id.etName);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont5);

        t = (TextView) findViewById(R.id.etName1);
        Typeface myCustomFont6=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont6);

        t = (TextView) findViewById(R.id.etLastname);
        Typeface myCustomFont7=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont7);

        t = (TextView) findViewById(R.id.etPhone);
        Typeface myCustomFont8=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont8);

        t = (TextView) findViewById(R.id.etBiHnumber);
        Typeface myCustomFont9=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont9);

        t = (TextView) findViewById(R.id.etMail);
        Typeface myCustomFont10=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont10);

        t = (TextView) findViewById(R.id.etPassword);
        Typeface myCustomFont11=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");
        t.setTypeface(myCustomFont11);

        t = (TextView) findViewById(R.id.Payment);
        Typeface myCustomFont12=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont12);

        t = (TextView) findViewById(R.id.Logout);
        Typeface myCustomFont13=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont13);

        t = (TextView) findViewById(R.id.etSave);
        Typeface myCustomFont14=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Bold.ttf");
        t.setTypeface(myCustomFont14);


        final Intent intent1 = new Intent(this, ApplicationActivity.class);

        arrowNoBorderBlack = (Button) findViewById(R.id.button4);
        arrowNoBorderBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

    }
}
