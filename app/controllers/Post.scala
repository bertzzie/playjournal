package controllers

import play.api._
import play.api.mvc._

import models._

object Post extends Controller with Security{
    def index = withAuth { user => implicit request =>
        val id = request.session.get("id").getOrElse("0")
        Ok(views.html.post.index( models.Post.findByUser(id.toLong) ))
    }
}