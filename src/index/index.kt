package index

import kotlinx.html.style
import kotlinx.html.title
import react.dom.b
import react.dom.div
import react.dom.h1
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")

    render(rootDiv) {
       div {
         h1 { +"Blackjack" }
         div {
           attrs.title = "foo"
           attrs.style = kotlinext.js.js {
             display = "flex"
           }

           div {
            div { b { +"Player Hand" } }
            div { +"cards goes here" }
            div { b { +"12 Point"} }
           }

           handUi()

           div {
            div { b { +"Dealer Hand" } }
            div { +"cards goes here" }
            div { b { +"14 Point"} }
           }

          }
        }
     }
}

private fun RBuilder.handUi() {
  div {
        div { b { +"Player Hand" } }
        div { +"cards goes here" }
        div { b { +"12 Point"} }
  }
}
