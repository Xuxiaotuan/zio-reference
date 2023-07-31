package dev.zio.quickstart.Basic_Concurrency

import zio.{Fiber, Scope, UIO, ZIO, ZIOAppArgs, ZIOAppDefault}

/**
 * @author : XuJiaWei
 * @since : 2023-07-15 11:22
 */
object MainApp extends ZIOAppDefault {

  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = fib100Fiber

  private def fib(n: Long): UIO[Long] =
    ZIO.suspendSucceed {
      if (n <= 1) ZIO.succeed(n)
      else fib(n - 1).zipWith(fib(n - 2))(_ + _)
    }

  private val fib100Fiber: UIO[Fiber[Nothing, Long]] =
    for {
      fiber <- fib(100).fork
    } yield fiber
}
