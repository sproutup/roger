
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
object content extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contentURL: String, productName: String, productSlug: String, destinationURL: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.88*/("""

<!DOCTYPE html>

<html>
<head>
    <title>SproutUp - Supporting """),_display_(Seq[Any](/*7.35*/productName)),format.raw/*7.46*/(""" grow</title>
    <link rel="stylesheet" media="all" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("stylesheets/content.css"))),format.raw/*8.90*/("""">
    <link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*9.55*/routes/*9.61*/.Assets.at("images/logo-square.png"))),format.raw/*9.97*/("""">
    <script src=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Assets.at("javascripts/content.js"))),format.raw/*11.61*/("""" type="text/javascript"></script>

    <meta name="viewport" content="width=device-width,initial-scale=1.0">

</head>
<body>


<script>
$(document).ready(function () """),format.raw/*20.31*/("""{"""),format.raw/*20.32*/("""
    window.location.hash='"""),_display_(Seq[Any](/*21.28*/contentURL)),format.raw/*21.38*/("""';
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/(""");
</script>

<style>
.sprtupC """),format.raw/*26.10*/("""{"""),format.raw/*26.11*/("""
    background: #000000;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

.cta_message """),format.raw/*30.14*/("""{"""),format.raw/*30.15*/("""
    color: #ffffff !important;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

.call_to_action """),format.raw/*34.17*/("""{"""),format.raw/*34.18*/("""
    background: #2996cc;
    border: none;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
.call_to_action:hover """),format.raw/*38.23*/("""{"""),format.raw/*38.24*/("""
    background: ##31CCFF;
    color: white;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""

.call_to_action """),format.raw/*43.17*/("""{"""),format.raw/*43.18*/("""
    color: #ffffff;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""
</style>


<!-- <div class="sprtup-frame-wrap"> -->
<div class="sprtup_container">

    <iframe src=""""),_display_(Seq[Any](/*52.19*/contentURL)),format.raw/*52.29*/("""/?utm_source=sprtup" id="iframe" class="sprtup-frame" width="300" frameborder="0" noresize="noresize" scrolling="no"></iframe>

    <div class="sprtup">
        <div class="container-fluid">
            <div class="sprtup_wrap">

                <div class="sprtupA">
                    <img class="img-responsive" src=""""),_display_(Seq[Any](/*59.55*/routes/*59.61*/.Assets.at("images/logo-square.png"))),format.raw/*59.97*/("""" alt="Square image" />
                </div> <!-- sprtupA -->

                <div class="sprtupC image">

                    <div class="row">
                        <div class="content content-left col-xs-8 col-sm-9">
                            <div class="table">
                                <span class="message cta_message">
                                    Like """),_display_(Seq[Any](/*68.43*/productName)),format.raw/*68.54*/("""? Help it grow and earn cool rewards in the process!
                                </span>
                            </div>
                        </div>

                        <div class="content content-right col-xs-4 col-sm-3">
                            <div class="table">
                                <span class="message">
                                    <a href=""""),_display_(Seq[Any](/*76.47*/destinationURL)),format.raw/*76.61*/("""" target="_blank" class="btn btn-info call_to_action">SproutUp</a>
                                </span>
                            </div>
                        </div>
                    </div> <!-- row -->

                </div> <!-- sprtupC -->

            </div> <!-- sprtup_wrap -->
        </div> <!-- container -->
    </div> <!-- sprtup -->


</div> <!-- sprtup_container -->

<!--[if IE]>
<script>
window.onload=function() """),format.raw/*93.26*/("""{"""),format.raw/*93.27*/("""
if (location.href.indexOf('again')==-1) location.replace(location.href+'?again');
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/("""
</script>
<![endif]-->

<script>

$(document).ready(function()"""),format.raw/*101.29*/("""{"""),format.raw/*101.30*/("""
    $.ajax("""),format.raw/*102.12*/("""{"""),format.raw/*102.13*/("""
        url: "/trackings",
        type: 'POST',
        data: """),format.raw/*105.15*/("""{"""),format.raw/*105.16*/("""tracking:"""),format.raw/*105.25*/("""{"""),format.raw/*105.26*/("""link_id:"86876686868jhi88""""),format.raw/*105.52*/("""}"""),format.raw/*105.53*/("""}"""),format.raw/*105.54*/(""",
        dataType : 'json',
        timeout: 2000,
        success: function(data) """),format.raw/*108.33*/("""{"""),format.raw/*108.34*/("""
            $(".call_to_action").click(function(e) """),format.raw/*109.52*/("""{"""),format.raw/*109.53*/("""
                e.preventDefault();
                var href = $(this).attr("href");
                $.ajax("""),format.raw/*112.24*/("""{"""),format.raw/*112.25*/("""
                    url: "/trackings/"+data.id,
                    type: 'PUT',
                    data: """),format.raw/*115.27*/("""{"""),format.raw/*115.28*/("""tracking:"""),format.raw/*115.37*/("""{"""),format.raw/*115.38*/("""clicked:1"""),format.raw/*115.47*/("""}"""),format.raw/*115.48*/("""}"""),format.raw/*115.49*/(""",
                    dataType : 'json',
                    timeout: 2000,
                    complete: function() """),format.raw/*118.42*/("""{"""),format.raw/*118.43*/("""
                        window.location = href;
                    """),format.raw/*120.21*/("""}"""),format.raw/*120.22*/("""
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/(""");
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/(""");
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""
    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/(""");
    $(window).load(function() """),format.raw/*125.31*/("""{"""),format.raw/*125.32*/("""
        // executes when complete page is fully loaded, including all frames, objects and images
        msieversion();
    """),format.raw/*128.5*/("""}"""),format.raw/*128.6*/(""");
    var iFrameID = document.getElementById('iframe').contentWindow.document;
    var iOS = ( navigator.userAgent.match(/(iPad|iPhone|iPod)/g) ? true : false );
    if (iOS)
    """),format.raw/*132.5*/("""{"""),format.raw/*132.6*/("""
        iFrameID.addClass('ios');
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/(""" else """),format.raw/*134.12*/("""{"""),format.raw/*134.13*/("""
        $('#iframe').attr("scrolling", "yes");
        $('#iframe').attr("src", $('#iframe').attr("src"));
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/("""

"""),format.raw/*139.1*/("""}"""),format.raw/*139.2*/(""");


</script>


</body>


</html>
"""))}
    }
    
    def render(contentURL:String,productName:String,productSlug:String,destinationURL:String): play.api.templates.HtmlFormat.Appendable = apply(contentURL,productName,productSlug,destinationURL)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (contentURL,productName,productSlug,destinationURL) => apply(contentURL,productName,productSlug,destinationURL)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 19 13:36:38 EDT 2015
                    SOURCE: /Users/tao/Dev/project/roger/app/views/content.scala.html
                    HASH: 3542e72b554f4fd0a37126d836244d79208f14e3
                    MATRIX: 797->1|977->87|1079->154|1111->165|1206->225|1220->231|1278->268|1370->325|1384->331|1441->367|1498->388|1513->394|1580->439|1669->492|1684->498|1742->534|1937->701|1966->702|2030->730|2062->740|2092->743|2120->744|2179->775|2208->776|2261->802|2289->803|2332->818|2361->819|2420->851|2448->852|2494->870|2523->871|2594->915|2622->916|2673->939|2702->940|2774->985|2802->986|2848->1004|2877->1005|2925->1026|2953->1027|3092->1130|3124->1140|3482->1462|3497->1468|3555->1504|3973->1886|4006->1897|4429->2284|4465->2298|4932->2737|4961->2738|5071->2821|5099->2822|5191->2885|5221->2886|5262->2898|5292->2899|5385->2963|5415->2964|5453->2973|5483->2974|5538->3000|5568->3001|5598->3002|5711->3086|5741->3087|5822->3139|5852->3140|5990->3249|6020->3250|6157->3358|6187->3359|6225->3368|6255->3369|6293->3378|6323->3379|6353->3380|6499->3497|6529->3498|6627->3567|6657->3568|6703->3585|6733->3586|6777->3601|6807->3602|6846->3613|6876->3614|6909->3619|6938->3620|7000->3653|7030->3654|7183->3779|7212->3780|7420->3960|7449->3961|7516->4000|7545->4001|7580->4007|7610->4008|7750->4120|7779->4121|7809->4123|7838->4124
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20|49->21|49->21|50->22|50->22|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|62->34|62->34|65->37|65->37|66->38|66->38|69->41|69->41|71->43|71->43|73->45|73->45|80->52|80->52|87->59|87->59|87->59|96->68|96->68|104->76|104->76|121->93|121->93|123->95|123->95|129->101|129->101|130->102|130->102|133->105|133->105|133->105|133->105|133->105|133->105|133->105|136->108|136->108|137->109|137->109|140->112|140->112|143->115|143->115|143->115|143->115|143->115|143->115|143->115|146->118|146->118|148->120|148->120|149->121|149->121|150->122|150->122|151->123|151->123|152->124|152->124|153->125|153->125|156->128|156->128|160->132|160->132|162->134|162->134|162->134|162->134|165->137|165->137|167->139|167->139
                    -- GENERATED --
                */
            