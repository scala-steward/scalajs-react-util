package io.github.nafg.scalajs.react.util

import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*


object Spinner {
  def imageURI = "data:image/gif;base64,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AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA="

  val component = ScalaFnComponent[TagMod](<.img(^.src := imageURI)(_))

  def apply(mod: TagMod = TagMod(^.position.absolute, ^.top := "10px", ^.right := "10px", ^.height := "20px", ^.width := "20px", ^.zIndex := "10")) =
    component(mod)

  def inline(size: Int) = apply(TagMod(^.width := (s"${size}px"), ^.height := (s"${size}px")))
}
