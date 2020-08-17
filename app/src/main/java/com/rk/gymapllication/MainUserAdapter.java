package com.rk.gymapllication;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.List;

public class MainUserAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> cardList;
    View view;
    LayoutInflater layoutInflater;

    public MainUserAdapter(Context context, ArrayList<Integer> cardList) {
        this.context = context;
        this.cardList = cardList;
    }

    @Override
    public int getCount() {
        return cardList.size();
    }

    @Override
    public Object getItem(int position) {
        return cardList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            view = new ImageView(context);
            view = layoutInflater.inflate(R.layout.main_card_item,null);
            ImageView imageView = view.findViewById(R.id.card_item);
            imageView.setBackgroundResource(cardList.get(position));
        } else {
            view = (View) convertView;
        }


        return view;
    }
}