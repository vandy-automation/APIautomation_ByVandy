package com.de.constants;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Constant {

    public static String baseUri = "http://admin.newdiningedge.baitek.org:";
    public static Properties properties;
    public static String emp_baseUri = properties.getProperty("emp_baseuri") ;
    public static String p_employees = properties.getProperty("path_employees") ;
    public static String p_employeeId = properties.getProperty("path_employeeId") ;

    public static String qaEnv = baseUri + "8100";
    public static String uatEnv = baseUri + "81";
    private String phpSessId;

    public String getPhpSessId() {
        return this.phpSessId;
    }

    public void setPhpSessId(String phpSessId) {
        this.phpSessId = phpSessId;

    }

    public void read_properties() {
        try {
            FileReader reader = new FileReader("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(reader);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }

}
