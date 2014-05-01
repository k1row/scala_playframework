/*
package models

import play.api.db.slick.{Profile, Session}

case class User(id: Int, name: String)

trait UserComponent { this: Profile =>
  import profile.simple._

  class Users(tag: Tag) extends Table[User](tag, "users") {
    def id = column[Int]("id", O.PrimaryKey)
    def name = column[String]("name", O.NotNull)

    def * = (id, name) <> (User.tupled, User.unapply _)
  }
}

class UsersDAO(implicit dao: DAO) {
  import dao._
  import profile.simple._

  def findByName(id: Int)(implicit s: Session): Option[User] = {
    Users filter { _.id === id } firstOption
  }

  def insert(user: User)(implicit s: Session) {
    Users += user
  }
}
*/

package models

import play.api.db.slick.Config.driver.simple._

case class User(id: Int, name: String)

/* Table mapping */
class UsersTable(tag: Tag) extends Table[User](tag, "USER") {
  def id = column[Int]("id", O.PrimaryKey)
  def name = column[String]("name", O.NotNull)

  def * = (id, name) <> (User.tupled, User.unapply _)
}
