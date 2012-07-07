package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import models._

object Authentication extends Controller {
    val loginForm = Form(
            tuple(
                    "email" -> email.verifying(nonEmpty),
                    "password" -> text
            ) verifying ("Invalid email or password", result => result match {
                case (email, password) => Users.authenticate(email, password).isDefined
            })
    )
    
    val signUpForm = Form(
            tuple(
                    "email" -> email.verifying(nonEmpty),
                    "password" -> nonEmptyText,
                    "name" -> nonEmptyText
            )
    )
    
    def login = Action { implicit request =>
        Ok(views.html.login(loginForm))
    }
    
    def logout = Action {
        Redirect(routes.Application.index).withNewSession.flashing("logoutSuccess" -> "Thank you for using PlayJournal!")
    }
    
    def signup = Action { implicit request =>
        Ok(views.html.signup(signUpForm))
    }
    
    def authenticate = Action { implicit request =>
        
        loginForm.bindFromRequest.fold(
                formWithErrors => BadRequest(views.html.login(formWithErrors)),
                user => Redirect(routes.Application.index).withSession("email" -> user._1, "name" -> Users.getName(user._1))
        )
    }
}