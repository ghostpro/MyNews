package com.example.takayuki.mynews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Takayuki on 2015/10/13.
 * アプリケーションTOP画面
 * 各ニュースのジャンルをListViewで表示する
 */
public class GenresFragment extends ListFragment {

    public final static String EXTRA_POSITION =
            "com.example.takayuki.mynews.POSITION";

    public GenresFragment(){}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                //TODO：ニュースAPIにあわせたジャンル名を取得するようにする
                NewsGenres.Genres
        ));
    }

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
            Intent intent  = new Intent(getActivity(), NewsActivity.class);
            intent.putExtra(EXTRA_POSITION, position);
            startActivity(intent);
    }
}
