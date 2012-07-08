package controllers

import play.api._
import play.api.mvc._

trait Security {
    def username(request: RequestHeader) = SecurityHelper.getUsername(request)
    
    def onUnauthorized(request: RequestHeader) = Results.Redirect(routes.Authentication.login).flashing("unauthorized" -> "You need to authenticate yourself to access the page.")
    
    def withAuth(f: => String => Request[AnyContent] => Result) = {
        Security.Authenticated(username, onUnauthorized) { user =>
            Action(implicit request => f(user)(request))
        }
    }
}

object SecurityHelper {
    def isAuthenticated(implicit request: RequestHeader) = request.session.get(Security.username).exists(_ => true) 
    
    def getUsername(implicit request: RequestHeader) = request.session.get(Security.username)
}