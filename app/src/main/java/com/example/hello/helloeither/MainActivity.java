package com.example.hello.helloeither;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.spencerwi.either.Either;
import java.util.Random;

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
    show(message());
  }

  private void show(String message1) {
    Toast.makeText(MainActivity.this, message1, Toast.LENGTH_SHORT).show();
  }

  private String message() {
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
      String fold = either().fold(String -> "OK", String -> "NOT OK");
      System.out.println("fold after API 23 result is :" + fold);
      return fold;
    } else {
      String fold = either().fold(String -> "OK", String -> "NOT OK 23");
      System.out.println("fold before API 23 result is :" + fold);
      return fold;
    }
  }

  private Either<Boolean, Boolean> either() {
    boolean flag = new Random().nextBoolean();
    Either<Boolean, Boolean> result = flag ? Either.right(true) : Either.left(false);
    System.out.println("either result is right:" + result.isRight());
    return result;
  }
}
