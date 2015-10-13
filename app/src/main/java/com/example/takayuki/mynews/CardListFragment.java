package com.example.takayuki.mynews;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Takayuki on 2015/10/14.
 */
public class CardListFragment extends ListFragment {

    public CardListFragment(){}

    public static CardListFragment newInstance(int position) {
        CardListFragment cardListFragment = new CardListFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        //fragmentにBunleを渡す
        cardListFragment.setArguments(args);
        return cardListFragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView listView = getListView();
        //区切り線を消す
        listView.setDivider(null);
        //スクロールバーを表示しない
        listView.setVerticalScrollBarEnabled(false);
        //card部分をselectorにするので、リストのselectorは透明にする
        listView.setSelector(android.R.color.transparent);

        //最後の余白分のビューを追加
        listView.addFooterView(LayoutInflater.from(getActivity())
                .inflate(R.layout.card_footer, listView, false));
        //cardに格納するデータ　TODO：CustomAdaptarの実装
//        setListAdapter(new CustomAdapter(
//                getActivity(),
//                R.layout.news_cardlist,
//                data));
        setListAdapter(new ArrayAdapter<String>(
                getActivity(),
                R.layout.news_cardlist,
                NewsGenres.Titeles));
    }
}
