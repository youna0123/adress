package team.suajung.ad.ress.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "coordinationRule")
public class CoordinationRule {

    @Id
    private String _id;

    private String userId;

    private String coordinationRule;

    public CoordinationRule(String userId, String coordinationRule) {

        this.userId = userId;

        this.coordinationRule = coordinationRule;
    }
}
