
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[scala.Tuple2[String, String]],play.api.mvc.RequestHeader,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[(String, String)])(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitField/*5.15*/ = {{ FieldConstructor(bootstrapInput.f) }};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.57*/("""

"""),_display_(Seq[Any](/*7.2*/main("Login", "login")/*7.24*/ {_display_(Seq[Any](format.raw/*7.26*/("""
	<div class="span5">
		<a href="#" class="thumbnail">
			<img src="http://placehold.it/450x300">
		</a>
	</div>
	"""),_display_(Seq[Any](/*13.3*/helper/*13.9*/.form(routes.Authentication.authenticate, 'class -> "loginForm-horizontal span6")/*13.90*/{_display_(Seq[Any](format.raw/*13.91*/("""
	<fieldset>
	<legend>Your Login Information</legend>
	
	"""),_display_(Seq[Any](/*17.3*/if(loginForm.hasGlobalErrors)/*17.32*/{_display_(Seq[Any](format.raw/*17.33*/("""
		<div class="alert alert-error">
			"""),_display_(Seq[Any](/*19.5*/loginForm/*19.14*/.globalErrors.map/*19.31*/ { error =>_display_(Seq[Any](format.raw/*19.42*/("""
				<strong>Error: </strong> """),_display_(Seq[Any](/*20.31*/error/*20.36*/.message)),format.raw/*20.44*/(""" <br>
			""")))})),format.raw/*21.5*/("""
		</div>
	""")))})),format.raw/*23.3*/("""
	
	"""),_display_(Seq[Any](/*25.3*/inputText(loginForm("email")))),format.raw/*25.32*/("""
	"""),_display_(Seq[Any](/*26.3*/inputPassword(loginForm("password")))),format.raw/*26.39*/("""
	
	<div class="loginForm-actions">
		<button type="submit" class="btn btn-primary">Login</button>
		<button type="reset" class="btn">Clear</button>
	</div>
	</fieldset>
	""")))})),format.raw/*33.3*/("""
""")))})))}
    }
    
    def render(loginForm:Form[scala.Tuple2[String, String]],request:play.api.mvc.RequestHeader) = apply(loginForm)(request)
    
    def f:((Form[scala.Tuple2[String, String]]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (loginForm) => (request) => apply(loginForm)(request)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 07 12:46:58 ICT 2012
                    SOURCE: C:/Users/bert/Desktop/projects/playjournal/app/views/login.scala.html
                    HASH: 2d3ef7efa0425f519fcaf37652ede75ea443da1a
                    MATRIX: 560->1|727->107|748->120|820->82|850->104|879->162|918->167|948->189|987->191|1143->312|1157->318|1247->399|1286->400|1383->462|1421->491|1460->492|1536->533|1554->542|1580->559|1629->570|1697->602|1711->607|1741->615|1783->626|1828->640|1870->647|1921->676|1960->680|2018->716|2228->895
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|34->13|34->13|34->13|34->13|38->17|38->17|38->17|40->19|40->19|40->19|40->19|41->20|41->20|41->20|42->21|44->23|46->25|46->25|47->26|47->26|54->33
                    -- GENERATED --
                */
            