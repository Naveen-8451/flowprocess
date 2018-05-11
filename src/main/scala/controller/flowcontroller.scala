package controller

import java.io.File
import com.typesafe.config.{ Config, ConfigFactory }

class flowcontroller {
  
  
  def readConfFile(Path:String):Unit={
    
    val configPath = System.getProperty(Path)
    val config = ConfigFactory.parseFile(new File(configPath + "conf1.conf"))
    config.getString("flow.steps.step-01.action")
    
  }
  
  
  
}