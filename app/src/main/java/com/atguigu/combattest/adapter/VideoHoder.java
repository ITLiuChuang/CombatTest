package com.atguigu.combattest.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.combattest.R;
import com.atguigu.combattest.bean.NetAudioBean;
import com.atguigu.combattest.utils.Utils;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by 刘闯 on 2017/1/16.
 */
public class VideoHoder extends BaseViewHolder {
    Utils utils;
    TextView tvContext;
    JCVideoPlayerStandard jcvVideoplayer;
    TextView tvPlayNums;
    TextView tvVideoDuration;
    ImageView ivCommant;
    TextView tvCommantContext;
    private NetAudioBean.ListBean data;


    VideoHoder(View convertView) {
        super(convertView);
        //中间公共部分 -所有的都有
        tvContext = (TextView) convertView.findViewById(R.id.tv_context);
        utils = new Utils();
        tvPlayNums = (TextView) convertView.findViewById(R.id.tv_play_nums);
        tvVideoDuration = (TextView) convertView.findViewById(R.id.tv_video_duration);
        ivCommant = (ImageView) convertView.findViewById(R.id.iv_commant);
        tvCommantContext = (TextView) convertView.findViewById(R.id.tv_commant_context);
        jcvVideoplayer = (JCVideoPlayerStandard) convertView.findViewById(R.id.jcv_videoplayer);

    }

    public void setData(NetAudioBean.ListBean mediaItem) {
        super.setData(mediaItem);

        //设置文本-所有的都有,只有广告没有哦
        tvContext.setText(mediaItem.getText() + "_" + mediaItem.getType());

        //视频特有的------------------------
        //第一个参数是视频播放地址，第二个参数是显示封面的地址，第三参数是标题
        boolean setUp = jcvVideoplayer.setUp(
                mediaItem.getVideo().getVideo().get(0), JCVideoPlayer.SCREEN_LAYOUT_LIST,
                "");
        //加载图片
        if (setUp) {
//                ImageLoader.getInstance().displayImage(mediaItem.getVideo().getThumbnail().get(0),
//                        jcvVideoplayer.thumbImageView);
            Context mContext;
           // Glide.with(mContext).load(mediaItem.getVideo().getThumbnail().get(0)).into(jcvVideoplayer.thumbImageView);
        }
        tvPlayNums.setText(mediaItem.getVideo().getPlaycount() + "次播放");
        tvVideoDuration.setText(utils.stringForTime(mediaItem.getVideo().getDuration() * 1000) + "");

    }

}

