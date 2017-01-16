package com.atguigu.combattest.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.atguigu.combattest.bean.NetAudioBean;

import java.util.List;

/**
 * Created by 刘闯 on 2017/1/16.
 */

public class NetAudioFragmentAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<NetAudioBean.ListBean> datas;

    public NetAudioFragmentAdapter(Context mContext, List<NetAudioBean.ListBean> datas) {
        this.mContext = mContext;
        this.datas = datas;
    }

    /**
     * 视频
     */
    private static final int TYPE_VIDEO = 0;

    /**
     * 图片
     */
    private static final int TYPE_IMAGE = 1;

    /**
     * 文字
     */
    private static final int TYPE_TEXT = 2;

    /**
     * GIF图片
     */
    private static final int TYPE_GIF = 3;


    /**
     * 软件推广
     */
    private static final int TYPE_AD = 4;


    /**
     * 返回总数量
     *
     * @return
     */
    @Override
    public int getCount() {
        return datas.size();
    }

    //返回总类型数据
    @Override
    public int getViewTypeCount() {
        return 5;
    }

    /**
     * 当前item是什么类型
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        int itemViewType = -1;
        //根据位置，从列表中得到一个数据对象
        NetAudioBean.ListBean listBean = datas.get(position);
        String type = listBean.getType();//得到类型
        if ("video".equals(type)) {
            itemViewType = TYPE_VIDEO;
        } else if ("image".equals(type)) {
            itemViewType = TYPE_IMAGE;
        } else if ("text".equals(type)) {
            itemViewType = TYPE_TEXT;
        } else if ("gif".equals(type)) {
            itemViewType = TYPE_GIF;
        } else {
            itemViewType = TYPE_AD;//广播
        }
        return itemViewType;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = initView(convertView, getItemViewType(position), datas.get(position));
        return convertView;
    }

    private View initView(View convertView, int itemViewType, NetAudioBean.ListBean mediaItem) {
        switch (itemViewType) {
            case TYPE_VIDEO://视频


                break;
            case TYPE_IMAGE://图片

                break;
            case TYPE_TEXT://文字



                break;
            case TYPE_GIF://gif



                break;
            case TYPE_AD://软件广告


                break;
        }
        return convertView;
    }


}
