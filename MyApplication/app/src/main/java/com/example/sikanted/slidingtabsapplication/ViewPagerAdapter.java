package com.example.sikanted.slidingtabsapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sikanted on 8/19/2016.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private List<String> list;
    private LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = this.layoutInflater.inflate(R.layout.viewpager_item, container, false);
        TextView textView = (TextView)view.findViewById(R.id.viewPagerTextViewId);
        String item = list.get(position);
        textView.setText(item);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
