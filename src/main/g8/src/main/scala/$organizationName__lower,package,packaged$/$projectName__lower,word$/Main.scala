package $organizationName$.$projectName$

import scala.scalajs.js
import typings.auroraLangium.outCliCliUtilMod.extractAstNode
import typings.auroraLangium.outLanguageGeneratedAstMod.PCM
import typings.auroraLangium.outCliMainMod.getAuroraServices
import scala.concurrent.{Future, ExecutionContext}
import ExecutionContext.Implicits.global
import scala.scalajs.js.Promise.resolve

object GetAST {
  def getAST(): Future[String] = {
    val servicesFuture = resolve(getAuroraServices())
                          .toFuture
                          .flatMap(promise => resolve(promise).toFuture)
                          .map(services => services.asInstanceOf[js.Dynamic].Aurora)  // Cast to Dynamic to access Aurora
    
    servicesFuture.flatMap { services =>
      val coreServices = services.asInstanceOf[typings.langium.libServicesMod.LangiumCoreServices]
      extractAstNode[PCM]("<FILE_PATH>.aurora", coreServices).toFuture
    }.map { pcmNode =>
      println(s"Elements: ${pcmNode.elements.map(e => 
        s"${e.$type}: ${js.JSON.stringify(js.Dynamic.literal(
          name = e.asInstanceOf[js.Dynamic].name,
          description = e.asInstanceOf[js.Dynamic].description
        ), space = 2)}"
      ).mkString("\n")}")
      // pcmContents(pcmNode)
      pcmNode.toString()
    }
  }

  def main(args: Array[String]): Unit = {
    getAST().onComplete {
      case scala.util.Success(result) =>
        println(s"AST Extraction Result: $result")
      case scala.util.Failure(exception) =>
        println(s"Error extracting AST: ${exception}")
    }

  }
}