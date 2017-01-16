package com.atguigu.combattest.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.combattest.base.BaseFragment;

/**
 * Created by 刘闯 on 2017/1/16.
 */

public class RecyclerviewFragment extends BaseFragment {
    private TextView textView;

    @Override
    public View initView() {
        Log.e("TAG", "Recyclerview  ui初始化了。。");
        textView = new TextView(mContext);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "Recyclerview数据初始化了。。");
        textView.setText("Recyclerview");
    }


    @Override
    public void onRefrshData() {
        super.onRefrshData();
        textView.setText("Recyclerview刷新");
//        Log.e("TAG","onHiddenChanged。。"+this.toString());
    }


}

