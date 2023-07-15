package dev.zio.quickstart

import zio.Console.{printLine, readLine}
import zio.ZIOAppDefault

/** @author
  *   : XuJiaWei
  * @since :
  *   2023-07-11 23:20
  */
object MyApp extends ZIOAppDefault {

  def run = for {
    _    <- printLine("Hello! What is your name?")
    name <- readLine
    _    <- printLine(s"Hello, ${name}, welcome to ZIO!")
  } yield ()
}
