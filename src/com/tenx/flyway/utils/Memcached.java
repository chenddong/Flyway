package com.tenx.flyway.utils;

import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class Memcached {
	public static void main(String[] args) {
	      try{
	         // 本地连接 Memcached 服务
	         MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
	         System.out.println("Connection to server sucessful.");
	         
	         // 关闭连接
	         mcc.shutdown();
	         
	      }catch(Exception ex){
	         System.out.println( ex.getMessage() );
	      }
	   }

}
