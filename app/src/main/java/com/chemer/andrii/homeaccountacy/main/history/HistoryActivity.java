package com.chemer.andrii.homeaccountacy.main.history;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chemer.andrii.homeaccountacy.R;

public class HistoryActivity extends AppCompatActivity implements HistoryViewModel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
}
