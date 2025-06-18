package team.suajung.ad.ress.dto;

import lombok.Data;
import team.suajung.ad.ress.enums.ClothesKey;

import java.util.Map;

@Data
public class OutfitDto {

    private String title;

    private String description;

    private Map<ClothesKey, Map<String, String>> clothes;
}
