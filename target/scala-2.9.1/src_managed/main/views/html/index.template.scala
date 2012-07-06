
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,play.api.mvc.RequestHeader,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String)(implicit request: play.api.mvc.RequestHeader, flash: Flash):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.79*/("""

"""),_display_(Seq[Any](/*3.2*/main("Play Journal - Fun blogging application", "home")/*3.57*/ {_display_(Seq[Any](format.raw/*3.59*/("""
    """),_display_(Seq[Any](/*4.6*/if(flash.get("logoutSuccess").exists(_ => true))/*4.54*/{_display_(Seq[Any](format.raw/*4.55*/("""
    	<div class="alert alert-info">
    		<strong>Logout Success.</strong> """),_display_(Seq[Any](/*6.41*/flash/*6.46*/.get("logoutSuccess"))),format.raw/*6.67*/("""
    	</div>
    """)))})),format.raw/*8.6*/("""
    
    <div class="hero-unit">
    	<h1>Welcome to """),_display_(Seq[Any](/*11.22*/message)),format.raw/*11.29*/("""</h1>
    </div>
    
""")))})))}
    }
    
    def render(message:String,request:play.api.mvc.RequestHeader,flash:Flash) = apply(message)(request,flash)
    
    def f:((String) => (play.api.mvc.RequestHeader,Flash) => play.api.templates.Html) = (message) => (request,flash) => apply(message)(request,flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 06 12:29:04 ICT 2012
                    SOURCE: C:/Users/bert/Desktop/projects/playjournal/app/views/index.scala.html
                    HASH: 7a4ea14e5416bf55b6ae9c1b61b19c58f9d400e2
                    MATRIX: 538->1|692->78|729->81|792->136|831->138|871->144|927->192|965->193|1077->270|1090->275|1132->296|1180->314|1271->369|1300->376
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|27->6|27->6|27->6|29->8|32->11|32->11
                    -- GENERATED --
                */
            