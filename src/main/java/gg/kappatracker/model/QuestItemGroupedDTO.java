package gg.kappatracker.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestItemGroupedDTO {
    private String item;
    private Long amount;

    public QuestItemGroupedDTO(String item, Long amount) {
        this.item = item;
        this.amount = amount;
    }
}
