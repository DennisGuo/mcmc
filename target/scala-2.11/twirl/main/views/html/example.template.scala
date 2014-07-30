
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object example extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),_display_(/*5.6*/play20/*5.12*/.welcome(message, style = "Java")),format.raw/*5.45*/("""

""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 30 13:14:05 CST 2014
                  SOURCE: F:/www/mcmc/app/views/example.scala.html
                  HASH: 605e6cdfecebab24bb17d3e489b0562bafda5a2d
                  MATRIX: 725->1|830->18|860->23|891->46|930->48|964->57|978->63|1031->96|1065->101
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7
                  -- GENERATED --
              */
          