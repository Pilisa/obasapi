package services.users

import java.time.{LocalDate, LocalDateTime}

import domain.users.User
import org.scalatest.FunSuite

import scala.concurrent.Await
import scala.concurrent.duration._


class UserServiceTest extends FunSuite {
  val entity = User("test@test.com", "", "", "", "", LocalDateTime.now())
  val roachService = UserService
  test("createEntity") {
    val result = Await.result(roachService.apply.saveEntity(entity), 2 minutes)
    assert(result.nonEmpty)
  }

  test("readEntity") {
    val result = Await.result(roachService.apply.getEntity(entity.email), 2 minutes)
    assert(result.head.email == entity.email)
  }

  test("getEntities") {
    val result = Await.result(roachService.apply.getEntities, 2 minutes)
    assert(result.nonEmpty)
  }

  test("updateEntity") {
    val result = Await.result(roachService.apply.saveEntity(entity), 2 minutes)
    assert(result.isEmpty)

  }


  test("deleteEntities") {
    Await.result(roachService.apply.deleteEntity(entity), 2 minutes)
    val result = Await.result(roachService.apply.getEntity(entity.email), 2 minutes)
    assert(result.isEmpty)

  }
}