package com.animset.killi8n.animset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnstart;
    ImageView animTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = (Button) findViewById(R.id.btnstart);
        animTarget = (ImageView) findViewById(R.id.animtarget);
    }

    public void mOnClick(View v) {
        AnimationSet animationSet = null;

        switch (v.getId()) {
            case R.id.btnstart:
                animationSet = new AnimationSet(true);

                TranslateAnimation trans = new TranslateAnimation(
                        Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1,
                        Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0);
                trans.setDuration(3000);
                animationSet.addAnimation(trans);

                AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
                alphaAnimation.setDuration(300);
                alphaAnimation.setStartOffset(500);
                alphaAnimation.setRepeatCount(4);
                alphaAnimation.setRepeatMode(Animation.REVERSE);
                animationSet.addAnimation(alphaAnimation);
                break;
        }
        animTarget.startAnimation(animationSet);
    }
}
