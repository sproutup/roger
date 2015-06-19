
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>SproutUp - Supporting Emerging Products grow</title>
        <link rel="stylesheet" media="all" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("stylesheets/content.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/round-logo-blue.jpg"))),format.raw/*9.105*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("javascripts/content.js"))),format.raw/*11.59*/("""" type="text/javascript"></script>
 
  <meta name="viewport" content="width=device-width,initial-scale=1.0">

</head>
<body>
  <b>"""),_display_(Seq[Any](/*17.7*/message)),format.raw/*17.14*/("""</b>
</body>"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 19 12:40:19 EDT 2015
                    SOURCE: /Users/tao/Dev/project/roger/app/views/index.scala.html
                    HASH: c74ecd8d67aa47a717590e4c6194301061a176cd
                    MATRIX: 774->1|885->18|1075->173|1089->179|1147->216|1243->277|1257->283|1319->323|1380->348|1395->354|1462->399|1549->450|1564->456|1622->492|1788->623|1817->630
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17
                    -- GENERATED --
                */
            