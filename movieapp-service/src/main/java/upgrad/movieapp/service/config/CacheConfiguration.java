package upgrad.movieapp.service.config;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching// xyz
public class CacheConfiguration {

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(
                new ConcurrentMapCache("cities"),
                new ConcurrentMapCache("city"),
                new ConcurrentMapCache("genres"),
                new ConcurrentMapCache("genre"),
                new ConcurrentMapCache("coupons"),
                new ConcurrentMapCache("coupon"),
                new ConcurrentMapCache("artist")));
        return cacheManager;
    }

}
