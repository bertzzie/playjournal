package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import models._

object Post extends Controller with Security{
	val postForm = Form(
			tuple(
				"title" -> nonEmptyText,
				"content" -> nonEmptyText
			)
		)

    def index = withAuth { user => implicit request =>
        val id = request.session.get("id").getOrElse("0")
        Ok(views.html.post.index( models.Post.findByUser(id.toLong) ))
    }
    
    def newPost = withAuth { user => implicit request =>
        Ok(views.html.post.newPost(postForm))
    }
}