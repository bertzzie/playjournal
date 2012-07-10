package models

import play.api.db._
import anorm._
import anorm.SqlParser._
import play.api.Play.current
import java.sql.Timestamp

case class Post(title: String,
    content: String,
    created: String,
    lastUpdate: String,
    writer: Long,
    id: Long = 0)

object Post {
    val simple = {
        get[String]("post.title") ~
            get[String]("post.content") ~
            get[String]("post.created") ~
            get[String]("post.lastUpdate") ~
            get[Long]("post.writer") ~
            get[Long]("post.id") map {
                case title ~ content ~ created ~ lastUpdate ~ writer ~ id => Post(title, content, created, lastUpdate, writer, id)
            }
    }

    def findByUser(userId: Long): Seq[Post] = {
        DB.withConnection { implicit connection =>
            SQL("SELECT * FROM post p WHERE p.writer = {uid}")
                .on('uid -> userId)
                .as(simple *)
        }
    }

    def create(title: String, content: String, userId: Long) = {
        DB.withConnection { implicit connection =>
            SQL("INSERT INTO post (title, content, created, writer) VALUES ({title}, {content}, NOW(), {writer})")
                .on(
                    'title -> title,
                    'content -> content,
                    'writer -> userId).executeUpdate()
        }
    }
}