
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
    def apply/*1.2*/(form: Form[(String, String)])(implicit request: play.api.mvc.RequestHeader):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.78*/("""

"""),_display_(Seq[Any](/*3.2*/main("Login", "login")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
	<div class="span6">
		<div class="hero-unit">
			<h1>LOGIN WOI</h1>
		</div>
	</div>
	"""),_display_(Seq[Any](/*9.3*/helper/*9.9*/.form(routes.Authentication.authenticate, 'class -> "form-horizontal span4")/*9.85*/{_display_(Seq[Any](format.raw/*9.86*/("""
	<fieldset>
	<legend>Your Login Information</legend>
	"""),_display_(Seq[Any](/*12.3*/form/*12.7*/.globalError.map/*12.23*/ { error =>_display_(Seq[Any](format.raw/*12.34*/("""
		<div class="alert alert-error">
			"""),_display_(Seq[Any](/*14.5*/error/*14.10*/.message)),format.raw/*14.18*/("""
		</div>
	""")))})),format.raw/*16.3*/("""
	<div class="control-group">
		<label class="control-label" for="email">Email</label>
		<div class="controls">
			<input type="email" class="input-large" id="email" name="email" placeholder="email">
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="password">Password</label>
		<div class="controls">
			<input type="password" class="input-large" id="password" name="password" placeholder="password">
		</div>
	</div>
	<div class="form-actions">
		<button type="submit" class="btn btn-primary">Login</button>
		<button type="reset" class="btn">Clear</button>
	</div>
	</fieldset>
	""")))})),format.raw/*34.3*/("""
""")))})))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],request:play.api.mvc.RequestHeader) = apply(form)(request)
    
    def f:((Form[scala.Tuple2[String, String]]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (form) => (request) => apply(form)(request)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 06 12:11:39 ICT 2012
                    SOURCE: C:/Users/bert/Desktop/projects/playjournal/app/views/login.scala.html
                    HASH: 655d6cdd97b662e070048b05cbb0e0cb04e6a185
                    MATRIX: 560->1|713->77|752->82|782->104|821->106|950->201|963->207|1047->283|1085->284|1179->343|1191->347|1216->363|1265->374|1341->415|1355->420|1385->428|1430->442|2094->1075
                    LINES: 19->1|22->1|24->3|24->3|24->3|30->9|30->9|30->9|30->9|33->12|33->12|33->12|33->12|35->14|35->14|35->14|37->16|55->34
                    -- GENERATED --
                */
            