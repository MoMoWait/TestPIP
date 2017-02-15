/**
 * 
 */
package com.example.testgooglepip;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;

/**
 * @author GaoFei
 *  ”∆µ≤•∑≈“≥√Ê
 */
public class VideoPlayerActivity extends Activity{
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        MyVideoView myVideoView = (MyVideoView)findViewById(R.id.video);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.test_video;
        myVideoView.setVideoURI(Uri.parse(uri));
        myVideoView.start();
    }
    
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            enterPictureInPictureMode();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
