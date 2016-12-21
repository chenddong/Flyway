package com.tenx.flyway.utils;

import java.io.IOException;
import java.util.Properties;

import com.googlecode.flyway.core.Flyway;

public class FlywayUtils {
	// 读取数据库配置参数  
    private static Properties config = new Properties();  
    static {  
        try {  
            config.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("activerecord.properties"));  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
    // 执行数据库版本升级  
    public static void migration() {  
        // Create the Flyway instance  
        Flyway flyway = new Flyway();  
          
        // Point it to the database  
        flyway.setDataSource(config.getProperty("com.et.ar.ActiveRecordBase.url"), config.getProperty("com.et.ar.ActiveRecordBase.username"), config.getProperty("com.et.ar.ActiveRecordBase.password"));  
        flyway.setInitOnMigrate(true);  
          
        // Start the migration  
        flyway.migrate();  
    }  

}
