error id: file:///D:/gitter8/start-scalajs.g8/src/main/g8/src/test/scala/$organizationName__lower,package,packaged$/$projectName__lower,word$/MainTest.scala:[31..37) in Input.VirtualFile("file:///D:/gitter8/start-scalajs.g8/src/main/g8/src/test/scala/$organizationName__lower,package,packaged$/$projectName__lower,word$/MainTest.scala", "package $organizationName$.

import utest._

import scala.scalajs.js

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._

object TutorialTest extends TestSuite {

  // Initialize App
  TutorialApp.setupUI()

  def tests = Tests {
    test("HelloWorld") {
      assert(document.querySelectorAll("p").count(_.textContent == "Hello World") == 1)
    }
  }
}")
file:///D:/gitter8/start-scalajs.g8/src/main/g8/src/test/scala/$organizationName__lower,package,packaged$/$projectName__lower,word$/MainTest.scala:3: error: expected identifier; obtained import
import utest._
^
#### Short summary: 

expected identifier; obtained import