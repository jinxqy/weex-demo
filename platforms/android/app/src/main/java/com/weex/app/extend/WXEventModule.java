package com.weex.app.extend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.weex.app.WXPageActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

import java.io.File;


public class WXEventModule extends WXModule {

    @JSMethod()
    public void openURL(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        Uri uri = Uri.parse(url);
        String scheme = uri.getScheme();

        if (scheme.equals("http") || scheme.equals("https") || scheme.equals("file")) {
            Intent renderIntent = new Intent(mWXSDKInstance.getContext(), WXPageActivity.class);
            renderIntent.setData(uri);
            mWXSDKInstance.getContext().startActivity(renderIntent);
        } else {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);
            mWXSDKInstance.getContext().startActivity(intent);
        }
    }

    public static final String PATH = "/storage/emulated/0/weex_test.jpg";

    public static final int CAMERA_REQUEST_CODE = 12000;

    @JSMethod
    public void openCamera() {
        Intent takeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/weex_test.jpg";
        Log.d("--sy", path);
        Context context = mWXSDKInstance.getContext();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            takeIntent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(context,
                    "com.weex.app.fileprovider", new File(path)));
        } else {
            takeIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(path)));
        }
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(takeIntent, CAMERA_REQUEST_CODE);
        }
    }

    @JSMethod
    public void showToast(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
