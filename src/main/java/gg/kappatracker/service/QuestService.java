package gg.kappatracker.service;

import gg.kappatracker.model.Quest;
import gg.kappatracker.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestService {

    @Autowired
    private QuestRepository questRepository;

    public Quest addQuest(Quest quest) {
        return questRepository.save(quest);
    }
}
