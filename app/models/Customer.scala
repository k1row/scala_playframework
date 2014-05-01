/*

package models

//import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.{Profile, Session}


case class Customer(
	customerid:Option[Int],
	email: String,
	password: String,
	zip: String,
	//created: Option[DateTime],
	//modified: Option[DetaTime],
	aid: Int,
	apass: String
	)


trait CustomerComponent { this: Profile =>
	import profile.simple._

	class Customers(tag: Tag) extends Table[Customer](tag, "customers") {
		def id = column[Int]("customerid", O.PrimaryKey, O.AutoInc)
		def email = column[String]("email", O.NotNull)
		def password = column[String]("password", O.NotNull)
		def zip = column[String]("zip")
		//def created = column[String]("created")
		//def modified = column[String]("modified")
		def aid = column[String]("aid")
		def apass = column[String]("apass")

		def * = (id.?, email, password, zip, aid, apss) <> (Customer.tupled, Customer.unapply _)
	}
}

class CustomersDAO(implicit dao: DAO) {
	import dao._
	import profile.simple._

	def findAll()(implicit s: Session): Option[Customer] = {
		for {
			c <- Customers
			} yield c
		}

		def findByName(id: Int)(implicit s: Session): Option[Customer] = {
			Customers filter { _.id === id } firstOption
		}

		def insert(customer: Customer)(implicit s: Session) {
			Customers += user
		}
	}
*/
