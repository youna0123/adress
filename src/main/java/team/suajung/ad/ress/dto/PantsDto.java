package team.suajung.ad.ress.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "pants")
@ToString(callSuper = true)
public class PantsDto extends ClothesDto {

    private String category;

    private String bottomLength;
    private String pantsFit;
}
