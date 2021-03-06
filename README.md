[![Build Status](https://travis-ci.org/nafg/scalajs-react-util.svg?branch=master)](https://travis-ci.org/nafg/scalajs-react-util)

# scalajs-react-util

Various utilities for use with scalajs-react.

* `AsyncStateFromProps`, for when your state (or part of it) is derived asynchronously from your props
* `FutureView`, for when you want to render a `Future`
* `Messages`, a global notification/alert system, which can be used to automatically report the result of a `Future` (such as a user action)
* `GlobalBusyIndicator`, to show a global indicator (such as a spinning animation) while a `Future` is in progress
* `SnapshotUtils`: various utilities for working with `StateSnapshot`, including a factory similar to the simple pre-1.2.0 factory, and `.toTagMod` to get `^.onChange` + `^.value`/`^.checked` for free, given a StateSnapshot zoomed to the value of an input field.
