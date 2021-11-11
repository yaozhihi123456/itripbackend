package cn.itrip.beans;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.196.137", 6379,5000);
        System.out.println(jedis.ping());
//        jedis.set("name", "lyx");
//        System.out.println(jedis.get("name"));

    }
}
