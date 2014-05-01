/*

package models

import scala.slick.driver.JdbcProfile
import scala.slick.lifted.TableQuery
import play.api.db.slick.Profile
import play.api.db.slick.DB

class DAO(override val profile: JdbcProfile) extends CustomerComponent with Profile {
  val Customers = TableQuery[Customers]
}

object current {
  implicit val dao = new DAO(DB(play.api.Play.current).driver)
  val Customers = new CustomersDAO
}

class DAO(override val profile: JdbcProfile) extends UserComponent with Profile {
  val Users = TableQuery[Users]
}

object current {
  implicit val dao = new DAO(DB(play.api.Play.current).driver)
  val Users = new UsersDAO
}
*/
