package com.example.testgooglepip;

import momo.cn.edu.fjnu.androidutils.utils.SizeUtils;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.VideoView;

public class MyVideoView extends VideoView{

    private Activity mActivity;
    
    public MyVideoView(Context context) {
        super(context);
        mActivity = (Activity)context;
    }

    public MyVideoView(Context context, AttributeSet attrs, int defStyleAttr,
            int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mActivity = (Activity)context;
    }

    public MyVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mActivity = (Activity)context;
    }

    public MyVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mActivity = (Activity)context;
    }

    
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean pictureMode = mActivity.isInPictureInPictureMode();
        if(pictureMode){
            setMeasuredDimension(SizeUtils.dp2px(mActivity, 240), SizeUtils.dp2px(mActivity, 135));
        }else{
            setMeasuredDimension(1920, 1080);
        }
    }
    
    
    @Override
    public void layout(int l, int t, int r, int b) {
        boolean pictureMode = mActivity.isInPictureInPictureMode();
        if(pictureMode){
            super.layout(0, 0, SizeUtils.dp2px(mActivity, 240), SizeUtils.dp2px(mActivity, 135));
        }else{
            super.layout(0, 0, 1920, 1080);
        }
    }
    
}



















































































































