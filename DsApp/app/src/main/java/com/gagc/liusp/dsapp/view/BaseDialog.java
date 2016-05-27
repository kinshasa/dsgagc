package com.gagc.liusp.dsapp.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/**
 * Created by liusp on 2016/5/25.
 */
public class BaseDialog extends Dialog{

    public BaseDialog(Context context){
        super(context);


        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
