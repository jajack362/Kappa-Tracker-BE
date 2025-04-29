package gg.kappatracker.service;

import gg.kappatracker.model.*;
import gg.kappatracker.repository.QuestItemRepository;
import gg.kappatracker.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class QuestItemService {

    @Autowired
    private QuestItemRepository questItemRepository;

    public QuestItem addQuestItem(QuestItem questItem) {
        return questItemRepository.save(questItem);
    }

    public List<QuestItem> getAllQuestItems() {
        return questItemRepository.findAllWithQuestTraderItem();
    }

    public List<QuestItem> getAllQuestItemsByTrader(Long traderId) {
        return questItemRepository.findAllByTraderId(traderId);
    }

    public List<QuestItemGroupedDTO> countTotalPerItem() {
        return questItemRepository.countTotalPerItem();
    }

    public List<TraderQuestItemsDTO> getAllQuestItemsGroupedByTrader() {
        List<QuestItem> allQuestItems = getAllQuestItems();

        // Group by trader
        Map<Trader, List<QuestItem>> grouped = allQuestItems.stream()
                .collect(Collectors.groupingBy(qi -> qi.getQuest().getTrader()));

        // Map each group to DTO
        return grouped.entrySet().stream().map(entry -> {
            Trader trader = entry.getKey();
            return new TraderQuestItemsDTO(
                    trader.getId(),
                    trader.getName(),
                    entry.getValue()
            );
        }).collect(Collectors.toList());
    }

}
