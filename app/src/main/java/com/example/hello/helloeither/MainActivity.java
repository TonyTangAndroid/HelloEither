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

    view.postDelayed(
        new Runnable() {
          @Override
          public void run() {
            Toast.makeText(MainActivity.this, message(), Toast.LENGTH_SHORT).show();
          }
        },
        300);
  }

  private String message() {
    return "clicked";
  }
}
