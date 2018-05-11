package controller

import org.junit._
import org.scalatest.FunSuite
import org.apache.log4j.Logger
import org.apache.log4j.Level
import java.sql.Connection
import java.sql.DriverManager


class TestFlowController extends FunSuite{
  
  @Test
  def testFlowController(){
    
    val Path = "src/main/resources/"
    val getString = new flowcontroller().readConfFile(Path)
    
  }
  
  
  
  
}