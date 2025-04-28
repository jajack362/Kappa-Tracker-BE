package gg.kappatracker.service;

import gg.kappatracker.model.Quest;
import gg.kappatracker.model.QuestItem;
import gg.kappatracker.model.QuestItemGroupedDTO;
import gg.kappatracker.repository.QuestItemRepository;
import gg.kappatracker.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestItemService {

    @Autowired
    private QuestItemRepository questItemRepository;

    public QuestItem addQuestItem(QuestItem questItem) {
        return questItemRepository.save(questItem);
    }

    public List<QuestItem> getAllQuestItems() {
        return questItemRepository.findAll();
    }

    public List<QuestItem> getAllQuestItemsByTrader(Long traderId) {
        return questItemRepository.findAllByTraderId(traderId);
    }

    public List<QuestItemGroupedDTO> countTotalPerItem() {
        return questItemRepository.countTotalPerItem();
    }
}
