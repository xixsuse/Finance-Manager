package com.chemer.andrii.homeaccountacy.main.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chemer.andrii.homeaccountacy.R;

public class EventActivity extends AppCompatActivity implements EventViewModel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }
}
