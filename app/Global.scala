import play.api._
import models._
import anorm._

object Global extends GlobalSettings {
    override def onStart(app: Application) = {
        if (Privilege.findAll.isEmpty) {
            Seq(
                Privilege(1, "admin"),
                Privilege(2, "standard")) foreach Privilege.create
        }

        /*
            Kalau tidak ada user sama sekali, buat user admin.
        */
        if (Users.findAll.isEmpty) {
            Seq(
                Users("admin@playjournal.com", "admin", "Admin", Privilege.admin),
                Users("user@playjournal.com", "user", "User", Privilege.standard)) foreach Users.create
        }
    }
}
