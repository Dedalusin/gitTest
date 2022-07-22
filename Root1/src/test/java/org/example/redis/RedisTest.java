package org.example.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
    private static final Jedis jedis = new Jedis("localhost", 6379);
    private static final String KEY = "my-zset";
    @Test
    public void zsetTest() {
//        System.out.println(jedis.zremrangeByRank(KEY, -1, -1));
        System.out.println(jedis.zrange("my-zset", 0, -1));
        System.out.println(jedis.zcard(KEY));

    }

}
