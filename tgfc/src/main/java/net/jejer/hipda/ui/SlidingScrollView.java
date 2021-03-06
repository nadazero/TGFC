package net.jejer.hipda.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * ObjectAnimator supported ScrollView
 * Created by GreenSkinMonster on 2015-11-04.
 */
public class SlidingScrollView extends ScrollView {

    public SlidingScrollView(Context context) {
        super(context);
    }

    public SlidingScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public float getXFraction() {
        final int width = getWidth();
        if (width != 0) return getX() / getWidth();
        else return getX();
    }

    public void setXFraction(float xFraction) {
        final int width = getWidth();
        float newWidth = (width > 0) ? (xFraction * width) : -9999;
        setX(newWidth);
    }
}
