package com.example.takayuki.mynews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newslist);

        int position = getIntent().getIntExtra(GenresFragment.EXTRA_POSITION,0);
        CardListFragment detailFragment = CardListFragment.newInstance(position);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.listFrame, detailFragment)
                .commit();
    }


}
