package com.example.hello.helloeither;

import com.spencerwi.either.Either;

public class EitherLibUtil {

  public static Either<Throwable, Boolean> build(boolean flag) {
    return flag ? Either.right(true) : Either.left(new RuntimeException("exception"));
  }

  /**
   * A java 8 method reference in library without enable desugar passes compile.
   * If the app is not aware of such assumption and did not enable the desugar flag, it will crash.
   */
  public static String foldBelow23(Either<Throwable, Boolean> either) {
    Either<String, String> map = either.map(Throwable::getMessage, String::valueOf);
    return map.isLeft() ? map.getLeft() : map.getRight();
  }
}
