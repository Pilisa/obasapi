//package repository.district
//
//import domain.demographics.District
//import org.scalatest.FunSuite
//import repository.demographics.DistrictRepository
//
//import scala.concurrent.Await
//import scala.concurrent.duration._
//
//class DistrictRepositoryImplTest extends FunSuite {
//
//  val entity = District("163","Eden District Municipality ")
//  val repository = DistrictRepository
//  test("createEntity"){
//    val result = Await.result(repository.roach.saveEntity(entity), 2 minutes)
//    assert(result.nonEmpty)
//  }
//
//  test("readEntity"){
//    val result = Await.result(repository.roach.getEntity(entity.districtCode), 2 minutes)
//    assert(result.head.districtCode==entity.districtCode)
//  }
//
//
//  test("getEntities") {
//    val result = Await.result(repository.roach.getEntities, 2 minutes)
//    assert(result.nonEmpty)
//  }
//
//  test("updateEntity") {
//    val result = Await.result(repository.roach.saveEntity(entity), 2 minutes)
//    assert(result.isEmpty)
//  }
//
//
//  test("deleteEntities"){
//    Await.result(repository.roach.deleteEntity(entity), 2 minutes)
//    val result = Await.result(repository.roach.getEntity(entity.districtCode), 2 minutes)
//    assert(result.isEmpty)
//
//  }
//
//}
