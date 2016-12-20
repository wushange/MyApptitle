package com.wsg.widget;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by wushange on 2016/12/19.
 */

public class AppTitle extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {

    public static final int LeftButton = R.id.title_back_btn;
    public static final int LeftImage = R.id.title_left_img;
    public static final int LeftText = R.id.title_left_text;
    public static final int Centertext = R.id.title_center_text;
    public static final int RightText = R.id.title_right_text;
    public static final int RightButton = R.id.title_right_btn;
    public static final int RightButton2 = R.id.title_right_btn_sub;


    private RelativeLayout mRoot;
    private ImageButton mLeftButton;
    private ImageButton mLeftImage;
    private TextView mLeftText;
    private TextView mCenterText;
    private ImageButton mRightButton;
    private ImageButton mRightButton2;
    private TextView mRightText;

    private ActionListener actionListener;
    private boolean canFinish = true;

    public AppTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        initAttrs(context, attrs);

    }


    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }


    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.title, this);
        mRoot = (RelativeLayout) findViewById(R.id.title_root);
        mCenterText = (TextView) findViewById(R.id.title_center_text);
        mLeftButton = (ImageButton) findViewById(R.id.title_back_btn);
        mLeftImage = (ImageButton) findViewById(R.id.title_left_img);
        mLeftText = (TextView) findViewById(R.id.title_left_text);
        mRightButton = (ImageButton) findViewById(R.id.title_right_btn);
        mRightButton2 = (ImageButton) findViewById(R.id.title_right_btn_sub);
        mRightText = (TextView) findViewById(R.id.title_right_text);

        mLeftText.setOnClickListener(this);
        mLeftButton.setOnClickListener(this);
        mLeftImage.setOnClickListener(this);
        mCenterText.setOnClickListener(this);
        mRightText.setOnClickListener(this);
        mRightButton.setOnClickListener(this);
        mRightButton2.setOnClickListener(this);

        mLeftText.setOnLongClickListener(this);
        mLeftButton.setOnLongClickListener(this);
        mLeftImage.setOnLongClickListener(this);
        mCenterText.setOnLongClickListener(this);
        mRightText.setOnLongClickListener(this);
        mRightButton.setOnLongClickListener(this);
        mRightButton2.setOnLongClickListener(this);

    }

    public void initAttrs(Context context, AttributeSet attrs) {

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.AppTitle);
        int totalAttributes = typedArray.getIndexCount();
        for (int i = 0; i < totalAttributes; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.AppTitle_showBack) {
                mLeftButton.setVisibility(getBoolean(typedArray, index, R.bool.default_showBack) ? VISIBLE : INVISIBLE);
            } else if (index == R.styleable.AppTitle_canFinish) {
                canFinish = getBoolean(typedArray, index, R.bool.default_canFinish);
            } else if (index == R.styleable.AppTitle_leftButtonRes) {
                mLeftButton.setImageResource(getResourceId(typedArray, index, R.drawable.ic_launcher));
            } else if (index == R.styleable.AppTitle_leftImageRes) {
                mLeftImage.setVisibility(VISIBLE);
                mLeftImage.setImageResource(getResourceId(typedArray, index, R.drawable.ic_launcher));
            } else if (index == R.styleable.AppTitle_leftText) {
                mLeftText.setVisibility(VISIBLE);
                mLeftText.setText(getString(typedArray, index));
            } else if (index == R.styleable.AppTitle_leftTextColor) {
                mLeftText.setTextColor(getColor(typedArray, index, R.color.default_leftTextColor));
            } else if (index == R.styleable.AppTitle_leftTextSize) {
                mLeftText.setTextSize(TypedValue.COMPLEX_UNIT_PX, getDimenSize(typedArray, index, R.dimen.default_leftTextSize));
            } else if (index == R.styleable.AppTitle_centerText) {
                mCenterText.setVisibility(VISIBLE);
                mCenterText.setText(getString(typedArray, index));
            } else if (index == R.styleable.AppTitle_centerTextColor) {
                mCenterText.setTextColor(getColor(typedArray, index, R.color.default_centerTextColor));
            } else if (index == R.styleable.AppTitle_centerTextSize) {
                mCenterText.setTextSize(TypedValue.COMPLEX_UNIT_PX, getDimenSize(typedArray, index, R.dimen.default_centerTextSize));
            } else if (index == R.styleable.AppTitle_rightText) {
                mRightText.setVisibility(VISIBLE);
                mRightText.setText(getString(typedArray, index));
            } else if (index == R.styleable.AppTitle_rightTextColor) {
                mRightText.setTextColor(getColor(typedArray, index, R.color.default_rightTextColor));
            } else if (index == R.styleable.AppTitle_rightTextSize) {
                mRightText.setTextSize(TypedValue.COMPLEX_UNIT_PX, getDimenSize(typedArray, index, R.dimen.default_rightTextSize));
            } else if (index == R.styleable.AppTitle_rightButtonRes) {
                mRightButton.setVisibility(VISIBLE);
                mRightButton.setImageResource(getResourceId(typedArray, index, R.drawable.ic_launcher));
            } else if (index == R.styleable.AppTitle_rightButton2Res) {
                mRightButton2.setVisibility(VISIBLE);
                mRightButton2.setImageResource(getResourceId(typedArray, index, R.drawable.ic_launcher));
            }

        }
        typedArray.recycle();
    }


    public AppTitle setLeftText(String leftText) {
        mLeftText.setVisibility(VISIBLE);
        mLeftText.setText(leftText);
        return this;
    }


    public AppTitle setCenterText(String centerText) {
        mCenterText.setVisibility(VISIBLE);
        mCenterText.setText(centerText);
        return this;
    }

    public AppTitle setRightText(String rightText) {
        mRightText.setVisibility(VISIBLE);
        mRightText.setText(rightText);
        return this;
    }

    public AppTitle setLeftButtonRes(int res) {
        mLeftButton.setVisibility(VISIBLE);
        mLeftButton.setImageResource(res);
        return this;
    }


    public AppTitle setLeftImageRes(int res) {
        mLeftImage.setVisibility(VISIBLE);
        mLeftImage.setImageResource(res);
        return this;
    }

    public AppTitle setRightButtonRes(int res) {
        mRightButton.setVisibility(VISIBLE);
        mRightButton.setImageResource(res);
        return this;
    }

    public AppTitle setRightButton2Res(int res) {
        mRightButton2.setVisibility(VISIBLE);
        mRightButton2.setImageResource(res);
        return this;
    }

    public AppTitle setShowLeftButton(boolean showBack) {
        mLeftButton.setVisibility(showBack ? VISIBLE : INVISIBLE);
        return this;
    }

    public AppTitle setCanFinish(boolean canFinish) {
        this.canFinish = canFinish;
        return this;
    }

    @Override
    public void onClick(View view) {
        if (canFinish) {
            if (view.getId() == R.id.title_back_btn) {
                ((Activity) getContext()).finish();
            }
        }
        if (actionListener != null) {
            actionListener.OnActionClickListener(view);
        }

    }

    @Override
    public boolean onLongClick(View view) {
        return actionListener == null ? false : actionListener.OnActionLongClickListener(view);
    }


    public AppTitle setLeftText() {
        return this;
    }

    public RelativeLayout getmRoot() {
        return mRoot;
    }

    public ImageButton getmLeftButton() {
        return mLeftButton;
    }

    public ImageButton getmLeftImage() {
        return mLeftImage;
    }

    public TextView getmLeftText() {
        return mLeftText;
    }

    public TextView getmCenterText() {
        return mCenterText;
    }

    public ImageButton getmRightButton() {
        return mRightButton;
    }

    public ImageButton getmRightButton2() {
        return mRightButton2;
    }

    public TextView getmRightText() {
        return mRightText;
    }


    public interface ActionListener {
        void OnActionClickListener(View view);

        boolean OnActionLongClickListener(View view);
    }

    private int getResourceId(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getResourceId(id, defaultId);
    }

    private String getString(
            TypedArray typedArray,
            int id) {
        return typedArray.getString(id);
    }

    private int getInt(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getInt(id, typedArray.getResources().getInteger(defaultId));
    }

    private boolean getBoolean(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getBoolean(id, typedArray.getResources().getBoolean(defaultId));
    }

    private int getDimenSize(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getDimensionPixelSize(id, typedArray.getResources().getDimensionPixelSize(defaultId));
    }

    private int getDimenOffset(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getDimensionPixelOffset(id, typedArray.getResources().getDimensionPixelOffset(defaultId));
    }

    private int getColor(
            TypedArray typedArray,
            int id,
            int defaultId) {
        return typedArray.getColor(id, getColor(typedArray, defaultId));
    }

    private int getColor(TypedArray typedArray, int id) {
        return getColor(typedArray, id, null);
    }

    private int getColor(TypedArray typedArray, int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return typedArray.getResources().getColor(id, theme);
        } else {
            return typedArray.getResources().getColor(id);
        }
    }

    private int dp2px(Context context, float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    private int sp2px(Context context, float spValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, context.getResources().getDisplayMetrics());
    }
}
