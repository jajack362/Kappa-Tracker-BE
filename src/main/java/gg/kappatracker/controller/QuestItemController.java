package gg.kappatracker.controller;

import gg.kappatracker.model.Quest;
import gg.kappatracker.model.QuestItem;
import gg.kappatracker.model.QuestItemGroupedDTO;
import gg.kappatracker.model.TraderQuestItemsDTO;
import gg.kappatracker.service.QuestItemService;
import gg.kappatracker.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestItemController {

    @Autowired
    private QuestItemService questItemService;

    @PostMapping("/quest-items")
    public QuestItem addQuestItem(@RequestBody QuestItem questItem) {
        return questItemService.addQuestItem(questItem);
    }

    @GetMapping("/quest-items")
    public List<QuestItem> getAllQuestItems(@RequestParam Long traderId) {
        return questItemService.getAllQuestItemsByTrader(traderId);
    }

    @GetMapping("/quest-items-grouped")
    public List<QuestItemGroupedDTO> getAllQuestItemsGrouped() {
        return questItemService.countTotalPerItem();
    }

    @GetMapping("/quest-items-by-trader")
    public List<TraderQuestItemsDTO> getQuestItemsByTrader() {
        return questItemService.getAllQuestItemsGroupedByTrader();
    }

}
