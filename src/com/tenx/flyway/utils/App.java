package com.tenx.flyway.utils;


public class App {

    public static void main(String[] args) {
    	
    	FlywayUtils.migration();
      /*  // 创建Flyway实例
        Flyway flyway = new Flyway();

        // 设置数据库
        flyway.setDataSource("jdbc:mysql://localhost:3306/foobar", "user", "pass");

        // 开始迁移
        flyway.migrate();*/
    }
}
