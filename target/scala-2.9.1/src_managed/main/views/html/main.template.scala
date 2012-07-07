
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String, section: String = "home")(content: Html)(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.104*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*8.105*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
    	<div class="container">
    		<div class="navbar">
    			<div class="navbar-inner">
    				<div class="container">
    					<a class="brand" href=""""),_display_(Seq[Any](/*17.34*/routes/*17.40*/.Application.index)),format.raw/*17.58*/("""">PlayJournal</a>
    					<ul class="nav">
    						<li """),_display_(Seq[Any](/*19.16*/{if(section.equals("home")) "class=active"})),format.raw/*19.59*/("""><a href="">Home</a></li>
    					</ul>
    					
    					<ul class="nav pull-right">
    						"""),_display_(Seq[Any](/*23.12*/if(request.session.get("email").exists(_ => true))/*23.62*/ {_display_(Seq[Any](format.raw/*23.64*/("""
    							<li><a href="#">"""),_display_(Seq[Any](/*24.29*/request/*24.36*/.session.get("name"))),format.raw/*24.56*/("""</a></li>
    							<li class="divider-vertical"></li>
    							<li><a href=""""),_display_(Seq[Any](/*26.26*/routes/*26.32*/.Authentication.logout)),format.raw/*26.54*/("""">Logout</a></li>
    						""")))}/*27.13*/else/*27.18*/{_display_(Seq[Any](format.raw/*27.19*/("""
	    						<li """),_display_(Seq[Any](/*28.17*/{if(section.equals("login")) "class=active"})),format.raw/*28.61*/("""><a href=""""),_display_(Seq[Any](/*28.72*/routes/*28.78*/.Authentication.login)),format.raw/*28.99*/("""">Log In</a></li>
	    						<li """),_display_(Seq[Any](/*29.17*/{if(section.equals("signup")) "class=active"})),format.raw/*29.62*/("""><a href=""""),_display_(Seq[Any](/*29.73*/routes/*29.79*/.Authentication.signup)),format.raw/*29.101*/("""">Sign Up</a></li>
    						""")))})),format.raw/*30.12*/("""
						</ul>
    				</div>
    			</div>
    		</div>
            """),_display_(Seq[Any](/*35.14*/content)),format.raw/*35.21*/("""
		</div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,section:String,content:Html,request:play.api.mvc.RequestHeader) = apply(title,section)(content)(request)
    
    def f:((String,String) => (Html) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (title,section) => (content) => (request) => apply(title,section)(content)(request)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 06 14:49:39 ICT 2012
                    SOURCE: C:/Users/bert/Desktop/projects/playjournal/app/views/main.scala.html
                    HASH: d3fa8d5f19a1c8d090f24f133aed1d35063ac515
                    MATRIX: 543->1|723->103|811->156|837->161|934->223|948->229|1015->274|1111->335|1125->341|1178->373|1239->398|1254->404|1321->449|1570->662|1585->668|1625->686|1720->745|1785->788|1920->887|1979->937|2019->939|2084->968|2100->975|2142->995|2259->1076|2274->1082|2318->1104|2366->1134|2379->1139|2418->1140|2471->1157|2537->1201|2584->1212|2599->1218|2642->1239|2712->1273|2779->1318|2826->1329|2841->1335|2886->1357|2948->1387|3052->1455|3081->1462
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|38->17|38->17|38->17|40->19|40->19|44->23|44->23|44->23|45->24|45->24|45->24|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|51->30|56->35|56->35
                    -- GENERATED --
                */
            