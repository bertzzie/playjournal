// @SOURCE:C:/Users/bert/Desktop/projects/playjournal/conf/routes
// @HASH:cd779aec4068762e357382069456a2daeab61ea9
// @DATE:Fri Jul 06 14:49:29 ICT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    


 
// @LINE:10
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:14
def signup() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:12
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:9
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    


 
// @LINE:10
def authenticate = JavascriptReverseRoute(
   "controllers.Authentication.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:14
def signup = JavascriptReverseRoute(
   "controllers.Authentication.signup",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:12
def logout = JavascriptReverseRoute(
   "controllers.Authentication.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:9
def login = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    


 
// @LINE:10
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Seq())
)
                              
 
// @LINE:14
def signup() = new play.api.mvc.HandlerRef(
   controllers.Authentication.signup(), HandlerDef(this, "controllers.Authentication", "signup", Seq())
)
                              
 
// @LINE:12
def logout() = new play.api.mvc.HandlerRef(
   controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Seq())
)
                              
 
// @LINE:9
def login() = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Seq())
)
                              

                      
    
}
                            
}
                    
                