package genericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
public String readPropData(String path, String key) throws Throwable
    {
      FileInputStream fis=new FileInputStream(path);
      Properties prop = new Properties();
      prop.load(fis);
      String propValue = prop.getProperty(key, "Incorrect Key");
      return propValue;
    }
}
