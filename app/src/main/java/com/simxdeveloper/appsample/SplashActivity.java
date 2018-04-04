package com.simxdeveloper.appsample;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

  @Override
  protected void onCreate (@Nullable Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    new Handler ().postDelayed (() -> {gotoMain();}, 2000);
  }

  private void gotoMain () {
    MainActivity.start (this);
    this.finish ();
  }
}
