package models

import play.api.db._
import anorm._
import anorm.SqlParser._
import play.api.Play.current

case class Privilege(id: Long, description: String)

object Privilege {
    val simple = {
        get[Long]("privilege.id") ~
        get[String]("privilege.description") map {
            case id~description => Privilege(id, description)
        }
    }
    
    def findAll(): Seq[Privilege] = {
        DB.withConnection{ implicit connection =>
            SQL("SELECT * FROM privilege").as(simple *)
        }
    }
    
    def create(privilege: Privilege) = {
        DB.withConnection{ implicit connection => 
            SQL("INSERT INTO privilege (id, description) VALUES ({id}, {description})")
            	.on('id -> privilege.id, 'description -> privilege.description)
            	.executeUpdate()
        }
    }
}