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
        basePackages = "team.suajung.ad.ress.digital_wardrobe.repository2",
        mongoTemplateRef = "mongoTemplate2"
)
public class MongoConfig2 {

    @Bean
    public MongoDatabaseFactory mongoDbFactory2() {

        return new SimpleMongoClientDatabaseFactory("");
    }

    @Bean
    public MongoTemplate mongoTemplate2() {

        return new MongoTemplate(mongoDbFactory2());
    }
}