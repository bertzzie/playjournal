// @SOURCE:C:/Users/bert/Desktop/projects/playjournal/conf/routes
// @HASH:cd779aec4068762e357382069456a2daeab61ea9
// @DATE:Fri Jul 06 14:49:29 ICT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Authentication_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Authentication_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:12
val controllers_Authentication_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:14
val controllers_Authentication_signup4 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:17
val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/login""","""controllers.Authentication.login"""),("""POST""","""/login""","""controllers.Authentication.authenticate"""),("""GET""","""/logout""","""controllers.Authentication.logout"""),("""GET""","""/signup""","""controllers.Authentication.signup"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Authentication_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Authentication.login, HandlerDef(this, "controllers.Authentication", "login", Nil))
   }
}
                    

// @LINE:10
case controllers_Authentication_authenticate2(params) => {
   call { 
        invokeHandler(_root_.controllers.Authentication.authenticate, HandlerDef(this, "controllers.Authentication", "authenticate", Nil))
   }
}
                    

// @LINE:12
case controllers_Authentication_logout3(params) => {
   call { 
        invokeHandler(_root_.controllers.Authentication.logout, HandlerDef(this, "controllers.Authentication", "logout", Nil))
   }
}
                    

// @LINE:14
case controllers_Authentication_signup4(params) => {
   call { 
        invokeHandler(_root_.controllers.Authentication.signup, HandlerDef(this, "controllers.Authentication", "signup", Nil))
   }
}
                    

// @LINE:17
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                