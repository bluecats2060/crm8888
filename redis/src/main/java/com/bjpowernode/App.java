package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class App 
{
    public static void main( String[] args )
    {
//crud
         Jedis jedis=new Jedis("192.168.150.128",6379);
         jedis.flushAll();
         jedis.set("name","tom");
         String name=jedis.get("name");
         System.out.println(name);

    }
}
