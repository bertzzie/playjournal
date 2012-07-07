
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
implicit def /*3.2*/implicitField/*3.15*/ = {{FieldConstructor(bootstrapInput.render)}};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*3.60*/("""

"""),_display_(Seq[Any](/*5.2*/main("Login", "login")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
	<div class="span6">
		<a href="#" class="thumbnail">
			<img src="http://placehold.it/450x300">
		</a>
	</div>
	"""),_display_(Seq[Any](/*11.3*/helper/*11.9*/.form(routes.Authentication.authenticate, 'class -> "form-horizontal span4")/*11.85*/{_display_(Seq[Any](format.raw/*11.86*/("""
	<fieldset>
	<legend>Your Login Information</legend>
	
	"""),_display_(Seq[Any](/*15.3*/if(form.hasGlobalErrors)/*15.27*/{_display_(Seq[Any](format.raw/*15.28*/("""
		<div class="alert alert-error">
			"""),_display_(Seq[Any](/*17.5*/form/*17.9*/.globalErrors.map/*17.26*/ { error =>_display_(Seq[Any](format.raw/*17.37*/("""
				<strong>Error: </strong> """),_display_(Seq[Any](/*18.31*/error/*18.36*/.message)),format.raw/*18.44*/(""" <br>
			""")))})),format.raw/*19.5*/("""
		</div>
	""")))})),format.raw/*21.3*/("""
	
	<div class="control-group">
		<label class="control-label" for="email">Email</label>
		<div class="controls">
			<input type="email" class="input-large" id="email" name="email" placeholder="email">
		</div>
	</div>
	"""),_display_(Seq[Any](/*29.3*/inputText(form("email")))),format.raw/*29.27*/("""
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
	""")))})),format.raw/*41.3*/("""
""")))})))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],request:play.api.mvc.RequestHeader) = apply(form)(request)
    
    def f:((Form[scala.Tuple2[String, String]]) => (play.api.mvc.RequestHeader) => play.api.templates.Html) = (form) => (request) => apply(form)(request)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 06 16:12:40 ICT 2012
                    SOURCE: C:/Users/bert/Desktop/projects/playjournal/app/views/login.scala.html
                    HASH: c22fc6d011620cd5b84ab5d598c4a9a197ddad10
                    MATRIX: 560->1|705->82|726->95|801->77|832->140|871->145|901->167|940->169|1096->290|1110->296|1195->372|1234->373|1331->435|1364->459|1403->460|1479->501|1491->505|1517->522|1566->533|1634->565|1648->570|1678->578|1720->589|1765->603|2029->832|2075->856|2517->1267
                    LINES: 19->1|21->3|21->3|22->1|24->3|26->5|26->5|26->5|32->11|32->11|32->11|32->11|36->15|36->15|36->15|38->17|38->17|38->17|38->17|39->18|39->18|39->18|40->19|42->21|50->29|50->29|62->41
                    -- GENERATED --
                */
            