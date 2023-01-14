package com.mytemplate.template.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableRedisRepositories
@RequiredArgsConstructor
public class SampleRedisConfiguration {

//    private final RedisProperties redisProperties;
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory(){
//        RedisURI redisURI = RedisURI.create(redisProperties.getUrl());
//        org.springframework.data.redis.connection.RedisConfiguration configuration =
//                LettuceConnectionFactory.createRedisConfiguration(redisURI);
//        LettuceConnectionFactory factory = new LettuceConnectionFactory(configuration);
//        factory.afterPropertiesSet();
//        return factory;
//    }
//
//    @Bean
//    public RedisTemplate<String, User> userRedisTemplate(RedisConnectionFactory redisConnectionFactory){
//        RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
//        return redisTemplate;
//    }
}
