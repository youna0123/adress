package team.suajung.ad.ress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "team.suajung.ad.ress.repository1",
        mongoTemplateRef = "mongoTemplate1"
)
public class MongoConfig1 {

    @Bean
    @Primary
    public MongoDatabaseFactory mongoDbFactory1() {

        return new SimpleMongoClientDatabaseFactory("");
    }

    @Bean
    @Primary
    public MongoTemplate mongoTemplate1() {

        return new MongoTemplate(mongoDbFactory1());
    }
}

