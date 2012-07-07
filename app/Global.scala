import play.api._
import models._
import anorm._

object Global extends GlobalSettings {
    override def onStart(app: Application) = {
        if(Users.findAll.isEmpty) {
            Seq(
                    Users("bertzzie@gmail.com", "bertzzie", "Bertzzie")
            ) foreach Users.create
        }
        
        if(Privilege.findAll.isEmpty) {
            Seq(
                    Privilege(1, "admin"),
                    Privilege(2, "standard")
            ) foreach Privilege.create
        }
    }
}