package repository.users

import domain.users.UserApplicationResult
import org.scalatest.FunSuite


import scala.concurrent.Await
import scala.concurrent.duration._


class UserApplicationResultRepositoryTest extends FunSuite{
  val entity = UserApplicationResult("1","It's nice")
  val repository = UserApplicationResultRepository
  test("createEntity"){
    val result = Await.result(repository.roach.saveEntity(entity), 2 minutes)
    assert(result.nonEmpty)

  }

//  test("readEntity"){
//    val result = Await.result(repository.roach.getEntity(entity.userApplicationResultId), 2 minutes)
//    assert(result.head.userApplicationResultId==entity.userApplicationResultId)
//  }
//
//  test("getEntities") {
//    val result = Await.result(repository.roach.getEntities, 2 minutes)
//    assert(result.nonEmpty)
//  }
//
  test("updateEntity") {
    val result = Await.result(repository.roach.saveEntity(entity), 2 minutes)
    assert(result.isEmpty)

  }
//
//
//  test("deleteEntities"){
//    Await.result(repository.roach.deleteEntity(entity), 2 minutes)
//    val result = Await.result(repository.roach.getEntity(entity.userApplicationResultId), 2 minutes)
//    assert(result.isEmpty)
//
//  }
}