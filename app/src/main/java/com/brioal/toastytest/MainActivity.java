package com.brioal.toastytest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //显示错误提示
    public void showError(View view) {
        Toasty.error(this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
    }

    //显示成功提示
    public void showSuccess(View view) {
        Toasty.success(this, "Success!", Toast.LENGTH_SHORT, true).show();
    }

    //显示信息
    public void showInfo(View view) {
        Toasty.info(this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
    }

    //显示Notice
    public void showNotice(View view) {
        Toasty.warning(this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
    }

    //显示Normal
    public void showNormal(View view) {
        Toasty.normal(this, "Normal toast w/o icon").show();
    }

    //显示带Icon的
    public void showIcon(View view) {
        Toasty.normal(this, "Normal toast w/ icon", getResources().getDrawable(R.mipmap.ic_launcher)).show();
    }

    //显示自定义的
    public void showCustom(View view) {
        Toasty.custom(this, "I'm a custom Toast", getResources().getDrawable(R.mipmap.ic_launcher), Color.WHITE, Color.RED, 1000, true, true).show();
    }
}
