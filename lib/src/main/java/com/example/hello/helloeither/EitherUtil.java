package com.example.hello.helloeither;

import com.spencerwi.either.Either;
import java.util.Random;

public class EitherUtil  {


  public static Either<Throwable, Boolean> either() {
    boolean flag = new Random().nextBoolean();
    Either<Throwable, Boolean> result = EitherLibUtil.build(flag);
    System.out.println("either result is right:" + result.isRight());
    return result;
  }

  public static String fold(Either<Throwable, Boolean> either) {
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
      return either.fold(Throwable::getMessage, String::valueOf);
    } else {
      return EitherLibUtil.foldBelow23(either);
    }
  }
}
