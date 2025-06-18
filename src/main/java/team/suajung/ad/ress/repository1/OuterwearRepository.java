package team.suajung.ad.ress.repository1;

import org.springframework.data.mongodb.repository.MongoRepository;
import team.suajung.ad.ress.digital_wardrobe.model.Item;
import team.suajung.ad.ress.dto.OuterwearDto;
import team.suajung.ad.ress.dto.TopDto;

import java.util.Optional;

public interface OuterwearRepository extends MongoRepository<OuterwearDto, String> {

    Optional<OuterwearDto> findByProductUrl(String productUrl);
    Optional<OuterwearDto> findBy_id(String _id);
    Optional<OuterwearDto> findByImageUrl(String imageUrl);
}
