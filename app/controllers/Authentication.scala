package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import models._

object Authentication extends Controller with Security {
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
            ) verifying ("Email already used. Please check your email.", result => result match {
                case (email, password, name) => {
                	var result = true
                    try {
                    	Users.create(Users(email, password, name, Privilege.standard))
                    } catch {
                        case e => result = false
                    }
                    
                    result
                }
            })
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
    
    def registration = Action { implicit request =>
        signUpForm.bindFromRequest.fold(
                formWithErrors => BadRequest(views.html.signup(formWithErrors)),
                newUser => Redirect(routes.Authentication.login).flashing("registration" -> "Your account have been created. You can now login and start using PlayJournal.")
        )
    }
    
    def authenticate = Action { implicit request =>
        loginForm.bindFromRequest.fold(
                formWithErrors => BadRequest(views.html.login(formWithErrors)),
                user => {
                    var datas: Users = Users.findByEmail(user._1) match {
                        case Some(u) => u
                        case None => throw new Exception("FATAL ERROR: Authentication get the wrong email")
                    }
                    
                    Redirect(routes.Application.index).withSession(
                            "id"              -> datas.id.toString, 
                            "email"           -> datas.email, 
                            Security.username -> datas.name,
                            "privilege"       -> datas.privilege.toString
                    )
                }
        )
    }
}