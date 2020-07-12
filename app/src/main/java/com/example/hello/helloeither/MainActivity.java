package com.example.hello.helloeither;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void click(View view) {

    view.postDelayed(this::showToast, 300);
  }

  private void showToast() {
    show(EitherUtil.fold(EitherUtil.either()));
  }

  private void show(String message) {
    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
  }

}
