package gg.kappatracker.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TraderQuestItemsDTO {
    private Long traderId;
    private String traderName;
    private List<QuestItem> questItems;

    public TraderQuestItemsDTO(Long traderId, String traderName, List<QuestItem> questItems) {
        this.traderId = traderId;
        this.traderName = traderName;
        this.questItems = questItems;
    }
}
