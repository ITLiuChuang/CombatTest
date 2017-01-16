package com.atguigu.combattest.fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.atguigu.combattest.R;
import com.atguigu.combattest.adapter.NetAudioFragmentAdapter;
import com.atguigu.combattest.base.BaseFragment;
import com.atguigu.combattest.bean.MediaItem;
import com.atguigu.combattest.bean.NetAudioBean;
import com.atguigu.combattest.utils.CacheUtils;
import com.atguigu.combattest.utils.Constants;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by 刘闯 on 2017/1/16.
 */

public class NetAudioFragment extends BaseFragment {
    private List<MediaItem> mediaItems = new ArrayList<>();
    private boolean isLoadMore;
    private TextView textView;
    private NetAudioFragmentAdapter myAdapter;
    private List<NetAudioBean.ListBean> datas = new ArrayList<>();

    private static final String TAG = NetAudioFragment.class.getSimpleName();
    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.progressbar)
    ProgressBar progressbar;
    @Bind(R.id.tv_nomedia)
    TextView tvNomedia;


    @Override
    public View initView() {
        Log.e("TAG", "网络音频ui初始化了。。");
        View view = View.inflate(mContext, R.layout.fragment_net_audio, null);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "网络音频数据初始化了。。");

        String saveJson = CacheUtils.getString(mContext, Constants.NET_AUDIO_URL);
        if (!TextUtils.isEmpty(saveJson)) {
            processData(saveJson);
        }

        getDataFromNet();


    }

    private void processData(String result) {

        datas = parsedJson(result);

        if (datas != null && datas.size() > 0) {
            //有视频
            tvNomedia.setVisibility(View.GONE);
            //设置适配器
            myAdapter = new NetAudioFragmentAdapter(mContext, datas);
            listview.setAdapter(myAdapter);
        } else {
            //没有视频
            tvNomedia.setVisibility(View.VISIBLE);
        }

        progressbar.setVisibility(View.GONE);


    }

    /**
     * 使用Gson解析json数据
     *
     * @param json
     * @return
     */
    private List<NetAudioBean.ListBean> parsedJson(String json) {
        NetAudioBean netAudioBean = new Gson().fromJson(json, NetAudioBean.class);
        return netAudioBean.getList();
    }


    public void getDataFromNet() {
        RequestParams reques = new RequestParams(Constants.NET_AUDIO_URL);

        x.http().get(reques, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

                CacheUtils.putString(mContext, Constants.NET_AUDIO_URL, result);
                LogUtil.e("onSuccess==" + result);
                processData(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtil.e("onError==" + ex.getMessage());
            }

            @Override
            public void onCancelled(CancelledException cex) {
                LogUtil.e("onCancelled==" + cex.getMessage());
            }

            @Override
            public void onFinished() {
                LogUtil.e("onFinished==");
            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}