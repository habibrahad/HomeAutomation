package com.example.darkwhite.homeautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class more extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        TextView aboutme = (TextView) findViewById(R.id.about_me);        //mail link of habib
        aboutme.setMovementMethod(LinkMovementMethod.getInstance());

        TextView sourcecode = (TextView) findViewById(R.id.sourcecode);        //sourcecode of the git
        sourcecode.setMovementMethod(LinkMovementMethod.getInstance());

        TextView facebook = (TextView) findViewById(R.id.facebook);        //Facebook link of habib
        facebook.setMovementMethod(LinkMovementMethod.getInstance());

        TextView faq = (TextView) findViewById(R.id.faq);        //mail developer
        faq.setMovementMethod(LinkMovementMethod.getInstance());

    }
}