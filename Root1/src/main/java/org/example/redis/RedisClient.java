package org.example.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

public class RedisClient {
    public static final Jedis jedis = new Jedis("localhost", 6379);

    public static void main(String[] args) {
        Pipeline pipeline = jedis.pipelined();
        pipeline.zadd("my-zset", 1, "one");
        pipeline.zadd("my-zset", 2, "two");
        pipeline.sync();
    }
}
