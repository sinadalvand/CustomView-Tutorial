package example.sinadalvand.ir.arcademy;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {


    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(manageDimension(widthMeasureSpec,200),manageDimension(heightMeasureSpec,100));
    }

    private int manageDimension(int valueMeasureSpec, int value_desired) {
        int value_final = 0;
        int value = MeasureSpec.getSize(valueMeasureSpec);
        int value_mode = MeasureSpec.getMode(valueMeasureSpec);
//        MeasureSpec.EXACTLY ==> fix || match_parent;
//        MeasureSpec.AT_MOST ==> wrap_content;
//        MeasureSpec.UNSPECIFIED ==> Scrollview ==> view_height:match_parent;
        if (value_mode == MeasureSpec.EXACTLY) {
            value_final = value;
        } else if (value_mode == MeasureSpec.AT_MOST) {
            value_final = Math.min(value, value_desired);
        } else {
            value_final = value_desired;
        }
        return value_final;
    }


    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


    }
}
