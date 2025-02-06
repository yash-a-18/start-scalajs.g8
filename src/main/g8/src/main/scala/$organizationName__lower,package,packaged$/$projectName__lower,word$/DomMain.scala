package $organizationName$.$projectName$

import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

object $projectName$ {
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  // @JSExportTopLevel("addClickedMessage") // Uncomment this line to expose the function to JavaScript and you use HTML onclick event from HTML button
  def addClickedMessage(): Unit = {
    appendPar(document.body, "I said don't click me!")
  }

  def setupUI(): Unit = {
    //UI directly from the Scala.js code
    val button = document.createElement("button")
    button.textContent = "Don't Click me!"
    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })
    document.body.appendChild(button)

    appendPar(document.body, "Hello World! from Axiom Modeling & Design Inc.")
  }

  // def main(args: Array[String]): Unit = {
  //   document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
  //     setupUI()
  //   })
  // }
}